import java.util.Scanner;
public class J04_1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		int kor, eng, mat;
		int total = 0;
		double avg;

	        System.out.print("국어점수를 입력하세요: ");
		kor = a.nextInt();
		System.out.print("영어점수를 입력하세요: ");
		eng = a.nextInt();
		System.out.print("수학점수를 입력하세요: ");
		mat = a.nextInt();
		total = kor + eng + mat;
		avg = total /3;
		System.out.println("평균은 "+ avg + "입니다.");
		if(kor >= 90)
			System.out.println("국어점수가 우수합니다.");
		if(eng >= 90)
			System.out.println("영어점수가 우수합니다.");
		if(mat >= 90)
			System.out.println("수학점수가 우수합니다.");
		}
}
