package kasirkopi;

import java.util.*;

public class Kasir {
    Scanner in = new Scanner(System.in);
    
   int harga = 0;
   int[] DaftarHarga = {10000,9000,10000,10000,7000,8000,5000,15000,13000};
   String[] Nama = {" ES COKLAT "," ES TARO "," ES MILO "," KOPI HITAM "," KOPI SUSU ",
                    " JOSHUA "," ROTI GORENG "," KENTANG GORENG " };
   
   public Kasir(){
       System.out.println("|-----------------------------------|");
       System.out.println("|   SELAMAT DATANG DI CAFE MANTUL   |");
       System.out.println("|-----------SILAHKAN PESAN----------|");
       System.out.println("|     NAMA           |    HARGA     |");
       System.out.println("| 1. ES COKLAT       |   Rp. 10000  |");
       System.out.println("| 2. ES TARO         |   Rp. 9000   |");
       System.out.println("| 3. ES MILO         |   Rp. 10000  |");
       System.out.println("| 4. KOPI HITAM      |   Rp. 7000   |");
       System.out.println("| 5. KOPI SUSU       |   Rp. 8000   |");
       System.out.println("| 6. JOSHUA          |   Rp. 5000   |");
       System.out.println("| 7. ROTI GORENG     |   Rp. 15000  |");
       System.out.println("| 8. KENTANG GORENG  |   Rp. 13000  |");
       System.out.println("|-----------------------------------|");
       
       for (String i = "Y"; i.equals("Y"); ) {
           System.out.print("\nMasukkan no pesanan   : ");
           int No = in.nextInt();
           System.out.print("Masukkan banyak pesanan : ");
           int Jumlah = in.nextInt();
           
           if (No == 1) {
               System.out.println("Anda Mememsan No: " + No + Nama[0]);
               harga = harga + Jumlah * DaftarHarga[0];
           }
           else if (No == 2) {
               System.out.println("Anda Mememsan No: " + No + Nama[1]);
               harga = harga + Jumlah * DaftarHarga[1];
           }
           else if (No == 3) {
               System.out.println("Anda Mememsan No: " + No + Nama[2]);
               harga = harga + Jumlah * DaftarHarga[2];
           }
           else if (No == 4) {
               System.out.println("Anda Mememsan No: " + No + Nama[3]);
               harga = harga + Jumlah * DaftarHarga[3];
           }
           else if (No == 5) {
               System.out.println("Anda Mememsan No: " + No + Nama[4]);
               harga = harga + Jumlah * DaftarHarga[4];
           }
           else if (No == 6) {
               System.out.println("Anda Mememsan No: " + No + Nama[5]);
               harga = harga + Jumlah * DaftarHarga[5];
           }
           else if (No == 7) {
               System.out.println("Anda Mememsan No: " + No + Nama[6]);
               harga = harga + Jumlah * DaftarHarga[6];
           }
           else if (No == 8) {
               System.out.println("Anda Mememsan No: " + No + Nama[7]);
               harga = harga + Jumlah * DaftarHarga[7];
           }
           else{
               System.out.println("Tidak Ada pada Menu");
               //return;
           }
           
           System.out.println("\nApakah Ada Pesanan Lain? Y/T");
            i = in.next().toUpperCase();
           
       }
            System.out.println("\nTotal Pesanan Anda : " + harga);
    }
}
