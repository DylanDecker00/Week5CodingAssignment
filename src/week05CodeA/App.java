package week05CodeA;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Logger logger = new AsteriskLogger();
		
		System.out.println("What are you wanting to Log?");
		
		String entry = sc.nextLine();
		logger.log(entry);
		
		logger.error(entry);
		
		
		
		//Bellow is creating and instantiate of the SpacedLogger
		
		Logger logger2 = new SpacedLogger();
		
		String entry2 = sc.nextLine();
		logger2.log(entry2);
		
		logger2.error(entry2);
	
	}
}
