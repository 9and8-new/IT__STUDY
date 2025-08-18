package Ch03;

public class C03ArrayMain배열3 {

	public static void main(String[] args) {
		int arr[][] = { 
				{ 10, 20, 30 }, 
				{ 40, 50, 60, 65, 67 }, 
				{ 70, 80, 90, 96, 11, 56 },
				{ 100, 110, 120, 15, 22, 33, 44 }, };

		System.out.println("행의 길이 : " + arr.length); // 1차원 배열의 요소갯수 4
		System.out.println("행의 길이 : " + arr[0].length); // 2차원에 [index]는 1차원 배열을 뽑아냄. {10, 20, 30} 길이는 3
		System.out.println("행의 길이 : " + arr[1].length); // 5
		System.out.println("행의 길이 : " + arr[2].length); // 6
		System.out.println("행의 길이 : " + arr[3].length); // 7

	}

}
