import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			//점수 개수 입력받기
			int n = Integer.parseInt(br.readLine());
			
			//점수들 입력받기
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int max = -1; //최대값. 입력받을 값이 0보다 크거나 같기 때문에 -1?
			double sum = 0.0; //구한 평균을 소수자리까지 출력해야 함
			
			for(int i=0; i<n; i++) {
				int value = Integer.parseInt(st.nextToken()); //값을 하나씩 가져옴
				
				if(value > max) { //값이 최대값보다 크면
					max = value;
				}
				
				sum += value; //총점 구하기
			}
		
				//각각의 값마다 (점수/최대값)*100 연산을 따로 해주며 sum에 더해주는 것보다
				//전부 더 해서 한 번만 연산하는 것이 효율적이다.
				System.out.println((sum/max) * 100.0 / n);
				//sum이 double타입이므로 연산값도 double타입으로 형변한 되어 반환된다.
	}

}
