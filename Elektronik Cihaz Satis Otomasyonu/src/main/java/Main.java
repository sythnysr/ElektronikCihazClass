import com.cihazsatis.calisan.SatisMuduru;
import com.cihazsatis.calisan.SatisSorumlusu;
import com.cihazsatis.cihaz.Bilgisayar;
import com.cihazsatis.cihaz.Telefon;

public class Main {
    public static void main(String[] args) {
        // com.cihazsatis.cihaz.Cihaz örnekleri
        Telefon telefon = new Telefon("Samsung", "Galaxy S22", 12000, 6.1);
        Bilgisayar.Dizustu dizustu = new Bilgisayar.Dizustu("Apple", "MacBook Air", 15000, 10, 13.3);
        Bilgisayar.Masaustu masaustu = new Bilgisayar.Masaustu("Dell", "OptiPlex", 9500, 0, true);

        // Müşteri örneği
        Musteri musteri = new Musteri("Ahmet Yılmaz", "ahmet@example.com");

        // Çalışan örnekleri
        SatisSorumlusu satisSorumlusu = new SatisSorumlusu("Ali");
        SatisMuduru satisMuduru = new SatisMuduru("Ayşe");

        // Satış ve iade işlemleri
        satisSorumlusu.satisYap(telefon, musteri);
        satisMuduru.satisYap(dizustu, musteri);
        satisMuduru.iadeAl(masaustu, musteri);
    }
}
