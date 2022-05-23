package intro.in;
import java.util.Scanner;
public class Addtion { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        int age = scanner.nextInt();
        switch(age / 10) {
            case 1:     System.out.println("10대입니다.");  
                        break;
            case 2:     System.out.println("20대입니다.");
                        break;
            case 3:     System.out.println("30대입니다.");
                        break;
            default:    System.out.print("뷰릅");
        }*/

        int count = 0, n = 0;
        double sum = 0;

        while((n = scanner.nextInt()) != 0) {
            sum = sum + n;
            count++;
        }
        System.out.println("수의 개수는 " + count + "개이며 평균은 " + sum / count + "입니다.");
        scanner.close();

    }
}