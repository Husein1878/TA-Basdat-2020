package model;

import java.util.Date;

public class Pegawai {

    private Integer Id_Pegawai;
    private String Nama_Pegawai;
    private Date Tanggal_lahir;
    private String Alamat;
    private Integer Kode_pos;
    private String No_telp;
    
    public Integer getId_Pegawai() {
        return Id_Pegawai;
    }

    public void setId_Pegawai(Integer Id_Pegawai) {
        this.Id_Pegawai = Id_Pegawai;
    }

    public String getNama_Pegawai() {
        return Nama_Pegawai;
    }

    public void setNama_Pegawai(String Nama_Pegawai) {
        this.Nama_Pegawai = Nama_Pegawai;
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
