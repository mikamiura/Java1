/*人を表す抽象クラスです
性別を取得するための抽象メソッド getGender を持ちます
性別に応じて標準出力に以下のメッセージを出力するインスタンスメソッド speak を持ちます
男性の場合:「I'm a man」
女性の場合:「I'm a woman」*/

public abstract class AbstractPerson {
	public abstract String getGender();//サブクラスから取得
	public void speak() {//実行クラスのspakここ
		System.out.println("I'm a" + getGender());//サブクラスのgetGenderここ
	}

}
