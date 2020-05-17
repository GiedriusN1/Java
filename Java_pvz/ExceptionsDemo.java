import java.util.ArrayList;
import java.util.List;
public class ExceptionsDemo {
    public static void main(String[] args) {
        try {
            a();
        } catch (ManoKlaida e) {
            System.out.println("Aha " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static void a() {
        List<Integer> m = new ArrayList<>();
        m.add(12);
        m.add(13);
        try {
            System.out.println("1 elementas yra " + metodas(m, 1));
            System.out.println("100 elementas yra " + metodas(m, 100));
        } catch (ManoKlaida | IllegalArgumentException e) {
            System.err.println("Klaida!!! " + e.getMessage());
            throw new ManoKlaida("Olia-lia!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("Pabaiga.");
    }
    static int metodas(List<Integer> m, int i) {
        if (i >= m.size()) {
            throw new ManoKlaida("Blogas i " + i);
        }
        return m.get(i);
    }
}
class ManoKlaida extends RuntimeException {
    public ManoKlaida(String message) {
        super(message);
    }
}