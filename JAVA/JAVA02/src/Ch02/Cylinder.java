package Ch01;

public class Cylinder extends Circle{
	double height;

	double getVolume() {
		return radius * radius * PI * height;
	}
	public Cylinder(double a,  double b){
		super.radius = a;
		this.height = b;
	}
	public static void main(String[] args) {
		Cylinder A = new Cylinder(2.8, 5.6);
		
		A.getVolume();
		System.out.print(A.getVolume());

	}

}
