import java.util.Scanner;
public class KasirMakanan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n|===============================================|");
            System.out.println("|              WARUNG KHOIR KN                |");
            System.out.println("|===============================================|");
            System.out.println("|                   MENU                      |");
            System.out.println("|===============================================|");
            System.out.println("| [1] Makanan                                |");
            System.out.println("| [2] Minuman                                |");
            System.out.println("| [3] Lihat Daftar Pesanan                   |");
            System.out.println("| [4] Checkout                                |");
            System.out.println("| [5] Keluar                                 |");
            System.out.println("|===============================================|");

            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    // Masukkan jumlah porsi
                    System.out.println("Masukkan jumlah porsi: ");
                    int jumlahPorsi = sc.nextInt();

                    // Masukkan nama makanan
                    System.out.println("Masukkan nama makanan: ");
                    String namaMakanan = sc.next();

                    // Hitung total harga makanan
                    int hargaMakanan = jumlahPorsi * 12000;
                    System.out.println("Total harga " + namaMakanan + ": " + hargaMakanan);

                    // Tambahkan makanan ke dalam pesanan
                    pesanan.add("Makanan: " + namaMakanan + ", Harga: " + hargaMakanan);
                    break;
                case 2:
                    // Masukkan jumlah gelas
                    System.out.println("Masukkan jumlah gelas: ");
                    int jumlahGelas = sc.nextInt();

                    // Masukkan nama minuman
                    System.out.println("Masukkan nama minuman: ");
                    String namaMinuman = sc.next();

                    // Hitung total harga minuman
                    int hargaMinuman = jumlahGelas * 8000;
                    System.out.println("Total harga " + namaMinuman + ": " + hargaMinuman);

                    // Tambahkan minuman ke dalam pesanan
                    pesanan.add("Minuman: " + namaMinuman + ", Harga: " + hargaMinuman);
                    break;
                case 3:
                    // Menampilkan daftar pesanan
                    System.out.println("Daftar Pesanan: ");
                    for (String p : pesanan) {
                        System.out.println(p);
                    }
                    break;
                case 4:
                    // Checkout dan menampilkan total harga
                    int totalHarga = 0;
                    for (String p : pesanan) {
                        String[] item = p.split(", ");
                        String[] harga = item[1].split(": ");
                        totalHarga += Integer.parseInt(harga[1]);
                    }
                    System.out.println("Total Harga: " + totalHarga);
                    break;
                case 5:
                    System.out.println("Terima kasih, selamat datang kembali!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        }
    }
}
