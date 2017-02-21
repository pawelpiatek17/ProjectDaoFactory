package ProjectDaoFactory.ProjectDaoFactory;

import java.util.ArrayList;

public class DaoFactory {
	private EDaoFactory source;
	private DaoFactory(){
    }
	private static DaoFactory INSTANCE = null;
    public static DaoFactory getInstance() {
    	if(INSTANCE == null){
    		INSTANCE = new DaoFactory();
    	}
    	return INSTANCE;
    }
	public Person getUserById(int user) {
		switch(source) {
		case XML: {
			XML xml = XML.getInstance();
			return xml.getPerson(user);
		}
		case DB: {
			DB db = DB.getInstance();
			return db.getPerson(user);
		}
		default: 
			return null;
		}
		
			
	}
	
	public void setSource(EDaoFactory e) {
		// TODO Auto-generated method stub
		this.source = e;
	}
	
	public ArrayList<Person> selectAllUsers() {
		switch(source) {
		case XML: {
			XML xml = XML.getInstance();
			return xml.getAll();
		}
		case DB: {
			DB db = DB.getInstance();
			return db.getAll();
		}
		default: 
			return null;
		}
	}

}
