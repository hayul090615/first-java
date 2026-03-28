package exam;

import java.util.Scanner; 

public class Cookie8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.print("연도를 입력하세요: ");
        int year = in.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(true); 
        } else {
            System.out.println(false);
        }
    }
}
