package eCommerse.core;

import eCommerse.amazonEmail.AmazonMailManager;

public class AmazonMailManagerAdapter implements EmailService{

	private AmazonMailManager amazonMailManager ;
	
	public AmazonMailManagerAdapter() {
		super();
		this.amazonMailManager = new AmazonMailManager();
	}

	@Override
	public void send(String email, String message) {
		amazonMailManager.send(email, message);
		
	}

}
