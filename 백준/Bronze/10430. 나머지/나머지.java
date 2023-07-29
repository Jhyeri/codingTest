import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.StringTokenizer;

public class Main {
	
	//나머지 계산식 문제
	public static void main(String[] args) throws IOException {
		
		// 1. Scanner를 사용하는 방법
//		Scanner sc = new Scanner(System.in);
//		//사용자의 입력을 받기 위해 Scanner 객체 생성
//		
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		int C = sc.nextInt();
//
//		sc.close(); //OS 자원을 다시 되돌리기 위해 close
//		
//		System.out.println( (A+B)%C );
//		System.out.println(  ((A%C) + (B%C))%C );
//		System.out.println( (A*B)%C );
//		System.out.println( ((A%C) * (B%C))%C );
		
		// 2. BufferedReader를 사용하는 방법
		// 2-1. StringTokenizer 클래스를 이용하여 분리하기
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String str = br.readLine();
//		StringTokenizer st = new StringTokenizer(str, " "); //공백을 기준으로 분리
//		int A = Integer.parseInt(st.nextToken());
//		int B = Integer.parseInt(st.nextToken());
//		int C = Integer.parseInt(st.nextToken());
//		
//		System.out.println( (A+B)%C );
//		System.out.println(  ((A%C) + (B%C))%C );
//		System.out.println( (A*B)%C );
//		System.out.println( ((A%C) * (B%C))%C );
		
		
		//2-2. readLine()을 통해 읽어온 것을 split(" ")을 통해 분리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int C = Integer.parseInt(str[2]);
		
		System.out.println( (A+B)%C );
		System.out.println(  ((A%C) + (B%C))%C );
		System.out.println( (A*B)%C );
		System.out.println( ((A%C) * (B%C))%C );
	}

}
