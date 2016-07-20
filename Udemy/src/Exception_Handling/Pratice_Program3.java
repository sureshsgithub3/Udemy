/**
 * 
 */
package Exception_Handling;


public class Pratice_Program3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			System.out.println("in try");
			
		int[] i= new int[4];
		i[5]=10;
		
		}
		catch(Exception e){
			System.out.println("in catch");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}

	}

}
