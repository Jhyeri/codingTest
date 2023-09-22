import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//입력받은 개수 변수 저장
		int n = Integer.parseInt(br.readLine());
		
		//입력받은 숫자 문자열로 저장
		String str = br.readLine();
		
		int a = 0;
		
		//한 글자씩 분리
		for(int i=0; i<n; i++) {
			a += str.charAt(i)-'0';
			//charAt은 해당 문자의 아스키코드를 반환하기 때문에 반드시 -48 또는 -'0'을 해주어야 알맞은 숫자가 출력된다.
			
		}
		
		System.out.println(a);
	}

}
