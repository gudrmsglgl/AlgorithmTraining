import java.util.Scanner;

public class A2 {
	
	public static void main(String[] args) {
		/*
		 * 800
		   700
		   900
		   198
		   330
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int pasta1= sc.nextInt();
		int pasta2 = sc.nextInt();
		int pasta3 = sc.nextInt();
		
		int juice1 = sc.nextInt();
		int juice2 = sc.nextInt();
		
		int choicePasta = ((pasta1 > pasta2) ? pasta2 : pasta1 ) > pasta3 ? pasta3 : ((pasta1 > pasta2) ? pasta2 : pasta1 ); 
		int choiceJuice = (juice1 > juice2) ? juice2 : juice1; 
		
		float totalPrice = (choicePasta + choiceJuice) + ((choicePasta + choiceJuice)/(float)10) ;
		
		System.out.printf("%.1f",totalPrice);
		
		sc.close();
	}
}
