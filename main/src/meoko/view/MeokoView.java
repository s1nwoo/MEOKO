package meoko.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

import meoko.exception.InputException;
import meoko.function.ManagerOfMeoko;
import meoko.object.Mco;
import meoko.object.Purchase;
import meoko.object.Store;
import meoko.object.User;

public class MeokoView {
	
	final Scanner scInputUser;	//Scanner Variable
	final InputException	ie;		//예외처리체크용 클래스
	final ManagerOfMeoko	mm;
	
	String strInput;			//주기적으로 쓰는 String Variable 하나 생성,사용	
	HashMap<String, String> map; //예외처리시 허용값을 넣어줄 맵
	ArrayList<Mco> arr;
	
	ViewMenu vm;			//다국어지원용 ViewMenu Class
	
	String currentUserName;
	String currentUserId;
	int currentUserCountOfPost;
	
	String searchGrade;
	String searchType;
	String searchDistance;
	String searchPrice;
	String searchStore;
	
	
	public MeokoView() {
		scInputUser = new Scanner(System.in);			
		mm = ManagerOfMeoko.getInstance();		
		vm = ViewMenuKor.getInstance();
		ie = InputException.getInstance();
		
		map = new HashMap<>();
		
		currentUserName=null;
		currentUserId=null;
		currentUserCountOfPost=0;
		
		searchType=null;
		searchGrade=null;
		searchDistance=null;
		searchPrice=null;
		searchStore=null;
		
	}

	// Util Method
	private String userInputData(String ...exceptS) {
		
		int count=1;
		String key=null;
		String input=null;
				
		map.clear();
		
		for(String str : exceptS) {
			key = "k"+count;
			map.put(key, str);
			count++;
		}
		
		while(true) {
			vm.inputMark();
					
			input=ie.InputDataException(map);
			
			if(input != null) { //
				break;
			}
			else { //적합하지 않은 값이 입력된 경우
				vm.wrongValue();
				continue;
			}			
		}
				
		return input;		
	}
	
	//에러 방지 Integer.parseInt,Double.parseDouble()
	private String userInputDataInt() {
				
		String input=null;
				
		map.clear();
		map.put("int","int");
				
		while(true) {
			vm.inputMark();
					
			input=ie.InputDataException(map);
			
			if(input != null) { //
				break;
			}
			else { //적합하지 않은 값이 입력된 경우
				vm.wrongValue();
				continue;
			}			
		}
				
		return input;		
	}
	
	private String userInputDataDouble() {
		
		String input=null;
				
		map.clear();
		map.put("double","double");
				
		while(true) {
			vm.inputMark();
					
			input=ie.InputDataException(map);
			
			if(input != null) { //
				break;
			}
			else { //적합하지 않은 값이 입력된 경우
				vm.wrongValue();
				continue;
			}			
		}
				
		return input;		
	}
	
	void printCurrestUserInfo() {		
		System.out.print("[ "+currentUserName+" / "+currentUserId+" / "+currentUserCountOfPost+" ]  ");		
	}
	
	// 언어 선택 메서드
	void selectLanguage() {
			
		vm.selectLang(); // V0 // 언어 선택 화면
		
		strInput=userInputData("1","2");				
		if (strInput.equals("2")) { // 영문 선택
			vm = ViewMenuEng.getInstance(); // 영문 출력			
		} else { // 2번을 제외한 숫자면 한국어가 출력.
			vm = ViewMenuKor.getInstance();	
		}		
		firstView();
	}

	// 1 메뉴(로그인, 회원가입)
	void firstView() {
		vm.fristView(); //V1
		
		strInput=userInputData("1","2","3");		
		
		if (strInput.equals("1")) {
			loginScreen();	
		} else if  (strInput.equals("2")) { // default 2
			signUpScreen();
		} else {
			selectLanguage();
		}
		mainSelect();
	}
		
	// 회원가입 메서드
	void signUpScreen() {
		
		String name;
		String id;
		String pw;

		// 회원가입 이름 입력 화면
		vm.signUpNameInput();
		name = scInputUser.nextLine();

		// 회원가입 아이디 입력 화면
		vm.signUpIdInput();
		id = scInputUser.nextLine();

		// ======== 아이디 중복 체크 메서드 호출
		while(true) {
			
			if(mm.checkSameIdUser(id)) { //입력한 아이디가 있음
				vm.signUpIdOverlap();
				vm.signUpIdInput();
				id = scInputUser.nextLine();
				continue;
			}
			else {
				break;
			}			
		}
		
		// 회원가입 비밀번호 입력화면
		vm.signUpPwInput();
		pw = scInputUser.nextLine();
		
		//회원정보 등록
		mm.inputUserInfoData(name,id,pw,0);
		
		//사용자 정보 입력 -- 출력용
		currentUserName=name;
		currentUserId=id;
		currentUserCountOfPost=0;
		
		
		// 회원가입 완료 안내문 출력
		vm.signUpComplete();

	}
	
	// 로그인 메서드
	void loginScreen() {
			
		boolean bResult = true;
		String id=null;
		String pw=null;
		
		int result = 0;
		while (true) {
			// 아이디 입력 화면
			vm.idInputScreen();
			id = scInputUser.nextLine();

			// 비밀번호 추가 입력
			vm.pwInputScreen();
			pw = scInputUser.nextLine();

			// ======== 배열에 저장된 ID와 비밀번호 비교하는 메서드 실행			
			bResult = mm.checkLogIn(id, pw);
			
			
			if (bResult) {
				result = 1; //로그인 성공
				//mm.getCurrentUserInfo(currentUserId, currentUserName, currentUserCountOfPost);
				//사용자 정보 입력 -- 출력용
				//currentUserName=name;
				currentUserId=id;
				//currentUserCountOfPost=0;
				//사용자 정보 입력 -- 출력용
				currentUserName = mm.getCurrentUserInfoName();
				currentUserId = mm.getCurrentUserInfoId();
				currentUserCountOfPost = mm.getCurrentUserInfoCountOfPost();
				
				break;

			} else {
				vm.loginFailScreen();
				strInput = userInputData("1","2");
				if (strInput.equals("1")) {
					result = 2;
					break;
				} else if (strInput.equals("2")) { //전화면으로 돌아가기
					continue;
				} else {
					continue;
				}
			}

		}
		
		if (result == 2) {
			firstView();
		} else { //default 1 로그인 성공  
			
		}
	}
		

	
	// 메인메뉴 선택 메서드	//2
	void mainSelect() {
		
		String input=null;
		printCurrestUserInfo();
		mainList();		
// 		로그인 성공했으니 4가지 중 선택하세요.
//		<1. 목록보기> <2. 글쓰기> <3. 내가 쓴 글 보기>  <4. 회원정보보기>
		input = userInputData("1","2","3","4");
		switch (input) {
		// 목록보기
		case "1":		// 1. 목록보기			
			viewList();			
			break;
		case "2":		// 2. 글쓰기
			post(2);			
			break;			
		case "3":		// 내가 쓴 글 보기
			// 내가 쓴 글 목록
			myPostView();			
			break;
		// 회원정보 보기
		case "4":
			// 회원정보 보여주기
			memInfoView();
			break;
		default:
			mainSelect();
			break;
				
		}
	
	}

	// 2. 메인메뉴(목록,글쓰기,내가쓴글보기,회원정보보기)
	void mainList() {
		// 메인 목록
		vm.mainMenu();
	}
	
	// 3. 리뷰 목록화면(이전목록보기, 글쓰기, 검색, 뒤로가기, 종료, 다음목록보기)
	void viewList() {
		
		// 사용자 글 갯수가 1개 이상이 아닐 경우, mainSelect()으로 다시이동
		if (mm.checkCountOfUserPosts()) {
			
			
			vm.reviewList();
						
			ArrayList<Mco> arrP=null;
			ArrayList<Mco> arrS=null;
			String str=null;
			String type=null;
			String grade=null;
			
			
			vm.reviewList(); // 회원이 작성한 게시글 목록 화면
			// 게시글 목록 출력
			
			arrP = mm.allReviewList();
			
			for (int i = 0; i < arrP.size(); i++) {
				
				str=((Purchase)arrP.get(i)).getStoreid();
				arrS = mm.findStoreList(str);
				
				type=returnType(((Store)arrS.get(0)).getType());
				grade=returnGreade(((Purchase)arrP.get(i)).getGrade());
				
				System.out.println((i+1)+"\t"+((Store)arrS.get(0)).getName()
						+"\t"+grade+"\t"+((Store)arrS.get(0)).getDistance()
						+"\t"+type);
						
				//(Purchase)arrP.get(i).
							
			}		
			
			vm.reviewListDown();
			
			
			strInput = userInputData("1","2","3","4");
			if(strInput.equals("1")) {
				post(3);
			} else if(strInput.equals("2")) {
				search();
			} else if(strInput.equals("3")) {				
				mainSelect();
			} else if(strInput.equals("4")) {
				exit();
			} else {
				viewList();				
			}
			
			
		} else {
			vm.newMemNotice();
			mainSelect();
		}
	}
	
	// 검색 메서드
	void search() {
		
		grade();
		
	}
	/*
	// 검색 메서드
	void search() {
		String input=null;
		vm.filterSelect();
		input=userInputData("1","2");
		
		if(input.equals("1")) {
			grade();
		} else if(input.equals("2")) {
			type();
//		} else if(input.equals("3")) {
//			distance();
//		} else if(input.equals("4")) {
//			price();
//		} else if(input.equals("5")) {
//			store();
		}else {
			search();
		}
	}
	*/
	// 평점 필터
	void grade() {
		
		vm.filterGrade();
		searchGrade=userInputData("1","2","3","4","5");
		// 입력값을 저장해야함
//		filterAdd();
		searchResult();
	}
	
	// 타입 필터
	void type() {
		vm.filterType();
		searchType = userInputData("1","2","3","4","5","6");
		// 입력값을 저장해야함
		filterAdd();
	}
	
	// 거리 필터
	void distance() {
		vm.filterDistance();
		searchDistance = userInputData("1","2","3","4","5");
		// 입력값을 저장해야함
		filterAdd();
	}
	
	// 가격 필터
	void price() {
		vm.filterPrice();
		searchPrice = userInputData("1","2","3","4","5");
		// 입력값을 저장해야함
		filterAdd();
	}
	
	// 가게 필터
	void store() {
		vm.filterStore();
		searchStore = scInputUser.nextLine();
		// 입력값을 저장해야함
		filterAdd();
	}
	
	// 필터 추가 메서드
	void filterAdd() {
		vm.filterAdd();
		strInput = userInputData("1","2");
		if(strInput.equals("1")) {
			search();
		} else{
			searchResult();
		}
		
	}
	
	// 검색결과 출력 메서드
	void searchResult() {
				
		ArrayList<Mco> arrP=null;
		ArrayList<Mco> arrS=null;
		
		String str=null;
		String type=null;
		String grade=null;
		
		
		vm.searchResult();
		
		//검색결과출력
		// 게시글 목록 출력

		arrP = mm.searchResult(searchGrade, null);
				
		if(arrP.size() ==0) {
			vm.searchResultNull();
		}
		else {
			for (int i = 0; i < arrP.size(); i++) {
				
				str=((Purchase)arrP.get(i)).getStoreid();
				arrS = mm.findStoreList(str);
				
				type=returnType(((Store)arrS.get(0)).getType());
				grade=returnGreade(((Purchase)arrP.get(i)).getGrade());
				
				System.out.println((i+1)+"\t"+((Store)arrS.get(0)).getName()
						+"\t"+grade+"\t"+((Store)arrS.get(0)).getDistance()
						+"\t"+type);						
			}			
		}
				
		
		vm.searchResultDown();
		
		searchGrade=null;
		searchType=null;	
		
		strInput = userInputData("1");
		if(strInput.equals("<")) {
			// 이전 목록으로
		} else if(strInput.equals(">")) {
			// 다음 목록으로
		} else if(strInput.equals("1")) {
			// 리뷰 목록화면
			viewList();
		}else {
			viewList();			
		}	
		
		
	}
	
	// 검색결과 없음 메서드
	void searchNull() {
		vm.searchResultNull();
		viewList();
	}
	
	// 글쓰기 메서드
	void post(int type) {			

		String input=null;
		String storeName=null;
		String storePhoneNumber=null;
		int storeType=0;
		double storeDistance=0;
		String menuName=null;
		int menuPrice=0;
		int purchaseGrade=0;
		
		while(true) {
			vm.postStoreNameInput(); 				// 글쓰기 화면 <가게이름>
			storeName = scInputUser.nextLine();
			vm.postStoreNumberInput(); 				// 글쓰기 화면 <가게 전화번호>
			storePhoneNumber = scInputUser.nextLine();
			vm.postTypeInput(); 							// 글쓰기 화면 <종류>
			input=userInputData("1","2","3","4","5");
			storeType = Integer.parseInt(input);		
			vm.postDistanceInput();					// 글쓰기 화면 <거리>
			input = userInputDataDouble();
			storeDistance = Double.parseDouble(input);
			vm.postMenuInput();						// 글쓰기 화면 <메뉴>
			menuName = scInputUser.nextLine();
			vm.postPriceInput();							// 글쓰기 화면 <가격>
			input = userInputDataInt();		
			menuPrice = Integer.parseInt(input);
			vm.postGradeInput();						// 글쓰기 화면 <평점>
			input=userInputData("1","2","3","4","5");
			purchaseGrade = Integer.parseInt(input);
					
			//vm.postInputCheckUp();
			//System.out.println(storeName+"  "+storePhoneNumber+"  "+storeType);
			//System.out.println(storeDistance+"  "+menuName+"  "+menuPrice+"  "+purchaseGrade);
			vm.postInputCheckDown();
			//vm.postInputCheck();						// 글쓰기 화면 <입력값 확인>
			
			input=userInputData("1","2");		
			if (input.equals("1")) {// 리뷰 등록
				currentUserCountOfPost++; 
				mm.writePost(currentUserId, storeName, storePhoneNumber, storeType, storeDistance, menuName, menuPrice, purchaseGrade);
				vm.reviewComplete();			// 리뷰 등록완료 문구
				break;				
			} else {
				continue;				
			}
		}		
		
		if(type == 2) {						
			mainSelect();						// 메인선택 메서드 호출			
		}
		else if(type == 3) {
			viewList();			
		}
		else if(type ==23) {
			
		}
		else { // 디폴트는 2로.
			mainSelect();						// 메인선택 메서드 호출			
		}
		
		
	}

	
	// 내가 쓴 글 보기
	void myPostView() {
		
		ArrayList<Mco> arrP=null;
		ArrayList<Mco> arrS=null;
		String str=null;
		String grade=null;
		String type=null;
		
		
		vm.postListScreen(); // 회원이 작성한 게시글 목록 화면
		// 게시글 목록 출력
		
		arrP = mm.userReviewList();
		
		for (int i = 0; i < arrP.size(); i++) {
			
			str=((Purchase)arrP.get(i)).getStoreid();
			arrS = mm.findStoreList(str);
			
			type=returnType(((Store)arrS.get(0)).getType());
			grade=returnGreade(((Purchase)arrP.get(i)).getGrade());
			
			System.out.println((i+1)+"\t"+((Store)arrS.get(0)).getName()
					+"\t"+grade+"\t"+((Store)arrS.get(0)).getDistance()
					+"\t"+type);
			
//			System.out.println((i+1)+"\t"+((Store)arrS.get(i)).getName()
//					+"\t"+((Purchase)arrP.get(i)).getGrade()+"\t"+((Store)arrS.get(i)).getDistance()
//					+"\t"+((Store)arrS.get(i)).getType());
					
			//(Purchase)arrP.get(i).
						
		}		
		vm.postListScreenDown(); // 회원이 작성한 게시글 목록 화면
			
		str = scInputUser.nextLine(); //다음으로 넘김
		mainSelect();
		
		// 원하는 게시글 번호 선택
/*		
		// 글 선택시 화면
		vm.postDetailsScreen();
		strInput = scInputUser.nextLine();
		if (strInput.equals("1")) {
			myPostModify();
		} else if (strInput.equals("2")) {
			postDelete();
		} else if (strInput.equals("3")) {
			mainSelect();
		}
*/		
	}

	// 내가 쓴 글 수정
	void myPostModify() {
		// 글쓰기 화면 <가게 이름>
		vm.postStoreNameInput();
		strInput = scInputUser.nextLine();
		// 글쓰기 화면 <가게 전화번호>
		vm.postStoreNumberInput();
		strInput = scInputUser.nextLine();
		// 글쓰기 화면 <종류>
		vm.postTypeInput();
		strInput = scInputUser.nextLine();
		// 글쓰기 화면 <거리>
		vm.postDistanceInput();
		strInput = scInputUser.nextLine();
		// 글쓰기 화면 <메뉴>
		vm.postMenuInput();
		strInput = scInputUser.nextLine();
		// 글쓰기 화면 <가격>
		vm.postPriceInput();
		strInput = scInputUser.nextLine();
		// 글쓰기 화면 <평점>
		vm.postGradeInput();
		strInput = scInputUser.nextLine();
		// =========== 입력값 적용
		// 글쓰기 화면 <입력값 확인>
		vm.postInputCheck();
		strInput = userInputData("1","2");
		if(strInput.equals("1")) {
			modifyComplete();
			myPostView();
		} else if(strInput.equals("2")) {
			myPostModify();
		}
		else {
			myPostModify();			
		}
	}
	
	// 수정 입력 완료 메서드
	void modifyComplete() {
		// 완료 문구
		vm.myInfoModifyComplete();
	}
	
	// 수정 다시 입력 메서드
	void modifyAgain() {
		myPostModify();
	}
	
	// 글 삭제 메서드
	void postDelete() {
		// 삭제 다시 확인문
		vm.deleteCheck();
		strInput = scInputUser.nextLine();
		if(strInput.equals("1")) {
			// YES 선택 시 삭제완료 문구
			vm.deleteCompete();
			// 삭제 후 내가 쓴 글로 돌아가기
			myPostView();
		} else if(strInput.equals("2")) {
			// NO 선택 시 삭제취소 문구
			vm.deleteCancel();
			myPostView();
		}
	}
	
	// 회원 정보 보기 
	void memInfoView() {
		
		String input=null;
		
		vm.myInfoScreen();
		vm.myInfoScreenName();
		System.out.println(currentUserName);
		vm.myInfoScreenId();
		System.out.println(currentUserId);
		vm.myInfoScreenCount();
		System.out.println(currentUserCountOfPost);
		vm.myInfoScreenCountUnder();
				
		input=userInputData("1","2");		
		
		if(input.equals("1")) {// 회원정보 수정 선택
			infoModify();			
		} else {// 뒤로가기 -> 메인메뉴로 이동				
			mainSelect();
		}
					
	}

	// 회원 정보 수정
	void infoModify() {
	
		boolean result = false;
		String name = null;
		String pw = null;
		String input = null;
		
		while (true) {
			// 회원정보 수정 선택 <이름 입력>
			vm.myInfoModifyNameInput();
			name = scInputUser.nextLine();
			// 회원정보 수정 선택 <비밀번호 입력>
			vm.myInfoModifyPwInput();
			pw = scInputUser.nextLine();
			// 회원정보 수정 선택 <입력값 확인>
			vm.myInfoModifyMoreCheck();
			
			input=userInputData("1","2");			
			if(input.equals("1")) {
				break;
			}			
		}
		
		mm.userInfoModify(name,pw);
		currentUserName=name;
		
		vm.myInfoModifyComplete();
		memInfoView();		
	}
	
	// 종료 메서드
	void exit() {
		String input=null;
		
		vm.exitCheck();
		
		input = userInputData("1","2");
		
		
		if(input.equals("1")) {
			vm.exitFinal();
		} else {
			viewList();
		}
		
		scInputUser.close();	// Scanner close
		ie.ScannerClose();		// Scanner close
	}
	
	public String returnType(String n) {
		
		String str=null;
		
		switch (n) {
		case "1":
			str=vm.koreanFood();
			break;
		case "2":
			str=vm.chineseFood();
			break;
		case "3":
			str=vm.japaneseFood();
			break;
		case "4":
			str=vm.snackFood();
			break;
		case "5":
			str=vm.etcFood();
			break;		
		default:
			str=vm.etcFood();
			break;
		}
				
		return str;
	}
	
	public String returnGreade(int n) {
		
		String str = null;

		switch (n) {
		case 1:
			str = "★☆☆☆☆";
			break;
		case 2:
			str = "★★☆☆☆";
			break;
		case 3:
			str = "★★★☆☆";
			break;
		case 4:
			str = "★★★★☆";
			break;
		case 5:
			str = "★★★★★";
			break;
		default:
			str = "☆";
			break;
		}
		
		return str;
	}

	// 시작 메서드
	public void start() {
		
		selectLanguage();	// 언어 선책화면
//		firstView();		// 첫화면  로그인 혹은 회원가입
//		mainSelect();	//2
		
		System.out.println("--end--");
	}
	
	public void TestData() {
		
		// 사용자 정보 입력
		String name=null;
		String id=null;
		String pw=null;
		
		name = "김가을";
		id = "abc";
		pw = "12345";		
		mm.inputUserInfoData(name,id,pw,0);
		
		name = "박준길";
		id = "bbb";
		pw = "qwer";		
		mm.inputUserInfoData(name,id,pw,3);
		
		name = "이가량";
		id = "qqq";
		pw = "111";		
		mm.inputUserInfoData(name,id,pw,2);
			
		
		// 리뷰데이터 입력
		mm.writePost("bbb","중화반점","02-3441-5621",2,1,"짬뽕",7000,4);
		mm.writePost("qqq","맛나분식","02-1411-5221",4,0.5,"순대",3000,2);		
		mm.writePost("bbb","낙양반점","02-3551-5651",2,3,"짜장면",6000,3);
		mm.writePost("qqq","진미일식","02-3441-1121",2,1,"초밥",10000,1);
		mm.writePost("bbb","중화반점","02-3441-5621",2,3,"짜장면",6000,1);
	}

}
