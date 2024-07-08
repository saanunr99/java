class Product{
	public static void main(String args[]){
		
		String productName[]={"perfume","magii","MtR masala","colgate","perfume","magii",
		"MtR masala","colgate","perfume","magii","MtR masala","colgate"
		,"perfume","magii","MtR masala","colgate"};
		
		System.out.println("List of the Products :"+productName[0]);
		System.out.println("List of the Products :"+productName[1]);
		System.out.println("List of the Products :"+productName[2]);
		System.out.println("List of the Products :"+productName[3]);
		System.out.println("List of the Products :"+productName[4]);
		System.out.println("List of the Products :"+productName[5]);
		System.out.println("List of the Products :"+productName[6]);
		System.out.println("List of the Products :"+productName[7]);
		System.out.println("List of the Products :"+productName[8]);
		System.out.println("List of the Products :"+productName[9]);
		System.out.println("List of the Products :"+productName[10]);
		
		System.out.println("-------------------------------------------");
		System.out.println("Size of a List:"+productName.length);
		
		System.out.println("-------------------------------------------");
		
		for(int i=0;i<productName.length;i++){
			System.out.println(productName[i]);
		}
		System.out.println("-------------------------------------------");
		for(int i=productName.length-1;i>0;i--){
			System.out.println(productName[i]);
		}
		
		int a[]={1,2,3,4,5,6,7,8,9,10};
		
		int even=0;
		
		int odd=0;
		
		System.out.println("-------------------------------------------");
		
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				even+=1;
			}else{
				odd+=1;
			}
	
		}
		
		System.out.println("Even count  :"+even);
		
		System.out.println("Odd count :"+odd);

		
		
		
		
	
		
	}
}