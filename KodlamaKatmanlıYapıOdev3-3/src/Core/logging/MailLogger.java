package Core.logging;

public class MailLogger implements BaseLogger{

	@Override
	public void logger(String data) {
		System.out.println("Mail gönderildi." + data);
		
	}

}
