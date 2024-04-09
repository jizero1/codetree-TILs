import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\\.");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.print(b+"-"+c+"-"+a);
    }
}