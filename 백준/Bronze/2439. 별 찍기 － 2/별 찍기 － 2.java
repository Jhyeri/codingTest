import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int a = Integer.parseInt(br.readLine());

			//공백은 n번째 행에 a-n개, 별은 n번째 행에 n개 출력
			//i가 행을 의미하므로 a-i의 값만큼이 공백
			
			for(int i=0; i<a; i++) { //ex)5번 반복. 전체 행을 의미
				for(int j=0; j<a-(i+1); j++) { //4번 반복. 공백을 의미. i가 0부터 시작하므로 i+1
					System.out.print(" ");
				}
				for(int k=0; k<i+1; k++) {//단독으로 반복하는 게 아니라 전체 행의 수와 맞춰 출력하는데, i가 0부터 시작하므로 i+1만큼 반복
					System.out.print("*");
				}
				System.out.print('\n');
			}
			
	}

}
