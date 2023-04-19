import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		
		//if else conditional statements
		
		int[] arr2= {1,2,4,5,6,8,10,12,122};
		
		//Check this array has multiple of 2
		
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i] % 2==0) {
			System.out.println(arr2[i]);
			break;
			}
			else {
				System.out.println(arr2[i]+"is not a multiple of 2");
			}
		}
		
		//ArrayList-->Dynamically create array and increase size
		ArrayList<String> a= new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("selenium");
		
		System.out.println(a.get(2));
		System.out.println("**********");
		
		//iterating Arraylist with for loop
		for(int i=0;i<a.size();i++) {
		  System.out.println(a.get(i));	
		}
		
		System.out.println("**********++++++++++++++++++++++++++++++++");
		//iterating arraylist with enhanced for loop
		for(String val:a) {
			 System.out.println(val);	
		}
		
		//methods in arraylist
		System.out.println(a.contains("selenium"));
		
		
		//converting normal array into arraylist
		
		String[] name= {"rahul","shetty","academy"};
		List<String> nameArraylist = Arrays.asList(name);
		
		System.out.println(nameArraylist.contains("shetty"));
		
		

	}

}
