import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		// 백슬래시와 따옴표는 단독으로 출력할 수 없고,
		// 백슬래시를 한번 더 붙여서 출력 가능하다.
		bw.write("|\\_/|");
		bw.newLine();
		
		bw.write("|q p|   /}");
		bw.newLine();
		
		bw.write("( 0 )\"\"\"\\");
		bw.newLine();
		
		bw.write("|\"^\"`    |");
		bw.newLine();
		
		bw.write("||_/=\\\\__|");
		
		bw.flush();
		bw.close();
		
		System.out.println(bw);
		
		
	}

}
