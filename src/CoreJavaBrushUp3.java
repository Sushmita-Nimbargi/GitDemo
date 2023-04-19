
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		
		String str = "Saket Saurav";
        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
        for(int i= chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
        }
		
        //Using String builder to reverse the string
        
        String st = "Automation";
        StringBuilder str2 = new StringBuilder();
        str2.append(st);
        str2 = str2.reverse();     // used string builder to reverse
       System.out.println(str2);
		
		
		
		// TODO Auto-generated method stub
        //String is an object that represents sequence of characters
		//We can declare string in 2 ways :String literal and with new keyword
		
		//String Literal :In string literals if string value is same no matter how 
		//many objects u create backend it will point to one object only
		
		String s = "Rahul shetty academy";
		String s1 = "Rahul shetty academy";//like this in backend only one object will be created
		String s5 = "hello";
		
		
		//String with new keyword or memory allocator operator : if string value is same also it will create different objects in backend
		
		String s2= new String("welcome");
		String s3= new String("welcome"); //String declared with new keyword if text is same in  backend 2 objects will be created.
		
		//String methods
		
		String s4 = "Rahul shetty academy";
		String[] splittedString=s4.split(" ");
		
		for(String val: splittedString) {
			System.out.println(val);
		}
		
		// split with shetty
		
		String s6 = "Rahul shetty academy";
		String[] splittedString1=s6.split("shetty");
		
		for(String val: splittedString1) {
			System.out.println(val);
		}
		
		// split with shetty
		
				String s7 = "Rahul shetty academy";
				String[] splittedString2=s6.split("shetty");
				
				for(String val: splittedString2) {
					System.out.println(val.trim());
				}
				
				for(int i=0;i<s7.length();i++) {
					System.out.println(s7.charAt(i));
				}
				
				//printing in reverse order
				for(int i=s7.length()-1;i>=0;i--) {
					System.out.println(s7.charAt(i));
				}
				String revrseStr="";
				for(int i=s7.length()-1;i>=0;i--) {
					 revrseStr = revrseStr+s7.charAt(i);
				}
				System.out.println("Reverse String = "+revrseStr);
				
				
				//Write a Java Program to swap two numbers using the third variable.
				int x, y,temp;
				x=20;
				y=30;
				System.out.println("Before Swaping = "+x+y);
				temp=x;
				x=y;
				y=temp;
				System.out.println("AfterSwaping = "+x+y);
				
				//Swapping without using temp variable
				int x1,y1;
				x1=20;
				y1=30;
				x1=x1+y1;
				y1=x1-y1;
				x1=x1-y1;
				
				
				
				
				
				//check for the number is prime or not
				int num = 10;
			    boolean flag = false;
			    for (int i = 2; i <= num / 2; i++) {
			      // condition for nonprime number
			      if (num % i == 0) {
			        flag = true;
			        break;
			      }
			    }

			    if (flag=false)//prints false 
			      System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
			    
			    //number is palindrome or not
			    String Palinstr="level";
			    String reverse=" ";
			    for(int i=Palinstr.length()-1;i>=0;i--) {
			    	reverse = reverse+Palinstr.charAt(i);
			    }
			    System.out.println("Reverse String = "+reverse);
			    
			    if(Palinstr.equals(reverse)) {
			    	System.out.println("String is Palindrome"+Palinstr);
			    }
			    else {
			    	System.out.println("String is not Palindrome"+Palinstr);
			    }
			    //Fibonacci series
			    //program to find duplicate 
	}

}
