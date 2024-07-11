package pkg2210020038;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author topaz
 */
public class KabKota {
    public int idKabKota;
    public String namaKabKota;
    
    // Constructor
    public KabKota(int idKabKota, String namaKabKota) {
        this.idKabKota = idKabKota;
        this.namaKabKota = namaKabKota;
    }
    
    public int getIdKabKota() {
        return idKabKota;
    }

    public void setIdKabKota(int idKabKota) {
        this.idKabKota = idKabKota;
    }

    public String getNamaKabKota() {
        return namaKabKota;
    }

    public void setNamaKabKota(String namaKabKota) {
        this.namaKabKota = namaKabKota;
    }
}
