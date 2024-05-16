package lab7;

/**
 * Klasa Osoba to natywna reprezentacji obiekow osobowych w systemie
 * Klasa dzuedziczona <b> Object </b> pakietu lang
 * @author MK
 * @version 1.0
 */
public class Osoba {

	
	/**
	 * Pola klasy osoba -> imie, nazwisko reprezentuja glowne dane osobowe <br>
	 * pola dotycza typu String, widocznosc prywatna
	 */
	private String imie, nazwisko;
	
	
	/**
	 * Konstruktor bezparametrowy klasy Osoba inicjalizujacy wartoscia "anonnymous" oba pola
	 */
	public Osoba() {
		this.imie = "anonny";
		this.nazwisko = "anonnymous";
	}
	
	/**
	 * Konstruktor bezparametrowy klasy Osoba inicjalizujaca pole zwiazane z parametrami
	 * @param imie pole reprezentujace pierwsze imie - typ String
	 * @param nazwisko pole reprezentujace pierwsze nazwisko - typ String
	 */
	public Osoba(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	/*
	 * metoda modyfikacji nazwiska
	 * @param nazwisko parametr modyfikujacy wartosc pola nazwisko typu String
	 * @see #imie
	 */
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	
	/**
	 * Metoda zwrotu imienia
	 * @return zwrot lancucha znakow reprezentujacego pole imie
	 */
	public String getImie() {
		return imie;
	}
	
	/**
	 * Metoda zwrotu nazwiska
	 * @return zwrot lancucha znakow reprezentujacego pole nazwisko
	 */
	public String getNazwisko() {
		return nazwisko;
	}
	
	
	
	/**
	 * Metoda uruchamiajaca Klase Osoba
	 * @param args argumenty przekazywane przy wywolaniu po spacji
	 */
	public static void main(String[] args) {
		

	}

}
