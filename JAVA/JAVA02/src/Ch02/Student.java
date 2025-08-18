package Ch01;

//문제 1 - 다음을 만족하는 Student 클래스를 작성하시오.

//· String형의 학과와 정수형의 학번을 필드로 선언
//
//· Student 클래스의 main() 메소드에서 Student 객체를 생성하여 학과와 학번 필드에 적당한 값을 입력 후 출력

//1번문제
//public class Student {
//	String 학과;
//	int 학번;
//	
//	public static void main(String[] args) {
//		Student boy = new Student(); // boy라는 객체를 생성하는 생성자
//		boy.학과 = "무인기공학과";
//		boy.학번 = 2017;
//		
//		System.out.println(boy.학과 + boy.학번);
//	}
//}


//=======================================================================================
//문제 - 2. 위에서 구현한 Student 클래스를 다음을 만족하도록 기능을 추가하여 작성하시오.

//· 필드(클래스의 속성)를 모두 private로 하고, getter와 setter를 구현하고
//
//· Student 클래스의 main() 메소드에서 Student 객체를 생성하여 setter를 사용하여 학과와 학번 필드에 적당한 값을 입력 후 출력


		public class Student {
			private String 학과;
			private int 학번;
			
			
			public String get학과() {
				return 학과;
			}
			
			public void set학과(String a) {
				this.학과 = a;
			}
			

			public int get학번() {
				return 학번;
			}

			public void set학번(int b) {
				this.학번 = b;
			}
			



			



			public static void main(String[] args) {
				Student boy = new Student(); // boy라는 객체를 생성하는 생성자
				
				boy.set학과("항공서비스학과");
				boy.set학번(2017);
				System.out.print(boy.get학과()+"\n");
				System.out.println(boy.get학과());
				System.out.print(boy.get학번());
				
			}
}
		
		
		
		
		
		
		
		
		
		