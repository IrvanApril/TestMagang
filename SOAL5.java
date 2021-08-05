import java.util.Scanner;

public class SOAL5 {
    public static void main(String[] args) {
        String kalimat;
        String balik = "";
        Integer size_kata;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Kalimat Bebas : ");

        kalimat = input.nextLine();

        size_kata = kalimat.length();

        for (int i = size_kata - 1; i >= 0; i--) {
            balik = balik + kalimat.charAt(i);
        }

        if (kalimat.equals(balik)) {
            System.out.println("Result True");
        } else {
            System.out.println("Result False");
        }

    }
}
