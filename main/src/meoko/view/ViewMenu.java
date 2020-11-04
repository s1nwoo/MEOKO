package meoko.view;

//extends 하는 super class를 만든 이유는,
//다국어표현시, 하나의 클래스 변수를 사용하여
//편이성을 증대하기 위함임.(다형성:오버라이드)
//예시:
//void SelectLanguage() {
//
//		vm.SelectLang(); // V0 // 언어 선택 화면
//		strInput = scInputUser.nextLine();
//		
//		if (strInput.equals("2")) { // 영문 선택
//			vm = ViewMenuEng.getInstance(); // 영문 출력			
//		} else { // 2번을 제외한 숫자면 한국어가 출력.
//
//		}
//		// 첫화면
//		vm.V1();
//		strInput = scInputUser.nextLine();
//
//	}
public class ViewMenu implements ViewMenuIF{

	public void selectLang() { //V0
		// 언어 선택 화면
	}
	
	
	public void fristView() { //V1
		// 첫 화면
	}
	
		
	public void idInputScreen() { // V1_1
		// 아이디 입력 화면
	}
	
	public void pwInputScreen() { // V1_1a
		// 비밀번호 추가 입력
	}
	
	public void loginFailScreen() { //V1_1b
		// 로그인 실패 화면
	}
	
	public void signUpNameInput() { // V1_2
		// 회원가입 이름 입력 화면
	}

	public void signUpIdInput() { // V1_2a
		// 회원가입 아이디 입력 화면
	}
	
	public void signUpIdOverlap() { // V1_2b
		// 회원가입 아이디 중복
	}
	
	public void signUpPwInput() { // V1_2c
		//  회원가입 비밀번호 입력화면
	}
	
	public void signUpComplete() { // V1_2c_1
		// 회원가입 완료 안내문 출력
	}
	
	public void mainMenu() { // V2
		// 메인 메뉴
	}
	
	public void newMemNotice() { // V2_1
		// 신규 회원 권한 없음 안내문
	
	}

	public void postListScreen() { // V2_3
		// 회원이 작성한 게시글 목록 화면
	}
		
	public void postListScreenDown() { // V2_3
	
	}
	
	public void postDetailsScreen() { // V2_3a
		// 글 선택시 화면
		
	}
	
	public void deleteCheck() { // V2_3b
		// 삭제 다시 확인문
	}
	
	public void deleteCompete() { // V2_3b_1
		// YES 선택 시 삭제완료 문구
	}
	
	public void deleteCancel() { // V2_3b_2
		// NO 선택 시 삭제취소 문구
	}
	
	public void myInfoScreen() { // V2_4
		// 회원정보 조회 화면			
	}
		
	public void myInfoScreenName() { // V2_4		
	
	}
		
	public void myInfoScreenId() { // V2_4
	
	}
	
	public void myInfoScreenCount() { // V2_4
	
	}
	
	public void myInfoScreenPrice() { // V2_4
	
	}
		
	public void myInfoScreenCountUnder() { // V2_4
			
	}

	public void myInfoModifyNameInput() { // V2_4_1
		// 회원정보 수정 선택 <이름 입력>
	}
		
	public void myInfoModifyPwInput() { // V2_4_1a
		// 회원정보 수정 선택 <비밀번호 입력>
	}
	
	public void myInfoModifyMoreCheck() { // V2_4_1b
		// 회원정보 수정 선택 <입력값 확인>
	}
	
	public void myInfoModifyComplete() { // V2_4_1c
		// 회원정보 수정완료 문구
	}
	
	public void reviewList() { // V3
		// 리뷰 목록화면
	}
		
	public void reviewListDown() { // V3
	
	}
	
	public void postStoreNameInput() { // V3_1
		// 글쓰기 화면 <가게 이름>
	}
	
	public void postStoreNumberInput() { // V3_1a
		// 글쓰기 화면 <가게 전화번호>
	}
	
	public void postTypeInput() { // V3_1b
		// 글쓰기 화면 <종류>
	}
	
	public void postDistanceInput() { // V3_1c
		// 글쓰기 화면 <거리>
	}
	
	public void postMenuInput() { // V3_1d
		// 글쓰기 화면 <메뉴>
	}
	
	public void postPriceInput() { // V3_1e
		// 글쓰기 화면 <가격>
	}
	
	public void postGradeInput() { // V3_1f
		// 글쓰기 화면 <평점>
	}
	
	public void postInputCheck() { // V3_1g
		// 글쓰기 화면 <입력값 확인>
	}
	
	public void postInputCheckUp() { // V3_1g
		// 글쓰기 화면 <입력값 확인>		
	}
		
	public void postInputCheckDown() { // V3_1g
		// 글쓰기 화면 <입력값 확인>	
				
	}
	
	public void reviewComplete() { // V3_1h
		// 리뷰 등록완료 문구
	}
	
	public void filterSelect() { // V3_2
		// 필터 선택
	}
	
	public void filterGrade() { // V3_2_1
		// 필터 선택 <평점>
	}
	
	public void filterType() { // V3_2_2
		// 필터 선택 <종류>
	}
	
	public void filterDistance() { // V3_2_3
		// 필터 선택 <거리>
	}
	
	public void filterPrice() { // V3_2_4
		// 필터 선택 <가격>
		
	}
	
	public void filterStore() { // V3_2_5
		// 필터 선택 <가게>
	}
	
	public void filterAdd() { // V3_2_0
		// 필터 추가 문의 화면
	}
	
	public void searchResult() { // V3_2_0a
		// 필터 검색 결과 화면
	}
	
	public void searchResultDown() { // V3_2_0a
		
	}
	
	public void searchResultNull() { // V3_3
		// 필터 결과 없음
	}
	
	public void exitCheck() { // V4
		// 프로그램 종료 확인
	}
	
	public void exitFinal() { // V4_1
		// 프로그램 종료 문구
	}
	
	public void wrongValue() { // ???
				
	}
	
	//input mark
	public void inputMark() { // ???		
	
	}
		
	public void fence2() {
			
	}
		
	public String chineseFood() {		
		return null;			
	}
		
	public String koreanFood() {
		return null;	
	}
	
	public String japaneseFood() {
		return null;	
	}
		
	public String westernFood() {
		return null;	
	}
		
	public String snackFood() {
		return null;
	}
		
	public String etcFood() {
		return null;	
	}
}