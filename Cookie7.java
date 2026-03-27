package exam;

public class Cookie7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int dan = 2; dan <= 9; dan++) {
            System.out.println("\n" + "출력 단: " +dan);
            for (int i = 1; i <= 9; i++) {
                System.out.print(dan + "*" + i + "=" + (dan * i) + "\t");
            }
            System.out.println(); 
		}
	}
}