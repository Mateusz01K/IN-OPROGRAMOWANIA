package Test_Jednostkowe;

public class Tablica {
	public int max(int tablica[]) throws IllegalArgumentException{
		
		
		if(tablica == null || tablica.length == 0) {
			throw new IllegalArgumentException("Przekazano bledny parametr");
		} 
			int maksimum = tablica[0];
			for(int i=1; i<tablica.length;i++)
				if(tablica[i] > maksimum)
					maksimum=tablica[i];
			return maksimum;
		
	}
}