import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner s = new Scanner(System.in);
        s.useDelimiter(":"); // 괄호안의 문자를 기준으로 잘라서 입력 받겠다.
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.printf("%d:%d",a+1,b);
    }
}