package meoko.view;

public class ViewMenuEng extends ViewMenu implements NamedEngIF {
	
	private static ViewMenuEng vmk = new ViewMenuEng();
	
	private ViewMenuEng() {
		
	}
		
	public static ViewMenuEng getInstance() {
		return vmk;
	}
	
	@Override
	public void selectLang() { //V0
		// 언어 선택 화면
		System.out.println(FENCE1);
		System.out.println(SELECTLANG);
		System.out.println(FENCE1);
		System.out.println("   "+SELECTLANG1);
		System.out.println("   "+SELECTLANG2);	
		
	}
	
	@Override
	public void fristView() { //V1
		// 첫 화면
		System.out.println();
		System.out.println(FENCE1);
		System.out.println(MENU);		
		System.out.println(FENCE1);
		System.out.println("   "+"1. "+LOGIN);
		System.out.println("   "+"2. "+SIGN_UP);	
		System.out.println("   "+"3. "+SELECTLANG3);
	}
	
	@Override	
	public void idInputScreen() { // V1_1
		// 아이디 입력 화면
		System.out.println();
		System.out.println(MENU+" > "+LOGIN);
		System.out.println(FENCE1);
		System.out.println(LOGIN);		
		System.out.println(FENCE1);
		System.out.print(INPUTMARK+" "+ID+" : ");	
	}
	
	@Override
	public void pwInputScreen() { // V1_1a
		// 비밀번호 추가 입력
		System.out.print(INPUTMARK+" "+PW+" : ");	
	}
	
	@Override
	public void loginFailScreen() { // V1_1b
		// 로그인 실패 화면
		System.out.println(FENCE1);
		System.out.println(LOGIN_FAIL);		
		System.out.println(FENCE1);
		System.out.println("   "+"1. "+YES+"  "+"2. "+NO);			
	}
	
	@Override
	public void signUpNameInput() { // V1_2
		// 회원가입 이름 입력 화면
		System.out.println(MENU+" > "+SIGN_UP);
		System.out.println(FENCE1);
		System.out.println(SIGN_UP);
		System.out.println(FENCE1);
		System.out.print(INPUTMARK+" "+NAME+" : ");	
	}

	@Override
	public void signUpIdInput() { // V1_2a
		// 회원가입 아이디 입력 화면
		System.out.print(INPUTMARK+" "+ID+" : ");
	}
	
	@Override
	public void signUpIdOverlap() { // V1_2b
		// 회원가입 아이디 중복
		System.out.println(FENCE1);
		System.out.println(OVERLAP_ID);
		System.out.println(FENCE1);
	}
	
	@Override
	public void signUpPwInput() { // V1_2c
		//  회원가입 비밀번호 입력화면
		System.out.print(INPUTMARK+" "+PW+" : ");
	}
	
	@Override
	public void signUpComplete() { // V1_2c_1
		// 회원가입 완료 안내문 출력
		System.out.println();
		System.out.println(FENCE1);
		System.out.println(SIGN_UP_COMPLETE);
		System.out.println(FENCE1);
	}
	
	@Override
	public void mainMenu() { // V2
		// 로그인 성공! 메인 메뉴
		//System.out.println();
		System.out.println(MENU+" > "+LOGIN+" > "+MAIN);
		System.out.println(FENCE1);
		System.out.println(WALCOME);
		System.out.println(FENCE1);
		System.out.println("   "+"1. "+LIST_SHOW);
		System.out.println("   "+"2. "+POST);
		System.out.println("   "+"3. "+MY_POST_SHOW);
		System.out.println("   "+"4. "+MEM_INFO_SHOW);		
	}
	
	@Override
	public void newMemNotice() { // V2_1
		// 신규 회원 권한 없음 안내문
		System.out.println();
		System.out.println(MENU+" > "+LOGIN+" > "+MAIN+" > "+LIST_SHOW);
		System.out.println(FENCE1);
		System.out.println(NEW_MEM);
		System.out.println(FENCE1);
	
	}

	@Override
	public void postListScreen() { // V2_3
		// 회원이 작성한 게시글 목록 화면
		System.out.println();
		System.out.println(MENU+" > "+LOGIN+" > "+MAIN+" > "+MY_POST_SHOW);
		System.out.println(FENCE1);
		System.out.println(MY_POST_LIST);
//		System.out.println(LOOKUP_POST_NUMBER);
		System.out.println(FENCE1);
		System.out.println(NUMBER+"\t"+STORE+"\t\t"+GRADE+"\t\t"+DISTANCE+"\t"+TYPE);
	}
	
	@Override
	public void postListScreenDown() { // V2_3
		System.out.println(FENCE2);
		System.out.println("<. "+PREVIOUS_PAGE+"   "+">. "+NEXT_PAGE);		
	}
	
	@Override
	public void postDetailsScreen() { // V2_3a
		// 글 선택시 화면
		System.out.println();
		System.out.println(FENCE1);
		System.out.println(MY_POST_WRITE);
		System.out.println(FENCE1);
		System.out.println(STORE+"    "+STORE_NUMBER+"    "+TYPE+"    "+DISTANCE);
		System.out.println("   "+"1. "+MODIFY+"  "+"2. "+DELETE+"  "+"3. "+BACK);		
		
	}
	
	@Override
	public void deleteCheck() { // V2_3b
		// 삭제 다시 확인문
		System.out.println();
		System.out.println(FENCE1);
		System.out.println(DELETE_CHECK);
		System.out.println(FENCE1);
		System.out.println("1. "+YES+"  "+"2. "+NO);		
	}
	
	@Override
	public void deleteCompete() { // V2_3b_1
		// YES 선택 시 삭제완료 문구
		System.out.println();
		System.out.println(FENCE1);
		System.out.println(DELETE_COMPLETE);
		System.out.println(FENCE1);
	}
	
	@Override
	public void deleteCancel() { // V2_3b_2
		// NO 선택 시 삭제취소 문구
		System.out.println();
		System.out.println(FENCE1);
		System.out.println(DELETE_CANCEL);
		System.out.println(FENCE1);
	}
	
	@Override
	public void myInfoScreen() { // V2_4
		// 회원정보 조회 화면
		System.out.println();
		System.out.println(MENU+" > "+LOGIN+" > "+MAIN+" > "+MEM_INFO_SHOW);
		System.out.println(FENCE1);		
	}
	
	@Override
	public void myInfoScreenName() { // V2_4		
		System.out.print(NAME+" : ");
	}
	
	@Override
	public void myInfoScreenId() { // V2_4
		System.out.print(ID+" : ");
	}
	
	@Override
	public void myInfoScreenCount() { // V2_4
		System.out.print(MY_POST_COUNT+" : ");
	}
	
	@Override
	public void myInfoScreenPrice() { // V2_4
		System.out.print(TOTAL_PRICE+" : ");
	}
	
	@Override
	public void myInfoScreenCountUnder() { // V2_4
		System.out.println(FENCE1);
		System.out.println("   "+"1. "+MODIFY_MEM_INFO+"  "+"2. "+BACK);		
	}

	@Override
	public void myInfoModifyNameInput() { // V2_4_1
		// 회원정보 수정 선택 <이름 입력>
		System.out.println();
		System.out.println(MENU+" > "+LOGIN+" > "+MAIN+" > "+MEM_INFO_SHOW+" > "+MEM_INFO_MODIFY);
		System.out.println(FENCE1);
		System.out.println(MODIFY_MEM_INFO);
		System.out.println(FENCE1);
		System.out.print(INPUTMARK+"  "+NAME+" : ");
	}
		
	@Override
	public void myInfoModifyPwInput() { // V2_4_1a
		// 회원정보 수정 선택 <비밀번호 입력>
		System.out.print(INPUTMARK+"  "+PW+" : ");
	}
	
	@Override
	public void myInfoModifyMoreCheck() { // V2_4_1b
		// 회원정보 수정 선택 <입력값 확인>
		System.out.println(FENCE1);
		System.out.println("   "+"1. "+MODIFY_COMPLETE+"  "+"2. "+MODIFY_RETURN);		
	}
	
	@Override
	public void myInfoModifyComplete() { // V2_4_1c
		// 회원정보 수정완료 문구
		System.out.println();
		System.out.println(FENCE1);
		System.out.println(MODIFY_COMPLETE_MESSAGE);
		System.out.println(FENCE1);
	}
	
	@Override
	public void reviewList() { // V3
		// 리뷰 목록화면
		System.out.println();
		System.out.println(MENU+" > "+LOGIN+" > "+MAIN+" > "+LIST_SHOW);
		System.out.println(FENCE1);
		System.out.println(REVIEW_LIST);
		System.out.println(FENCE1);
		System.out.println(NUMBER+"\t"+STORE+"\t"+GRADE+"\t"+DISTANCE+"\t"+TYPE);
	}
	
	@Override
	public void reviewListDown() { // V3
		System.out.println(FENCE2);
		System.out.println("<. "+PREVIOUS_PAGE+"  1. "+POST+"  2. "+SEARCH+"  3. "+BACK+"  4. "+EXIT+"  >. "+NEXT_PAGE);		
	}
	
	@Override
	public void postStoreNameInput() { // V3_1
		// 글쓰기 화면 <가게 이름>
		System.out.println();
		System.out.println(MENU+" > "+LOGIN+" > "+MAIN+" > "+POST);
		System.out.println(FENCE1);
		System.out.println(REVIEW_INFO);
		System.out.println(FENCE1);
		System.out.println(STORE_INPUT);
		System.out.print(INPUTMARK+"  ");
	}
	
	@Override
	public void postStoreNumberInput() { // V3_1a
		// 글쓰기 화면 <가게 전화번호>
		System.out.println(STORE_NUMBER_INPUT);
		System.out.print(INPUTMARK+"  ");
	}
	
	@Override
	public void postTypeInput() { // V3_1b
		// 글쓰기 화면 <종류>
		System.out.println(TYPE_INPUT);
		System.out.println("   1. "+KOREAN_FOOD+"   2. "+CHINESE_FOOD+"   3. "+JAPENES_FOOD+"   4. "+SNACK_FOOD+"   5. "+ETC);
	}
	
	@Override
	public void postDistanceInput() { // V3_1c
		// 글쓰기 화면 <거리>
		System.out.println(DISTANCE_INPUT);		
	}
	
	@Override
	public void postMenuInput() { // V3_1d
		// 글쓰기 화면 <메뉴>
		System.out.println(MENU_INPUT);
		System.out.print(INPUTMARK+"  ");
	}
	
	@Override
	public void postPriceInput() { // V3_1e
		// 글쓰기 화면 <가격>
		System.out.println(PRICE_INPUT);		
	}
	
	@Override
	public void postGradeInput() { // V3_1f
		// 글쓰기 화면 <평점>
		System.out.println(SCORE_INPUT);
		System.out.println(ONE_GRADE+" : "+ONE_GRADE_OPTION);
		System.out.println(TWO_GRADE+" : "+TWO_GRADE_OPTION);
		System.out.println(THREE_GRADE+" : "+THREE_GRADE_OPTION);
		System.out.println(FOUR_GRADE+" : "+FOUR_GRADE_OPTION);
		System.out.println(FIVE_GRADE+" : "+FIVE_GRADE_OPTION);		
	}
	
	@Override
	public void postInputCheck() { // V3_1g
		// 글쓰기 화면 <입력값 확인>
		System.out.println(FENCE1);
		System.out.println(CHECK_INPUT_MORE);
		System.out.println();
		System.out.println(STORE+" : ");
		System.out.println(STORE_NUMBER+" : ");
		System.out.println(TYPE+" : ");
		System.out.println(DISTANCE+" : ");
		System.out.println(MENU+" : ");
		System.out.println(PRICE+" : ");
		System.out.println(GRADE+" : ");
		System.out.println(FENCE1);
		System.out.println("   1. "+INPUT_COMPLETE+"   2. "+INPUT_RETURN);		
	}
	
	@Override
	public void postInputCheckUp() { // V3_1g
		// 글쓰기 화면 <입력값 확인>
		System.out.println(FENCE1);
		System.out.println(CHECK_INPUT_MORE);
		System.out.println();
	}
	
	@Override
	public void postInputCheckDown() { // V3_1g
		// 글쓰기 화면 <입력값 확인>		
		System.out.println(FENCE1);
		System.out.println("   1. "+INPUT_COMPLETE+"   2. "+INPUT_RETURN);		
	}
	
	
	@Override
	public void reviewComplete() { // V3_1h
		// 리뷰 등록완료 문구
		System.out.println(FENCE1);
		System.out.println(REVIEW_COMPLETE);
		System.out.println(FENCE1);
	}
	
	@Override
	public void filterSelect() { // V3_2
		// 필터 선택
		System.out.println(MENU+" > "+LOGIN+" > "+MAIN+" > "+LIST_SHOW+" > "+SEARCH);
		System.out.println(FENCE1);
		System.out.println(FILTER_SELECT);
		System.out.println();
		System.out.println("   1. "+GRADE);
		System.out.println("   2. "+TYPE);
//		System.out.println("   3. "+DISTANCE);
//		System.out.println("   4. "+PRICE);
//		System.out.println("   5. "+STORE);
		System.out.println(FENCE1);		
	}
	
	@Override
	public void filterGrade() { // V3_2_1
		// 필터 선택 <평점>
		System.out.println(MENU+" > "+LOGIN+" > "+MAIN+" > "+LIST_SHOW+" > "+SEARCH);
		System.out.println(FENCE1);
		System.out.println(GRADE_FILTER);
		System.out.println();
		System.out.println("   1. "+ONE_GRADE+" "+MORE_THAN);
		System.out.println("   2. "+TWO_GRADE+" "+MORE_THAN);
		System.out.println("   3. "+THREE_GRADE+" "+MORE_THAN);
		System.out.println("   4. "+FOUR_GRADE+" "+MORE_THAN);
		System.out.println("   5. "+FIVE_GRADE);
		System.out.println(FENCE1);		
	}
	
	@Override
	public void filterType() { // V3_2_2
		// 필터 선택 <종류>
		System.out.println(MENU+" > "+LOGIN+" > "+MAIN+" > "+LIST_SHOW+" > "+SEARCH);
		System.out.println(FENCE1);
		System.out.println(TYPE_FILTER);
		System.out.println();
		System.out.println("   1. "+KOREAN_FOOD);
		System.out.println("   2. "+CHINESE_FOOD);
		System.out.println("   3. "+JAPENES_FOOD);
		System.out.println("   4. "+SNACK_FOOD);
		System.out.println("   5. "+ETC);
		System.out.println(FENCE1);		
	}
	
	@Override
	public void filterDistance() { // V3_2_3
		// 필터 선택 <거리>
		System.out.println(MENU+" > "+LOGIN+" > "+MAIN+" > "+LIST_SHOW+" > "+SEARCH);
		System.out.println(FENCE1);
		System.out.println(DISTANCE_FILTER);
		System.out.println();
		System.out.println("   1. "+MIN_DISTANCE);
		System.out.println("   2. "+MAX_DISTANCE);
		System.out.println("   3. "+ZERO_FIVE_KM+" "+UNDER);
		System.out.println("   4. "+ZERO_FIVE_KM+" "+MORE_THAN+" "+ONE_KM+" "+BELOW);
		System.out.println("   5. "+ETC);
		System.out.println(FENCE1);		
	}
	
	@Override
	public void filterPrice() { // V3_2_4
		// 필터 선택 <가격>
		System.out.println(MENU+" > "+LOGIN+" > "+MAIN+" > "+LIST_SHOW+" > "+SEARCH);
		System.out.println(FENCE1);
		System.out.println(PRICE_FILTER);
		System.out.println();
		System.out.println("   1. "+FIVE_THOUSAND+" "+UNDER);
		System.out.println("   2. "+FIVE_THOUSAND+" "+MORE_THAN+" "+SIX_THOUSAND+" "+UNDER);
		System.out.println("   3. "+SIX_THOUSAND+" "+MORE_THAN+" "+SEVEN_THOUSAND+" "+UNDER);
		System.out.println("   4. "+SEVEN_THOUSAND+" "+MORE_THAN+" "+EIGHT_THOUSAND+" "+UNDER);
		System.out.println("   5. "+EIGHT_THOUSAND+" "+MORE_THAN);
		System.out.println(FENCE1);		
	}
	
	@Override
	public void filterStore() { // V3_2_5
		// 필터 선택 <가게>
		System.out.println(MENU+" > "+LOGIN+" > "+MAIN+" > "+LIST_SHOW+" > "+SEARCH);
		System.out.println(FENCE1);
		System.out.println(STORE_FILTER);
		System.out.println(FENCE1);
		System.out.print(INPUTMARK+"  ");
	}
	
	@Override
	public void filterAdd() { // V3_2_0
		// 필터 추가 문의 화면
		System.out.println("   1: "+FILTER_ADD+"   2:"+RESULT);
		System.out.print(INPUTMARK+"  ");
	}
	
	@Override
	public void searchResult() { // V3_2_0a
		// 필터 검색 결과 화면
		System.out.println(SEARCH_RESULT);
		System.out.println(FENCE1);
		System.out.println(FENCE1);
		System.out.println(NUMBER+"\t"+STORE+"\t\t"+GRADE+"\t"+DISTANCE+"\t"+TYPE);		
		System.out.println(FENCE2);			
	}
	
	@Override
	public void searchResultDown() { // V3_2_0a
		System.out.println("<. "+PREVIOUS_PAGE+"   1. "+REVIEW_LIST_SCREEN+"   "+">. "+NEXT_PAGE);
	}
	
	@Override
	public void searchResultNull() { // V3_3
		// 필터 결과 없음
		System.out.println(FENCE1);
		System.out.println(FILTER_NULL);
		System.out.println(FENCE1);
	}
	
	@Override
	public void exitCheck() { // V4
		// 프로그램 종료 확인
		System.out.println(FENCE1);
		System.out.println(MORE_EXIT);
		System.out.println(FENCE1);
		System.out.println("   1: "+EXIT+"   2:"+BACK);		
	}
	
	@Override
	public void exitFinal() { // V4_1
		// 프로그램 종료 문구
		System.out.println(FENCE1);
		System.out.println(FINAL_EXIT);
		System.out.println(FENCE1);
	}
	
	@Override
	public void wrongValue() { // ???
		// 프로그램 종료 문구
		System.out.println(FENCE2);
		System.out.println(WRONGVALUE);
		System.out.println(FENCE2);
	}

	@Override
	public void inputMark() { // ???		
		System.out.print(INPUTMARK+"  ");
	}

	@Override
	public void fence2() {
		System.out.println(FENCE2);		
	}

	@Override
	public String chineseFood() {
		return CHINESE_FOOD;		
	}
	
	@Override
	public String koreanFood() {
		return KOREAN_FOOD;		
	}
	
	@Override
	public String japaneseFood() {
		return JAPENES_FOOD;		
	}
	
	@Override
	public String westernFood() {
		return WESTERN_FOOD;		
	}
	
	@Override
	public String snackFood() {
		return SNACK_FOOD;	
	}
	
	@Override
	public String etcFood() {
		return ETC;		
	}
}