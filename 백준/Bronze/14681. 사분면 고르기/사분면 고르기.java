import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //키보드 입력을 받기 위해 Scanner 객체 생성
		
		//정수를 입력받음
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		String answer = null;
		
		if(a > 0) {
			if(b > 0) {
				answer = "1";
			} else if (b < 0) {
				answer = "4";
			}
		} else {
			if(b > 0) {
				answer = "2";
			} else if (b < 0) {
				answer = "3";
			}
		}
		
		System.out.println(answer);
		
		
	}

}
