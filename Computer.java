package inheritance;

import java.io.File;
import java.io.FileInputStream;

public class Computer extends Calculater{
	//부모의 메서드와 동일 시그니처(리턴타입, 메서드이름, 파라미터)를 가져야 한다
	@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer Override areaCircle()");
		//File file = new File("test.txt");
		//FileInputStream fis = new FileInputStream(file);
		return Math.PI * r * r; //클래스변수입니다. Math클래스의 PI라는 변수를쓴거임 static으로 공유
	}	//private<default<protected<public 언제나 이겁니다
		//접근제어자는 부모의 범위와 동일하거나 더 커야함
		//새로운 예외를 thorws할 수 없습니다. 더 정확히는 부모의 메서드에 throw가없다면 자식에서도 안됨
	
}
