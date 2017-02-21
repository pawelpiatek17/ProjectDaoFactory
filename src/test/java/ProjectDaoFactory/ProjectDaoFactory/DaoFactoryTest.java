package ProjectDaoFactory.ProjectDaoFactory;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

public class DaoFactoryTest {

	private DaoFactory daoFactory;
	private DaoFactory daoFactory2;
	private XML mockXML;
	private DB mockDB;
	private int userId;
	private ArrayList<Person> persons;
	@Before
	public void setUp() throws Exception {
		daoFactory = DaoFactory.getInstance();
		mockXML = createMock(XML.class);
		mockDB = createMock(DB.class);
		userId = 10;
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testXML() {
		persons = new ArrayList<Person>();
		daoFactory.setSource(EDaoFactory.XML);
		daoFactory2 = DaoFactory.getInstance();
		Person person = new Person();
		person.setId(userId);
		person.setAge(22);
		person.setName("abc");
		persons.add(person);
		expect(mockXML.getPerson(userId)).andReturn(person);
		expect(mockXML.getAll()).andReturn(persons);
		assertTrue(daoFactory2.getUserById(userId).getId() == person.getId());
		replay(mockXML);
	}
	
	@Test
	public void testDB() {
		daoFactory.setSource(EDaoFactory.DB);
		Person person = new Person();
		person.setId(userId);
		person.setAge(22);
		person.setName("abc");
		expect(mockDB.getPerson(userId)).andReturn(person);
		assertTrue(daoFactory.getUserById(userId).getId() == person.getId());
		replay(mockDB);
	}

}
