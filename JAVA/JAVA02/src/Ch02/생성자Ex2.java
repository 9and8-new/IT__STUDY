package Ch01;

	class Book{
		String title;
		String author;
		int price;
		
	Book(String 제목, String 저자, int 가격){
		this.title = 제목;
		this.author = 저자;
		this.price = 가격;
	}
	void showInfo() {
		System.out.printf("이 책의 제목은 %s 이고 저자는 %s 이며 가격은 %d원 입니다.\n",title, author, price);
	}
}


	public class 생성자Ex2 {
		
		public static void main(String[] args) {
			Book A = new Book("개미", "베르베르", 18000);
			Book B = new Book("웹툰 화산귀환", "라코팀", 22000 );
			
			A.showInfo();
			B.showInfo();
		}
	
	}
