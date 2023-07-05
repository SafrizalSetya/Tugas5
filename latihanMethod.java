package Latihan;

public class latihanMethod {

    public static void main(String[] args) {
        Calculate p = new Calculate();
        p.setAngka1(8);
        p.setAngka2(9);
        p.addAllNumber();
        p.multiplyNumber();
        p.multiplyNumber(p.getAngka1(), p.getAngka2());

    }
}

class Calculate {
    private int angka1;
    private int angka2;

    public int getAngka1() {
        return angka1;
    }

    public int getAngka2() {
        return angka2;
    }

    public void setAngka1(int angka1) {
        this.angka1 = angka1;
    }

    public void setAngka2(int angka2) {
        this.angka2 = angka2;
    }

    public void addAllNumber() {
        int total = angka1 + angka2;
        System.out.println("Hasil Penjumlahan: " + total);
    }

    public void multiplyNumber() {
        int hasil = angka1 * angka2;
        System.out.println("Hasil kali: " + hasil);
    }

    public void multiplyNumber(int angka1, int angka2) {
        int hasil = angka1 * angka2;
        System.out.println("Hasil kali: " + hasil);
    }
}