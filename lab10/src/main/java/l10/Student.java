package l10;

public class Student {
	public String imie;
	public String nazwisko;
	public String nrAlbumu;
	public int semestr;
	public String kierunek;
	
	
	public Student(String imie, String nazwisko, String nrAlbumu, int semestr, String kierunek) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.nrAlbumu = nrAlbumu;
		this.semestr = semestr;
		this.kierunek = kierunek;
	}


	public String getImie() {
		return imie;
	}


	public void setImie(String imie) {
		this.imie = imie;
	}


	public String getNazwisko() {
		return nazwisko;
	}


	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}


	public String getNrAlbumu() {
		return nrAlbumu;
	}


	public void setNrAlbumu(String nrAlbumu) {
		this.nrAlbumu = nrAlbumu;
	}


	public int getSemestr() {
		return semestr;
	}


	public void setSemestr(int semestr) {
		this.semestr = semestr;
	}


	public String getKierunek() {
		return kierunek;
	}


	public void setKierunek(String kierunek) {
		this.kierunek = kierunek;
	}
	
	
}
