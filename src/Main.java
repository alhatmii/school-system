import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
//		 Variables:
		double totalMarks = 0;

//		 initialize counter
		int counter = 0;
		int counter5 = 0;

//		 Calling Subjects:
		School Scl = new School();
		Department Dp1 = new Department();
		Teacher Tc1 = new Teacher();
		Student Std1 = new Student();
		Course Crs1 = new Course();
		Mark Mrk1 = new Mark();

//		 Adding ArrayLists:
		List<Department> newDept = new ArrayList<Department>();

//		Stack of Departments
		Stack<String> DepSta = new Stack<String>();

//		 Initializing Scanner:
		Scanner sc = new Scanner(System.in);

//		 Initializing Data transfer to .txt file:

//		 Initializing Menu:
		boolean i = true;
		while (i) {

			System.out.println("1- To Add Detalis.");
			System.out.println("2- To print Details & Departments Using Stacks.");
			System.out.println("3- Transfer the Inputs in (.txt) File.");
			System.out.println("4- Open History Updated Inputs.");
			System.out.println("5- Search Word In Exsisting file.");
			System.out.println("6- Encrypting new data from Exsisting file.");
			System.out.println("7- Exit");

			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("\n");

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
					Department Dp = new Department();
					Dp1 = Dp;

//					 User Input for Department name using object chaining:);
					System.out.println("What is your Department?");
					String DepName = sc.next();
					DepSta.push(DepName);
					Dp.setName(DepName);

					boolean T = true;
					while (T) {

//						User Input for Teacher name using object chaining:
						Teacher Tc = new Teacher();
						Tc1 = Tc;

						System.out.println("Enter Teacher is name:");
						String TecName = sc.next();
						Tc.setName(TecName);

//						User Input for Teacher ID using object chaining:
						System.out.println("Enter Teacher is ID:");
						int TecID = sc.nextInt();
						Tc.setId(TecID);

						boolean S = true;
						while (S) {
							Student Std = new Student();
							Std1 = Std;
//							User Input for Student name using object chaining:
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
								Crs1 = Crs;
								Mrk1 = Mrk;

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
								Double MarkQ = (double) sc.nextDouble();

//								 Allowing only up to 15 Quiz Marks:
								if (MarkQ <= 15) {
									Mrk.setQuizMarks(MarkQ);
								} else {

									System.out.println("Re-Enter the Quiz Marks:");
									Double MarkQ1 = (double) sc.nextDouble();
									Mrk.setQuizMarks(MarkQ1);
								}

//								 User Input for Quiz Course Marks using object chaining:
								System.out.println("Enter Mid Marks:");
								Double MarkM = (double) sc.nextDouble();
								Mrk.setMidMarks(MarkM);

//								 Allowing only up to 30 Quiz Marks:
								if (MarkM <= 35) {
									Mrk.setMidMarks(MarkM);
								} else {

									System.out.println("Re-Enter the Mid Marks:");
									Double MarkM1 = (double) sc.nextDouble();
									Mrk.setMidMarks(MarkM1);
								}

//								 User Input for Quiz Course Marks using object chaining:
								System.out.println("Enter Final Marks:");
								Double MarkF = (double) sc.nextDouble();
								Mrk.setFinalMarks(MarkF);

//								 Allowing only up to 55 Quiz Marks:
								if (MarkF <= 55) {
									Mrk.setQuizMarks(MarkF);
								} else {

									System.out.println("Re-Enter the Final Marks:");
									Double MarkF1 = (double) sc.nextDouble();
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
									System.out.println("\n");

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
								System.out.println("\n");

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
							System.out.println("\n");

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
						System.out.println("\n");

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

				System.out.println("\n");
				System.out.println("School name is " + Scl.getName());
				System.out.println("Located on " + Scl.getLocation());

				System.out.println("This School Has:");
				System.out.println("\n");

//				 For loop inside for loop:
				for (String DpS : DepSta) {

					System.out.println(DpS + " Department");

				}

				System.out.println("\n");
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
								System.out.println(
										"Total  Marks of : " + C.getName() + " " + C.getId() + " is " + totalMarks);
								System.out.println("--------------------------------------------");
								System.out.println("\n");
							}
						}
					}
				}

			}

			else if (choice == 3) {

				try {
					FileWriter MyInputs = new FileWriter("History Inputs.txt");
//					 increment counter variable
					counter = counter + 1;

					MyInputs.write("\n");
					MyInputs.write("School name is " + Scl.getName());
					MyInputs.write("\n");
					MyInputs.write("Located on " + Scl.getLocation());
					MyInputs.write("\n");
//					 For loop inside for loop:
					for (Department D1 : newDept) {

						MyInputs.write("Assigned in " + D1.getName() + " Department");
						MyInputs.write("\n");
//						 print the incremented counter variable value
						MyInputs.write("--------------------------------------------");
						MyInputs.write("\n");
						MyInputs.write("Teacher Number" + " #" + counter);
						MyInputs.write("\n");
						for (Teacher T : D1.newTech) {
							MyInputs.write("Teacher is name " + T.getName());
							MyInputs.write("\n");
							MyInputs.write("Holding ID " + T.getId());
							MyInputs.write("\n");

							for (Student S : T.newStu) {
								MyInputs.write("Have Student named " + S.getName());
								MyInputs.write("\n");
								MyInputs.write("his ID " + S.getId());
								MyInputs.write("\n");
								MyInputs.write("at age of " + S.getAge());
								MyInputs.write("\n");

								for (Course C : S.newCrs) {
									MyInputs.write("Assigned to teach " + C.getName() + " Holding ID " + C.getId());
									MyInputs.write("\n");
									MyInputs.write(
											"Total  Marks of : " + C.getName() + C.getId() + " is " + totalMarks);
									MyInputs.write("\n");
									MyInputs.write("--------------------------------------------");
									MyInputs.write("\n");
								}
							}
						}
					}
					MyInputs.close();
					System.out.println("Successfully wrote to the file.");
					System.out.println("\n");

				} catch (IOException e) {
					System.out.println("An error occurred.");
					System.out.println("\n");
					e.printStackTrace();
				}
			}

			else if (choice == 4) {
//				 File path
				File ReadFile = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Mohammed_AlHatmi\\History Inputs.txt");

//				 Creating an object of BufferedReader class
				BufferedReader br = new BufferedReader(new FileReader(ReadFile));

//				 Declaring a string variable
				String st;

//				 Condition holds true till
//				 there is character in a string
				while ((st = br.readLine()) != null)

//				 Print the string
					System.out.println(st);

			}

			else if (choice == 5) {
//				Creation of File Descriptor for input file
//				File SearchWord = new File("History Inputs.txt"); 

				File SearchWord = new File(
						"C:\\Users\\Lenovo\\eclipse-workspace\\Mohammed_AlHatmi\\History Inputs.txt");

//				Intialize the word Array
				String[] words = null;

//			    Creation of File Reader object
				FileReader fr = new FileReader(SearchWord);

//				Creation of BufferedReader object
				BufferedReader br = new BufferedReader(fr);

				String s;

				System.out.println("Please Enter the word you want to search:");
//			    Input word to be searched
				String WordInput = sc.next();

//			    Intialize the word to zero
				int count = 0;

//			    Reading Content from the file
				while ((s = br.readLine()) != null) {

//			   	Split the word using space
					words = s.split(" ");

//			 	Search for the given word
					for (String word : words) {
						if (word.equalsIgnoreCase(WordInput)) {
							count++;
						}
					}
				}

//			    Check for count not equal to zero
				if (count != 0) {
					System.out.println("\n");
					System.out.println("--------------------------------------------------");
					System.out.println(
							"The given word |" + WordInput + "| is present for (" + count + ") Times in the file");
					System.out.println("--------------------------------------------------");
					System.out.println("\n");

				} else {
					System.out.println("\n");
					System.out.println("--------------------------------------------------");
					System.out.println("The given word is not present in the file");
					System.out.println("--------------------------------------------------");
					System.out.println("\n");

				}

				fr.close();
			}

//			 To Print out the data:
			else if (choice == 6) {
				try {
//					File ReadFile = new File(
//							"C:\\Users\\Lenovo\\eclipse-workspace\\Mohammed_AlHatmi\\History Inputs.txt");

					FileOutputStream EncryOut = new FileOutputStream("Encrypted File.txt");
					ObjectOutputStream ABC = new ObjectOutputStream(EncryOut);
					ABC.writeObject(Scl);
					ABC.writeObject(newDept);
					ABC.writeObject(Dp1.newTech);
					ABC.writeObject(Tc1.newStu);
					ABC.writeObject(Std1.newCrs);
					ABC.writeObject(Crs1.newMark);
					ABC.close();
					EncryOut.close();

					System.out.println("\n");
					System.out.println("The DATA Serialization in Encrypted File.txt");
					System.out.println("\n");
					FileInputStream EncryIn = new FileInputStream("Encrypted File.txt");
					ObjectInputStream In = new ObjectInputStream(EncryIn);
					Scl = (School) In.readObject();
					newDept = (ArrayList) In.readObject();
					Dp1.newTech = (ArrayList) In.readObject();
					Tc1.newStu = (ArrayList) In.readObject();
					Std1.newCrs = (ArrayList) In.readObject();
					Crs1.newMark = (ArrayList) In.readObject();

					In.close();
					EncryIn.close();

//					 increment counter variable
					counter5 = counter5 + 1;

					System.out.println("\n");
//					 For loop inside for loop:
					for (Department D : newDept) {

						System.out.println("Assigned in " + D.getName() + " Department");

//						 print the incremented counter variable value
						System.out.println("--------------------------------------------");
						System.out.println("Teacher Number" + " #" + counter5);

						for (Teacher T : D.newTech) {
							System.out.println("Teacher is name " + T.getName());
							System.out.println("Holding ID " + T.getId());

							for (Student S : T.newStu) {
								System.out.println("Have Student named " + S.getName());
								System.out.println("his ID " + S.getId());
								System.out.println("at age of " + S.getAge());

								for (Course C : S.newCrs) {
									System.out.println("Assigned to teach " + C.getName() + " Holding ID " + C.getId());
									System.out.println(
											"Total  Marks of : " + C.getName() + " " + C.getId() + " is " + totalMarks);
									System.out.println("--------------------------------------------");
									System.out.println("\n");
								}
							}
						}
					}

				} catch (IOException z) {
					z.printStackTrace();
				} catch (ClassNotFoundException y) {
					System.out.println("Class not found");
					y.printStackTrace();
					return;

				}

			}

//			 Exiting the menu:
			else if (choice == 7) {
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