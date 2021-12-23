/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo2021;
import Controller07320.AllObjectController07320;
import java.util.Scanner;
import Gui07320.RecordGui07320;

public class ProjectPBO2021 {
static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
      dataDefault();
      RecordGui07320 g = new RecordGui07320();
    }
    static void dataDefault(){
        AllObjectController07320.recordcontroller.InsertRecord("Jatim", 19, 15, 39);
        AllObjectController07320.recordcontroller.InsertRecord("Jateng", 21, 15, 81);
        AllObjectController07320.recordcontroller.InsertRecord("Kalbar", 20, 16, 6);
        AllObjectController07320.recordcontroller.InsertRecord("Jabar", 23, 16, 77);
        AllObjectController07320.recordcontroller.InsertRecord("Sulteng", 31, 17, 40);
        AllObjectController07320.recordcontroller.InsertRecord("Sumut", 22, 17, 76);  
    }
}