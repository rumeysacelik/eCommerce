package eCommerse.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerse.dataAccess.abstracts.UserDao;
import eCommerse.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	
	private List<User> users = new ArrayList<User>();
	
	public InMemoryUserDao() {
		super();
		User user1=new User(1, "Rümeysa", "Çelik", "rumeysacelik@gmail.com", "12345", true);
		
		users.add(user1);
	}


	@Override
	public void add(User user) {	
		System.out.println("Log inmemory: "+ user.getePosta());
		users.add(user);		
	}

	@Override
	public void update(User user) {			
		User userToUpdate = users.stream()
				.filter(u -> u.getId() == user.getId())
				.findFirst()
				.orElse(null);
		
		userToUpdate.setePosta(user.getePosta());
		userToUpdate.setName(user.getName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setPassword(user.getPassword());
		userToUpdate.setVerify(user.isVerify());		
	}

	@Override
	public void delete(int userId) {
		User userToDelete = users.stream()
				.filter(u -> u.getId() == userId)
				.findFirst()
				.orElse(null);
		
		users.remove(userToDelete);			
	}

	@Override
	public List<User> getAll() {		
		return users;
	}


	@Override
	public User get(String email) {
		User user = users.stream()
				.filter(u -> u.getePosta() == email)
				.findFirst()
				.orElse(null);
		return user;
	}
}