package Core.logging;

public class FileLogger implements BaseLogger{

	@Override
	public void logger(String data) {
		System.out.println("Dosyaya loglandı." + data);
		
		
	}

}
