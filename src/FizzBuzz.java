
public class FizzBuzz {
	public static void main(String[] args) {
		//argsを整数に変換
		//コマンド引数52
		int num = Integer.parseInt(args[0]);
		
		for (int i = 1; i <= num; i++) {

			//iが3で割り切れる場合
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			}
			//iが5で割り切れる場合
			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			//iが15で割り切れる場合
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);

			}

		}
	}
}
