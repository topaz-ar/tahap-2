/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2210020038;

/**
 *
 * @author topaz
 */
public class Kecamatan extends KabKota {
    public int idKecamatan;
    public String namaKecamatan;
    
    // Constructor
    public Kecamatan(int idKabKota, String namaKabKota, int idKecamatan, String namaKecamatan) {
        super(idKabKota, namaKabKota);
        this.idKecamatan = idKecamatan;
        this.namaKecamatan = namaKecamatan;
    }

    public int getIdKecamatan() {
        return idKecamatan;
    }

    public void setIdKecamatan(int idKecamatan) {
        this.idKecamatan = idKecamatan;
    }

    public String getNamaKecamatan() {
        return namaKecamatan;
    }

    public void setNamaKecamatan(String namaKecamatan) {
        this.namaKecamatan = namaKecamatan;
    }
}