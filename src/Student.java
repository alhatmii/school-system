import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {

	// Class Student Properties:
	private String Name;
	private int Id;
	private int Age;

	// ArrayList for Course:
	ArrayList<Course> newCrs = new ArrayList<Course>();

	// Object chaining to Course:
	Course Crs = new Course();

	// Getter for StudentName:
	public String getName() {
		return Name;
	}

	// Setter StudentName:
	public void setName(String name) {
		Name = name;
	}

	// Getter of ArrayList for Courses:
	public ArrayList<Course> getNewCrs() {
		return newCrs;
	}

	// Setter of ArrayList for Courses:
	public void setNewCrs(ArrayList<Course> newCrs) {
		this.newCrs = newCrs;
	}

	// Getter of Object Chaining for Courses:
	public Course getCrs() {
		return Crs;
	}

	// Setter of Object Chaining for Courses:
	public void setCrs(Course crs) {
		Crs = crs;
	}

	// Getter for StudentId:
	public int getId() {
		return Id;
	}

	// Setter for StudentId:
	public void setId(int id) {
		Id = id;
	}

	// Getter for StudentAge:
	public int getAge() {
		return Age;
	}

	// Setter for StudentAge:
	public void setAge(int age) {
		Age = age;
	}

}
