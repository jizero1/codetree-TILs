import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner s = new Scanner(System.in);
        s.useDelimiter("-"); //괄호 안에 문자를 기준으로 가르기
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int change = a;
        int change2 = b;
        a = c;
        b = change;
        c = change2;
        System.out.printf("%d.%d.%d",a,b,c);
    }
}