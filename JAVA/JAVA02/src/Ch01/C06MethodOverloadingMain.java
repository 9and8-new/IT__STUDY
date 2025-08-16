package Ch01;

import java.util.Scanner;

class C06Simple {
	// 속성
	// 오버로딩 : 같은 이름의 메서드를 매개변수 의 개수또는 타입만 다르게 하여 여러 개 정의하는 것 
	// 메서드 이름을 재사용함으로써 코드의 가독성과 유지보수성 향상
	// 기능 | 이름을 통일해서 코드의 파라미터의 개수에 따라 알맞는것을 뽑아서 자동으로 사용하게끔 만듬.
	public int sum(int n1, int n2) { 				//반환자료형(ex.int)이 있으면 return은 필수임. 안할시 오류발생
		System.out.println("sum1(int n1, int n2)");
		return n1 + n2;
	}
	public int sum(int n1, int n2,int n3) { 				
		System.out.println("sum2(int n1, int n2,int n3)");
		return n1 + n2 + n3;
	}
	public int sum(int n1, int n2, int n3, int n4) {
		System.out.println("sum3(int n1, int n2, int n3, int n4)");
		return n1 + n2 + n3 + n4;
	}
	
}


public class C06MethodOverloadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C06Simple obj = new C06Simple();
		obj.sum(10, 20);
		obj.sum(10, 20, 30);
		obj.sum(10, 20, 30, 40);
	}

}
