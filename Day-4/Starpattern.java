
public class Starpattern {
    public static void main(String[] args) {
        for (int line = 1; line <= 5; line++) {
            for(int stars = 1; stars <= line; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
