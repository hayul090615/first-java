package exam;

public class Cookie6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int dan = 2; dan <= 9; dan++) {
            System.out.println("\n" + "dan: " +dan);
            for (int i = 1; i <= 9; i++) {
                System.out.print(dan + "*" + i + "=" + (dan * i) + "\n");
            }
            System.out.println(); 
		}
	}
}
