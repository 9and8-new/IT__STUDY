package Ch01;

import java.util.Scanner;

class MethodTest {
	// 속성
	Scanner sc = new Scanner(System.in);
	// 기능
	public int sum1(int n1, int n2) { 				//반환자료형(ex.int)이 있으면 return은 필수임. 안할시 오류발생
		return n1 + n2;
	}
	public int sum2() {								//반환자료형이 있으면 return은 필수임. 안할시 오류발생
		return sc.nextInt() + sc.nextInt();
	}
	public void sum3(int n1, int n2) {				//void = retun 필수 x void는 텅빈거라 그냥 return;은 가능.
		System.out.println(n1 + n2);
		return;
	}
	public void sum4() {
		System.out.println(sc.nextInt() + sc.nextInt());
	}
}
public class C04MethodMain {

	public static void main(String[] args) {
		MethodTest sumCalc = new MethodTest(); // 객체 생성
		System.out.println(sumCalc.sum1(10, 20));
		System.out.println(sumCalc.sum2());
		sumCalc.sum3(10,20);
		sumCalc.sum4();
	}

}

