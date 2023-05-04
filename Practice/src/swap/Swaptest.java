package swap;

public class Swaptest {
	
	public static int swap(int a, int b){
        return a;
    }

    public static void main(String[] args) {
    	int a=10, b=20;
        // 첫번째 인자 a 가 값이 복사되고, 두번째인자 a=b는 a가 b로 바뀐 후 값이 복사되어 b의 값으로 함수로 전달됨
        // 함수의 리턴값은 두번째인자가 무엇이든 관계없이, 첫번째 인자인 a이므로, b는 a 의 값으로 바뀜
        b = swap(a,a=b);
        System.out.println(a);
        System.out.println(b);
    }
}