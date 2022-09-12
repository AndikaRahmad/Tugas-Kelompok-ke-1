import java.util.Scanner;

public class TugasKelompok1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Input seluruh nilai variabel

        double  nasigorengHarga = 9999.99, ayambakarHarga = 12345.67, steaksirloinHarga = 21108.40, kwetiawsiramHarga = 13579.13, kambinggulingharga = 98765.43;
        double diskon = 0.10;
        double totalbarangsetelahDiskon, totalPesanan, totalPembelian;
        int nasigorengJmlh, ayambakarJmlh, steaksirloinJmlh, kwetiawsiramJmlh, kambinggulingJmlh, jumlahPesanan;
        
        System.out.println("\t Selamat Siang .....");
        System.out.print("\t pesan untuk berapa orang : ");
        jumlahPesanan = Integer.parseInt(input.nextLine());
        System.out.print("\t Pesanan atas nama        : ");
        String nama = input.nextLine();
        System.out.println();
        System.out.println("\t Menu Spesial hari ini");
        System.out.println("\t =====================");
        System.out.println();

        // daftar menu dan harga
        System.out.println("\t 1. Nasi Goreng Spesial " + "\t @ Rp. "+ String.format("%.2f", nasigorengHarga));
        System.out.println("\t 2. Ayam Bakar Spesial " + " \t @ Rp. " + String.format("%.2f", ayambakarHarga));
        System.out.println("\t 3. Steak sirloin Spesial " + "\t @ Rp. " + String.format("%.2f", steaksirloinHarga));
        System.out.println("\t 4. Kwetiaw Siram Spesial " + "\t @ Rp. " + String.format("%.2f", kwetiawsiramHarga));
        System.out.println("\t 5. kambing Guling Spesial " + "\t @ Rp. " + String.format("%.2f", kambinggulingharga));
        System.out.println();

        //jumlah pesanan permenu
        System.out.println("Pesanan Anda [ batas pesanan 0-10 po]");
        System.out.print("1. Nasi Goreng Spesial    = ");
        nasigorengJmlh = Integer.parseInt(input.nextLine());
        System.out.print("2. Ayam Bakar Spesial     = ");
        ayambakarJmlh = Integer.parseInt(input.nextLine());
        System.out.print("3. Steak sirloin Spesial  = ");
        steaksirloinJmlh =  Integer.parseInt(input.nextLine());
        System.out.print("4. Kwetiaw Siram Spesial  = ");
        kwetiawsiramJmlh =  Integer.parseInt(input.nextLine());
        System.out.print("5. kambing Guling Spesial = ");
        kambinggulingJmlh =  Integer.parseInt(input.nextLine());
        System.out.println();

        //pembelian menu
        System.out.println("Pembelian :");
        System.out.println();
        System.out.println("1. Nasi Goreng Spesial  \t" + nasigorengJmlh + " Porsi * Rp. " +nasigorengHarga + " \t= Rp. \t" + String.format("%.2f",nasigorengJmlh * nasigorengHarga));
        System.out.println("2. Ayam bakar spesial   \t" + ayambakarJmlh + " Porsi * Rp. " + ayambakarHarga + " \t= Rp. \t" + String.format("%.2f",ayambakarJmlh * ayambakarHarga));
        System.out.println("3. Steak Sirloin Spesial \t" + steaksirloinJmlh + " Porsi * Rp. " + steaksirloinHarga + " \t= Rp. \t" + String.format("%.2f",steaksirloinJmlh * steaksirloinHarga));
        System.out.println("4. Kwetiaw Siram Spesial \t" + kwetiawsiramJmlh + " Porsi * Rp. " + kwetiawsiramHarga + " \t= Rp. \t" + String.format("%.2f", kwetiawsiramJmlh * kwetiawsiramHarga));
        System.out.println("5. Kambing Guling Spesail \t" + kambinggulingJmlh + " Porsi * Rp. " + kambinggulingharga + " \t= Rp. \t" + String.format("%.2f",kambinggulingJmlh * kambinggulingharga) + " + ");
        System.out.println("=======================================================================");

        //Total harga seluruh pesanan
        totalPesanan = (nasigorengHarga*nasigorengJmlh) + (ayambakarHarga*ayambakarJmlh) + (steaksirloinHarga*steaksirloinJmlh) + (kwetiawsiramHarga*kwetiawsiramJmlh) + (kambinggulingharga*kambinggulingJmlh);
        System.out.println("Total Pembelian  \t\t\t\t\t\t\t\t\t= Rp. \t"+ String.format("%.2f", totalPesanan));
        System.out.println();
        totalbarangsetelahDiskon = totalPesanan*diskon;
        System.out.println("Disc. 10% <Masa Promosi> \t\t\t\t\t\t\t= Rp. \t"+ totalbarangsetelahDiskon+ " - ");
        System.out.println("=======================================================================");
        totalPembelian = totalPesanan-totalbarangsetelahDiskon;
        System.out.println("Total Pembelian setelah Disc 10% \t\t\t\t\t= Rp. \t"+ String.format("%.2f", totalPembelian));
        System.out.println("Pembelian per orang <untuk 8 orang>\t\t\t\t\t= Rp. \t"+ String.format("%.2f", totalPembelian/jumlahPesanan));
        System.out.println();
        System.out.println("\t\t\t\tTerima kasih atas kunjungan Anda.....  ");
        System.out.println("\t\t\t\t.....Tekan Enter untuk keluar.....  ");

    }

}
