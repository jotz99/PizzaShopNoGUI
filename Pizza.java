package shop;


import java.util.ArrayList;


public abstract class Pizza {

    private static final double costOfTopping = 2.5;//getter

// Price of Small, medium and large pizza is 10$, 12$ and 14$ respectively.
    private String nameOfCustomer;
    private double[] PriceOfBasePizza = {10.00, 12.00, 14.00};//getter
    private double TotalCost;//both
    private String type;//both
    
    protected ArrayList<String> toppings = new ArrayList<String>();//getter
    private String size;//both

//Initialize the default constructor for this class. [1 Mark]
    
    public Pizza () {
	
      }

   


	




	public Pizza(String type, String size,String name) {
		
		this.type = type;
		this.size = size;
		this.nameOfCustomer =name;
	}
	
	
	
	/* Generate Setters and getters for the variables which you will be requiring later [3 Marks] */
	

	
	
	public static double getCostoftopping() {
		return costOfTopping;
	}


	
	
	public String getNameOfCustomer() {
		return nameOfCustomer;
	}

	public void setNameOfCustomer(String nameOfCustomer) {
		this.nameOfCustomer = nameOfCustomer;
	}
	
	
	
	
	
	public double[] getPriceOfBasePizza() {
		return PriceOfBasePizza;
	}


	
	
	
	
	public double getTotalCost() {
		return TotalCost;
	}


	public void setTotalCost(double totalCost) {
		TotalCost = totalCost;
	}


	
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	
	
	
	
	

	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}

	
	
	
	
	
	public abstract void getToppings();









	

	@Override
	public String toString() {
		return    "**************************************************************\n"
				+ "Order Details:\n"
				+ "\n"
				+ "Name of the Customer: "+nameOfCustomer+"\n"
				+ "Type of Pizza   \t-----\t "+  type                     +"\n"
				+ "Size            \t-----\t "+  size                     +"\n"
				+ "Toppings        \t-----\t "+  (toppings.size())        +"\n"
				+ "Name ofToppings \t-----\t "+  toppings                 +"\n"
				+ "==============================================================\n"
				+ "Total           \t-----\t$"+  TotalCost/1.125          +"\n"
				+ "Tax             \t-----\t$"+  (TotalCost/1.125)*0.125  +"\n"
				+ "______________________________________________________________\n"
				+ "Amount Due      \t-----\t$"+  TotalCost                +"\n"
				+ "______________________________________________________________\n"
				+ "\n"
				+ "\n"
				+ "************************* THANK YOU **************************\n";
		        
	}

	

	
	
	
	
	



	//Override the toString() method here. [2 Marks]
	
	
}




