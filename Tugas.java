import java.util.Scanner;

public class Tugas {
    Scanner sc = new Scanner(System.in);

    static int jml;
    static int[] n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        jml = sc.nextInt();

        n = new int[jml];

        for(int i = 0; i < n.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            n[i] = sc.nextInt();
        }

        int total = jumlahRekursif(n, 0);
        System.out.println("Total (rekursif) dari " + n.length + " angka yang dimasukkan adalah: " + total);

        int hasil = jumlahIteratif(n);
        System.out.println("Total (iteratif) dari " + n.length + " angka yang dimasukkan adalah: " + hasil);

        sc.close();
    }

    static int jumlahRekursif(int[] n, int index) {
        if(index == n.length) {
            return 0;
        } else {
            return n[index] + jumlahRekursif(n, index + 1);
        }
    }

    static int jumlahIteratif(int[] n) {
        int jumlah = 0;
        for(int i = 0; i < n.length; i++) {
            jumlah += n[i];
        }
        return jumlah;
    }
}
