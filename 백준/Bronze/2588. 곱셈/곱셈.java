import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//키보드로부터 입력받기 위해 InputStreamReader 사용
	//성능을 향상하기 위해 BufferedReader 보조스트림 사용
	
	//입력받아 곱셈할 두 개의 수
	int a = Integer.parseInt(br.readLine()); //입력받은 숫자를 읽어서 int로 변환
	int b = Integer.parseInt(br.readLine()); 
		
	StringBuilder sb = new StringBuilder();
	//숫자가 한 줄씩 구분되어 들어오기 때문에 StringBuilder 사용
	
	int three = a * (b%10); //1의자리와 곱셈
	int four = a * ((b/10)%10); //10의자리와 곱셈
	int five = a * (b/100); //100의자리와 곱셈
	int six = a * b; //곱셈 결과
	
	//결과들을 줄바꿈하여 출력해야 하기 때문에 \n과 함께 출력
	sb.append(three + "\n" + four + "\n" + five + "\n" + six);
	
	br.close(); //스트림 close
	
	System.out.println(sb); //sb 객체 출력

		
		
	
	}

}
