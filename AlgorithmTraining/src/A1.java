
public class A1 {
	
	// 배낭 채우기
	// Knapsack = 50w
	// item1 = ($60, 10w), item2 = ($100, 20w), item3 = ($120, 30w)
	
	public static void main(String[] args) {
		
		int bagMax = 100;
		
		int[] itemWeight = {10, 20, 30};
		int[] itemPrice = {50, 100, 120};
		
		int totalPrice = 0;
		int n = 0;
		int remain = bagMax;
		
		
		for (int i=3; i>0; i--) {
			n = remain / itemWeight[i-1];
			remain = remain % itemWeight[i-1];
			totalPrice += itemPrice[i-1] * n;
		}
		
		System.out.printf("%s: %d$", "도둑이 훔칠 수 있는 최고 금액" ,totalPrice);
		
	}
	
}
