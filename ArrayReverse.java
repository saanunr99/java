public class ArrayReverse{
 public static void main(String[] args){
     int[]array = {1,2,3,4,5,6,7,8,9,10};
	 

	 sysyem.out.println("Original array:");
	 PrintArray(array);
	 ReverseArray(array);
	 
	 System.out.println("Reversed array:");
	 printarray(array);
   } 
    public static void reversearray(int[] array){
	int start=0;
	int end = array.lenght-1;
	
	while (start<end){
	 int temp=array[start];
	 array[start]=array[end];
	 
	 array[end]=temp;
	 start++;
	 end--;
	 }
	 
	 }
	 public static void printarray(int[] array){
	 for(int i : array){
	 System.out.print(i+"");
	 
	 }
	System.out.println();
	
	}
	}








