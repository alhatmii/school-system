import java.util.ArrayList;
import java.util.Stack;

public class Department {
	private String Name;

	// ArrayList for Teachers:
	ArrayList<Teacher> newTech = new ArrayList<Teacher>();

//	Stack of Teachers
	Stack<Teacher> TecSta = new Stack<Teacher>();

	// Object chaining to Teacher:
	Teacher Tc = new Teacher();

	// Getter for DepartmentName:
	public String getName() {
		return Name;
	}

	// Setter for DepartmentName:
	public void setName(String name) {
		Name = name;
	}

	// Getter of new Teacher list
	public ArrayList<Teacher> getNewTech() {
		return newTech;
	}

	// Setter of new Teacher list
	public void setNewTech(ArrayList<Teacher> newTech) {
		this.newTech = newTech;
	}

	// Getter of Object chaining to Teacher:
	public Teacher getTc() {
		return Tc;
	}

	// Setter of Object chaining to Teacher:
	public void setTc(Teacher tc) {
		Tc = tc;
	}

}
