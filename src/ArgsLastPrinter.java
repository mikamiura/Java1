
public class ArgsLastPrinter {
	public static void main(String[] args) {
		//1.引数argsの要素数を数える
		int i = args.length;
		//2.要素数が0個かどうか？を確認する
		if (i == 0) {
			//3.要素数が0個だったらメッセージを表示して終了
			System.out.println("なし");
		} else {
			//4.要素数が1個以上だったら最後の要素を表示する
			System.out.println(args[args.length - 1]);
			//　りんご(0)・ばなな(１)・もも(2)
		}
	}
}
