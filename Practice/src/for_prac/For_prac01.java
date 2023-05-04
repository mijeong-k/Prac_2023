package for_prac;

public class For_prac01 {

	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		for(int i=0; i<10; i++) {
			sum1+=i;
			System.out.print("? ");
		}
		System.out.printf("\n반복횟수: 조건식 수-i+1 = %d-%d+1", 10, 0);
		System.out.printf("\n%d~9의 합: %d\n\n", 0, sum1);
		
		for(int i=0; i<=10; i++) {
			sum2+=i;
			System.out.print("? ");
		}
		System.out.printf("\n%d~10의 합: %d", 0, sum2);
	}

}
