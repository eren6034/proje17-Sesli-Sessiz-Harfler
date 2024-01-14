import java.util.Scanner;

public class proje17SesliSessizHarfler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine().toLowerCase();

        int sesliSayisi = 0;
        int sessizSayisi = 0;

        for (int i = 0; i < kelime.length(); i++) {
            char karakter = kelime.charAt(i);


            if (karakter == 'a' || karakter == 'e' || karakter == 'ı' || karakter == 'i' ||
                    karakter == 'o' || karakter == 'ö' || karakter == 'u' || karakter == 'ü') {
                sesliSayisi++;
            } else if (Character.isLetter(karakter)) {
                sessizSayisi++;
            }
        }

        System.out.println("Sesli harf sayısı: " + sesliSayisi);
        System.out.println("Sessiz harf sayısı: " + sessizSayisi);

        scanner.close();
    }
}
