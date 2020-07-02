package Controller;

import model.Detail_transaksi;
import model.kategori;
import model.Pegawai;
import model.Pelanggan;
import model.Transaksi;
import model.Produk;
import database.koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Penjualan {
koneksi koneksi;
    ArrayList<Pegawai>arrPegawai;
    ArrayList<Pelanggan>arrPelanggan;
    ArrayList<Produk>arrProduk;
    ArrayList<Transaksi>arrTransaksi;
    
    public Penjualan (){
        this.koneksi = new koneksi();
        this.arrPegawai = new ArrayList<>();
        this.arrPelanggan = new ArrayList<>();
        this.arrProduk = new ArrayList<>();
        this.arrTransaksi = new ArrayList<>();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try{
            String sql = "insert into Produk values('"+.getText()+"','"+jTextField4.getText()+"','"+jTextField2.getText()+"')";
            pst = koneksi.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Sukses Disimpan");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }
        viewData();
        
    }

}
