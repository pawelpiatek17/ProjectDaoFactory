package ProjectDaoFactory.ProjectDaoFactory;

import java.util.ArrayList;

public class XML {
	private XML(){
	}
	private static XML INSTANCE = new XML();
	public static XML getInstance(){
		return INSTANCE;
	}
	public Person getPerson(int person) {
		return new Person();
	}
	public ArrayList<Person> getAll() {
		return new ArrayList<Person>();
	}
	
}
