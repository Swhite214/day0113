package inheritance;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculater calculator = new Calculater();
		double result = calculator.areaCircle(2.5);
		System.out.println("원의 넓이 : " + result);
		
		Computer computer = new Computer();
		double result2 = computer.areaCircle(2.5);
		System.out.println("원의 넓이 :" + result);
		Calculater computer2 = new Computer();
		computer2.areaCircle(2.5);// 다형성~ 결과는? 오버라이드된형태로나옴 단 멤버필드 호출하면 부모의 멤버필드로 나옴
		//다형성이란? 자식객체(Computer)로 인스턴스화하고 부모타입 객체변수(Calculater)로 접근한다.
		//OBject는 최상위부모이므로
		Object asdf = new Computer(); //당연히 이것도 가능
	}//?? 똑같은데
		
		

}
