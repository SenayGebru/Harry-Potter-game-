/**
 * This program reads data from a file and sorts it based on value to be written 
 * into a created file succesfully for viewing.
 * 10/02/2022
 * @author Senay Gebru
 */

import java.util.Scanner;
import java.io.*;


public class LAB4A
{
    public static void main (String[] args) throws IOException
    {
     
        File file = new File("steps.txt");
        Scanner infile = new Scanner(file);

        double highActivity, mediumActivity, lowActivity;
        double Highcounter = 0 ,  Mediumcounter = 0 , Lowcounter = 0 , totalDays = 0;


       while (infile.hasNext())
 {
        int num  = infile.nextInt();
        

        if (num >= 10000)
        {
            
            Highcounter++;

        }

        if (num <= 9999 && num >= 5000)
        {
           
            Mediumcounter++;
        }

        if (num < 5000)
        {
            
            Lowcounter++;
        }
        totalDays++;   
  }     
  infile.close();

           
            
            highActivity = (Highcounter/totalDays)*100;
            mediumActivity = (Mediumcounter/totalDays)*100;
            lowActivity = (Lowcounter/totalDays)*100;

            PrintWriter outfile = new PrintWriter("Activityresults.txt");
            outfile.println("***Activity Results*** ");
            outfile.println();
            outfile.printf("High Activity Days: %.0f , %.2f",Highcounter , highActivity);
            outfile.print(" %\n");
            outfile.printf("Medium Activity Days: %.0f ,  %.2f", Mediumcounter , mediumActivity);
            outfile.print(" %\n");
            outfile.printf("Low Activity Days:  %.0f , %.2f", Lowcounter, lowActivity);
            outfile.print(" %\n");

       outfile.close();
    }
}