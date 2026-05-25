package kadai_018;

//同じく親クラスを継承！
public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

 // 名前のフィールドに「一郎」をセットするメソッド
 public void setGivenName() {
     this.givenName = "一郎";
 }

 // 親から丸投げされた抽象メソッドの中身を描く！
 public void eachIntroduce() {
     System.out.println("好きな食べ物はリンゴです");
 }
}