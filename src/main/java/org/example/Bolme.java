package org.example;

public class Bolme {
    public static void main(String[] args) {
        try {
            int sonuc = bolmeIslemi(10, 0);
            System.out.println("Sonuç: " + sonuc);
        } catch (Customexception e) {
            System.err.println("Hata: " + e.getMessage());
        }
    }

    public static int bolmeIslemi(int a, int b) throws Customexception {
        try {
            return a / b;
        } catch (ArithmeticException ex) {
            throw new Customexception("Bolme Hatasi: 0'a bolme hatasi");
        }
    }
}