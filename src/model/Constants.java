package model;

public interface Constants {

    public enum LiczbaMiejsc {
        Jednoosobowy, Dwuosobowy, Trzyosobowy, Czteroosobowy, Piecioosobowy 
    }
    
    public String LiczbyMiejsc[] = {
        "Jednoosobowy", "Dwuosobowy", "Trzyosobowy", "Czteroosobowy", "Piecioosobowy"
    };
    
    public enum StandardPokoju {
        WysokiStandard, SredniStandard, NiskiStandard
    }
    
    public String StandardyPokojow[] = {
        "Wysoki standard", "Sredni standard", "Niski standard"
    };
    
    public enum StatusPokoju {
        Zajety, Wolny, Zawieszony
    }
    
    public String StatusyPokojow[] = {
        "Zajety", "Wolny", "Zawieszony"
    };
    
    public enum TypGoscia {
        OsobaPonizej18RokuZycia, OsobaPelnoletnia, Senior
    }
    
    public String TypyGosci[] = {
        "Osoba ponizej 18 roku zycia", "Osoba pelnoletnia", "Senior"
    };
	
    public enum TypPlatnosci {
        PlatnoscGotowka, PlatnoscKarta, PlatnoscPrzelewem
    }
    
    public String TypyPlatnosci[] = {
        "Platnosc gotowka", "Platnosc karta", "Platnosc przelewem"
    };
    
    public enum TypPokoju{
        ZBalkonem, BezBalkonu, ZTelewizorem, BezTelewizora, ZInternetem, BezInternetu
    }
    
    public String TypyPokojow[] = {
        "Z balkonem", "Bez balkonu",
    };
    
    public enum TypPracownika {
        Recepcjonista, Ksiegowy, Administrator 
    }
    
    public String TypyPracownikow[] = {
        "Recepcjonista", "Ksiegowy", "Administrator"
    };
    
    public enum TypRezerwacji {
        RezerwacjaLastMinute, RezerwacjaZWyprzedzeniem
    }
    
    public String TypyRezerwacji[] = {
        "Rezerwacja Last Minute", "Rezerwacja z wyprzedzeniem"
    };
}
