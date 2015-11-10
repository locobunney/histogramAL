/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histogram;
import java.util.Scanner;
/**
 *
 * @author Andrew_2
 */
public class Histogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int userinput=0;
     System.out.println("Enter numbers 1-100 for as long as you like, enter a number outside of that interval to end.");   
     Scanner scanner = new Scanner (System.in);
        while (userinput<=100){
            userinput = scanner.nextInt();
            
        }
    }
    
}
