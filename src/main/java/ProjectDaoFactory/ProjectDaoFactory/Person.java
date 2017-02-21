package ProjectDaoFactory.ProjectDaoFactory;


public class Person {
	private int id = 10;
    private String name = "janusz";
    private int age = 66;
	public Person() {
    }
	public int getId() {
		return id;
	}
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setId(int id) {
		this.id = id;
	}
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
    	return "imie: "+name+" wiek: "+age;
    }
}
