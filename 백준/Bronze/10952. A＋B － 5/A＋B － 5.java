import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

			//입력 받기
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			StringTokenizer st;
			StringBuilder sb = new StringBuilder(); //출력할 문자열을 담을 객체
		
			//0 0이 나오기 전까지 반복하기 위해 while문 사용
			while(true){
			
				st = new StringTokenizer(br.readLine(), " "); //한 줄씩 읽어와서 공백을 기준으로 문자 분리
				int a = Integer.parseInt(st.nextToken()); //st객체에서 하나의 토큰을 가져옴
				int b = Integer.parseInt(st.nextToken());
				
				if(a==0 && b==0) { //두 숫자 모두 0이면
					break; //while문 종료
				}
				
				sb.append(a+b).append('\n'); //StringBuilder객체에 덧셈결과와 개행문자 추가
			}
			
			System.out.println(sb);
	}

}
