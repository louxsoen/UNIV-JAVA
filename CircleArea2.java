import java.util.Scanner;

public class CircleArea2 {
    public static double getArea(int radius) {
        return 3.14 * radius * radius;
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        System.out.print("반지름" + radius + ", ");
        System.out.println("원의 면적 = " + getArea(radius)); 
        scanner.close();
    }
}