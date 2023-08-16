import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		if(a%4==0) { //a가 4의 배수일 때
			
			if(a%400 == 0) { //4의 배수이면서 400의 배수일 때
				System.out.println("1"); //윤년
			} else if(a%100 == 0) { //4의 배수이면서 100의 배수이면
				System.out.println("0"); //윤년이 아님
			} else {
				System.out.println("1");
			}
			
		} else { //a가 4의 배수가 아니면
			System.out.println("0"); //윤년이 아니므로 0
		}
		
		//삼항연산자 사용하기
//		System.out.println((a%4==0)?((a%400==0)?"1":(a%100==0)?"0":"1"):"0");
	}

}
