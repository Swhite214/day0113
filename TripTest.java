package inheritance;

import java.util.Scanner;

public class TripTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("여행 상품을 선택하세요");
		System.out.println("1. 독도 2. 제주 3. 부산");
		System.out.println("선택 > ");
		int choice;
		Trip trip = null; //스위치문 안에서 선언하면 스위치문안에서밖에 못쓰고 밖에나오면 없어져버림
		JejuTrip j = new JejuTrip();
		switch(choice = in.nextInt()) {
		case 1:trip = new DokdoTrip(); //trip.go(); 여기서 변수이름이 똑같은데 어떻게 3개나 가능할까? 변수이름은 똑같을지 몰라도 참조하는 객체가 다르기에 엄연히 다른존재입니다.
		break;// 다형성은 상속을 쓰는 주요 이유중 하나입니다.
		case 2:trip = new JejuTrip(); //trip.go(); 게다가 switch문에 따라 trip이 참조하는 객체가 달라짐
		break;
		case 3:trip = new BusanTrip();// trip.go(); 
		break;
		default:
			System.out.println("그런 여행은 없어요");
		}
		trip.go();
		j.disp();//이건 가능함 하지만
		//trip.disp(); 부모타입으로 만들어진건 오버라이드된 메서드만 사용가능
		in.close(); //다형성관계가 아니라 자식 타입의 객체만 만든다 하더라도 부모클래스의 기본 생성자가 존재한다면 반드시 출력됩니다.
	}

}
