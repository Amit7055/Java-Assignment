package lab_assignments2;

import java.util.Scanner;

public class StudentQuestion8 {

	private int rollNo;
	private String name;
	private String course;
	private int mark;
	private char grade;
	private String result;

	Scanner sc = new Scanner(System.in);

	public void get() {
		System.out.println("Enter roll no, name, course name, mark");
		rollNo = sc.nextInt();
		name = sc.next();
		course = sc.next();
		mark = sc.nextInt();
	}

	public void display() {
		if(mark>=90)
			grade='A';
		else if(mark<90 && mark>=80)
			grade='B';
		else if(mark<80 && mark>=70)
			grade='C';
		else if(mark<70 && mark>=60)
			grade='D';
		else
			grade='F';
		
		if(mark>60)
			result="Pass";
		else
			result="Fail";
		System.out.println("Student details \nrollNo=" + rollNo + ",\nname=" + name + ",\ncourse=" + course + ",\nmark=" + mark
				+ ",\ngrade=" + grade + ",\nresult=" + result);
	}

}
