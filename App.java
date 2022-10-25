import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int input = 0;
        int bakso = 0;
        int hargabakso = 0;
        int total;

        do{
        System.out.println("Yummy Delivery Order");
        System.out.println("1. Order Bakso");
        System.out.println("2. Pay");
        System.out.println("3. Exit");
        System.out.println("Masukkan menu : ");
        Scanner choose = new Scanner(System.in);
        input = choose.nextInt();
            
            if (input == 1){
                System.out.println("1. Bakso Negara api = @50000");
                System.out.println("2. Balso Negara angin = @55000");
                System.out.println("Pilih pesanan :");
                bakso = choose.nextInt();
                if (bakso == 1)
                hargabakso = 50000;
                else if (bakso == 2)
                hargabakso = 55000;
                System.out.println("Pesanan berhasil ditambahkan");
            }
        else if (input == 2){
             if (hargabakso == 0){

             System.out.println("You are not buy anything..");
             }
             else{
                 System.out.println("harga bakso ="+hargabakso);
                 System.out.println("Jumlah uang anda =");
                 total = choose.nextInt();
                 total = total - hargabakso;
                 System.out.println("Kembalian ="+ total);
             }
        }

        else if (input == 3){
            System.out.println("Terima Kasih telah membeli bakso kami");
        }       
    }while (input < 3);
} 
}