
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HeaderIndex {
	public HeaderIndex() {}
	public HeaderIndex(File indexFile) {
		BufferedReader br = null;
		//System.out.println("Reading index at: " + indexFile.getAbsolutePath());
        try {
            //Reading the csv file
        	FileReader read = new FileReader(indexFile);
            br = new BufferedReader(read);
            String line = "";
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(COMMA_DELIMITER);
                if(data.length > 0 ) {
                	try{
                		indexes[i] = Integer.parseInt(data[1]);
                	} catch(NumberFormatException ex) {
                		indexes[i] = -1;
                	}
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

	private static final String COMMA_DELIMITER = ",";
	private int[] indexes = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
     								   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
     								   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
     								   -1, -1, -1, -1, -1};
}
