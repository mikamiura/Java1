/*課題③
tryブロックのメッセージは WARNING レベルで表示しましょう
catchブロックのメッセージは SEVERE レベルで表示しましょう
finallyブロックのメッセージは INFO レベルで表示しましょう*/
//ログパッケージをインポート
import java.util.logging.Level;
import java.util.logging.Logger;

public class TryCatchFinallySample2 {
    //ロガーを宣言する。引数にログを埋め込むクラス名を設定する
	private static Logger logger = Logger.getLogger(TryCatchFinallySample2.class.getName());

	public static void main(String[] args) {
		logger.setLevel(Level.ALL);

		try {
			logger.warning("try");//↓より先、表示しない
			Integer.parseInt(args[0]);//文字列を整数に変換(文字列例外、整数実行)
			

		} catch (Exception e) {
			logger.severe("catch");

		} finally {
			logger.info("finally");
		}

	}
}
