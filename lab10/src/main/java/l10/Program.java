package l10;

import com.google.gson.Gson;

public class Program {
	public static void nain(String[] args){
		Student student1 = new Student("Marta", "Nowakowska", "w12345", 6, "informatyka");
		Gson gson = new Gson();
		String formatJSON = gson.toJson(student1);
		
		System.out.println(formatJSON);
	}
}
