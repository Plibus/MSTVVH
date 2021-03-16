
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Avails {
	public Avails() {
		savedAvails = null;	
	}
	
	public void createCSV(File csvFile) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(csvFile);
		    //System.out.println("CSV file is created...");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.flush();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void excelToCSV(File avails, File availsCopy) {
		savedAvails = availsCopy;
		createCSV(savedAvails);
		StringBuffer data = new StringBuffer();
	    try {
		    FileOutputStream fos = new FileOutputStream(availsCopy);
		    @SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(avails));
		    	XSSFSheet sheet = workbook.getSheetAt(0);
			    Cell cell;
			    Row row;
		
			    // Iterate through each rows from first sheet
			    Iterator<Row> rowIterator = sheet.iterator();
			    while (rowIterator.hasNext()) {
			    	row = rowIterator.next();
			        // For each row, iterate through each columns
			    	int columnCounter = 0;
			        Iterator<Cell> cellIterator = row.cellIterator();
			        while (cellIterator.hasNext()) {
			          	cell = cellIterator.next();
			          	while (cell.getColumnIndex() != columnCounter) {
			          		data.append(",");
			          		columnCounter++;
			          	}
			            if (cell.getCellType() == CellType.BOOLEAN) {
			                data.append(cell.getBooleanCellValue() + ",");
			            } else if (cell.getCellType() ==CellType.NUMERIC) {
			                data.append(cell.getNumericCellValue() + ",");
			            } else if (cell.getCellType() ==CellType.STRING) {
			            	String temp = cell.getStringCellValue();
			            	if (temp.contains(",")) {
			            		temp = temp.replaceAll(",", "##");
			            	}
			                data.append(temp + ",");
			            } else if (cell.getCellType() == CellType.BLANK) {
			                data.append(",");
			            } else {
			              	data.append(",");
			            }
			            columnCounter++;
			        }
			        data.append('\n'); 
			    }
		    fos.write(data.toString().getBytes());
		    fos.close();
		    //System.out.println("Avails copied into CSV...");
	    } catch (FileNotFoundException e) {
            
	    }
	    catch (IOException e) {
	    	System.out.println("File " + availsCopy.getName() + " is being used by another program.\nPlease close file and attempt again");
	    }   
	}
	
	public boolean locateTemplate(String provider) {
		headerDirectoryPath = new File("\\\\azvmfile\\MediaServices\\BulkAvails\\res\\res2\\HeaderTemplates\\" + provider); //Creating a File object for directory		
		String contents[] = headerDirectoryPath.list(); //List of all files and directories
		templateName = provider + "Template";
		if (headerDirectoryPath.exists()) {
			for(int i = 0; i < contents.length; i++) {
				File template = new File(headerDirectoryPath.getAbsoluteFile() + "\\" + contents[i]);
				try {
					if (compare(template)) {
						File templateLocation = new File("\\\\azvmfile\\MediaServices\\BulkAvails\\res\\res2\\HeaderIndex\\" + template.getName());
						HeaderIndex readIndex = new HeaderIndex(templateLocation); 
						index = readIndex.getIndexes();
						templateName = provider + "Template" + (i + 1);
						return true;
					} else {
						templateName = provider + "Template" + (i + 1);
					}	
				} catch (Exception e) {
					e.printStackTrace();
					templateName = provider + "Template" + (contents.length + 1);
					//System.out.print(templateName);
					return false;
				}
			}
			templateName = provider + "Template" + (contents.length + 1);
			//System.out.print(templateName);
			return false;
		} else {
			headerDirectoryPath.mkdirs();
			templateName += 1;
			return false;		
		}
	}

	private boolean compare(File template) {
		BufferedReader br1 = null;
		BufferedReader br2 = null;
        String line1 = "";
        String line2 = "";
        String splitBy = ",";
        int rowNumb = 0;
        try {
        	br1 = new BufferedReader(new FileReader(template));
        	br2 = new BufferedReader(new FileReader(savedAvails));
        	while ((line1 = br1.readLine()) != null) {
        		if ((line2 = br2.readLine()) != null) {
        			String[] row1 = line1.split(splitBy);
        			String[] row2 = line2.split(splitBy);
        			if (row1.length == row2.length) {
        				for (int i = 0; i < row1.length; i++) {
	        				if (!row1[i].contains(row2[i])) {
	        					return false;
	        				} else {
	        					if (line1 != null) {
	        						headers.add(line1);
	        					} else {
	        						headers.add("");
	        					}
	        				}
        				}
        			} else {
            			return false;
            		}
        		} else {
        			return false;
        		}
        		rowNumb++;
        	}
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
        	if (br1 != null) {
        		try {
        			br1.close();
        		} catch (IOException e) {
        			e.printStackTrace();
        		}
        	}
        	if (br2 != null) {
        		try {
        			br2.close();
        		} catch (IOException e) {
        			e.printStackTrace();
        		}
        	}
        }
        start = rowNumb;
		return true;
	}
	
	public ArrayList<Entry> readAvails() {
		ArrayList<Entry> data = new ArrayList<Entry>();
		if (index != null) {
			BufferedReader reader;
	        String splitBy = ",";
			String currentLine;
			try {
				reader = new BufferedReader(new FileReader(savedAvails));
				//writer = new FileOutputStream(savedAvails);
				int rowNumb = 0;
				while((currentLine = reader.readLine()) != null) {
					if (rowNumb > start) {
						
						String[] passStrs = new String[] {"", "", "", "", "",
														  "", "", "", "", "",
														  "", "", "", "", "",
														  "", "", "", "", "",
														  "", "", "", "", "",
														  "", "", "", "", "",
														  "", ""};

		        		String[] row = currentLine.split(splitBy);
		        		int passStringIndex = 0;
						for (int i = 0; i < index.length; i++) {
							if (passStringIndex < passStrs.length) {
			        			if (index[i] > -1 && index[i] < row.length ) {
		        					passStrs[passStringIndex] = row[index[i]];
		        					if (passStrs[passStringIndex].contains("##")) {
		        						passStrs[passStringIndex] = passStrs[passStringIndex].replaceAll("##", ",");
		        					}
		        					passStringIndex++;
			        			} else {
			        				passStrs[passStringIndex] = "";
			        				passStringIndex++;
			        			}
							}
		        		}
						if (passStrs[28] != "" || passStrs[12] != "") {
							data.add(new Entry(passStrs));
						}
	        			
					}
				    rowNumb++;
				}
				reader.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Index never assigned");
		}
		return data;
		
	}
	
	public File getAvailsFile() {
		return savedAvails;
	}
	
	public boolean deleteCopiedAvails(File availsCopy) {
		return availsCopy.delete();
	}
	
	public String getTemplateName() {
		return templateName;
	}
	
	public int getStart() {
		return start;
	}
	
	public int getIndexOfPID() {
		return index[12];
	}
	
	public int getIndexOfTitle() {
		return index[28];
	}
	
	public void setIndex(int[] in) {
		index = in;
	}
	
	public int[] getIndex() {
		return index;
	}

	private File headerDirectoryPath;
	private File savedAvails;
	private String templateName;
	private int start;
	private ArrayList<String> headers = new ArrayList<String>();
	Queue<Integer> endOfSheet = new ArrayDeque<Integer>();
	int[] index = null;
}
