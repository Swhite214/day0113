package others;

import inheritance.Poketmon;

public class Sub01 extends Poketmon{//클래스 vs 클래스에서는 다중상속은 지원하지않아요 허나 인터페이스에서는 다중상속이 가능해요~ 나중에 배우겠죠?
	public static void main(String[] args) {
	Poketmon p = new Poketmon();
	//System.out.println(p.name);
	//public 전부 가능 protected 동일패키지 혹은 상속 private 클래스내부 default 동일패키지
}
}
