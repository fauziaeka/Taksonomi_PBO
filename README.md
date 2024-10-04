# 🐾 Pertemuan Pertama – Konsep Inheritance 

# 📚 Topik Utama  
- Inheritance 
- Setter & Getter 

# 📑 Daftar Isi  

- [Utama](https://github.com/fauziaeka/TugasPBO_TM1/blob/main/Utama.java) 
- [Superclass(Makhluk Hidup)](https://github.com/fauziaeka/TugasPBO_TM1/blob/main/MakhlukHidup.java) 
- [Subclass (Hewan)](https://github.com/fauziaeka/TugasPBO_TM1/blob/main/Hewan.java) 
- [Subclass Hewan (Aves)](https://github.com/fauziaeka/TugasPBO_TM1/blob/main/Aves.java) 
- [Subclass Hewan (Mamalia)](https://github.com/fauziaeka/TugasPBO_TM1/blob/main/Mamalia.java) 
- [Subclass Hewan (Amfibi)](https://github.com/fauziaeka/TugasPBO_TM1/blob/main/Amfibi.java) 
- [Subclass Hewan (Reptil)](https://github.com/fauziaeka/TugasPBO_TM1/blob/main/Reptil.java) 
- [Subclass Hewan (Pisces)](https://github.com/fauziaeka/TugasPBO_TM1/blob/main/Pisces.java) 
- [Subclass (Tumbuhan)](https://github.com/fauziaeka/TugasPBO_TM1/blob/main/Tumbuhan.java) 
- [Subclass Tumbuhan (Monokotil)](https://github.com/fauziaeka/TugasPBO_TM1/blob/main/Monokotil.java) 
- [Subclass Tumbuhan (Dikotil)](https://github.com/fauziaeka/TugasPBO_TM1/blob/main/Dikotil.java) 

# 🌱 Inheritance  

PBO_PertemuanPertama adalah contoh penerapan konsep inheritance. Inheritance (pewarisan) adalah salah satu konsep dasar dalam pemrograman berorientasi objek (OOP) 
yang memungkinkan sebuah kelas (subclass atau child class) untuk mewarisi atribut dan metode dari kelas lain (superclass atau parent class). Dalam projek ini, 
Inheritance terdiri dari class utama yang digunakan untuk me-running code, Class MakhlukHidup sebagai Superclass, Subclass Hewan yang akan meng-extend superclass MakhlukHidup, 
Class Aves yang akan meng-extend subclass Hewan, Class Mamalia yang akan meng-extend subclass Hewan, Class Amfibi yang akan meng-extend subclass Hewan, 
Class Reptil akan meng-extend subclass Hewan dan Class Pisces akan meng-extend subclass Hewan. Subclass Tumbuhan yang akan meng-extend superclass MakhlukHidup, 
Class Monokotil yang akan meng-extend subclass Tumbuhan dan Class Dikotil yang akan meng-extend subclass Tumbuhan.  

## ⚙️ Class Utama  

```  
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
``` 
## 🌍 Class MakhlukHidup sebagai Superclass 

```
public class MakhlukHidup {
     
    public void bernafas(){
        System.out.println("Saya Bernafas...");
    }
    public void tumbuh(){
        System.out.println("Saya Tumbuh...");
    }   
}
```
## 🐄 1. Subclass Hewan yang akan meng-extend superclass MakhlukHidup

```
public class Hewan extends MakhlukHidup {
    private int jumlahKaki;

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }
    public int getJumlahKaki() {
        return this.jumlahKaki;
    }
}

```
## 🦜a. Class Aves akan meng-extend subclass Hewan 

```
public class Aves extends Hewan {
    private String warnabulu;
    private String habitat;
    
    public void setwarnabulu(String warnabulu){
        this.warnabulu = warnabulu;
    }
    public String getwarnabulu(){
        return this.warnabulu;
    }
    public void sethabitat(String habitat) {
        this.habitat = habitat;
    }
    public String gethabitat() {
        return this.habitat;
    }
}
``` 

## 🐘 b. Class Mamalia akan meng-extend subclass Hewan 

```
public class Mamalia extends Hewan {
    private String makanan;
    private String ukurantubuh;
    
    public void setmakanan(String makanan) {
        this.makanan = makanan;
    }
    public String getmakanan(){
        return this.makanan;
    }
    public void setukurantubuh(String ukurantubuh){
        this.ukurantubuh = ukurantubuh;
    }
    public String getukurantubuh(){
        return this.ukurantubuh;
    } 
}
``` 

## 🐸 c. Class Amfibi akan meng-extend subclass Hewan 

```
public class Amfibi extends Hewan {
    private String teksturkulit;
    private String bentukekor;
    
    public void setteksturkulit(String teksturkulit){
        this.teksturkulit = teksturkulit;
    }
    public String getteksturkulit(){
        return this.teksturkulit;
    }
    public void setbentukekor(String bentukekor){
        this.bentukekor = bentukekor;
    }
    public String getbentukekor(){
        return this.bentukekor;
    } 
}
``` 

## 🦎 d. Class Reptil akan meng-extend subclass Hewan 

```
public class Reptil extends Hewan {
    private String bentukgigi;
    private String bentuklidah;
    
    public void setbentukgigi(String bentukgigi){
        this.bentukgigi = bentukgigi;
    }
    public String getbentukgigi(){
        return this.bentukgigi;
    }
    public void setbentuklidah(String bentuklidah){
        this.bentuklidah= bentuklidah;
    }
    public String getbentuklidah(){
        return this.bentuklidah;
    } 
}
``` 

## 🐟 e. Class Pisces akan meng-extend subclass Hewan 

```
public class Pisces extends Hewan {

    private String jenissirip;
    private String bentukrangka;

    public void setjenissirip(String jenissirip) {
        this.jenissirip = jenissirip;
    }

    public String getjenissirip() {
        return this.jenissirip;
    }

    public void setbentukrangka(String bentukrangka) {
        this.bentukrangka = bentukrangka;
    }

    public String getbentukrangka() {
        return this.bentukrangka;
    }
}
``` 

## 🍀 2. Subclass Tumbuhan yang akan meng-extend superclass MakhlukHidup 

```
public class Tumbuhan extends MakhlukHidup {
    private String warnadaun;
    private String arahdaun;
    
    public void setwarnadaun(String warna){
        this.warnadaun = warna;
    }
    public String getwarnadaun(){
        return this.warnadaun;
    }
    public void setarahdaun(String arah){
        this.arahdaun = arah;
    }
    public String getarahdaun(){
        return this.arahdaun;
    }
    
}
``` 

## 🌾 a. Class Monokotil yang akan meng-extend subclass Tumbuhan 

```
public class Monokotil extends Tumbuhan {
    private String jumlahkotiledon;
    private String bentukbiji;
    
    public void setjumlahkotiledon(String jumlahkotiledon){
        this.jumlahkotiledon = jumlahkotiledon;    
    }
    public String getjumlahkotiledon(){
       return this.jumlahkotiledon;
    }
    
    public void setbentukbiji(String bentukbiji){
        this.bentukbiji = bentukbiji;
    }
    public String getbentukbiji(){
        return this.bentukbiji; 
    }
}
``` 

## 🌹 b. Class Dikotil yang akan meng-extend subclass Tumbuhan

```
public class Dikotil extends Tumbuhan {
    private int jumlahkelopak;
    private String warnabunga;
    
     public void setjumlahkelopak(int jumlahkelopak){
        this.jumlahkelopak = jumlahkelopak;
    }
    public int getjumlahkelopak(){
        return this.jumlahkelopak;
    }
    public void setwarnabunga(String warnabunga){
        this.warnabunga = warnabunga;
    }
    public String getwarnabunga(){
        return this.warnabunga;
    } 
}
```
---
# 🔧 Setter dan Getter

Method setter dan getter harus diberikan modifier public karena method ini akan diakses dari luar class 

- Setter merupakan method yang digunakan untuk mengatur nilai dari atribut privat suatu class. Method setter tidak memiliki nilai kembalian void(kosong), karena tugasnya hanya mengisi data ke dalam atribut. Penamaan pada method set biasanya diberi awalan set kemudian diikuti dengan nama atribut.  

- Getter merupakan method yang digunakan unutk mengambil nilai dari atribut privat suatu class. Berbeda dengan method setter yang tidak memiliki nilai kembalian, method getter memiliki nilai kembalian sesuai dengan tipe data yang akan diambil. Penamaan pada method getter biasanya diberi awalan get kemudian diikuti dengan nama atribut.  

## 🔍 Source Code penerapan setter dan getter 

```
public class Aves extends Hewan {
    private String warnabulu;
    private String habitat;
    
    public void setwarnabulu(String warnabulu){
        this.warnabulu = warnabulu;
    }
    public String getwarnabulu(){
        return this.warnabulu;
    }
    public void sethabitat(String habitat) {
        this.habitat = habitat;
    }
    public String gethabitat() {
        return this.habitat;
    }
} 
```
