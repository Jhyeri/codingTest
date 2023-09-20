import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine()); //테스트 케이스의 개수
		//readLine()은 엔터까지의 문자열을 가져옴
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " "); //readLine()을 통해 문자열을 한 줄씩 읽어들이고, 공백을 기준으로 문자열을 구분하고 st 객체에 저장 
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())); //nextToken()을 통해 문자열(숫자)를 하나씩 가져와 int 형태로 변환 후, 덧셈
			sb.append('\n'); //한 줄씩 출력되어야 하므로 개행문자까지 추가하기 
		}
		
		
		System.out.println(sb);
		
	}

}
