/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2210020038;

/**
 *
 * @author topaz
 */
public class Kelurahan extends Kecamatan {
    public int idKelurahan;
    public String namaKelurahan;
    
    // Constructor
    public Kelurahan(int idKabKota, String namaKabKota, int idKecamatan, String namaKecamatan, int idKelurahan, String namaKelurahan) {
        super(idKabKota, namaKabKota, idKecamatan, namaKecamatan);
        this.idKelurahan = idKelurahan;
        this.namaKelurahan = namaKelurahan;
    }

    public int getIdKelurahan() {
        return idKelurahan;
    }

    public void setIdKelurahan(int idKelurahan) {
        this.idKelurahan = idKelurahan;
    }

    public String getNamaKelurahan() {
        return namaKelurahan;
    }

    public void setNamaKelurahan(String namaKelurahan) {
        this.namaKelurahan = namaKelurahan;
    }
}
