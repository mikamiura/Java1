/*2. 人を表す Person クラスをポリモーフィズムを用いて実装してみましょう

課題1.では 人を表す Person クラス を実装しましたが、性別によって振る舞いを切り分けるために「enumを利用したフラグ」を利用していました。

インスタンス毎に異なる挙動をさせる実装方法は、フラグを利用する他にも ポリモーフィズム というものがあります。
これは 共通の抽象クラス を継承する 実装クラス を複数用意することで、振る舞いを切り分ける実装方法です。

こんどは課題1で作成した Personクラス と同様の機能をポリモーフィズムを利用して実装してみましょう。
以下の条件を満たす抽象クラスとクラスを実装してください。*/
/*mainメソッドを持つ、処理を実行させるためのクラスです
mainメソッドは以下の条件を満たします
Manクラス、Womanクラスのインスタンスを生成し、後述するdoSpeakメソッドに渡します
以下の条件を満たすstaticメソッド doSpeak を持ちます
引数としてAbstractPersonのインスタンスを受け取ります
引数として受け取ったAbstractPersonのインスタンスのspeakメソッドを呼び出します*/

public class GenderSpeaker {
	public static void main(String[] args) {
		//Manクラス、Womanクラスのインスタンスを生成
		AbstractPerson man = new Man();
		AbstractPerson woman = new Woman();
		
		doSpeak(man);//manが渡される、doSpeakの前何もついてないからこのクラスのdospeakメソッドを呼び出し
		doSpeak(woman);
		
	}
	//以下の条件を満たすstaticメソッド doSpeak を持ちます
	//引数としてAbstractPersonのインスタンスを受け取ります
	public static void doSpeak(AbstractPerson person) {
	//引数として受け取ったAbstractPersonのインスタンスのspeakメソッドを呼び出します
		person.speak();//引数person、サブクラスのspeak見に行く
	}

}
