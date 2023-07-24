package section01;
/*
 * 주석
 * 코드에 영향을 주지 않는 개발자가 사용하는 메모공간
 * 
 * 여러줄 주석
 * 
 * 줄 삭제 단축키 : Ctrl + d
 * 
 * 실행 단축키 : Ctrl + F11
 * 
 * 주석 단축키 : Ctrl + /
 * 
 * JavaDoc 주석 단축키 : Alt + Shift + j 혹은 /** + enter
 */
public class Comment {
	public static void main(String[] args) {
		//한줄 주석
		System.out.println("Hello,Java!");
		
		printNum(712);
	}
	/** JavaDoc 주석
	 * 
	 * 입력받은 정수 출력하는 메소드
	 * 
	 * @param num - 입력받은 정수
	 */
	
	
	public static void printNum(int num) {
		System.out.println("num: " + num);
	}

	
}
