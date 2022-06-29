
import java.util.Scanner;
public class OrtalamaHesaplama {
    public static void main(String[] args) {
        int mat, fizik, turkce, tarih, muzik, kimya;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.println("Turkce Notunuz : ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.println("Muzik Notunuz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        int sonuc = toplam / 6;
        System.out.println(sonuc);

        boolean kosul1 = sonuc >= 50;

        String Ort= kosul1 ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(Ort);



    }
}