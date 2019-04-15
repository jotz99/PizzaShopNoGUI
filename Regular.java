package shop;

import java.util.Scanner;

public  class Regular extends Pizza implements PizzaPrice {

	

	public Regular(String type, String size,String name) {
		super(type, size ,name);
		// TODO Auto-generated constructor stub
	}
	
    public Regular() {
    }
    


/*Define the toppings here, ask the user, max 2 toppings allowed for Regular type pizza. Populate your ArrayList of Toppings defined in Pizza class in here. Also compute here the total cost of ordering the extra toppings. [3 Marks] */

	@Override
	public void getToppings() {
		
	  Scanner in = new Scanner(System.in);
        System.out.println("How many toppings would you like? Max 2 Toppings Allowed in Regular Pizza.");
        int numToppings = in.nextInt();
      // Check for correct
        while(numToppings < 0 || numToppings>2)
        {
        	System.out.println("Please Enter Correct Number of Toppings. Max 2");
            numToppings = in.nextInt();	
        }
        
        
        
       for(int i= 0 ; i<numToppings;i++) {
			if (numToppings==1) {
				
			System.out.println("Please Enter Desired Toping:");
			super.toppings.add(in.next());}
			
			if (numToppings==2) {
				System.out.println("Please Enter Desired Toping "+(i+1)+ " :");
				super.toppings.add(in.next());
				}
       }
			
			
			
				
			
		
		
		
		if(this.getSize().equalsIgnoreCase("small") ) 
		{
			
			this.setTotalCost(this.PriceofSmallPizza(super.getPriceOfBasePizza()[0]) + this.TaxOnPizza(this.PriceofSmallPizza(super.getPriceOfBasePizza()[0])));	
		}
		
		 if(this.getSize().equalsIgnoreCase("medium")){
			this.setTotalCost(this.PriceofMediumPizza(super.getPriceOfBasePizza()[1]) + this.TaxOnPizza(this.PriceofMediumPizza(super.getPriceOfBasePizza()[1])));
		}
		 if(this.getSize().equalsIgnoreCase("large")){
			this.setTotalCost(this.PriceofLargePizza(super.getPriceOfBasePizza()[2]) + this.TaxOnPizza(this.PriceofLargePizza(super.getPriceOfBasePizza()[2])));
		}
		 
		
		 in.close();
	}


/*Implement the PizzaPrice Interface’s methods here to find the price of each pizza by its size using the cost of toppings. One of the method is implemented for your reference.   [3 Marks] */


	@Override
	public double PriceofSmallPizza(double BasePriceSmall) {
		double cost= super.toppings.size()*super.getCostoftopping();
		return BasePriceSmall+cost;
	}



@Override
public double PriceofMediumPizza(double BasePriceMedium) {
	double cost= super.toppings.size()*super.getCostoftopping();
	return BasePriceMedium+ cost;
	
}



@Override
public double PriceofLargePizza(double BasePriceLarge) {
	double cost= super.toppings.size()*super.getCostoftopping();
	return cost+BasePriceLarge;
}



@Override
public double TaxOnPizza(double TotalCost) {
	// TODO Auto-generated method stub
	return TotalCost*0.125;
}



}
 

	
