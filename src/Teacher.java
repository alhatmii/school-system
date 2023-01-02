import java.util.ArrayList;

public class Teacher {
	private String Name;
	private int Id;

	// Setter ArrayList for Students:
	ArrayList<Student> newStu = new ArrayList<Student>();

	// Getter of Student ArrayList:
	public ArrayList<Student> getNewStu() {
		return newStu;
	}

	// Setter of Student ArrayList:
	public void setNewStu(ArrayList<Student> newStu) {
		this.newStu = newStu;
	}

	// Object chaining to Student:
	Student Std = new Student();

	// Getter for TeacherName:
	public String getName() {
		return Name;
	}

	// Setter for TeacherName:
	public void setName(String Name) {
		this.Name = Name;
	}

	// Getter for TeacherId:
	public int getId() {
		return Id;
	}

	// Setter for TeacherId:
	public void setId(int Id) {
		this.Id = Id;
	}

	// Setter of Object chaining to Teacher:
	public Student getStd() {
		return Std;
	}

	// Setter of Object chaining to Teacher:
	public void setStd(Student std) {
		Std = std;
	}

}
