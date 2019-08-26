// Binary Search Tree
// 04 April 2017
// Yaseen Hull

import java.io.*;
import java.util.Scanner;
import java.util.*;

/**
 * A list containing all the phonebooks contacts and entry
 * linear structure
 */
public class LinearPhonebook
{
        public static void main ( String [] args )
        {

                try
                {	/**
                         * testdata contains all contacts for the phone book
                         * each contact has address, number and name and must be split to establish key
                         */
                        BufferedReader input = new BufferedReader(new FileReader("testdata"));
                        int i=0;
                        String data;
                        ArrayList<String> entryList = new ArrayList<String>();
                        ArrayList<String> nameList = new ArrayList<String>();
                        
                        while ((data=input.readLine()) != null)
                        {
                                String[] parts = data.split("\\|");
                                String partName = parts[2];
                                entryList.add(data); //full entry array list
                                nameList.add(partName); //name array list


            
                        }
                       // System.out.println(entryList);
                       /**
                        * if Query is read then all entries are considered for comparison
                        * the parametes can then be adjusted to set number of entries
                        */
                        
                       BufferedReader in = new BufferedReader(new FileReader("QueryFile"));
                       int j = 0;
                       String names;
                       while ((names = in.readLine()) != null) // && j <10000) //parameter adjustment
                       {	j++;
                                SearchItLinear(names,entryList);
                       }    
                        return;
    
                }
                /**
                 * @throws filenotfoundexception throws an exception of the input file is not found
                 */
                 
		catch(FileNotFoundException filenotfoundexception)
                {
                        System.out.println("File not found. ");
                }
                /**
                 * @throws ioexception throws an exception if in incorrect input is inserted
                 */
                catch(IOException ioexception)
                {
                        System.out.println("File input error occured!");
                }

        }

        public static void quitError(String msg)
        {
                System.out.println(msg);
                System.out.println("Program will now quit. ");
                System.exit(0);
        }
        public static void SearchItLinear(String d,ArrayList<String> entryList)
        {
                for (int i =0; i< entryList.size();i++) //search it gets size of entry list to traverse through
                {
                        String [] parts = (entryList.get(i)).split("\\|"); //split entries based on character symbol
                        String partName = parts[2];
                        if (d.equals(partName)) // compare query file to entries in entryList (d is names from query file)
                        {
                                System.out.println(entryList.get(i));
                        }
                       
       
                        
                        	
                }
        }
}          
