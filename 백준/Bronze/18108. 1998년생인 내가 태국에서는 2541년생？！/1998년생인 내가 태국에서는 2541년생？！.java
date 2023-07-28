import java.util.Scanner;

public class Main {

	//식을 직접 세워서 계산하는 문제
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        //사용자로부터 키 입력을 받기 위해 System.in 사용
		
		int year = sc.nextInt(); //입력받은 값을 int 타입으로 반환
		
		System.out.println(year - 543); //입력한 불기 연도를 서기 연도로 변환하기 위해 -543
	
	}

}
