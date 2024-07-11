/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2210020038;


/**
 *
 * @author topaz
 */
public class Main {
    public static void main(String[] args) {
        // Inisialisasi objek DataIrigasi
        DataIrigasi dataIrigasi = new DataIrigasi(1, "Kabupaten A", 1, "Kecamatan B", 1, "Kelurahan C",
                                                  1, "Irigasi D", 100.0, "Pemerintah", "img.jpg", 10.0, 
                                                  5.0, 20.0, 50.0, 30.0, 20.0, 2024);

        // Tes hubungan inheritance
        System.out.println("Nama Kabupaten: " + dataIrigasi.getNamaKabKota());
        System.out.println("Nama Kecamatan: " + dataIrigasi.getNamaKecamatan());
        System.out.println("Nama Kelurahan: " + dataIrigasi.getNamaKelurahan());
        System.out.println("Nama Irigasi: " + dataIrigasi.getNamaIrigasi());
        
       
    }
}
