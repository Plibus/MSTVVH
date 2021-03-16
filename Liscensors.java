import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Liscensors {
	public Liscensors(String ContentOwner) {
		String name = modifyName(ContentOwner);
		File priceCardFile = new File("\\\\azvmfile\\MediaServices\\BulkAvails\\res\\Liscensors\\" + name  + ".csv");
		//System.out.println(priceCardFile.getName());
		for (int i = 0; i < cards.length; i++) {
			cards[i] = new ArrayList<Tier>();
		}
		readPriceCard(priceCardFile);
	}
	
	public void getAll() {
		for (int i = 0; i < cards.length; i++) {
			//System.out.print(i);
			for (int j = 0; j < cards[i].size(); j++) {
				System.out.print(cards[i].get(j).getliscensor() + "|");
				System.out.print(cards[i].get(j).getRights() + "|");
				System.out.print(cards[i].get(j).gettierName() + "|");
				System.out.print(cards[i].get(j).getWsp() + "|");
				System.out.print(cards[i].get(j).getRtp() + "\n" );
				System.out.println("---------------------------------------------");
			}
		}
		
	}
	
	public Tier getTierByName(int country, String rights, String name) {
		if (isNumber(name)) {			
			name = "Tier " + name;
		}
		for (int i = 0; i < cards[country].size(); i++) {
			if (cards[country].get(i).getRights().contentEquals(rights)) {
				if (cards[country].get(i).gettierName().contains(name)) {
					return cards[country].get(i);
				}
			}
		}
		return null;
	}
	
	public Tier getTierByPrice(int country, String rights, Double price) {
		for (int i = 0; i < cards[country].size(); i++) {
			if (cards[country].get(i).getRights().contentEquals(rights)) {
				if (Math.abs((cards[country].get(i).getWsp() - price)) <= 0.05) {
					return cards[country].get(i);
				}
			}
		}
		return null;
	}
	
	private void readPriceCard(File priceCardFile) {
		BufferedReader reader;
        String splitBy = ",";
		String currentLine;
		try {
			reader = new BufferedReader(new FileReader(priceCardFile));
			while((currentLine = reader.readLine()) != null && !currentLine.contentEquals("")) {
				String[] row = currentLine.split(splitBy);
				int countryIndex;
				
				if (row[1].contentEquals("US")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 0;
					} else {
						countryIndex = 20;
					}					
				} else if (row[1].contentEquals("BR")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 1;
					} else {
						countryIndex = 21;
					}
				} else if (row[1].contentEquals("MX")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 2;
					} else {
						countryIndex = 22;	
					}
					
				} else if (row[1].contentEquals("CA")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 3;
					} else {
						countryIndex = 23;
					}
				} else if (row[1].contentEquals("AU")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 4;
					} else {
						countryIndex = 24;	
					}
				} else if (row[1].contentEquals("NZ")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 5;
					} else {
						countryIndex = 25;	
					}
				} else if (row[1].contentEquals("AT")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 6;
					} else {
						countryIndex = 26;
					}
				} else if (row[1].contentEquals("BE")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 7;
					} else {
						countryIndex = 27;
					}
				} else if (row[1].contentEquals("DK")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 8;
					} else {
						countryIndex = 28;
					}
				} else if (row[1].contentEquals("FI")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 9;
					} else {
						countryIndex = 29;	
					}
				} else if (row[1].contentEquals("FR")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 10;
					} else {
						countryIndex = 30;	
					}
				} else if (row[1].contentEquals("DE")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 11;
					} else {
						countryIndex = 31;	
					}
				} else if (row[1].contentEquals("IE")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 12;
					} else {
						countryIndex = 32;	
					}
				} else if (row[1].contentEquals("IT")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 13;
					} else {
						countryIndex = 33;	
					}
				} else if (row[1].contentEquals("NL")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 14;
					} else {
						countryIndex = 34;	
					}
				} else if (row[1].contentEquals("NO")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 15;
					} else {
						countryIndex = 35;	
					}
				} else if (row[1].contentEquals("ES")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 16;
					} else {
						countryIndex = 36;
					}
				} else if (row[1].contentEquals("SE")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 17;
					} else {
						countryIndex = 37;	
					}
				} else if (row[1].contentEquals("CH")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 18;
					} else {
						countryIndex = 38;	
					}
				} else if (row[1].contentEquals("GB")) {
					if (row[2].contentEquals("Movie")) {
						countryIndex = 19;
					} else {
						countryIndex = 39;	
					}
				} else {
					countryIndex = -1;
				}
				
				if (countryIndex != -1) {
					String modifiedLiscensor;
					row[0].replaceAll("\\|", ",");
					modifiedLiscensor = row[0].replaceAll("##", ",");
					row[3].replaceAll("\\##", ",");
					cards[countryIndex].add(new Tier(modifiedLiscensor, row[3], row[4], row[5], row[6]));
				} else {
					//System.out.println("ERROR in Reading price card at product level " + row[1] + " " + row[2] );	
				}
			}
			reader.close(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private String modifyName(String provider) {
		String fileN;
		int length = provider.length();
		if (length <= 10) {
			return provider;	
		}
		fileN = provider.substring(0, 3);
		if (fileN.contentEquals("The")) {
			fileN = provider.substring(4, 9);
			return provider;
		}
		fileN = provider.substring(0, 9);
		return fileN;
	}
	
	public boolean isNumber(String string) {
		try {
            @SuppressWarnings("unused")
			Double num = Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
	}
	
	@SuppressWarnings("unchecked")
	ArrayList<Tier>[] cards = new ArrayList[40];
}
