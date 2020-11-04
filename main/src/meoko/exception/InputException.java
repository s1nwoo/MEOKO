package meoko.exception;

import java.util.Map;
import java.util.Scanner;

public class InputException {

	Map<String, String> map;
	static Scanner sc;	
	
	private InputException(){
		sc = new Scanner(System.in);
	}
	
	private static InputException manager = new InputException();
	
	public static InputException getInstance() {
		return manager;
	}
	
	//map : 허용값
	//허용값에 적합할 경우 입력받은 String을 리턴
	//허용값에 적합하지 않을 경우, null을 리턴
	public String InputDataException(Map<String, String> map){
		String str = sc.nextLine();
		int size = map.size();
		boolean check = false;
		
		try {	// 주관식 문항 : 입력값이 측정가능 숫자로 들어와야하는 경우
			if(map.containsKey("int")) {
				Integer.parseInt(str);
				check = true;
			}
			else if(map.containsKey("double")) { //20200512
				Double.parseDouble(str);				
				check = true;
			}
			else {	// 객관식 문항 : 입력값이 정수로 들어와야하는 경우
				for(int i=1; i<=size; i++) {
					//if(map.containsKey("k"+i))
					if(map.get("k"+i)!=null) {
						if(map.get("k"+i).equals(str)) {
							check = true;
							break;
						}
						else {	// 정상 작동시 입력값 리턴
						}
					}
				}
			}
			if(check == false) {
				OptionInputException excpt = new OptionInputException();
				throw excpt;
			}
		} catch(OptionInputException e) {
			str = null;
//			e.printStackTrace();
		} catch(NumberFormatException e) {
			str = null;
//			e.printStackTrace();
		}
		
		return str;
	}
	
	public void ScannerClose() {
		sc.close();
	}
}
