import java.util.ArrayList;

public class Course {

	private String Name;
	private int Id;
	
	// ArrayList for Teachers:
	ArrayList<Mark> newMark = new ArrayList<Mark>();


	// Object chaining to Mark:
	Mark Mrk = new Mark();

	// Getter for getCourseName.
	public String getName() {
		return Name;
	}

	// Setter for setCourseName.
	public void setName(String name) {
		Name = name;
	}

	// Getter for getCourseId.
	public int getId() {
		return Id;
	}

	// Getter for ArrayList of Marks:
	public ArrayList<Mark> getNewMark() {
		return newMark;
	}

	// Setter for ArrayList of Marks:
	public void setNewMark(ArrayList<Mark> newMark) {
		this.newMark = newMark;
	}

	// Getter of Object Chaining for Marks:
	public Mark getMrk() {
		return Mrk;
	}

	// Setter of Object Chaining for Marks:
	public void setMrk(Mark mrk) {
		Mrk = mrk;
	}

	// Setter for setCourseId.
	public void setId(int id) {
		Id = id;
	}

}
