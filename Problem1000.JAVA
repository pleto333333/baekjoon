import java.util.Scanner;

public class Problem1000 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

    int A = scanner.nextInt();
    int B = scanner.nextInt();

    System.out.println(A+B);

    scanner.close();//scanner 닫기
    }
}