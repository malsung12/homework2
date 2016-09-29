import java.util.Scanner;
public class J01_1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		int birth_year;
		int age;

	        System.out.print("태어난 연도를 입력하시오: ");
		birth_year = a.nextInt();
		age = 2016 - birth_year + 1;
		if(age < 20)
			System.out.print("미성년자입니다.");
		else
			System.out.print(age);
		}
}
