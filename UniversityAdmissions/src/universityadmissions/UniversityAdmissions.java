/*
 * Art University Admissions 
 */
package universityadmissions;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Laura
 */
public class UniversityAdmissions {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileReader AdmissionFile = new FileReader("Admission.txt");
        Scanner scan =new Scanner(AdmissionFile);
        PrintWriter myOutputFile = new PrintWriter("AccpetedOrRejected File");
        myOutputFile.println("Name" + "\t" + "\t" + "\t" + "Result");
        while(scan.hasNext()){
            String FirstName = scan.next();
            
            String LastName = scan.next();
            
            String portfolio = scan.next();
            
            int average = scan.nextInt();
            
            int clubs = scan.nextInt();
            
            String artContest = scan.next();
            
            int goodDrawing = scan.nextInt();
            
            String photoshop =scan.next();
            
            int artMark = scan.nextInt();
            String name = FirstName + " " + LastName;
            
            if (portfolio.equals("yes") && (goodDrawing >= 2 || artMark >= 85) 
                    && clubs >= 3){
                String Accpted ="Accpted";
                myOutputFile.println(name + "\t" + "\t" + Accpted);
            }else if (photoshop.equals("yes") && artContest.equals("yes") 
                    || average >= 90){
                String Accpted ="Accpted";
                myOutputFile.println(name + "\t" + "\t" + Accpted);
            }else if (average >= 80 && artMark >= 90 && clubs >=4){
                String Accpted ="Accpted";
                myOutputFile.println(name + "\t" + "\t" + Accpted);
            }else if (artContest.equals("yes")||goodDrawing >= 4){
                String Accpted ="Accpted";
                myOutputFile.println(name + "\t" + "\t" + Accpted);
            }else{
                String Rejected = "Rejected";
                myOutputFile.println(name + "\t" + "\t" + Rejected);
            }
        }//end of while loop
        
        myOutputFile.close();
    } //end of main
}//end of class
