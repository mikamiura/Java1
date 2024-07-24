//空行を含んだ以下のコードは、現在の時間 (HH:mm:ss.SSS) を表示することができるメソッド 
//`currentTime()` を持ったクラス  `Lambda` です。
//「ここに『1行』追加」の部分に、ラムダ式を使って「現在の時間、半角スペース、1〜9999の連番」
//を表示するコードを実装してみましょう。

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

public class Lambda {
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 1000);
		stream.forEach(i -> System.out.println(Lambda.currentTime() + " " + i));
	}

	public static String currentTime() {
		return FORMATTER.format(LocalDateTime.now());
	}
}
