package Ch05;

// 부모클래스
class Super{
	int n1;
}
// 자식클래스
class Sub extends Super{
	int n2;
}
public class C06UpDownCastingMain엄청중요 {

	public static void main(String[] args) {
		
		// NoCasting(형변환 없음 / 자료형일치) 
		Super ob1 = new Super();
		ob1.n1 = 10;
		Sub ob2 = new Sub();
		ob2.n1 = 10;	// 부모에게 상속받은 n1값
		ob2.n2 = 20;	// Sub 자식에서만 있는 n2

		// UpCasting(상위클래스 참조변수 = 하위클래스형 객체) (자동형변환)
		// 자동형변환이 일어나는 이유 ? 메모리 영역을 침범할 우려가 없기 때문
		// UpCasting을 사용하는 이유 : 1)상속관계에 있는 모든 하위클래스를 연결(바인딩)하기 위해
		// 						   2)Upcasting된 상태에서는 재정의된 함수에 접근이 가능하다!
		Super ob3 = new Sub();
		ob3.n1=100;
//		ob3.n2=200; n2에는 접근못함
		Super ob4 = ob2;
		ob4.n1=200;
//		ob4.n2=300;
		
		//DownCasting(하위클래스 참조변수 = 상위클래스형 객체)(강제형변환) 상속관계 연결구 개별객체 접근할려면 다운캐스팅 사용
//		Sub ob5 = (Sub)ob1; // 문제발생함
//		ob5.n1=100; // 실제 있는 n1공간에 값 대입(문제 없음)
//		on5.n2=200; // n2가 없을 수 있는데 값을 넣는다고 하면 예외(컴파일 에러)가 뜸
		
		Sub down = (Sub)ob4; //Upcasting을 전제로 한 Downcasting
		down.n1=1000;
		down.n2=2000;
		
		
		
		
		
	}

}
