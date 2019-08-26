// Binary Search Tree
// 04 April 2017
// Yaseen Hull


import java.io.*;
import java.util.Scanner;

/**
 * Phonebook using Binary Search Tree data structure
 */
 
public class BSPhonebook
{
	public static void main ( String [] args )
  	{
		BinarySearchTree<String> bt = new BinarySearchTree<String> ();
	
		try
		{	
			/**
			 * testdata contains all contacts for phonebook
			 * each contact has address, number and name, must be split to establish key
			 */ 
			BufferedReader input = new BufferedReader(new FileReader("testdata"));// test data (full entry) read in
			int i =0;				
			String data;
			while ((data=input.readLine()) != null)
			{	i++;
				String[] parts = data.split("\\|"); //split each line read in based on symbol
				String partName = parts[2]; //3rd string in split is the key (name)
			
				bt.insert(partName,data); //inserts/adds entry into binary tree structure
			}
			/**
			 * printIt method prints inorder traversal of BST
			 */
			bt.printIt(); 
			
			/**
			 * QueryFile contains 20 names to be compared to for search function
			 * Query is used all names of test is made available to be compared
			 * when Query is used as input then parameters can be adjust to fluctuate number of entries in experiment
			 */
			 
			BufferedReader in = new BufferedReader(new FileReader("QueryFile"));// Query contains all names from test data
			
			int j=0;
			String names;
			while ((names = in.readLine()) != null)// && i <10000) //parameters can be adjusted to conducted experiment
			{
				j++;
				System.out.println(bt.searchIt(names).getString());//get String returns entry data
									
			}
		
			return;
			
		}
		
		/**
		 * @throws filenotfoundexception throws exception if input file is not found
		 */
		catch(FileNotFoundException filenotfoundexception)
		{
			System.out.println("File not found. ");
		}
		/**
		 * @throws ioexception throws exception if input is incorrect
		 */
		catch(IOException ioexception)
		{
			System.out.println("File input error occured!");
		}
		/**
		 * @throws nullpointerexception throws exception if name in query file is not in database
		 */ 
		catch(NullPointerException nullpointerexception)
		{
			System.out.println("Not Found");
		}
	
	}
	
	public static void quitError(String msg)
	{
		System.out.println(msg);
		System.out.println("Program will now quit. ");
		System.exit(0);
	}
}

