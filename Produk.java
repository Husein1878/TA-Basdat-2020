package model;

public class Produk {
    private Integer Id_Produk;
    private kategori kategori;
    private String Nama_produk;
    private Integer Harga_Satuan;
    private Integer Stok_Produk;

    public Integer getId_Produk() {
        return Id_Produk;
    }

    public void setId_Produk(Integer Id_Produk) {
        this.Id_Produk = Id_Produk;
    }

    public kategori getKategori() {
        return kategori;
    }

    public void setKategori(kategori kategori) {
        this.kategori = kategori;
    }

    public String getNama_produk() {
        return Nama_produk;
    }

    public void setNama_produk(String Nama_produk) {
        this.Nama_produk = Nama_produk;
    }

    public Integer getHarga_Satuan() {
        return Harga_Satuan;
    }

    public void setHarga_Satuan(Integer Harga_Satuan) {
        this.Harga_Satuan = Harga_Satuan;
    }

    public Integer getStok_Produk() {
        return Stok_Produk;
    }

    public void setStok_Produk(Integer Stok_Produk) {
        this.Stok_Produk = Stok_Produk;
    }
}
