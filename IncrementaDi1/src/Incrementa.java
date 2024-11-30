import java.util.Scanner;

public class Incrementa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = incremento(x); 
	    System.out.print(y);

	}
	
	public static int incremento(int x) {
		return (x+1);
	}

}
