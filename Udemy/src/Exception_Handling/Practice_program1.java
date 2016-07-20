/**
 * 
 */
package Exception_Handling;


public class Practice_program1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			System.out.println("divide");
			int i=10/0;
			System.out.println(i);
			System.out.println("In try ");
			
		}
		catch(Exception e){
			System.out.println("error occured");
			System.out.println(e.getMessage());//this will print error
			
		}

	}

}
