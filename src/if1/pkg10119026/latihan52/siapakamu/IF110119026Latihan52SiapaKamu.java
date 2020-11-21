/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan52.siapakamu;

/**
 *
 * @author Asus
 * NAMA         : Muhammad Khatami
 * KELAS        : IF-1
 * NIM          : 10119026
 * Deskripsi Program : program ini untuk menampilkan nama dosen dan mahasiswa
 */
public class IF110119026Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen;
        dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println();
        
        Mahasiswa mahasiswa;
        mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10119026");
        System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.setNama("Muhammad Khatami");
        mahasiswa.setUmur(20);
        mahasiswa.setKelas("IF1");
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
