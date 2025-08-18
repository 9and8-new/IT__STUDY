package Ch01;

	class Movie {
		String title;
		String director;
		int year;
		double rating;
	
	Movie(){}
		
	// 별점 미포함 버전
	Movie(String 제목, String 감독, int 개봉연도){
		this.title = 제목;
		this.director = 감독;
		this.year = 개봉연도;
	}	
	// 별점 포함 버전
	Movie(String 제목, String 감독, int 개봉연도, double 평점 ){
		this.title = 제목;
		this.director = 감독;
		this.year = 개봉연도;
		this.rating = 평점;

	}
	
	// 영화 정보 출력
	void showInfo() {
		System.out.printf("영화제목 : %s, 감독 : %s, 개봉연도 : %d, 평점 : %.1f\n", title, director, year, rating);
	}
	
}



	public class 생성자오버로딩Ex3 {
		
		public static void main(String[] args) {
			
			Movie A = new Movie("태극기 휘날리며", "한국인", 2004);
			Movie B = new Movie("기생충", "봉준호", 2019, 9.873);
			
			A.showInfo();
			B.showInfo();
		}
	
	}
