import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		if(a>=90) System.out.println("A");//90 ~ 100점
		else if(a>=80) System.out.println("B"); //80~89점
		else if(a>=70) System.out.println("C"); //70~79점
		else if(a>=60) System.out.println("D"); //70~79점
		else System.out.println("F"); //60점 미만
	}

}
