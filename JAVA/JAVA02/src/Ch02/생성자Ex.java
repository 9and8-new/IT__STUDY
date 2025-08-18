package Ch01;

class IT코리아{
	String addr;
	int floor;
	double price;

IT코리아(String 주소, int 층, double 학원비){
	this.addr = 주소;		// 전달받은 주소를 멤버변수 addr에 저장
	this.floor = 층;		// 전달받은 층을 멤버변수 floor에 저장
	this.price = 학원비;	// 전달받은 학원비를 멤버변수 price에 저장
}

	// 정보 보여주기 기능
	void showInfo() {
		System.out.printf("주소:%s, 층:%d, 가격:%.1f\n", addr, floor, price);
	}
}
	public class 생성자Ex {
		
		public static void main(String[] args) {
			// 객체 만들 때 생성자가 자동 호출됨
			IT코리아 대구 = new IT코리아("대구광역시 중구", 9, 132800.241);
			IT코리아 강남 = new IT코리아("서울특별시 강남구", 11, 1582573.524); 
			
			대구.showInfo();
			강남.showInfo();
		}
	
	}
