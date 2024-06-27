public class Cloth{

    public static void main(String[]args){
       
        String cotton = "Summer";
		String Linen = "Spring";
		String Polyester = "Fall";
		String Wool = "Winter";
		String Nylon = "Fall";
	   
		if(cotton!=Nylon){
			System.out.println("Cotton is suitable for:"+cotton);
		
		
		}else{
			System.out.println("Nylon is suitable for:"+cotton);
		}
        System.out.println("Cotton used in: " +cotton );
        System.out.println("Linen used in: " +Linen );
        System.out.println("Polyester used in:" + Polyester);
        System.out.println("Wool used in:" +Wool );
        System.out.println("Nylon used in:" +Nylon );
        
    }
 
}