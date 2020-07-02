package model;

import java.util.Date;

public class Pelanggan {
    private Integer Id_Pelanggan;
    private String Nama_Pelanggan;
    private Date Tanggal_lahir;
    private String Alamat;
    private Integer Kode_pos;
    private String No_telp;

    public Integer getId_Pelanggan() {
        return Id_Pelanggan;
    }

    public void setId_Pelanggan(Integer Id_Pelanggan) {
        this.Id_Pelanggan = Id_Pelanggan;
    }

    public String getNama_Pelanggan() {
        return Nama_Pelanggan;
    }

    public void setNama_Pelanggan(String Nama_Pelanggan) {
        this.Nama_Pelanggan = Nama_Pelanggan;
    }

    public Date getTanggal_lahir() {
        return Tanggal_lahir;
    }

    public void setTanggal_lahir(Date Tanggal_lahir) {
        this.Tanggal_lahir = Tanggal_lahir;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public Integer getKode_pos() {
        return Kode_pos;
    }

    public void setKode_pos(Integer Kode_pos) {
        this.Kode_pos = Kode_pos;
    }

    public String getNo_telp() {
        return No_telp;
    }

    public void setNo_telp(String No_telp) {
        this.No_telp = No_telp;
    }
}
