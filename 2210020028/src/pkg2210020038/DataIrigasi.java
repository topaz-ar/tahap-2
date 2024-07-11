/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2210020038;

/**
 *
 * @author topaz
 */
public class DataIrigasi extends Kelurahan {
    public int idIrigasi;
    public String namaIrigasi;
    public double luas;
    public String kewenangan;
    public String gambar;
    public double bangunanBagiPintu;
    public double bangunanBagiSadapPintu;
    public double bangunanGorongGorong;
    public double panjangSaluranPembawa;
    public double panjangSaluranPrimer;
    public double panjangSaluranSekunder;
    public int tahun;
    
    // Constructor
    public DataIrigasi(int idKabKota, String namaKabKota, int idKecamatan, String namaKecamatan, int idKelurahan, String namaKelurahan,
                       int idIrigasi, String namaIrigasi, double luas, String kewenangan, String gambar, double bangunanBagiPintu, 
                       double bangunanBagiSadapPintu, double bangunanGorongGorong, double panjangSaluranPembawa, 
                       double panjangSaluranPrimer, double panjangSaluranSekunder, int tahun) {
        super(idKabKota, namaKabKota, idKecamatan, namaKecamatan, idKelurahan, namaKelurahan);
        this.idIrigasi = idIrigasi;
        this.namaIrigasi = namaIrigasi;
        this.luas = luas;
        this.kewenangan = kewenangan;
        this.gambar = gambar;
        this.bangunanBagiPintu = bangunanBagiPintu;
        this.bangunanBagiSadapPintu = bangunanBagiSadapPintu;
        this.bangunanGorongGorong = bangunanGorongGorong;
        this.panjangSaluranPembawa = panjangSaluranPembawa;
        this.panjangSaluranPrimer = panjangSaluranPrimer;
        this.panjangSaluranSekunder = panjangSaluranSekunder;
        this.tahun = tahun;
    }
    
    public int getIdIrigasi() {
        return idIrigasi;
    }

    public void setIdIrigasi(int idIrigasi) {
        this.idIrigasi = idIrigasi;
    }

    public String getNamaIrigasi() {
        return namaIrigasi;
    }

    public void setNamaIrigasi(String namaIrigasi) {
        this.namaIrigasi = namaIrigasi;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public String getKewenangan() {
        return kewenangan;
    }

    public void setKewenangan(String kewenangan) {
        this.kewenangan = kewenangan;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public double getBangunanBagiPintu() {
        return bangunanBagiPintu;
    }

    public void setBangunanBagiPintu(double bangunanBagiPintu) {
        this.bangunanBagiPintu = bangunanBagiPintu;
    }

    public double getBangunanBagiSadapPintu() {
        return bangunanBagiSadapPintu;
    }

    public void setBangunanBagiSadapPintu(double bangunanBagiSadapPintu) {
        this.bangunanBagiSadapPintu = bangunanBagiSadapPintu;
    }

    public double getBangunanGorongGorong() {
        return bangunanGorongGorong;
    }

    public void setBangunanGorongGorong(double bangunanGorongGorong) {
        this.bangunanGorongGorong = bangunanGorongGorong;
    }

    public double getPanjangSaluranPembawa() {
        return panjangSaluranPembawa;
    }

    public void setPanjangSaluranPembawa(double panjangSaluranPembawa) {
        this.panjangSaluranPembawa = panjangSaluranPembawa;
    }

    public double getPanjangSaluranPrimer() {
        return panjangSaluranPrimer;
    }

    public void setPanjangSaluranPrimer(double panjangSaluranPrimer) {
        this.panjangSaluranPrimer = panjangSaluranPrimer;
    }

    public double getPanjangSaluranSekunder() {
        return panjangSaluranSekunder;
    }

    public void setPanjangSaluranSekunder(double panjangSaluranSekunder) {
        this.panjangSaluranSekunder = panjangSaluranSekunder;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}
