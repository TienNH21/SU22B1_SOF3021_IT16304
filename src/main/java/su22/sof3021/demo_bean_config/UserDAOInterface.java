package su22.sof3021.demo_bean_config;

import su22.sof3021.beans.User;

public interface UserDAOInterface {
	public void create(User u);
	public void update(User u);
	public void delete(User u);
	public User findById(int id);
}
