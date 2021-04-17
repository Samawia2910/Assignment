/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projectmanagementproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.jfr.events.FileReadEvent;

/**
 *
 * @author Samawiaijaz
 */
public class Projectmanagement {
    
    private static Projectmanagement instance;
    
    private List<Project> projects; 
    
    private Projectmanagement(){
        members = new ArrayList<Member>();
    }
    
    public static Projectmanagement getIsntance(){
        if(instance==null)
        {
            instance = new Projectmanagement();
        }
        
        return instance;
    }
    
    
    public void addMember(Member c){
        contacts.add(c);
    }
    
    private int searchMember(String name)
    {
        int index = -1;
         for(int i = 0 ; i  < members.size(); i++)
         {
             if(members.get(i).getMembersname().equals(name))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    
    public Member getMembers(String name)
    {
        int index = searchMember(member);
        return members.get(index);
    }
     public boolean updateMember(String name ,Member c){
       int index = searchMember(name);
       
       if(index == -1)
           return false;
       else {
           members.set(index, c);
           return true;
       }
    }
    
     
    public boolean deleteMember(String name){
       int index = searchMember(member);
       
       if(index == -1)
           return false;
       else {
           members.remove(index);
           return true;
       }
    }
    
    public List<Member> getAllMembers(){
        return memebers;
    }
    
   
    
    public List<Member> searchBasedOnEmail(String emailIdText){
        List<Member> searched = new ArrayList<Contact>();
        
         for(int i = 0 ; i  < members.size(); i++)
         {
             if(memebers.get(i).getEmail().contains(emailIdText))
             {
                 searched.add(members.get(i));
             }
         }
        return searched;
    }
    
    
    
     public List<Member> searchBasedOnName(String nameText){
        List<Member> searched = new ArrayList<Member>();
        
         for(int i = 0 ; i  < members.size(); i++)
         {
             if(memebers.get(i).getName().contains(nameText))
             {
                 searched.add(memebers.get(i));
             }
         }
        return searched;
    }
     
     
      public List<Member> searchBasedOnMember(String memText){
        List<Member> searched = new ArrayList<Member>();
        
         for(int i = 0 ; i  < memebers.size(); i++)
         {
             if(members.get(i).getMembername().contains(memText))
             {
                 searched.add(meembers.get(i));
             }
         }
        return searched;
    }
    
    
    public void saveData(String filename)
    {
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Name,Email,Member,Date Of Birth,Saved On\n");
            
            for(int i = 0 ; i < members.size();i++)
            {
                bw.write(members.get(i).getName() + ", "+
                        members.get(i).getEmail() + ","+
                        members.get(i).getMembername()+","+
                        members.get(i).getDob().toString()+","+
                        members.get(i).getSavedOn().toString()+"\n"
                );
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(Projectmanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
        public void loadData(String filename)
    {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            
          String line = br.readLine();
            
          line = br.readLine();
          while(line != null)
          {
               Member c = new Member();
               String[] toks = line.split(",");
               
               c.setName(toks[0]);
               c.setEmail(toks[1]);
               c.setMembername(toks[2]);
               
                  SimpleDateFormat formatter5=new SimpleDateFormat("E MMM dd HH:mm:ss yyyy");  
                 Date d =  formatter5.parse(toks[3].replace(" PKT", ""));
               c.setDob(d);
                   Date d1=formatter5.parse(toks[4].replace(" PKT", ""));  
               c.setSavedOn(d1);
               Projectmanagement.getIsntance().addMember(c);
               
          }
             
              
          
            
            
            br.close();
            fr.close();
        } catch (Exception ex) {
            Logger.getLogger(Projectmanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
