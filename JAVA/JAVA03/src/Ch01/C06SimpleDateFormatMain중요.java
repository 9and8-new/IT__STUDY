package Ch01;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class C06SimpleDateFormatMain중요 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("YYYY/MM/DD 입력 : ");
		String ymd = sc.next();
		
		//포매터 객체 생성(입력용) | 문자열을 날짜열로 바꿔주는 포매터
		SimpleDateFormat fmtin = new SimpleDateFormat("yyyy/MM/dd"); // y,M,d,h,m,s
		Date date = fmtin.parse(ymd);
		System.out.println(date);
		
		//포매터 객체 생성(출력용)
		SimpleDateFormat fmtout = new SimpleDateFormat("yyyy~MM~dd");
		System.out.println(fmtout.format(date));
		
		
	}

}
