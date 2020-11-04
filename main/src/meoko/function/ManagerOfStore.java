package meoko.function;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import meoko.object.Mco;
import meoko.object.Store;

public class ManagerOfStore implements ManagerIF{
	
	final ArrayList<Mco> arr; 
	final ArrayList<Mco> res;
	Scanner sc;
	
	// 초기화 생성자
	public ManagerOfStore(){
		// 1. 배열 초기화
		arr = new ArrayList<Mco>();
		res = new ArrayList<Mco>();
		// 2. Scanner 객체 초기화
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

	// 입력 메소드
	public boolean input(Map<String, String> map) {
		// Store 객체 인스턴스 생성
		Store store = new Store();
		// Store 정보 입력
		store.set((String)map.get("id"), (String)map.get("name"), (String)map.get("phoneNumber"), Double.parseDouble((String)map.get("distance")), (String)map.get("type"));
		
		// 배열에 추가
		return arr.add(store);
	}

	// 수정 메소드
	public boolean modify(Map<String, String> map) {
	//중요!!   id는 기존 id를 동일하게 사용한다    !!
		boolean bResult = true;
		
		// ArrayList에서 index 검색
		int idx = searchIndex((String)map.get("id"));
		
		if(idx>0) {
			// User 객체 인스턴스 생성 및 정보 입력
			Store store = new Store();
			store.set((String)map.get("id"), (String)map.get("name"), (String)map.get("phoneNumber"), Double.parseDouble((String)map.get("distance")), (String)map.get("type"));
			
			// 기존 객체 삭제 및 동일 index에 수정된 객체 덮어쓰기
			arr.remove(idx);
			arr.add(idx, store);
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

	// 검색 메소드 : 객체 반환
	public ArrayList<Mco> search(Map<String, String> map) {
		res.clear();
		
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i).getId().equals((String)map.get("id"))) {
				res.add(arr.get(i));
			}
		}
		
		return res;
	}
	
	public ArrayList<Mco> searchName(Map<String, String> map) {
		res.clear();
		
		for(int i=0; i<arr.size(); i++) {
			if(((Store)arr.get(i)).getName().equals((String)map.get("name"))) {
				res.add(arr.get(i));
			}
		}
		
		return res;
	}
	
	public ArrayList<Mco> searchDistance(Map<String, String> map) {
		res.clear();
		
		for(int i=0; i<arr.size(); i++) {
			if(((Store)arr.get(i)).getDistance()== Double.parseDouble((String)map.get("distance"))) {
				res.add(arr.get(i));
			}
		}
		
		return res;
	}
	
	public ArrayList<Mco> searchType(Map<String, String> map) {
		res.clear();
		
		for(int i=0; i<arr.size(); i++) {
			if(((Store)arr.get(i)).getType().equals((String)map.get("type"))) {
				res.add(arr.get(i));
			}
		}
		
		return res;
	}
	//20200511추가
	public ArrayList<Mco> searchPhoneNumber(Map<String, String> map) {
		res.clear();

		for (int i = 0; i < arr.size(); i++) {
			if (((Store) arr.get(i)).getPhoneNumber().equals((String) map.get("phoneNumber"))) {
				res.add(arr.get(i));
			}
		}

		return res;
	}
}
