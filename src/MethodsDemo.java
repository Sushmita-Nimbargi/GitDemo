
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to access the methods present in class create the object of the class with that object call the methods
		MethodsDemo d= new MethodsDemo();
		String name =d.getData();
		System.out.println(name);
		
		//calling the methods from another class
		MethodsDemo2 d1= new MethodsDemo2();
		d1.getUserdata();
		
		//if we declare method with static keyword it methods becomes class level there is no need to create object to access the methods
		
		String name2 = getData2();
		System.out.println(name2);

	}
	public String getData() {
		System.out.println("Hello world");
		return "Rahul shetty";
	}
	public static String getData2() {
		System.out.println("Hello world.....");
		return "Rahul shetty";
	}

}
