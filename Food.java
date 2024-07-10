public class Food {
 public String fooditemname;
 public int quantity;
 public double price;
 
 public Food(String fooditemName, int quantity){
        this.fooditemname=fooditemname;
		this.quantity=quantity;
		this.price=200.00;
		}
		
		public void displayfooditem(){
		System.out.println("Fooditem:"+"fooditemname +" Quantity:" + quantity+", price:"+price );
		}
		}