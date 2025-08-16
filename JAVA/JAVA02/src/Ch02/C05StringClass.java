package Ch02;

public class C05StringClass {
//실제 문자열의 위치 확인
	public static void main(String[] args) {
		String str1 = "Java Powerful";
		String str2 = new String("java Programming");
		String str3 = str1 + str2; //Java Powerful java Programming이 연결되서 메서드에 위치함 
		String str4 = str1.concat(str2); // 문자열을 이어붙이는 메서드  str1과str2를 붙인다. +랑 같은위치지만 정보가 다름 <= 메모리낭비
//		
//		
//		System.out.printf("%x\n",System.identityHashCode(str1));
//		System.out.printf("%x\n",System.identityHashCode(str2));
//		System.out.printf("%x\n",System.identityHashCode(str3));
//		System.out.printf("%x\n",System.identityHashCode(str4));

		System.out.println("문자열 길이 : " + str1.length());
		System.out.println("한문자 찾기 : " + str1.charAt(2));
		
		System.out.println("인덱스 찾기 : " + str1.indexOf('a'));
		System.out.println("인덱스 찾기 : " + str1.lastIndexOf('a'));
		
		System.out.println("문자열포함 여부 : " + str1.contains("va"));
		System.out.println("문자열포함 여부 : " + str1.contains("abs"));
		
		System.out.println("문자열 자르기 : " + (str1.substring(2,6))); //인덱스 순서2번부터6번까지 자름 슬라이드랑같음
		
		String str6 = "등산,탁구,축구,골프,독서,영화감상";
		String [] result = str6.split(",");
		//split은 배열을 자르기때문에 배열형태로 만들어야함.
		
		for(String hobby : result)
			System.out.println(hobby);
		
//		int i=0;
//	String str  = ""; //str이라는 참조변수에 빈문자를 넣고 숫자누적 => 형변환 작업이 이뤄지면서 문자열처럼 덧붙여짐.
//	while(i<10) {
//		str +=i;
//		System.out.print("str : " + str + " ");
//		System.out.printf("위치 : %x\n",System.identityHashCode(str));
//		i++;
//	}
		
		//문자열 덧붙이기(메모리 누수 방지 클래스 : StringBuffer , StringBuilder)
		
//		int i=0;
////		String str  = "";
//		StringBuilder str = new StringBuilder("");
//		while(i<10) {
////			str +=i;
//			str.append(i);
//			System.out.print("str : " + str + " ");
//			System.out.printf("위치 : %x\n",System.identityHashCode(str));
//			i++;
//		}
	//기존의 문자열이 저장된 위치에서 str이 메모리영역을 계속 확장시켜 사이즈를 확장시킴
		
	}

}
