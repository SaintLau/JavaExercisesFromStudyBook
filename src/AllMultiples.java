
// Print all multiples of 3, between 1 and 10
public class AllMultiples {
    public static void main(String[] args) {
        for(int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
