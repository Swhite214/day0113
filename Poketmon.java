package inheritance;

public class Poketmon {
	//Is-A 관계에 해당하는 친구들만 상속관계로 만듭시다 그리고 공통점 추출하는 이른바 추상화 작업을 거칩시다.
	//여러자식 클래스에서 공통사항을 추출해서 생성가능
	String name;
	String type;
	int level;
	String tech;
	long poketno;
	//오버라이드할때 void disp()여기까지는 부모의것임 {} 여기 바디부분을 자식이 재정의한형태임
}

class Pickachu extends Poketmon{
	String thundertech;
	String weak;
	void disp() {
		System.out.println("이름은? "+super.name);//보통 명시해주지않는한 가장 가까운곳에서 부터 찾아갑니다
		System.out.println("타입은? "+type);
		System.out.println("레벨은? "+level);
		System.out.println("기술은? "+super.tech);
		System.out.println("포켓 넘버는? "+poketno);
		System.out.println("번개 기술은? "+this.thundertech);
		System.out.println("약점은? "+this.weak);
		System.out.println("------------------------------------------");
		}
	public Pickachu() {
		name = "picakchu";
		type = "전기";
		level = 7;
		tech = "몸통박치기";
		poketno = 1;
		thundertech = "전기타격";
		weak = "바위";
	}
}

class Pyry extends Poketmon{
	String firetech;
	String weak;
	void disp() {
		System.out.println("이름은? "+super.name);
		System.out.println("타입은? "+type);
		System.out.println("레벨은? "+level);
		System.out.println("기술은? "+tech);
		System.out.println("포켓 넘버는? "+this.poketno); //this super둘다 접근 가능합니다.
		System.out.println("번개 기술은? "+this.firetech); //대부분 경우 this는 자신의 클래스에 있는 멤버필드를 가리킬때 super는 부모클래스에있는것을 호출할때 사용되요
		System.out.println("약점은? "+this.weak);
		System.out.println("------------------------------------------");
	}
	public Pyry() {
		// TODO Auto-generated constructor stub
		name = "pyry";
		type = "불꽃";
		level = 5;
		tech = "꼬리치기";
		poketno = 2;
		firetech = "불꽃타격";
		weak = "물";
	}
}
