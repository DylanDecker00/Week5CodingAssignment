package week05CodeA;

public class SpacedLogger implements Logger{
	
	//Used java methods to clean up the requested code

	@Override
	public void log(String log) {
	System.out.println(log.replace("", " ").trim());
		
	}


	@Override
	public void error(String error) {
	System.out.println("ERROR: " + error.replace("", " ").trim());

		
	}

}
