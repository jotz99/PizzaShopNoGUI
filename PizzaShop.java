package shop;

import java.util.Scanner;

public class PizzaShop {

	public static void main(String[] args) {

// ask for customer name, type and size of pizza.
		Structure.greeting();
	 Scanner in = new Scanner(System.in);
	 
        System.out.println("Enter customer name: ");
        String name = in.nextLine();
        
        System.out.println("What type of pizza would you like, regular or feast? ");
        String type = in.nextLine();
        
        while( (! type.equalsIgnoreCase("regular"))&&(! type.equalsIgnoreCase("feast")))
        		{
        	System.out.println("Size Unavailable... Please Enter Either Regular or Feast? ");
             type = in.nextLine();
        	
        }
      
        System.out.println("What size of pizza would you like, small, medium or large? ");
        String size = in.nextLine(); 
        while( (! size.equalsIgnoreCase("small") &&(! size.equalsIgnoreCase("medium"))&&(! size.equalsIgnoreCase("large")) ))
		{
	System.out.println("Type Unavailable... Please Enter Either Small,Medium or Large? ");
     size = in.nextLine();
	
}

/* Find total price of pizza as per selection of the user for each pizza type. 
[5 Marks] */

if (type.equalsIgnoreCase("regular"))
        {Pizza pR = new Regular(type,size,name);
        pR.getToppings();
        	System.out.println(pR.toString()); }	
if (type.equalsIgnoreCase("feast"))
        {Pizza pF = new Feast(type,size,name);
        pF.getToppings();
	    System.out.println(pF.toString()); }	     
        	
        
        
      //  if(type.equalsIgnoreCase()){
        	
        	
    //    }

        
    
      in.close();
        /* Finally call the toString() method from your Pizza Class and modify it to display the customer name, their type, size and toppings and the total cost of the pizza. [2 Marks] */  
	}
	
}

	
	

	
	


	

	
	

	
	





