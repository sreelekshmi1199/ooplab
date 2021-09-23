import java.util.Scanner;
class stud {
    public static void main(String[] args) {
	String name;
	int roll,i;
	char[] branch;
	double mark;
	char grade;
	Scanner reader=new Scanner(System.in);
	System.out.print("Enter student name:");
	name= reader.nextLine();
	System.out.print("Enter roll number:");
	roll=reader.nextInt();
	System.out.print("Enter branch:");
	branch=reader.next().toCharArray();
	System.out.print("Enter student mark:");
	mark=reader.nextDouble();
	System.out.print("Enter student grade:");
	grade=reader.next().charAt(0);
	System.out.println("\n\nStudent details:\nName: "+name+"\nRoll number: "+roll+
	"\nBranch name: ");
	for(i=0;i<branch.length;i++)
	System.out.print(branch[i]);
	System.out.print("\nMArk : "+mark+"\nGrade: "+grade);
	} }
