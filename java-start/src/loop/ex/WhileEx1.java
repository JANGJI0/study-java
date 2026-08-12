package loop.ex;

public class WhileEx1 {

    public static void main(String[] args) {
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }
        /*while (true) {
            System.out.println(count);
            if (count >= 10) {
                break;
            }
            count++;
        }*/
    }
}
