package su22.sof3021.demo_bean_config;

import su22.sof3021.beans.User;

public class UserDAOSqlServer implements UserDAOInterface {

	@Override
	public void create(User u) {
		// TODO Auto-generated method stub
		System.out.println("Them Id SqlServer");
	}

	@Override
	public void update(User u) {
		// TODO Auto-generated method stub
		System.out.println("Cap nhat Id SqlServer");
	}

	@Override
	public void delete(User u) {
		// TODO Auto-generated method stub
		System.out.println("Xoa Id SqlServer");
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		System.out.println("Tim theo Id SqlServer");
		return null;
	}

}
