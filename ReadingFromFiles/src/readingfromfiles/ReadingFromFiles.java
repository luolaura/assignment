/*
 * Read from a file
 */
package readingfromfiles;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author luol3562
 */
public class ReadingFromFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileReader medalCountFile = new FileReader("Medal counts.txt");
        
        Scanner scan =new Scanner(medalCountFile);
        
        PrintWriter myOutputFile = new PrintWriter("Output Medal File");
        
        myOutputFile.println("Country" + "\t" + "Total Medals");
        
        while(scan.hasNext()){
            String country = scan.next();
            
            int goldMedals = scan.nextInt();
            
            int sliverMedals =scan.nextInt();
            
            int bronzeMedals = scan.nextInt();
            
            System.out.println(country + " has " + goldMedals +" gold, " + sliverMedals + " sliver, " + bronzeMedals +" bronze.");
            
            int medalCount = goldMedals + sliverMedals + bronzeMedals;
            
            myOutputFile.println(country + "\t" + medalCount);
            
        }
        myOutputFile.close();
    }
}
