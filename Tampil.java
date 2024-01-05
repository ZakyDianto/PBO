public class Tampil {
    public static void main(String[] args) {
        Rumah r= new Rumah();
        Sekolah s = new Sekolah();
        DataDiri d = new DataDiri();
        Umur u = new Umur();
        

        System.out.println("DATA RUMAH");
        r.tampilLokasi();
        r.tampilUkuran(10,8);
        System.out.println("DATA SEKOLAH");
        s.tampilNama("SMK Telkom Malang");
        s.jumlahSiswa(36, 13);
        System.out.println("TANGGAL KELAHIRAN");
        d.kelahiran("12, Maret 2008");
        d.lahir("Trenggalek");
        System.out.println("UMUR");
        u.umur(15);

    }

    public void tampilLokasi(){
        String alamat="Malang";
        System.out.println("Lokasi Rumah: "+alamat);

    }
    public void tampilUkuran(int panjang, int lebar){
        int luas = panjang*lebar;
        System.out.println("Ukuran Rumah: "+luas+"m2");

    }

    public void tampilNama(String nama){
        System.out.println("Saya bersekolah di: "+nama);
 
    }
 
    public void jumlahSiswa(int rombel, int jumlahSiswa){
         int total=rombel*jumlahSiswa;
         System.out.println("Jumlah Siswa: "+jumlahSiswa);
    }

    public void kelahiran(String tanggal){
        System.out.println("Tanggal Lahir: "+tanggal);

    }

    public void lahir(String lahir){
        System.out.println("Lahir di: "+lahir);
    }

    public void umur(int umur){
        System.out.println("Umur Saya: "+ umur);
    }
}   
