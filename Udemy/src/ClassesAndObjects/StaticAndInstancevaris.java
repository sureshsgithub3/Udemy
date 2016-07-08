package ClassesAndObjects;

public class StaticAndInstancevaris {
	
	public static int b=40;
	public int a=10;
	
	static void change(){
		 b=50;
	}
	public void change1(){
		b=100;
	}
   

	public static void main(String[] args) {
		
		StaticAndInstancevaris obj1= new StaticAndInstancevaris();
		obj1.change1();
		
		obj1.b=200;
		System.out.println(b);
		System.out.println(obj1.a);
		StaticAndInstancevaris obj2= new StaticAndInstancevaris();
		obj2.a=20;
		System.out.println(obj1.a);
		System.out.println(obj2.b);
		
		
		
		
		
		
		
		
		

	}

}
