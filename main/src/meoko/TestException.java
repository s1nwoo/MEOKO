package meoko;

import java.util.HashMap;

import meoko.exception.InputException;

public class TestException {

	static HashMap<String, String> map = new HashMap<>();
	static InputException ie = InputException.getInstance();
	
	// Util Method
	static private String userInputData(String ...exceptS) {
		
		int count=1;
		String key=null;
				
		map.clear();
		
		for(String str : exceptS) {
			key = "k"+count;
			map.put(key, str);
			count++;
		}
		
		return ie.InputDataException(map);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* test1
		map.put("k1", "1");
		map.put("k2", "2");
		map.put("k3", "3");
		map.put("k4", "4");
		
		String res= ie.InputDataException(map);
		
		System.out.println(res);
		*/
		
		//test2
		
//		String res = userInputData("1","2","3");
//		System.out.println(res);
		
		map.put("int", "int");
		
		String ans = ie.InputDataException(map);
		System.out.println(ans);
			
		
	}

}
