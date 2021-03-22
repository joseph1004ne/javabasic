package jo_basic_day4;

// 7단 출력하기
import java.util.Scanner;

public class GugudanEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String dan3 = sc.next();
		int newdan = Integer.parseInt(dan3);
		
		int i = 1;
		try {
			while(i <= 9) {
				System.out.printf("%d x %d = %2d\n", newdan, i, newdan * 3);
				i++;
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}