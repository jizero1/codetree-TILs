import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        String c = a;
        a = b;
        b = c;
        System.out.print(a+"\n");
        System.out.print(b);
    }
}