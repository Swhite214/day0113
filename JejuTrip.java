package inheritance;

public class JejuTrip extends Trip{

	@Override
	void go() {
		// TODO Auto-generated method stub
		System.out.println("머리도 식힐겸 제주로 말이야~");
	}
	void disp() {}
	public JejuTrip() {
		System.out.println("제주 생성자");
	}
	
}
class BusanTrip extends Trip{

	@Override
	void go() {
		// TODO Auto-generated method stub
		System.out.println("아무런 계획도 없이 나혼자 부산으로~");
	}
	public BusanTrip() {
		System.out.println("부산 생성자");// TODO Auto-generated constructor stub
	}
}
class DokdoTrip extends Trip{

	@Override
	void go() {
		// TODO Auto-generated method stub
		System.out.println("숨좀 쉬고 싶어서 독도로 가보자~");
	}
	public DokdoTrip() {
		System.out.println("독도 생성자");// TODO Auto-generated constructor stub
	}
	
}