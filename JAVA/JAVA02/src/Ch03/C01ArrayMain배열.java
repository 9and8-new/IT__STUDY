package Ch03;

import java.util.Arrays;
import java.util.Scanner;

public class C01ArrayMain배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// []위치는 상관없음.
//		int [] arr1 = new int[5];
		int arr1 [] = new int[5]; 
		System.out.println("배열길이 : " + arr1.length);
		System.out.println("5개의 값을 입력하세요");
		arr1[0] = sc.nextInt();
		arr1[1] = sc.nextInt();
		arr1[2] = sc.nextInt();
		arr1[3] = sc.nextInt();
		arr1[4] = sc.nextInt();

		// 배열보다는 리스트를 많이 쓴다고 함.
		for(int i=0;i<arr1.length;i++) {
			System.out.println(i+" : "+arr1[i]);
		}
		System.out.println("---------------");
		for(int el : arr1) {
			System.out.println(el);
		}
		System.out.println("---------------");
//		Arrays.stream(arr1).forEach((el)->{System.out.println(el);});
//		// () {}생략가능
//		Arrays.stream(arr1).forEach(el->System.out.println(el));
//		// 생략가능
//		Arrays.stream(arr1).forEach(System.out::println);
		
		// 배열에 입력된 정수중에 최대값과 최소값을 출력
//		int max = arr1[0];
//		int min = arr1[0];
//		for(int i=0;i<arr1.length;i++) {
//			if (arr1 [i] > max) {
//				max = arr1[i];
//			}
//			if (arr1 [i] < min) {
//				min = arr1[i];
//			}
//		}
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
		
		// MAX MIN구해수는 stream 함수?
		System.out.println("MAX : " + Arrays.stream(arr1).max().getAsInt());
		System.out.println("MIN : " + Arrays.stream(arr1).min().getAsInt());
	}
	
}
