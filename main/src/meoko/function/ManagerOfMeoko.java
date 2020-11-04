package meoko.function;

import java.util.ArrayList;
import java.util.HashMap;

import meoko.object.Mco;
import meoko.object.Menu;
import meoko.object.Store;
import meoko.object.User;

public class ManagerOfMeoko {
	
	ManagerOfUser mu;
	ManagerOfStore ms;
	ManagerOfMenu mm;
	ManagerOfPurchase mp;
	//User user;					//현재사용자 정보
	
	HashMap<String, String> map;
	ArrayList<Mco> arr;
	
	//String uid;					//현재사용자 정보
	String currentUserName;
	String currentUserId;
	String currentUserpw;
	int currentUserCountOfPost;
		
	
	private static ManagerOfMeoko mmanager = new ManagerOfMeoko();
	
	public static ManagerOfMeoko getInstance() {
		return mmanager;
	}
	
	private ManagerOfMeoko() {
		mu = new ManagerOfUser();
		ms = new ManagerOfStore();
		mm = new ManagerOfMenu();
		mp = new ManagerOfPurchase();
		//user = new User();				
		
		map = new HashMap<>();
		arr = new ArrayList<Mco>();
		
				
	}
		
	//로그인체크
	//아이디와 패스워드를 받아서 아이디에 일치하는 사용자정보
	//를 가져와 동일여부를 확인하고 
	//로그인에 성공하면 true, 실패하면 false 반환
	public boolean checkLogIn(String iid, String ipw) {
	
		boolean result=false;
		String id=null;
		String name=null;
		String pw=null;
		int countOfPost=0;
		map.clear();
		arr.clear();
		
		map.put("id", iid);
		//map.put("pw", ipw);
		arr = mu.search(map);
		
		if(arr.size() > 0) {
			//countOfPost = ((User)arr.get(0)).getCountOfPost();
			//((User)arr.get(0)).get(id, name, pw, countOfPost);
			id = ((User)arr.get(0)).getId();
			name = ((User)arr.get(0)).getName();
			pw = ((User)arr.get(0)).getPw();
			countOfPost = ((User)arr.get(0)).getCountOfPost();
					
			
			if(ipw.equals(pw)) {
				result = true;
				
				//현재 사용자 정보 가지고 있기
				currentUserName = name;
				currentUserId = id;
				currentUserpw = pw;
				currentUserCountOfPost = countOfPost;
				
			}
			else {
				result = false;
			}			
		}
		else {
			result = false;			
		}
		
				
		return result;
	}
	
	//동일아이디 체크
	//사용자정보들 중 동일한 아이디가 있는지 검색
	//있으면 true, 없으면 false 반환
	public boolean checkSameIdUser(String iid) {
		
		boolean result=false;
		map.clear();
		arr.clear();
				
		map.put("id", iid);
		arr = mu.search(map);
		
		if(arr.size() > 0) {
			result = true;
		}
		
		return result;				
	}
	//동일아이디 체크
	//가게정보들 중 동일한 아이디가 있는지 검색
	//있으면 true, 없으면 false 반환
	public boolean checkSameIdStore(String iid) {
		
		boolean result=false;
		map.clear();
		arr.clear();
				
		map.put("id", iid);
		arr = ms.search(map);
		
		if(arr.size() > 0) {
			result = true;
		}
		
		return result;				
	}
	//동일아이디 체크
	// 가게정보들 중 동일한 아이디가 있는지 검색
	// 있으면 true, 없으면 false 반환
	public boolean checkSameIdMenu(String iid) {

		boolean result = false;
		map.clear();
		arr.clear();

		map.put("id", iid);
		arr = mu.search(map);

		if (arr.size() > 0) {
			result = true;
		}

		return result;
	}

	//동일아이디 체크
	// 구매정보들 중 동일한 아이디가 있는지 검색
	// 있으면 true, 없으면 false 반환
	public boolean checkSameIdPurchase(String iid) {

		boolean result = false;
		map.clear();
		arr.clear();

		map.put("id", iid);
		arr = mp.search(map);

		if (arr.size() > 0) {
			result = true;
		}

		return result;
	}
	
	// 사용자 정보 입력
	public boolean inputUserInfoData(String name, String id, String pw, int count) {
		//boolean result=false;
		
		//현재 사용자 정보 가지고 있기
		currentUserName = name;
		currentUserId = id;
		currentUserpw = pw;
		currentUserCountOfPost = count;
		
		map.clear();
		map.put("name", currentUserName);
		map.put("id",currentUserId);
		map.put("pw",currentUserpw);
		map.put("countOfPost",String.valueOf(currentUserCountOfPost));
				
		
				
		return mu.input(map);
		
		//return result;
	}
	
	public String getCurrentUserInfoId(){
		return currentUserId;	
	}
	
	public String getCurrentUserInfoName() {
		return currentUserName;	
	}
	
	public int getCurrentUserInfoCountOfPost() {
		return currentUserCountOfPost;	
	}

	//사용자 글 갯수 체크
	//1개도 글이 없을 경우 false,	
	//1개 이상의 글이 있을 경우 true 반환
	public boolean checkCountOfUserPosts() {
		
		boolean result=false;
				
		if(currentUserCountOfPost > 0) {
			result = true;
		}
		
		return result;				
	}
	
	/*
	 * 	ManagerOfUser mu;
	ManagerOfStore ms;
	ManagerOfMenu mm;
	ManagerOfPurchase mp;
	 */
	public void writePost(String userid, String storeName, String storePhoneNumber, int storeType, double storeDistance, String menuName, int menuPrice, int purchaseGrade) {
		
		HashMap<String, String> map= new HashMap<>();
		String storeid=null;
		String menuid=null;
		String pid=null;
		ArrayList<Mco> arr=null;
		

		
		//Store 정보 입력
		//store.set((String)map.get("id"), (String)map.get("name"), 
		//(String)map.get("phoneNumber"), Double.parseDouble((String)map.get("distance")),
		//(String)map.get("type"));
		
		//전화번호를 검색하여, 같은 번호가 있는 경우,
		//해당 가게 아이디로 정보를 입력
		map.clear();
		map.put("phoneNumber",storePhoneNumber);
		arr =ms.searchPhoneNumber(map);
		if(arr.size()>0) { //같은전화번호가 있음
			storeid = arr.get(0).getId();
		}
		else {
			while(true) {
				storeid = makeId();
				if(checkSameIdStore(storeid)==false){
					break;
				}			
			}			
		}				
		map.clear();
		map.put("id",storeid);
		map.put("name",storeName);
		map.put("phoneNumber",storePhoneNumber);
		map.put("distance",String.valueOf(storeDistance));
		map.put("type",String.valueOf(storeType));
		ms.input(map);
		
		//Menu 정보 입력
		//menu.set((String)map.get("id"), (String)map.get("name"), (String)map.get("storeid"), 
		//Integer.parseInt((String)map.get("price")));
		//name, storeid, price가 같은 경우, 같은 id 할당
		
		map.clear();
		map.put("name",menuName);				
		arr =mm.searchName(map);
		if(arr.size()>0) { //같은이름이 있음
			if((storeid == ((Menu)arr.get(0)).getStoreid())
					&&((menuPrice == ((Menu)arr.get(0)).getPrice()))){
				menuid = arr.get(0).getId();
			}					 
		}

		if (menuid == null) {

			while (true) {
				menuid = makeId();
				if (checkSameIdStore(menuid) == false) {
					break;
				} 
			}
		}
		map.clear();
		map.put("id",menuid);
		map.put("name",menuName);
		map.put("storeid",storeid);
		map.put("price",String.valueOf(menuPrice));		
		mm.input(map);
						
		//Purchase 정보 입력
		//pur.set((String)map.get("id"), (String)map.get("userid"), (String)map.get("storeid"), 
		//(String)map.get("menuid"), Integer.parseInt((String)map.get("grade")));
		while(true) {
			pid = makeId();
			if(checkSameIdStore(pid)==false){
				break;
			}			
		}	
		map.clear();
		map.put("id",pid);
		map.put("userid",userid);
		map.put("storeid",storeid);
		map.put("menuid",menuid);
		map.put("grade",String.valueOf(purchaseGrade));
		mp.input(map);
		
		//글을 입력
		currentUserCountOfPost++;
		
		map.clear();
		map.put("id",currentUserId);
		map.put("name",currentUserName);
		map.put("pw",currentUserpw);
		map.put("countOfPost",String.valueOf(currentUserCountOfPost));
		mu.modify(map);

	}
		
	
	public String makeId() {
		return String.valueOf(System.currentTimeMillis());
	}
	
	public void userInfoModify(String name, String pw) {
		currentUserName = name;
		currentUserpw = pw;
		
		map.clear();
		map.put("id",currentUserId);
		map.put("name",currentUserName);
		map.put("pw",currentUserpw);
		map.put("countOfPost",String.valueOf(currentUserCountOfPost));
		mu.modify(map);	
		
	}

	public ArrayList<Mco> userReviewList() {
		
		map.clear();		
		map.put("userid", currentUserId);
		return mp.searchUserid(map);
		
	}
	
	public ArrayList<Mco> findStoreList(String id) {
		
		map.clear();	
				
		map.put("id", id);
		return ms.search(map);
		
	}
	
	public ArrayList<Mco> allReviewList() {
				
		return mp.AllData();
		
	}
	
	public ArrayList<Mco> searchResult(String sg, String st) {

		ArrayList<Mco> result=null;
		map.clear();		


		
		if(sg!=null && st!=null) { // grade 와 type
						
		}
		else if(sg!=null && st==null) { //garde 만
			map.put("grade", sg);
			result = mp.searchGrade(map);			
		}
		else if(sg==null && st!=null) { // type 만
			map.put("ade", sg);
		}
		else {
			result = null;			
		}
		
		return result;
		
	}

}
