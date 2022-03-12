/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railway;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author HP
 */
     
public class Tickets {
    
  
    ArrayList<String> passengerName;
    //list of all passenger IDs
    ArrayList<Integer> passengerIDs;
    Queue<Integer> rac1;
    Queue<Integer> waitingList;
   int confirm=63;
   int rac=18;
   int waitinglist=21;
    int lower=21;
    int middle=21;
    int upper=21;
         
    public Tickets(){
         passengerName = new ArrayList();
         passengerIDs = new ArrayList();
         rac1=new LinkedList();
         waitingList=new LinkedList();
        
    }
    
    public  String book(String PassengerName,int Age,String Gender,String Berthpreference,int passengerId)
    {
        passengerName.add(PassengerName);
        passengerIDs.add(passengerId);
        
        if(Age>5)
                    
           {
        if(confirm>0)
                {   
                    if(Age>60)
                    {   
                        if(lower<0)
                        {                    
                          lower--;
                          confirm--;
                          return "Lower";
                        }
                       
                    }  
                    else if("middle".equals(Berthpreference)){
                        if(middle>0)
                        {                   
                          middle--;
                          confirm--;
                          return "Middle";
                        }
                        else if(upper<0)
                        {                   
                          upper--;
                          confirm--;
                          return "Upper";
                        }
                    }
                     else if(Berthpreference.equals("upper")){
                        
                        if(upper>0)
                        { confirm--;  
                          upper--;
                          return "Upper";
                        }
                        else if(middle>0)
                        { confirm--;                  
                          middle--;
                          return "Middle";
                        }
                     
                   
                    }
                
                }          
        else if(rac>0)
      {
            rac1.add(passengerId);
            rac--;
                return "SideLower";
      }
            
            
        else if(waitinglist>0)
                    {   waitingList.add(passengerId);
                        waitinglist--;
                        return "WaitingList";
                    }
        else{       
        return "No tickets Available";
        }
           }
        return "Not alloted because .You are child so you can travel free of cost with your parents";
                }

    
    void printTicket(int TicketId) {
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Avail() {
        System.out.println(" Available Tickets                -->"+confirm);
        System.out.println("You can book rac tickets upto     -->"+rac+"tickets");
        System.out.println("Waiting list option availabe up to--> "+waitinglist+"tickets");
       
            
    }

    void cancel(int PassengerId, String AllotedBerth) {
          int indexToRemove = passengerIDs.indexOf(PassengerId);
       if(indexToRemove < 0)
       {
           System.out.println("Passenger ID not found!");
           return;
       }
        passengerIDs.remove((PassengerId)-1);
        
        if(rac<18)
        { int toconfirm;
              toconfirm = rac1.peek();
              passengerIDs.add(toconfirm);
              if(waitinglist<10)
              {int torac = waitingList.peek();
              rac1.add(torac);
                  
              }
              else{
                  rac++;
              }
        }
        else
        {
          confirm++;  
        }
        
        if(AllotedBerth.equals("middle"))
        {
middle++;
//To change body of generated methods, choose Tools | Templates.
    }
        if(AllotedBerth.equals("lower"))
        {
lower++;//To change body of generated methods, choose Tools | Templates.
    }
        if(AllotedBerth.equals("upper"))
        {
upper++;//To change body of generated methods, choose Tools | Templates.
    }
        
        
    }  }

