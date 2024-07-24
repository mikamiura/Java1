/*女性を表すクラスです
AbstractPersonを継承しています
インスタンスメソッド speak はオーバーライドしません*/

public class Woman extends AbstractPerson{
	//getGenderだけオーバーライド
	@Override
	public String getGender() {//スーパークラスとアクセス修飾子合わせる
		return "Woman";
	}
	//speakメソッドここにないからスーパーへ見に行く

}
