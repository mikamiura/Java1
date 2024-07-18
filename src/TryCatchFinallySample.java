/*以下の条件を満たす TryCatchFinallySampleクラス を実装しましょう。
課題②
mainメソッド内でtry、catch、finallyブロックを持ちます
それぞれのブロック内で、標準出力にブロック名を出力します
プログラムを実行したとき、出力結果が指定の内容と一致します*/

public class TryCatchFinallySample {
		public static void main(String[] args) {
		
		try {
			System.out.println("try");//標準出力にブロック名を出力①
			Integer.parseInt(args[0]);//文字列を整数に変換(文字列例外、整数実行)

		} catch (Exception e) {
			System.out.println("catch");//標準出力にブロック名を出力②
			
		} finally {
			System.out.println("finally");//標準出力にブロック名を出力③
			
		}

	}
}
