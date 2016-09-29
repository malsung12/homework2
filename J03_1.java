import java.util.Scanner;
public class J03_1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		int days;
		int seconds;
		int m_count;

	        System.out.print("날수를 입력하세요: ");
		days = a.nextInt();
		seconds = days * 24 * 60 * 60;
		System.out.println("날수에 해당하는 기간은 모두  " + seconds + "초 입니다.");
		m_count = seconds / 1000000;
		System.out.print("100만 초가 모두 " + m_count + "번이나 포함됩니다.");
		}
}
