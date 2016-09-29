import java.util.Scanner;
public class J02_1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Scanner s = new Scanner(System.in);

		double input_degree;
		String kind;
		double output_degree = 0;

	        System.out.print("온도를 입력하시오: ");
	  	input_degree = a.nextInt();
		System.out.print("입력온도가 섭씨온도이면 c, 화씨온도이면 F를 입력하시오: ");
		kind = s.nextLine();
		if(kind == "F")
			output_degree = input_degree * 1.8 + 32;
		else
			output_degree = input_degree - 32 /1.8;
		System.out.print("변화된 온도는 " + output_degree + "입니다.");
		}
	}
