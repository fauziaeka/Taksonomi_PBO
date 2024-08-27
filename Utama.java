/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuanpertama;

/**
 *
 * @author ASUS
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hewan moo = new Hewan();
        System.out.println("nama saya moo");
        moo.setJumlahKaki(4); 
        moo.bernafas();
        moo.tumbuh();
        System.out.println("jumlah kaki saya ada " + moo.getJumlahKaki());
       
       Tumbuhan durian = new Tumbuhan();
       System.out.println("");
       System.out.println("nama saya durian");
       durian.setwarnadaun("Hijau");
       durian.setarahdaun("Timur");
       durian.bernafas();
       durian.tumbuh();
       System.out.println("warna daun saya " +durian.getwarnadaun());
       System.out.println("arah daun saya " +durian.getarahdaun());
       
       Aves Cenderawasih = new Aves();
       System.out.println("");
       System.out.println("nama saya Cenderawasih");
       Cenderawasih.setwarnabulu("Putih");
       Cenderawasih.sethabitat("Hutan");
       Cenderawasih.bernafas();
       Cenderawasih.tumbuh();
       System.out.println("warna bulu saya " +Cenderawasih.getwarnabulu());
       System.out.println("habitat saya di " +Cenderawasih.gethabitat());
       
       
       Mamalia Gajah = new Mamalia();
       System.out.println("");
       System.out.println("nama saya Gajah");
       Gajah.setmakanan("Rumput");
       Gajah.setukurantubuh("Besar");
       Gajah.bernafas();
       Gajah.tumbuh();
       System.out.println("makanan saya " +Gajah.getmakanan());
       System.out.println("ukuran tubuh saya " +Gajah.getukurantubuh());
       
       
       Amfibi salamander = new Amfibi();
       System.out.println("");
       System.out.println("nama saya Salamander");
       salamander.setteksturkulit("Lembab");
       salamander.setbentukekor("Panjang");
       salamander.bernafas();
       salamander.tumbuh();
       System.out.println("tekstur kulit saya " +salamander.getteksturkulit());
       System.out.println("bentuk ekor saya " +salamander.getbentukekor());
       
       Reptil Komodo = new Reptil();
       System.out.println("");
       System.out.println("nama saya Komodo");
       Komodo.setbentukgigi("Tajam dan Melengkung");
       Komodo.setbentuklidah("Panjang");
       Komodo.bernafas();
       Komodo.tumbuh();
       System.out.println("bentuk gigi saya " +Komodo.getbentukgigi());
       System.out.println("bentuk lidah saya " +Komodo.getbentuklidah());
       
       Pisces ikan_bandeng = new Pisces();
       System.out.println("nama saya Bandeng");
       System.out.println("");
       ikan_bandeng.setjenissirip("Sirip punggung");
       ikan_bandeng.setbentukrangka("Bertulang keras");
       ikan_bandeng.bernafas();
       ikan_bandeng.tumbuh();
       System.out.println("Jenis sirip saya " + ikan_bandeng.getjenissirip());
       System.out.println("Jenis rangka saya " + ikan_bandeng.getbentukrangka());
       
       Monokotil Padi = new Monokotil();
       System.out.println("");
       System.out.println("nama saya padi");
       Padi.setjumlahkotiledon("1");
       Padi.setbentukbiji("Bulir");
       Padi.bernafas();
       Padi.tumbuh();
       System.out.println("jumlah kotiledon saya " +Padi.getjumlahkotiledon());
       System.out.println("bentuk biji saya " +Padi.getbentukbiji());
       
       Dikotil mawar = new Dikotil();
       System.out.println("");
       System.out.println("nama saya Mawar");
       mawar.setjumlahkelopak(20);
       mawar.setwarnabunga("Merah");
       mawar.bernafas();
       mawar.tumbuh();
       System.out.println("jumlah kelopak saya " +mawar.getjumlahkelopak());
       System.out.println("warna bunga saya " +mawar.getwarnabunga());
    }
    
}

