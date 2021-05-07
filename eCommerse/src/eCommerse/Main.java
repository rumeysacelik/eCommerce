package eCommerse;

import eCommerse.business.concretes.AuthManager;
import eCommerse.business.concretes.UserManager;
import eCommerse.core.AmazonMailManagerAdapter;
import eCommerse.core.GoogleMailManagerAdapter;
import eCommerse.dataAccess.concretes.InMemoryUserDao;
import eCommerse.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		//UserManager userManager = new UserManager(new InMemoryUserDao(), new AmazonMailManagerAdapter());
		User z�ynet = new User(2,"Ziynet","Ku�aslan", "ziynet@gmail.com", "123456", true);
		//userManager.add(z�ynet);
		
		User rumeysa = new User(1, "Emine", "�elik", "emine@gmail.com", "12345", true);
		//userManager.update(rumeysa);
		
		InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
		GoogleMailManagerAdapter googleMailManagerAdapter = new GoogleMailManagerAdapter();
		AmazonMailManagerAdapter amazonMailManagerAdapter = new  AmazonMailManagerAdapter();

		
		AuthManager authManager =new AuthManager(new UserManager(inMemoryUserDao, googleMailManagerAdapter));
		
		//userManager.delete(2);
		
		
		UserManager userManager = new UserManager(inMemoryUserDao, amazonMailManagerAdapter);
		authManager.register(z�ynet);
		
		userManager.getAll();
		
		
	}

}
