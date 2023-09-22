import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			//최대값을 찾고, 몇 번째 값인지 출력해야 함
			int max = 0;
			int index = 0;
			
			//for문으로 9번 반복하면서 문자열 입력 받기
			for(int i=0; i<9; i++) {
				
				int val = Integer.parseInt(br.readLine());
				//BufferedReader 기본 반환값이 문자이므로 int로 형변환
				
				//하나씩 max와 바로 비교하고, 크면 max에 넣기
				if(val > max) {
					max = val;
					index = i+1;
				}
			}
			System.out.println(max);
			System.out.println(index);
	}

}
