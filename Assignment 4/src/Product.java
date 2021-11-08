
public abstract class Product {
	
	double cost = 0.0; 
	int quantity = 0; 
	double price= 0.0;
	

	Product(int q) {
		quantity = q; 
	}
	
	public double getPrice() {
		return price;
	}
	
   public void setPrice(double p) {
		price = p;
	}
   
   public double getCost() {
		return cost;
	}
	
  public void setCost(double c) {
	  cost = c;
	}
   
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int q) {
		quantity = q;
	}

	public void outputProduct() {
		String str = "";
		str += "Product Details:";
		str += "\nCost : " + cost;
		str += "\nQuantity: " + quantity;
		System.out.println(str);
	}	


}
