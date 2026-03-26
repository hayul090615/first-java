package exam;

import java.util.Scanner;

public class Cookie5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 

        System.out.print("점수를 입력하세요: ");
        int a = in.nextInt(); 
		
        if(a > 100 || a < 0) {
        	System.out.println("100점 이하로 작성하세여");
        }
        else {
        	if (a>=90) {
    			System.out.println("A");
    		}
    		else if (a>=80) {
    			System.out.println("B");
    		}
    		else if (a>=70) {
    			System.out.println("C");
    		}
    		else {
    			System.out.println("F");
    		}
        }
		
	}

}
