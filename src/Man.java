/*男性を表すクラスです
AbstractPersonを継承しています
インスタンスメソッド speak はオーバーライドしません*/

public class Man extends AbstractPerson {
	//getGenderだけオーバーライド
	@Override
	public String getGender() {//スーパークラスとアクセス修飾子合わせる
		return "Man";
	}
	//speakメソッドここにないからスーパーへ見に行く

}
