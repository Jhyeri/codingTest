import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//방법 2. BufferedWriter 사용하기
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("\\    /\\");
		bw.newLine();
		//줄마다 newLine()으로 개행해준다.
		
		bw.write(" )  ( \')");
		bw.newLine();
		
		bw.write("(  /  )");
		bw.newLine();
		
		bw.write(" \\(__)|");
		
		bw.flush(); //버퍼를 비움
		bw.close(); //스트림 종료
	}

}
