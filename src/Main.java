import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthDesktopPaneUI;

public class Main {

	public static void main(String[] args) {
//		 Variables:
		int totalMarks = 0;

//		 initialize counter
		int counter = 0;

//		 Calling Subjects:
		School Scl = new School();

//		 Adding ArrayLists:
		List<Department> newDept = new ArrayList<Department>();

//		 Initializing Scanner:
		Scanner sc = new Scanner(System.in);

//		 Initializing Menu:
		boolean i = true;
		while (i) {
//			 Scanner Menu = new Scanner(System.in);
			System.out.println("1- To Add Detalis.");
			System.out.println("2- To print Details.");
			System.out.println("3- To edit Details.");
			System.out.println("4- Exit");

			int choice = sc.nextInt();

			if (choice == 1) {

//				 User Input for School name using object chaining:
				System.out.println("Please, School Name: ");
				String sclName = sc.next();
				Scl.setName(sclName);

//				 User Input for School location using object chaining:);
				System.out.println("Where it located? ");
				String sclLoc = sc.next();
				Scl.setLocation(sclLoc);

				boolean D = true;
				while (D) {

//					 User Input for Department name using object chaining:);
					Department Dp = new Department();
					System.out.println("What is your Department?");
					String DepName = sc.next();
					Dp.setName(DepName);
//					Scl.newDep.add(Scl.Dp);

					boolean T = true;
					while (T) {

//						 User Input for Teacher name using object chaining:
						Teacher Tc = new Teacher();
						System.out.println("Enter Teacher is name:");
						String TecName = sc.next();
						Tc.setName(TecName);

//						 User Input for Teacher ID using object chaining:
						System.out.println("Enter Teacher is ID:");
						int TecID = sc.nextInt();
						Tc.setId(TecID);
//						Scl.Dp.newTech.add(Tc);

						boolean S = true;
						while (S) {

							Student Std = new Student();
//							 User Input for Student name using object chaining:
							System.out.println("Enter your Student name:");
							String StdName = sc.next();
							Std.setName(StdName);

//							 User Input for Student ID using object chaining:
							System.out.println("Enter  Student ID:");
							int StdId = sc.nextInt();
							Std.setId(StdId);

//							 User Input for Student Age using object chaining:
							System.out.println("Enter your Student Age:");
							int StdAge = sc.nextInt();
							Std.setAge(StdAge);

							boolean C = true;
							while (C) {

								Course Crs = new Course();
								Mark Mrk = new Mark();

//								 User Input for Course Name using object chaining:
								System.out.println("Enter Course Name:");
								String CrsName = sc.next();
								Crs.setName(CrsName);

//								 User Input for Course ID using object chaining:
								System.out.println("Enter  Course ID:");
								int CrsId = sc.nextInt();
								Crs.setId(CrsId);

//								 User Input for Quiz Course Marks using object chaining:
								System.out.println("Enter Quiz Marks:");
								int MarkQ = sc.nextInt();

//								 Allowing only up to 15 Quiz Marks:
								if (MarkQ <= 15) {
									Mrk.setQuizMarks(MarkQ);
								} else {

									System.out.println("Re-Enter the Quiz Marks:");
									int MarkQ1 = sc.nextInt();
									Mrk.setQuizMarks(MarkQ1);
								}

//								 User Input for Quiz Course Marks using object chaining:
								System.out.println("Enter Mid Marks:");
								int MarkM = sc.nextInt();
								Mrk.setMidMarks(MarkM);

//								 Allowing only up to 30 Quiz Marks:
								if (MarkM <= 35) {
									Mrk.setMidMarks(MarkM);
								} else {

									System.out.println("Re-Enter the Mid Marks:");
									int MarkM1 = sc.nextInt();
									Mrk.setMidMarks(MarkM1);
								}

//								 User Input for Quiz Course Marks using object chaining:
								System.out.println("Enter Final Marks:");
								int MarkF = sc.nextInt();
								Mrk.setFinalMarks(MarkF);

//								 Allowing only up to 55 Quiz Marks:
								if (MarkF <= 55) {
									Mrk.setQuizMarks(MarkF);
								} else {

									System.out.println("Re-Enter the Final Marks:");
									int MarkF1 = sc.nextInt();
									Mrk.setFinalMarks(MarkF1);
								}

//								 sum of Marks:
								if (totalMarks <= 100) {
									totalMarks = (MarkQ + MarkM + MarkF);
								} else {

								}

//								 Adding new Course:
								System.out.println("Do you wish to add new Course?");
								System.out.println("(Answer with yes or no)");
								String AnsC = sc.next();
								Std.newCrs.add(Crs);

								if (AnsC.equals("yes")) {
									C = true;

								}

								else if (AnsC.equals("no")) {
									System.out.println("Thanks for adding courses details.");
									System.out.println("--------------------------------------------");
									C = false;
								} else {
									System.out.println("Enter valid Answer!");
									C = false;
								}

							}

//							 Adding new Student:
							System.out.println("Do you wish to add new Student?");
							System.out.println("(Answer with yes or no)");
							String AnsS = sc.next();
							Tc.newStu.add(Std);

							if (AnsS.equals("yes")) {
								S = true;

							}

							else if (AnsS.equals("no")) {
								System.out.println("Thanks for adding students details.");
								System.out.println("--------------------------------------------");
								S = false;
							} else {
								System.out.println("Enter valid Answer!");
								S = false;
							}

						}

//						 Adding new Teacher:
						System.out.println("Do you wish to add new teacher?");
						System.out.println("(Answer with yes or no)");
						String AnsTc = sc.next();
						Dp.newTech.add(Tc);

						if (AnsTc.equals("yes")) {
							T = true;

						}

						else if (AnsTc.equals("no")) {
							System.out.println("Thanks for adding teachers details.");
							System.out.println("--------------------------------------------");
							T = false;
						} else {
							System.out.println("Enter valid Answer!");
							T = false;
						}
					}

//					 Adding new Department:
					System.out.println("Do you wish to add new department?");
					System.out.println("(Answer with yes or no)");
					String AnsD = sc.next();
					newDept.add(Dp);

					if (AnsD.equals("yes")) {
						D = true;

					}

					else if (AnsD.equals("no")) {
						System.out.println("Thanks for adding departments details.");
						System.out.println("--------------------------------------------");
						D = false;
					} else {
						System.out.println("Enter valid Answer!");
						D = false;
					}
				}
			}

//			 To Print out the data:
			else if (choice == 2) {

//				 increment counter variable
				counter = counter + 1;

				System.out.println("School name is " + Scl.getName());
				System.out.println("Located on " + Scl.getLocation());

//				 For loop inside for loop:
				for (Department D : newDept) {

					System.out.println("Assigned in " + D.getName() + " Department");

//					 print the incremented counter variable value
					System.out.println("--------------------------------------------");
					System.out.println("Teacher Number" + " #" + counter);

					for (Teacher T : D.newTech) {
						System.out.println("Teacher is name " + T.getName());
						System.out.println("Holding ID " + T.getId());

						for (Student S : T.newStu) {
							System.out.println("Have Student named " + S.getName());
							System.out.println("his ID " + S.getId());
							System.out.println("at age of " + S.getAge());

							for (Course C : S.newCrs) {
								System.out.println("Assigned to teach " + C.getName() + " Holding ID " + C.getId());
//								System.out.println("Quiz Marks of : " + C.getName() + C.getId() + " is "
//										+ Scl.Dp.Tc.Std.Crs.Mrk.getQuizMarks());
//								System.out.println("Mid-Term Marks of : " + C.getName() + C.getId() + " is "
//										+ Scl.Dp.Tc.Std.Crs.Mrk.getMidMarks());
//								System.out.println("Final Marks of : " + C.getName() + C.getId() + " is "
//										+ Scl.Dp.Tc.Std.Crs.Mrk.getFinalMarks());
								System.out
										.println("Total  Marks of : " + C.getName() + C.getId() + " is " + totalMarks);
								System.out.println("--------------------------------------------");
							}
						}
					}
				}
				break;
			}

			// To edit the details entered:
//			else if (choice == 3) {
//				boolean k = true;
//				while (k) {
//					// Scanner editMenu = new Scanner(System.in);
//					System.out.println("1- To Change School Name:");
//					System.out.println("2- To Change School Location:");
//					System.out.println("3- To Change Department Name:");
//					System.out.println("4- To Change Teacher Name:");
//					System.out.println("5- To Change Teacher ID:");
//					System.out.println("6- To Change Student Name:");
//					System.out.println("7- To Change Student ID:");
//					System.out.println("8- To Change Student Age");
//					System.out.println("9- To Change Course Name:");
//					System.out.println("10- To Change Course ID:");
//					System.out.println("11- Done Editing!");
//
//					int edit = sc.nextInt();
//					if (edit == 1) {
//
//						// User Input to edit SchoolName:
//						System.out.println("Re-Enter School name:");
//						String sclName = sc.next();
//						Scl.setName(sclName);
//					}
//
//					else if (edit == 2) {
//						// User Input to edit SchoolLocation:
//						System.out.println("Re-Enter School Location:");
//						String sclLoc = sc.next();
//						Scl.setLocation(sclLoc);
//					}
//
//					else if (edit == 3) {
//						// User Input to edit Department name:
//						System.out.println("Re-Enter your Departmant name:");
//						String DepName = sc.next();
//						Dp.setName(DepName);
//					}
//
//					else if (edit == 4) {
//						// User Input to edit Teacher name:
//						System.out.println("Enter your name:");
//						String TecName = sc.next();
//						Tc.setName(TecName);
//					}
//
//					else if (edit == 5) {
//						// User Input to Teacher ID:
//						System.out.println("Enter your ID:");
//						int TecID = sc.nextInt();
//						Tc.setId(TecID);
//					}
//
//					else if (edit == 6) {
//						// User Input to edit Student name:
//						System.out.println("Enter your Student name:");
//						String StdName = sc.next();
//						Std.setName(StdName);
//					}
//
//					else if (edit == 7) {
//						// User Input to edit Student ID:
//						System.out.println("Enter  Student ID:");
//						int StdId = sc.nextInt();
//						Std.setId(StdId);
//					}
//
//					else if (edit == 8) {
//						// User Input to edit Student Age:
//						System.out.println("Enter your Student Age:");
//						int StdAge = sc.nextInt();
//						Std.setAge(StdAge);
//					}
//
//					else if (edit == 9) {
//						// User Input for Course Name:
//						System.out.println("Enter Course Name:");
//						String CrsName = sc.next();
//						Crs.setName(CrsName);
//					}
//
//					else if (edit == 10) {
//						// User Input for Course ID:
//						System.out.println("Enter  Course ID:");
//						int CrsId = sc.nextInt();
//						Crs.setId(CrsId);
//					}
//
//					// When Exiting the menu:
//					else if (edit == 11) {
//						k = false;
//
//						System.out.println("Ready to Print!");
//					}
//
//					// When Entering larger value:
//					else {
//						System.out.println("Re-Enter the right value.");
//					}
//				}
//			}

//			 Exiting the menu:
			else if (choice == 4) {
				i = false;

				System.out.println("See you next time!");
			}

//			 When Entering larger value:
			else {
				System.out.println("Re-Enter the right value.");
			}

//			 Closing sc Scanner:
//			 sc.close();
		}
	}
}