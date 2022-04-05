import java.util.Scanner;

public class CircleArea1 {
    public static void main(String [] args) {
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double circleArea = radius * radius * PI;

        System.out.print("반지름" + radius + ", ");
        System.out.println("원의 면적 = " + circleArea); 
        scanner.close();
    }
}