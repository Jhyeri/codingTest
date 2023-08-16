import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //키보드로부터 입력받기
		
		String str = sc.nextLine();//입력한 문자를 변수에 저장
		
		String[] arr = str.split(" "); //공백을 구분자로 문자를 나누어 배열에 저장
		
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		
		String answer = "";
		
		if(A > B) {
			answer = ">";
		} else if(A < B) {
			answer = "<";
		} else if(A == B) {
			answer = "==";
		}
		
		System.out.println(answer);
		
	}

}
