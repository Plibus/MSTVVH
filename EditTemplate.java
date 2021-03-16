import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class EditTemplate implements Runnable{
	public EditTemplate(File savedAvails, String provider, String templateName, boolean state) {		
		this.savedAvails = savedAvails;
		this.provider = provider;
		this.templateName = templateName;
		this.state = state;
		t = new Thread(this, "main");
		t.start();
	}
	
	public EditTemplate(File savedAvails, String provider, String templateName, boolean state, int[] passIndex, int start) {		
		this.savedAvails = savedAvails;
		this.provider = provider;
		this.templateName = templateName;
		this.state = state;
		setIndexData(passIndex);
		this.start= start; 
		t = new Thread(this, "main");
		t.start();
	}
	
	public void run() {
		if (state) {
			System.out.println("EDITING");
			TemplateCreator templateCreator = new TemplateCreator(lock, getIndexData(), start);
			Thread templateCreatorThread = new Thread(templateCreator, "template");
			templateCreatorThread.start();
			synchronized (lock) {
			    try {
			        lock.wait();
			    } catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    
			}
			this.setIndexData(templateCreator.getIndexes());
			createTemplate(templateCreator.getIndexes(), templateCreator.getFirstData(), provider);
		} else {
			System.out.println("CREATING");
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "Cannot locate template.\nWould you like to create one?", "Template Error",dialogButton);
			if(dialogResult == JOptionPane.YES_OPTION){
			    TemplateCreator templateCreator = new TemplateCreator(lock);
			    Thread templateCreatorThread = new Thread(templateCreator, "template");
			    templateCreatorThread.start();
			    synchronized (lock) {
				    try {
				        lock.wait();
				    } catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    
			    }
			    this.setIndexData(templateCreator.getIndexes());
			    createTemplate(templateCreator.getIndexes(), templateCreator.getFirstData(), provider);
			}
		}
	}
	
	public void createTemplate(int[] indexes, int start, String provider) {
		this.start = start;
		System.out.println(provider);
		createHeaderTemplate(provider);
		createTemplateIndex(indexes, provider);
	}
	
	private void createHeaderTemplate(String provider) {
		File templateLocation = new File("\\\\azvmfile\\MediaServices\\BulkAvails\\res\\res2\\HeaderTemplates\\" + provider  + "\\" + templateName + ".csv");
		BufferedReader br = null;
        String line = "";
        int rowNumb = 0;
        StringBuffer data = new StringBuffer();
	    try {
		    FileOutputStream fos = new FileOutputStream(templateLocation);
		    br = new BufferedReader(new FileReader(savedAvails));
		    while ((line = br.readLine()) != null && rowNumb < start) {
		    	 data.append(line + '\n');
		    	 rowNumb++;
		    }
		    fos.write(data.toString().getBytes());
		    fos.flush();
		    fos.close();
		    System.out.println("Template created...");
	    } catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void createTemplateIndex(int[] indexes, String provider) {
		File templateLocation = new File("\\\\azvmfile\\MediaServices\\BulkAvails\\res\\res2\\HeaderIndex\\" + templateName + ".csv");
		FileWriter writer = null;
		 try {
			 writer = new FileWriter(templateLocation);
			 for (int i = 0; i < names.length; i++) {
			     writer.append(names[i]);
			     writer.append("," + indexes[i]);
			     if ( i != names.length - 1)
			    	 writer.append('\n');
			 }
		     System.out.println("CSV file is created...");

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
		 HeaderIndex readIndex = new HeaderIndex(templateLocation); 
		 index = readIndex.getIndexes();
	}
	
	public ArrayList<Entry> getData() {
		return data;
	}

	public int[] getIndexData() {
		return indexData;
	}

	public void setIndexData(int[] indexData) {
		this.indexData = indexData;
	}

	private File savedAvails;
	private String provider;
	private String[] names = new String[] {"Title",
			  							   "VersionTitle",
										   "SerieTitle",
										   "SeasonTitle",
										   "Seasonnumber",
										   "EpisodeTitle",
										   "Episodenumber",
										   "NumberOfEpisodes",
										
										   "ContentOwner",
										   "Licensor",
										   "Country",
										   "ProductType",
										   "Studio",
										   "Network",
										
										   "PID",
										   "EIDR",
										   "ExternalId1",
										   "ExternalId2",
										   "ISAN",
										   "Priority",
										   "Right",
										   "LicenseType",
										   "FormatProfile",
									 	
										   "StartDate",
										   "StreetDate",
										   "ReleaseDate",
										   "EndDate",
						 	
										   "Tier",
										   "PriceType",
										   "Wholesaleprice",
										   "Retailprice",
										   "SDWholesaleprice",
										   "SDRetailprice",
										   "HDWholesaleprice",
										   "HDRetailprice"};

	private int[] indexData = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            				   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            				   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            				   -1, -1, -1, -1, -1};
	Thread t;
	Object lock = new Object();
	private ArrayList<Entry> data;
	private String templateName;
	private int start;
	int[] index = null;
	boolean state = false;
}
