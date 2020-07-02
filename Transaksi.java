package model;

import java.util.Date;

public class Transaksi {
    private Integer Id_Transaksi;
    private Pelanggan pelanggan;
    private Pegawai pegawai;
    private Date Tgl_Pembelian;
    private Double Harga_Total;

    public Integer getId_Transaksi() {
        return Id_Transaksi;
    }

    public void setId_Transaksi(Integer Id_Transaksi) {
        this.Id_Transaksi = Id_Transaksi;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    public Date getTgl_Pembelian() {
        return Tgl_Pembelian;
    }

    public void setTgl_Pembelian(Date Tgl_Pembelian) {
        this.Tgl_Pembelian = Tgl_Pembelian;
    }

    public Double getHarga_Total() {
        return Harga_Total;
    }

    public void setHarga_Total(Double Harga_Total) {
        this.Harga_Total = Harga_Total;
    }
}
