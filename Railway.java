/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railway;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Railway {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        Tickets b=new Tickets();
        System.out.println("Enter the Option");
        System.out.println("1.book");
        System.out.println("2.Cancel");
        System.out.println("3.print TIcket");
        System.out.println("4.Available Tickets");
        System.out.println("5.Exit");
        int pid=1;
        do{
            
        int choice=sc.nextInt();
        
        switch(choice)
        {    case 1:
                System.out.println("Name");
                String Name=sc.nextLine();
                sc.nextLine();
                System.out.println("Age");
                int Age=sc.nextInt();
                sc.nextLine();
                System.out.println("Gender");
                String Gender=sc.nextLine();
                System.out.println("BerthPreference");
                String BerthPreference=sc.nextLine();
                System.out.println("Booked !!Your PassengerId-->"+pid);
                System.out.println("Your Berth is at"+b.book(Name,Age,Gender,BerthPreference,pid));
                
                pid++;
                break;
        case 2:
               System.out.println("Enter Passenger Id");
               int PassengerId=sc.nextInt();
               sc.nextLine();
               String AllotedBerth=sc.nextLine();
               b.cancel(PassengerId,AllotedBerth);
               break;
            
        case 3:
               System.out.println("Enter Passenger Id");
               int TicketId=sc.nextInt();
               b.printTicket(TicketId);
               break;
        case 4:
            b.Avail();
            break;
            
               
        default:
                
                 exit(0);
        }         
        }while(true);
    }
    
}
