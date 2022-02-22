import java.util.Scanner;

public class c2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원화를 입력하세요(단위 원)>>");
        int getWon = scanner.nextInt();
        System.out.println(getWon + "원은 $" + (float)(getWon / 1100) + "원입니다.");
        scanner.close();
    }
}