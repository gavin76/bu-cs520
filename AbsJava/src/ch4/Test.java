package ch4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int balance = 11;
		
		while (balance-- >= 1) {
			if (balance > 9) {
				System.out.println("continue");
				continue;
			}
			balance -= 9;
		}
	}

}
