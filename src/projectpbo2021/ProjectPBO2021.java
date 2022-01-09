package projectpbo2021;
import Controller07276.AllObjectController; 
import Gui07276.RecordGui;
import java.util.Scanner;

public class ProjectPBO2021 {
     static Scanner input = new Scanner(System.in);   
     public static void main (String [ ] args) {
        dataDefault();
         RecordGui g=new RecordGui();
     }
static void dataDefault(){
AllObjectController.recordcontroller.InsertRecord( "Jatim" ,19,15,39); 
AllObjectController.recordcontroller.InsertRecord( "Jateng" ,21,15,81);
AllObjectController.recordcontroller.InsertRecord( "Kalbar" ,20,16,6);
AllObjectController.recordcontroller.InsertRecord( "Jabar" ,23,16,77);
AllObjectController.recordcontroller.InsertRecord( "Sulteng",31,17,40);
AllObjectController.recordcontroller.InsertRecord( " sumut ",22,17,76);

}
        }


