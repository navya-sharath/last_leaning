package page_3;

public class Condition_statement {

	public static void main(String[] args) {
		int age =152;
		if (age<=18) {
			System.out.println("age is "  + age+ " there are childrens");
		
		}
		else if(age<=30){
			System.out.println("age is "+age+" there are adults");
	}
		else if(age<=110) {
		System.out.println("age is " +age+" there are seniours");

}
		else {
			System.out.println("there are death");
		}
			
}
}
