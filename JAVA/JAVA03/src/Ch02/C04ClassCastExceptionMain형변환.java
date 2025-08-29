package Ch02;


class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
public class C04ClassCastExceptionMain형변환 {

	public static void main(String[] args) {
		
		Animal poppi = new Dog();		//업캐스팅
		Animal tori = new Cat();		//업캐스팅
		
		//Dog로 다운캐스팅
		try {								// 그렇기 때문에 예외처리 | 다운캐스팅되진않음.
			Dog down1 = (Dog)poppi;			//다운캐스팅 O
			Dog down2 = (Dog)tori;			//다운캐스팅 X 토리는 고양이임 
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
	}

}
