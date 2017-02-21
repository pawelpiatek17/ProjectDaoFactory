package ProjectDaoFactory.ProjectDaoFactory;

import java.util.ArrayList;

public class DB {
	private DB(){
	}
	private static DB INSTANCE = new DB();
	public static DB getInstance(){
		return INSTANCE;
	}
	public Person getPerson(int person) {
		return new Person();
	}
	public ArrayList<Person> getAll() {
		return null;
	}
}
