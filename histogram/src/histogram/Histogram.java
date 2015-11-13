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
        int userinput=0; int ctr1=0,ctr2=0,ctr3=0,ctr4=0,ctr5=0,ctr6=0,ctr7=0,ctr8=0,ctr9=0,ctr10 = 0;
     System.out.println("Enter numbers 1-100 for as long as you like, enter a number outside of that interval to end.");   
     Scanner scanner = new Scanner (System.in);
        while (userinput<=100){
            userinput = scanner.nextInt();
            if (userinput>=1 && userinput<10){
                ctr1++;
            }
            else if (userinput>=10 && userinput<20){
                ctr2++;
            }
            else if (userinput>=20 && userinput<30){
                ctr3++;
            }else if (userinput>=30 && userinput<40){
                ctr4++;
            }else if (userinput>=40 && userinput<50){
                ctr5++;
            }else if (userinput>=50 && userinput<60){
                ctr6++;
            }else if (userinput>=60 && userinput<70){
                ctr7++;
            }else if (userinput>=70 && userinput<80){
                ctr8++;
            }else if (userinput>=80 && userinput<90){
                ctr9++;
            }else if (userinput>=90 && userinput<100){
                ctr10++;
            }
        }
        System.out.print("1-10/");
                for (int i=ctr1;i>0;i--){
                    System.out.print("*");
                }
        System.out.println();
        System.out.print("10-20/");
                for (int i=ctr2;i>0;i--){
                    System.out.print("*");
                }
        System.out.println();
        System.out.print("20-30/");
                for (int i=ctr3;i>0;i--){
                    System.out.print("*");
                }
        System.out.println();
        System.out.print("30-40/");
                for (int i=ctr4;i>0;i--){
                    System.out.print("*");
                }
        System.out.println();
        System.out.print("40-50/");
                for (int i=ctr5;i>0;i--){
                    System.out.print("*");
                }
        System.out.println();
        System.out.print("50-60/");
                for (int i=ctr6;i>0;i--){
                    System.out.print("*");
                }
        System.out.println();
        System.out.print("60-70/");
                for (int i=ctr7;i>0;i--){
                    System.out.print("*");
                }
        System.out.println();
        System.out.print("70-80/");
                for (int i=ctr8;i>0;i--){
                    System.out.print("*");
                }
        System.out.println();
        System.out.print("80-90/");
                for (int i=ctr9;i>0;i--){
                    System.out.print("*");
                }
        System.out.println();
        System.out.print("90-100/");
                for (int i=ctr10;i>0;i--){
                    System.out.print("*");
                }
        System.out.println();
    }
    
}
