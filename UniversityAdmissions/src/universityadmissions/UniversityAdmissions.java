/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package universityadmissions;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author LHY
 */
public class UniversityAdmissions {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileReader AdmissionFile = new FileReader("Admission.txt");
        Scanner scan =new Scanner(AdmissionFile);
        PrintWriter myOutputFile = new PrintWriter("Accpeted File");
        myOutputFile.println("Name" + "\t" + "Result");
        while(scan.hasNext()){
            String name = scan.next();
            
            String portfolio = scan.next();
            
            int average = scan.nextInt();
            
            int clubs = scan.nextInt();
            
            String artContest = scan.next();
            
            int goodDrawing = scan.nextInt();
            
            String photoshop =scan.next();
            
            int artMark = scan.nextInt();
            
            if (portfolio.equals("yes") && (goodDrawing >= 2 || artMark >= 85) && clubs >= 3){
                String Accpted ="Accpted";
                myOutputFile.println(name + "\t" + Accpted);
            }else if (photoshop.equals("yes") && artContest.equals("yes") || average >= 90){
                String Accpted ="Accpted";
                myOutputFile.println(name + "\t" + Accpted);
            }
        }
        
        myOutputFile.close();
    }
}
