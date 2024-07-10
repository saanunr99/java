public class FoodRunner {
public static void main(String[] args){
 Food[] fooditems=new Food[30];
  for(int i=0; i<30; i++){
  fooditems[i]=new Food("Fooditem"+ (i+1),i+1);
  }
  for (Food fooditem: fooditems){
  fooditem.displayFooditem();
  }
  }
  }