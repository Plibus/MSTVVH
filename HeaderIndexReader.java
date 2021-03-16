import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HeaderIndexReader {
	public HeaderIndexReader() {}
	public HeaderIndexReader(File file) {
		BufferedReader br = null;
        try {
            //Reading the csv file
        	FileReader read = new FileReader(file);
            br = new BufferedReader(read);
            String line = "";
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(COMMA_DELIMITER);
                if(data.length > 0 ) {
                	names[i] = data[0];
                	try{
                		indexes[i] = Integer.parseInt(data[1]);
                	} catch(NumberFormatException ex){ // handle your exception
                		indexes[i] = -1;
                	}
                	//System.out.println(names[i] + " " + indexes[i]);
                	i++;
                }
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                br.close();
            }
            catch(IOException ie) {
                System.out.println("Error occured while closing the BufferedReader");
                ie.printStackTrace();
            }
        }
	}
	
	public int[] getIndexes() {
		return indexes;
	}
	public String[] getNames() {
		return names;
	}
	private static final String COMMA_DELIMITER = ",";
	private int[] indexes = new int[35];
	private String[] names = new String[35];
}