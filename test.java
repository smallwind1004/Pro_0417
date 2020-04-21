import java.util.Random;

public class test {
    public static void main(String[] args) {
        int[] random = new int[6];
        for (int i = 0; i < 6; i++) {
            random[i] = (int) Math.floor(Math.random() * 49 + 1);
            for (int j = 0; j < i; j++) {
                if (random[i] == random[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println("result is:");
        for (int x = 0; x < 6; x++) {
            System.out.print(random[x] + " ");
        }
    }
}