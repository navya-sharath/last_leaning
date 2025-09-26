package page_3;

public class Condition_3 {

	public static void main(String[] args) {
		int marks = 44;
		
		System.out.println(" STUDENT MARKS ");
		if (marks<=24) {
			System.out.println ( marks+ " this student is fail");
		}
		else if (marks>=25 && marks<=49) {
			System.out.println ( marks+ " this student have 'C' grade ");
		}
		else if (marks>=50 && marks<=74) {
			System.out.println (marks+ " this student have 'B' grade");
		}
		else if (marks>=75 && marks<=100) {
			System.out.println ( marks+ " this student have 'A' grade");
		}
		System.out.println(" THANK YOU ");

	}

}
