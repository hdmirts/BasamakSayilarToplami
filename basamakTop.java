import java.util.Scanner;
public class basamakTop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int sayi = input.nextInt();
        int toplam = 0;
        while(sayi != 0) {
            toplam = (sayi % 10) + toplam;
            sayi /= 10;
        }
        System.out.print("Sayının Basamak Sayılarının Toplamı :" + toplam);
    }
    
}
