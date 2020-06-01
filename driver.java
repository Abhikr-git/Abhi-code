import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		String csvFile = "/home/rhyme/eclipse-workspace/RhymeDS/src/unspsc codes_3-1.csv";
		String line = "";
		final int SIZEOFINPUT = 997;
		String[] segmentName = new String[SIZEOFINPUT];
		String[] familyName = new String[SIZEOFINPUT];
		String[] className = new String[SIZEOFINPUT];
		String[] commodityName = new String[SIZEOFINPUT];
		int[] segmentNum = new int[SIZEOFINPUT];
		int[] familyNum = new int[SIZEOFINPUT];
		int[] commodityNum = new int[SIZEOFINPUT];
		int[] classNum = new int[SIZEOFINPUT];
		Commodity[] commodities = new Commodity[SIZEOFINPUT];
        String cvsSplitBy = ",";
        for(int i = 0; i < SIZEOFINPUT; i++) {
	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
	            while ((line = br.readLine()) != null) {
	            	if(!line.contains("\"")) {
		                // use comma as separator
		                String[] country = line.split(cvsSplitBy);
				        segmentNum[i] = Integer.parseInt(country[0]);
				        segmentName[i] = country[1];
				        familyNum[i] = Integer.parseInt(country[2]);
				        familyName[i] = country[3];
				        classNum[i] = Integer.parseInt(country[4]);
				        className[i] = country[5];
				        commodityNum[i] = Integer.parseInt(country[6]);
				        commodityName[i] = country[7];
				        Commodity C1 = new Commodity(segmentName[i], familyName[i], className[i], commodityName[i], 
				        		segmentNum[i], familyNum[i], classNum[i], commodityNum[i]);	
				        boolean flag = false;
				        for(int j = 0; j < i; j++) {
				        	if(commodities[j].compareTo(C1) == 0) {
				        		flag = true;
				        		break;
				        	}
				        }
				        if(!flag) {
				        	commodities[i] = C1;
				        }
	            }   
	            }
	
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
        }
        for(int i = 0; i < SIZEOFINPUT; i++) {
        }
        System.out.println("DONE!");
        
	}

}
