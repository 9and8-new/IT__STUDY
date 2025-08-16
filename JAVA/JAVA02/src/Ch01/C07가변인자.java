package Ch01;

class C07Simple{
		
	int sum(int ...arg) { // 자바에서는 배열[]형태로 받음
//		System.out.println(arg[0]);
//		System.out.println(arg[1]);
//		System.out.println(arg[2]);
//		System.out.println(arg[3]);
		int s=0;
		for(int item : arg) { // item에 밑에 obj.sum값을 [] 에 누적해서 증가시킴?
			System.out.println(item);
			s+=item;
		}
		return s;
	}
}

public class C07가변인자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C07Simple obj = new C07Simple();
		obj.sum(10,20); // sum에 10부터 순차적으로 위의 배열[]에 0번인덱스에 저장됨. 

	}

}
