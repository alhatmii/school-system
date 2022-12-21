import java.util.ArrayList;

public class School {
	private String Name;
	private String Location;

	// Object chaining to Department:
	Department Dp = new Department();

	// Function of adding new listDep:
	ArrayList<Department> newDep = new ArrayList<Department>();

	// Getter for SchoolName:
	public String getName() {
		return Name;
	}

	// Setter for SchoolName:
	public void setName(String name) {
		Name = name;
	}

	// Getter for SchoolLocation:
	public String getLocation() {
		return Location;
	}

	// Setter for SchoolLocation:
	public void setLocation(String location) {
		Location = location;
	}

	// Getter of Object chaining to Departments:
	public Department getDp() {
		return Dp;
	}

	// Setter of Object chaining to Departments:
	public void setDp(Department dp) {
		Dp = dp;
	}

	// Setter of new Department list
	public ArrayList<Department> getNewDep() {
		return newDep;
	}

	// Getter of new Department list
	public void setNewDep(ArrayList<Department> newDep) {
		this.newDep = newDep;
	}

}