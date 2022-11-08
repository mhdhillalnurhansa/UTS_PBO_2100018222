public class Main {
    public static void main(String[] args) {
        System.out.println("Nama    : Muhammad Hillal Nurhansa");
        System.out.println("NIM     : 2100018222");
        System.out.println("Kelas   : D");
        System.out.println("UTS");
        System.out.println("\n");
        Tendik tndk = new Tendik();
        tndk.setNama("Alvin Daroji");
        tndk.setNip(12345678);
        tndk.setTglLahir("08/09/1985");
        tndk.setAlamat("Jambi");
        tndk.setJk("Laki-Laki");
        tndk.setTahunMasuk(2019);

        Dosen dsn = new Dosen();
        dsn.setJurusan("Informatika");
        dsn.setNidn(21092005);
        dsn.setNama("Agus Bagas S.T.");
        dsn.setNip(210928308);
        dsn.setTglLahir("18/05/1976");
        dsn.setJk("Laki-Laki");
        dsn.setAlamat("Jakarta");
        dsn.setTahunMasuk(2017);

        System.out.println("Nama Tendik         : "+ tndk.getNama());
        System.out.println("NIP  Tendik         : "+ tndk.getNip());
        System.out.println("Tanggal Lahir       : "+ tndk.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ tndk.getJk());
        System.out.println("Alamat              : "+ tndk.getAlamat());
        System.out.println("Tahun masuk         : "+ tndk.getTahunMasuk());
        System.out.println("Gaji pokok          : "+tndk.gajiTotal());
        System.out.println("Upah lembur(20 jam) : "+ tndk.lembur(20));
        System.out.println("Gaji total          : "+ tndk.gajiTotal(20));

        System.out.println("\n");
        System.out.println("Nama Dosen          : "+ dsn.getNama());
        System.out.println("NIDN                : " +dsn.getNidn());
        System.out.println("Jurusan             : " + dsn.getJurusan());
        System.out.println("NIP  Dosen          : "+ dsn.getNip());
        System.out.println("Tanggal Lahir       : "+ dsn.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ dsn.getJk());
        System.out.println("Alamat              : "+ dsn.getAlamat());
        System.out.println("Tahun masuk         : "+ dsn.getTahunMasuk());
        System.out.println("Gaji pokok          : "+ dsn.gajiTotal());
        System.out.println("Kelas lebih (6 SKS) : "+ dsn.mengajarLebih(6));
        System.out.println("Gaji total          : "+ dsn.gajiTotal(6));

    }
}