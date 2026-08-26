package array.ex;

public class ArrayEx1Ref {

    public static void main(String[] args) {
        int[] sutdents = {80, 90, 70, 60, 50};
        int total = 0;

        for (int i = 0; i < sutdents.length; i++) {
            total += sutdents[i];
        }
        double avarage = (double)total / sutdents.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + avarage);
    }
}
