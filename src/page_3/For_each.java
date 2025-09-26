package page_3;

public class For_each {

	public static void main(String[] args) {
		String[] fruits= {"apple","banana","pinapple","strawberries","watermelon"};
		for(String fruit:fruits) {
			if(fruit.equalsIgnoreCase("banana")){
				System.out.println("this is banana");
			}
			
		}

	}

}
