package Ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C05Select {

	public static void main(String[] args) {
		//DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/opendatadb";
		//				 jdbc:DBMS종류//DBMS위치 / DB명
		//JDBC참조변수
		Connection conn = null;				// DBMS 의 특정 DB와 연결되는 객
		PreparedStatement pstmt = null;		// SQL Query 전송용 객체
		ResultSet rs = null;				// Select 결과물 담을 객체
		
			//연결작업 JDBC드라이브 로딩
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success...");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB CONNECTED...");
			// sql query객체 생성. 쿼리문 준비
			pstmt = conn.prepareStatement("SELECT * FROM tbl_a"); // opendatadb안에 있기떄매 뺴도되고 prerpareStatement에서는 ;를 넣지 않는다.
			
			rs = pstmt.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) {
					System.out.print(rs.getInt("no")+" . "); // no라는 값을 가져옴
					System.out.println(rs.getString("name")); // name이라는 값을 가져옴
				}
			}
			
			
			
		}catch(ClassNotFoundException e1) {
			System.out.println("클래스 부재 예외발생!");
		}catch(SQLException e2) {
			System.out.println("SQL 예외발생!");
			e2.printStackTrace();
		}finally {
			try{rs.close();} catch(SQLException e) {e.printStackTrace();}
			try{pstmt.close();} catch(SQLException e) {e.printStackTrace();}
			try{conn.close();} catch(SQLException e) {e.printStackTrace();}
		}
	}

}
