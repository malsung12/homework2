import java.util.Scanner;
public class J06 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Scanner s = new Scanner(System.in);

		int kor, eng, mat;
		int total = 0;
		String name, hak;
		double avg;

	        System.out.print("이름 : ");
		name = s.nextLine();
		System.out.print("국어점수 입력: ");
		kor = a.nextInt();
		System.out.print("수학점수 입력: ");
		mat = a.nextInt();
		System.out.print("영어점수 입력: ");
		eng = a.nextInt();
		System.out.println("=======================");
		System.out.println("["+name+"] 님은");

		total = kor + mat + eng;
		avg = total /3;
		if(avg >= 90)
			hak = "A";
		else if(avg >= 80)
			hak = "B";
		else if(avg >= 70)
			hak = "C";
		else if(avg >= 60)
			hak = "D";
		else
			hak = "F";
		System.out.println("평균은 "+ avg+"이고");
		System.out.println("학점은 "+hak+"입니다." );
		}
}
