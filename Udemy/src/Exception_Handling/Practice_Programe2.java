/**
 * 
 */
package Exception_Handling;


public class Practice_Programe2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try{
			System.out.println("divide");
			int i=10/0;
			System.out.println(i);
			System.out.println("In try");
		}
		catch(Exception e){
			System.out.println("In catch");
			System.out.println(e.getMessage());
			
			System.out.println("Error occured");
			e.printStackTrace();
			
			
		}
		

	}

}
