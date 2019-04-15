package shop;

import java.util.Scanner;

public class Feast extends Pizza implements PizzaPrice {
	public Feast(String type, String size,String name) {
		super(type, size ,name);
		// TODO Auto-generated constructor stub
	}
	
    public Feast() {
    }

    
    public void getToppings() {
		
  	  Scanner in = new Scanner(System.in);
          System.out.println("How many toppings would you like? Max 3 Toppings Allowed in Feast Pizza");
          int numToppings = in.nextInt();
        // Check for correct
          while(numToppings < 0 || numToppings>3)
          {
          	System.out.println("Please Enter Correect Number of Toppings. Max 3 ");
              numToppings = in.nextInt();	
          }
          
          
          
         for(int i= 0 ; i<numToppings;i++) {
  			if (numToppings==1) {
  				
  			System.out.println("Please Enter Desired Toping:");
  			super.toppings.add(in.next());}
  			
  			if (numToppings==3||numToppings==2) {
  				System.out.println("Please Enter Desired Toping "+(i+1)+" :");
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
