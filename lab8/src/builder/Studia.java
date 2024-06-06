package builder;

public class Studia 
{
  
  public static void main(String[] args) {
	  Director direct = new Director();
	  Builder builder1 = new Programowanie();
	  Builder builder2 = new Teleinformatyka();
	  
	  System.out.println("Specjalnoœæ Programowanie na WSIiZ - przedmioty obieralne:");
	  direct.setBuilder(builder1);
	  direct.ukladaj();
	  Plan plan1 = direct.getPlan();
	  plan1.show();
	  
	  System.out.println("");
	  System.out.println("Specjalnoœæ Teleinformatyka na WSIiZ - przedmioty obieralne:");
	  direct.setBuilder(builder2);
	  direct.ukladaj();
	  Plan plan2 = direct.getPlan();
	  plan2.show();
}
  
}
