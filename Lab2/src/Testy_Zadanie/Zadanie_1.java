package Testy_Zadanie;

public class Zadanie_1 {
	public int szuk(int []t, int k)
	{
	 for(int i=0; i<t.length; i++)
	 {
	 if (t[i] == k)
	 {
	 System.out.println("Element "+k+" znajduje sie na pozycji "+i);
	 return i;
	 }
	 }
	 System.out.println("Element "+k+" nie znajduje sie na pozycji");
	 return -1;
	}

}
