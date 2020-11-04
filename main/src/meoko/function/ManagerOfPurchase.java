package meoko.function;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import meoko.object.Mco;
import meoko.object.Purchase;
import meoko.view.ViewMenuKor;

public class ManagerOfPurchase implements ManagerIF {

	ViewMenuKor vm;
	final ArrayList<Mco> arr;
	final ArrayList<Mco> res;
	Scanner sc;
	
	public ManagerOfPurchase() {
		vm = ViewMenuKor.getInstance();
		arr = new ArrayList<Mco>();
		res = new ArrayList<Mco>();
		sc = new Scanner(System.in);
		
	}

	// index 검색 메소드
	public int searchIndex(String id) {
		int idx=-1;
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i).getId().equals(id)) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	
	public boolean input(Map<String, String> map) {
		Purchase pur = new Purchase();
		
		pur.set((String)map.get("id"), (String)map.get("userid"), (String)map.get("storeid"), (String)map.get("menuid"), Integer.parseInt((String)map.get("grade")));
		
		return arr.add(pur);

	}

	// 수정 메소드
	public boolean modify(Map<String, String> map) {
	//중요!!   id는 기존 id를 동일하게 사용한다    !!
		boolean bResult = true;
			
		// ArrayList에서 index 검색
		int idx = searchIndex((String)map.get("id"));
		
		if(idx>0) {
			// User 객체 인스턴스 생성 및 정보 입력
			Purchase pur = new Purchase();
			pur.set((String)map.get("id"), (String)map.get("userid"), (String)map.get("storeid"), (String)map.get("menuid"), Integer.parseInt((String)map.get("grade")));
			
			// 기존 객체 삭제 및 동일 index에 수정된 객체 덮어쓰기
			arr.remove(idx);
			arr.add(idx, pur);
		}
		else
			bResult = false;
		
		return bResult;
	}

	// 삭제 메소드
	public boolean delete(Map<String, String> map) {
		boolean bResult = true;
		
		// ArrayList에서 id로 index 검색
		int idx = searchIndex((String)map.get("id"));
		
		if(idx>0) {
			// 삭제
			arr.remove(idx);
		}
		else
			bResult = false;

		return bResult;

	}

	public ArrayList<Mco> search(Map<String, String> map) {
		res.clear();
		
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i).getId().equals((String)map.get("id"))) {
				res.add(arr.get(i));
			}
		}
		
		return res;
	}
	
	public ArrayList<Mco> searchGrade(Map<String, String> map) {
		res.clear();
		
		for(int i=0; i<arr.size(); i++) {
//20200512			if(((Purchase)arr.get(i)).getGrade()== Integer.parseInt((String)map.get("grade"))) {
			if(((Purchase)arr.get(i)).getGrade()>= Integer.parseInt((String)map.get("grade"))) {
				res.add(arr.get(i));
			}
		}
		
		return res;
	}
	
	public ArrayList<Mco> searchMenuid(Map<String, String> map) {
		res.clear();
		
		for(int i=0; i<arr.size(); i++) {
			if(((Purchase)arr.get(i)).getMenuid().equals((String)map.get("menuid"))) {
				res.add(arr.get(i));
			}
		}
		
		return res;
	}
	
	public ArrayList<Mco> searchStoreid(Map<String, String> map) {
		res.clear();
		
		for(int i=0; i<arr.size(); i++) {
			if(((Purchase)arr.get(i)).getStoreid().equals((String)map.get("storeid"))) {
				res.add(arr.get(i));
			}
		}
		
		return res;
	}
	
	public ArrayList<Mco> searchUserid(Map<String, String> map) {
		res.clear();
		
		for(int i=0; i<arr.size(); i++) {
			if(((Purchase)arr.get(i)).getUserid().equals((String)map.get("userid"))) {
				res.add(arr.get(i));
			}
		}
		
		return res;
	}
	
	public ArrayList<Mco> AllData() {	
		return arr;
	}
}
