package Ch06.IF문;

import java.util.Scanner;

public class C02switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ranking = sc.nextInt();
		char medalColor;
		switch (ranking) { //case에는 상수값만 가능함 | 조건식 넣으면 안됨
		case 1: 
			medalColor = 'G';
			System.out.println("메달색상 : G");
			break;
		case 2:
			medalColor = 'S';
			System.out.println("메달색상 : S");
			break;
		case 3:
			medalColor = 'B';
			System.out.println("메달색상 : B");
			break;
		default:
			medalColor = 'C';
			System.out.println("메달색상 : C");
		}
		System.out.println(ranking + " 등 메달의 색은 " + medalColor + " 입니다.");


	}

}
