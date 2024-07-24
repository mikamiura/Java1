
/*Personクラスが以下の条件を満たすように実装しましょう。

Person クラスは男女いずれかの性別を持っています。性別に関してはGenderという名前の列挙型で表現しましょう。
性別はインスタンスの生成時に設定を行います
標準出力にメッセージを出力するインスタンスメソッド、 speak が定義されています
インスタンスに設定された性別を元に、表示内容を切り替えます
男性の場合:「I'm a man」
女性の場合:「I'm a woman」
Person.java の main メソッドで、以下の処理を行います
1 男性、女性のインスタンスを1つずつ作成する
2 それぞれのインスタンスのspeakメソッドを呼び出す*/

public class Person {
	//性別に関してはGenderという名前の列挙型で表現
	public enum Gender {
		MAN, WOMAN
	};
	//クラスの定義
	
	private Gender gender;

	//コンストラクタ　クラス(Gender型の引数 インスタンス変数)
	public Person(Gender gender) {
		//インスタンス変数へ代入
		this.gender = gender;
	}

	public void speak() {
		switch (gender) {
		//男性の場合:「I'm a man」
		case MAN:
			System.out.println("I'm a man");
			break;//抜ける
		//女性の場合:「I'm a woman」
		case WOMAN:
			System.out.println("I'm a woman");
			break;//抜ける
		//終わり	
		default:
		}
	}
	    //Person.java の main メソッドで、以下の処理を行います
		public static void main(String[] args) {
			//1 男性、女性のインスタンスを1つずつ作成する
			//それぞれのインスタンスのspeakメソッドを呼び出す
			Person man = new Person(Gender.MAN);
			man.speak();
	        Person woman = new Person(Gender.WOMAN);
	        woman.speak();
		}
}
