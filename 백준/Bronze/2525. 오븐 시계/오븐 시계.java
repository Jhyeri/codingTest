import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" "); //입력한 글자를 읽고 공백으로 구분하여 String타입의 배열에 저장
		
		int H = Integer.parseInt(str[0]); //시
		int M = Integer.parseInt(str[1]); //분
		
		int T = Integer.parseInt(br.readLine()); //요리에 필요한 시간 (분 단위)
		
		br.close();
		
		int min = H * 60 + M; //시 * 60 + 분 = 하나의 분으로 만든다.
		min = min + T; //요리 시간 더하기
		
		int hour = min / 60; //시 분리
		int minute = min % 60; //분 분리
		
		
		if(hour >= 24) { //시가 24를 넘을 경우
			hour -= 24; //24부터는 0으로 표시하므로 24를 뺀다.
		}
		
		System.out.println(hour + " " + minute);
	}

}
