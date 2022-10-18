package Core.logging;

public class DatabaseLogger implements BaseLogger {

	@Override
	public void logger(String data) {
		System.out.println("veri tabanına loglandı." + data);
		
	}

}
