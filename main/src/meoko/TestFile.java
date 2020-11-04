package meoko;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import meoko.function.ManagerOfMenu;
import meoko.object.Mco;
import meoko.object.Menu;


	public class TestFile {

		Scanner scInputUser = new Scanner(System.in);
			
		public String inputData(Map<String, String> map) {
	
			String result = null;
			
			
			return result;
	}
	
	public static void main(String[] args) {
		
		String str = String.valueOf(System.currentTimeMillis());
		System.out.println(str);
		
		System.out.println("test");
		ManagerOfMenu manager = new ManagerOfMenu();
		
		HashMap<String, String> menu = new HashMap<>();
		menu.put("id", "1");
		menu.put("name", "1");
		menu.put("storeid", "1");
		menu.put("price", "1");
		
		manager.input(menu);
		
		menu.put("id", "2");
		menu.put("name", "2");
		menu.put("storeid", "2");
		menu.put("price", "2");
		
		manager.input(menu);
		
		menu.put("id", "3");
		menu.put("name", "5");
		menu.put("storeid", "3");
		menu.put("price", "3");
		
		manager.input(menu);
		
		menu.put("id", "4");
		menu.put("name", "5");
		menu.put("storeid", "4");
		menu.put("price", "4");
		
		manager.input(menu);
		
		menu.put("id", "5");
		menu.put("name", "5");
		menu.put("storeid", "5");
		menu.put("price", "5");
		
		manager.input(menu);
		
		HashMap<String, String> name = new HashMap<>();
		name.put("name","aa");
		ArrayList<Mco> arr = manager.searchName(name);

		
		int a = arr.size();
		
		System.out.println("---------------");
		for(int i=0; i<arr.size(); i++) {
			Menu menu1 = ((Menu)arr.get(i));
			System.out.println(menu1.getStoreid());
		}	
		System.out.println("---------------");
		name.put("name","5");
		arr = manager.searchName(name);
		a = arr.size();
		
		System.out.println("---------------");
		for(int i=0; i<arr.size(); i++) {
				Menu menu1 = ((Menu)arr.get(i));
				System.out.println(menu1.getStoreid());
		}			
		System.out.println("---------------");
				

	}
}
