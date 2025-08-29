package Ch01;

import java.util.Objects;

class C03Simple{
	
	int n;
	C03Simple(int n){
		this.n = n;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C03Simple) {
			C03Simple down = (C03Simple)obj;
			return this.n == down.n;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.n); // 입력된값은 12인데 알수없는 값으로 교체해서 전달
	}
	// equals 재정의할땐 hashCode도 재정의하는것이 좋다.
	
	
	
}


public class C03ObjectMain2 {

	public static void main(String[] args) {
		C03Simple ob1 = new C03Simple(10);
		System.out.println(ob1.toString());
		System.out.printf("%x \n",ob1.hashCode());

	}

}
