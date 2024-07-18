
/*キーとバリューの組み合わせを登録できる Recorderクラス を以下の条件を満たすように実装しましょう。
put(String key, String value)
keyとvalueの組み合わせを受け取り、登録します
このとき、標準出力に「[keyの値] = [valueの値]」と出力します
get(String key)
keyが登録済みの場合、対応するvalueを標準出力に出力します
指定されたキーが未登録の場合、IllegalArgumentException をスローします
delete() / void delete(String key)
keyが登録済みの場合、対応するkeyとvalueの組み合わせを削除します
このとき、標準出力に「deleted: [keyの値]」と出力します
指定されたキーが未登録の場合、IllegalArgumentException をスローします
引数がなかった場合、全てのキーとバリューの値を削除します
このとき、標準出力に「deleted all」と出力します*/

import java.util.HashMap;
import java.util.Map;

public class Recorder {
	private Map<String, String> map = new HashMap<>();

	public void put(String Key, String value) {//keyとvalueの組み合わせを受け取り、登録します
		map.put(Key, value);// mapにKey,valueのセットを追加する
		System.out.println("[" + Key + "] = [" + value + "]");//このとき、標準出力に「[keyの値] = [valueの値]」と出力します
	}

	public void get(String key) {
		if (!map.containsKey(key)) {//mapにkeyが含まれていない場合
			throw new IllegalArgumentException();//指定されたキーが未登録の場合、IllegalArgumentException をスローします
		} else {
			System.out.println(map.get(key));
		}
	}

	public void delete(String key) {
		if (!map.containsKey(key)) {//mapにkeyが含まれていない場合
			throw new IllegalArgumentException();

		} else {
			map.remove(key);//keyが登録済みの場合、対応するkeyとvalueの組み合わせを削除します
			System.out.println("deleted: [" + key + "]");//このとき、標準出力に「deleted: [keyの値]」と出力します
		}
	}

	public void delete() {
		map.clear();//引数がなかった場合、全てのキーとバリューの値を削除します
		System.out.println("deleted all");//このとき、標準出力に「deleted all」と出力します
	}

}