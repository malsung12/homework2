import java.util.Scanner;
public class J05_1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		int birth_year;
		int age;

	        System.out.print("태어난 연도를 입력하시오: ");
		birth_year = a.nextInt();
		age = 2016 - birth_year + 1;
		if(age <= 7)
			System.out.print("유아 입니다.");
	 	else if(age <= 13)
			System.out.print("어린이 입니다.");
		else if(age <= 20)
			System.out.print("청소년 입니다.");
		else if(age <= 30)
			System.out.print("청년 입니다.");
		else if(age <= 60)
			System.out.print("중년 입니다.");
		else
			System.out.print("노년 입니다.");
		}
}
