package su22.sof3021.demo_bean_config;

import su22.sof3021.beans.User;

public class UserDAOMySql implements UserDAOInterface {

	@Override
	public void create(User u) {
		// TODO Auto-generated method stub
		System.out.println("Them MYSQL");
		
	}

	@Override
	public void update(User u) {
		// TODO Auto-generated method stub
		System.out.println("Cap nhat MYSQL");
	}

	@Override
	public void delete(User u) {
		// TODO Auto-generated method stub
		System.out.println("Xoa MYSQL");
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		System.out.println("Tim theo Id MYSQL");
		return null;
	}

}
