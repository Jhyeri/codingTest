import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		br.close();
		
		//공백을 기준으로 구분하므로 STringTokenizer 사용
		StringTokenizer st = new StringTokenizer(str);
		
		int a = Integer.parseInt(st.nextToken()); //시
		int b = Integer.parseInt(st.nextToken()); //분
	
		
		if(b < 45) { //입력받은 값이 45분보다 작으면
			a--; //시간을 -1
			b =	 60 - (45 - b);
			
			if(a<0) { //시가 0보다 작아질 경우
				a = 23; //23시로 설정
			}
		
			System.out.println(a + " " + b);
		
		} else {
			System.out.println(a + " " + (b-45));
		}
	}

}
