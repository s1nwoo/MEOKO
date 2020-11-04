package meoko.view;

public interface NamedEngIF {
		
	String WRONGVALUE = "Wrong Input Value.";
	// 언어선택
	String FENCE1 = "==================================================================";
	String FENCE2 = "------------------------------------------------------------------";
	String SELECTLANG="언어를 선택해주세요. / Please Select Lanaguage";
//	String FENCE = "=================================";
	String SELECTLANG1="1. 한국어 / Korean";
	String SELECTLANG2="2. 영어   / English";
	String SELECTLANG3="Slect Lanaguage";
	String INPUTMARK=">>>";
	
	// 1
//	String FENCE = "=================================";
	String MENU = "Menu";
//	String FENCE = "=================================";
	String LOGIN="Login In"; 	
	String SIGN_UP = "Sign Up";
//	String INPUTMARK=">>>";
	
	// 1_1a
//	String MENU = "메뉴";
//	String LOGIN = "로그인";
//	String FENCE = "=================================";
//	String LOGIN = "로그인";
//	String FENCE = "=================================";
//	String INPUTMARK=">>>";
	String ID = "ID";
//	String INPUTMARK=">>>";
	String PW = "PW";
	
	// 1_1b
//	String FENCE = "=================================";
	String LOGIN_FAIL = "Fail to Login. Return to Menu?";
//	String FENCE = "=================================";
	String YES = "YES";
	String NO = "NO";	
//	String INPUTMARK=">>>";
	
	// 1_2 a 와 c
//	String MENU = "메뉴";
//	String SIGN_UP = "회원가입";
//	String FENCE = "=================================";
//	String SIGN_UP = "회원가입";
//	String FENCE = "=================================";
//	String INPUTMARK=">>>";
	String NAME = "NAME";
//	String ID = "아이디";
//	String PW = "비밀번호";
	
	// 1_2b
//	String FENCE = "=================================";
	String OVERLAP_ID = "This ID already exists";
//	String FENCE = "=================================";
	
	String SIGN_UP_COMPLETE = "Complete to Sign Up";
	
	// 2
//	String MENU = "메뉴";
//	String LOGIN = "로그인";
	String MAIN = "MAIN";
//	String FENCE = "=====System.out.println(FENCE);============================";
	String WALCOME = "WELCOME! :)";
//	String FENCE = "=================================";
	String LIST_SHOW = "List view";
	String POST = "Writing";
	String MY_POST_SHOW = "View my posts";
	String MEM_INFO_SHOW = "View my information";
	
	// 2_1
//	String MENU = "메뉴";
//	String LOGIN = "로그인";
//	String MAIN = "메인";
//	tring LIST_SHOW = "목록보기";
//	String FENCE = "=================================";
	String NEW_MEM = "When you write more than 1 post, you can search.";
//	String FENCE = "=================================";
	
	// 작성 대기 중
	
	
	// 목록화면
	String LOOKUP_POST_NUMBER = "Please input Post no";
	String MY_POST_LIST = "List of my posts";
	String MY_POST_WRITE = "My posts";
	String NUMBER = "No";
	String STORE = "Store";
	String STORE_NUMBER = "Phone Number";	
	String SELECT_NUM_POST = "Select a post number.";
	String SEARCH = "Search";
	String EXIT = "Exit";
	String NEXT_PAGE = "Next page";
	String PREVIOUS_PAGE = "Previous page";
	
	// 내가 쓴 글 보기
	String COMPLETE = "Complete";
	String MODIFY = "Modify";
	String DELETE = "Delete";
	String BACK = "Back";
	
	// 수정 시
	String MEM_INFO_MODIFY = "Modify";
	String MODIFY_COMPLETE = "Modification is complete";
	String MODIFY_RETURN = "Modify Again";
	String MODIFY_POST = "Edit posts";
	String MORE_CHECK = "Check the information you entered once more";
	String MODIFY_COMPLETE_MESSAGE = "Modification is complete";
		
	// 삭제 시
	String DELETE_CHECK = "Are you sure you want to delete?";
	String DELETE_COMPLETE = "Deletion is complete\n Return to the list of articles I wrote";
	String DELETE_CANCEL = "Cancle\n Return to the list of articles I wrote";
	
	// 회원정보 보기
	String MY_POST_COUNT = "count of my posts";
	String TOTAL_PRICE = "Total price";
	String MODIFY_MEM_INFO = "Edit member information";
	
	// 선택
	String GRADE = "Grade";
	String TYPE = "Type";
	String DISTANCE = "Distance";
	String PRICE = "Price";
	String OPTION = "Option";
	
	// 타입 선택
	String CHINESE_FOOD = "Chinese food";
	String KOREAN_FOOD = "Korean food";
	String JAPENES_FOOD = "Japenes food";
	String WESTERN_FOOD = "Western food";
	String SNACK_FOOD = "Snack food";
	String ETC = "Etc";
	
	// 리뷰 시
	String REVIEW_LIST_SCREEN = "View Of Review List";
	String REVIEW_LIST = "Review List";	
	String REVIEW_INFO = "enter the information of the food you are reviewing";
	String STORE_INPUT = "enter the store name";
	String STORE_NUMBER_INPUT = "Please input Store Phone Number.";
	String TYPE_INPUT = "enter the type";
	String MENU_INPUT = "enter the menu name";
	String PRICE_INPUT = "enter the price(Omit units)";		
	String SCORE_INPUT = "enter the score";
	String ONE_GRADE_OPTION = "★";
	String TWO_GRADE_OPTION = "★★";
	String THREE_GRADE_OPTION = "★★★";
	String FOUR_GRADE_OPTION = "★★★★";
	String FIVE_GRADE_OPTION = "★★★★★";
	String CHECK_INPUT_MORE = "Check, please";
	String INPUT_COMPLETE = "Complete";
	String INPUT_RETURN = "Please input again";
	
	String DISTANCE_INPUT = "enter the distance(km)";
	
	String REVIEW_COMPLETE = "Your review has been registered\n Return to the review list screen";
	
	// 필터
	String FILTER_SELECT = "Select filter.";
	String FILTER_ADD = "Add filter";
	String RESULT = "Result";

	
	// 검색 시(평점)	
	String GRADE_FILTER = "enter your desired grade.(ex: 3 grade or more → 3)";
	String ONE_GRADE = "1 grade or more";
	String TWO_GRADE = "2 grade or more";
	String THREE_GRADE = "3 grade or more";
	String FOUR_GRADE = "4 grade or more";
	String FIVE_GRADE = "5 grade";
	
	String MORE_THAN = "More than";
	String BELOW = "Below";
	String UNDER = "Under";
	
	// 검색 시(종류. 거리, 가격, 가게)	
	String TYPE_FILTER = "enter your desired type";
	String DISTANCE_FILTER = "enter your desired distance";
	String MIN_DISTANCE = "Minimum Distance";
	String MAX_DISTANCE = "Maximum Distance";
	String ZERO_FIVE_KM = "0.5km";
	String ONE_KM = "1km";	
	String PRICE_FILTER = "enter your desired price";	
	String FIVE_THOUSAND = "\\5,000";
	String SIX_THOUSAND = "\\6,000";
	String SEVEN_THOUSAND = "\\7,000";
	String EIGHT_THOUSAND = "\\8,000";
	String STORE_FILTER = "enter your desired store name.(ex: McDonald's)";
	
	// 검색 없음
	String FILTER_NULL = "There are no search results";
	
	// 검색 결과
	String SEARCH_RESULT = "Search Results";
	
	// 프로그램 종료
	String MORE_EXIT = "Are you sure you want to exit the program?";
	String FINAL_EXIT = "End the program :(";
		
}

