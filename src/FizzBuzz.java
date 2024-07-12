
public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {

			//iが3で割り切れる場合
			if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			//iが5で割り切れる場合
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			//iが15で割り切れる場合
			else if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else {
				System.out.println(i);

			}

		}
	}
}
