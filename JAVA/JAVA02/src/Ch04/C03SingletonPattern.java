package Ch04;


class Company{
	int n1;
	int n2;
	// 싱글톤 패턴 코드
	private static Company instance;
	// 디폴트생성자 앞에 private => 외부에 객체 생성 불가능, 클래스 내부에서만 객체 생성가능
	private Company() {}; 
	public static Company getInstance() 
	{
		if(instance==null) //인스턴스가 null이면 새로운 객체를 만들고 반환
			instance = new Company();
		return instance;
	}
	
	
	
	//toString 재정의
	@Override
	public String toString() {
		return "Company [n1=" + n1 + ", n2=" + n2 + "]";
	}
}
public class C03SingletonPattern {

	public static void main(String[] args) {
		// 객체 생성요청
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		
		com1.n1=100;
		com2.n2=200;
		System.out.println("com1 : " + com1);
		System.out.println("com2 : " + com2);

	}

}
