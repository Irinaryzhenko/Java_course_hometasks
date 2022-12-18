public class Task4Lesson2 {
    public static void main (String[] args) {

        int n = 130;
        int a = n / 100;
        int b = n % 100 / 10;
        int c = n % n;

        int s = a + b + c;

        System.out.println(s);
    }
}
