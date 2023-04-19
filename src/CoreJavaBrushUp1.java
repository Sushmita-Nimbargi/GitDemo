
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// Variables and datatypes
		
		int myNum = 5;
		String website = "Rahul shetty academy";
		char letter = 'c';
		double dec = 5.99;
		boolean mycard=true;
		System.out.println(myNum+" is the value of myNum");
		System.out.println(website);
		
		//Arrays in java--Can store multiple values in one single variable
		// Array declaration 2 ways
		int[] arr= new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int[] arr2= {56,1,2,3,4,5,6,89,56,789,345};
		
		System.out.println(arr2[4]);
		
		
		//iterating Array --loops
		
		for(int i=0;i<arr.length;i++) {
		
			System.out.println(arr[i]);
		};
		
		for(int i=0;i<arr2.length;i++) {
			
			System.out.println(arr2[i]);
		};
		
		String[] name= {"Sushmita","Sushila","Sumangala","Shobha"};
		
	for(int i=0;i<name.length;i++) {
			
			System.out.println(name[i]);
		};
		
		//Enhanced for loop syntax
		for(String s: name) {
			System.out.println(s);
		};
		
		for(int s: arr2) {
			System.out.println(s);
		};

	}

}
