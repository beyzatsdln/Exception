import org.example.Customexception;

import static org.example.Bolme.bolmeIslemi;

public class Test {
    public static void main(String[] args) {
        testBolmeIslemi();
    }

    public static void testBolmeIslemi() {
        try {
            int sonuc = bolmeIslemi(10, 0);
            System.out.println("Test başarısız: Beklenen CustomException atilmadi");
        } catch (Customexception ex) {
            if ("Bolme Hatasi: 0'a bolme hatasi".equals(ex.getMessage())) {
                System.out.println("Test basarili: Doğru hata mesaji alındi");
            } else {
                System.out.println("Test basarisiz: Hata mesaji beklenenden farkli");
            }
        }
    }
}

