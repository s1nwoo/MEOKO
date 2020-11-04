package meoko.view;

public interface NamedIF {
		
	// 적합한 값이 아닐 경우 메시지
	String WRONGVALUE = "입력값이 잘못되었습니다.";
	// 언어선택
	String FENCE1 = "==================================================================";
	String FENCE2 = "------------------------------------------------------------------";
	String SELECTLANG="언어를 선택해주세요. / Please Select Lanaguage";
	String SELECTLANG1="1. 한국어 / Korean";
	String SELECTLANG2="2. 영어   / English";
	String SELECTLANG3="언어 선택";
	String INPUTMARK=">>>";
	
	
	// 메뉴
	String MENU = "메뉴";
	String LOGIN = "로그인";
	String SIGN_UP = "회원가입";
	
	// 로그인
	String ID = "아이디";
	String PW = "비밀번호";
	
	// 로그인 실패
	String LOGIN_FAIL = "로그인에 실패하였습니다. 메뉴화면으로 돌아가시겠습니까?";
	String YES = "예";
	String NO = "아니요";
	
	// 회원가입 : 정보 입력
	String NAME = "이름";
	
	// 회원가입 : 아이디 중복확인
	String OVERLAP_ID = "이미 존재하는 아이디입니다.";
	
	String SIGN_UP_COMPLETE = "회원가입이 완료되었습니다.";
	
	// 메인
	String MAIN = "메인";
	String WALCOME = "WELCOME! :)";
	String LIST_SHOW = "목록보기";
	String POST = "글쓰기";
	String MY_POST_SHOW = "내가 쓴 글 보기";
	String MEM_INFO_SHOW = "회원정보 보기";
	
	// 게시글 1개 미만 안내문구
	String NEW_MEM = "게시글 1개 이상 작성 시 조회가 가능합니다.";
	
	// 작성 대기 중
	
	
	// 목록화면
	String LOOKUP_POST_NUMBER = "조회하고자 하는 게시글의 번호를 입력해주세요.";
	String MY_POST_LIST = "내가 쓴 글 목록";
	String MY_POST_WRITE = "내가 쓴 게시글";
	String NUMBER = "번호";
	String STORE = "가게";
	String STORE_NUMBER = "전화번호";
	String SELECT_NUM_POST = "게시물 번호를 선택하세요.";
	String SEARCH = "검색";
	String EXIT = "종료";
	String NEXT_PAGE = "다음목록보기";
	String PREVIOUS_PAGE = "이전목록보기";
	
	// 내가 쓴 글 보기
	String COMPLETE = "완료";
	String MODIFY = "수정";
	String DELETE = "삭제";
	String BACK = "뒤로가기";
	
	// 수정 시
	String MEM_INFO_MODIFY = "회원정보 수정";
	String MODIFY_COMPLETE = "수정 완료";
	String MODIFY_RETURN = "다시 수정";
	String MODIFY_POST = "게시글을 수정합니다.";
	String MORE_CHECK = "입력한 정보를 한 번 더 확인하세요.";
	String MODIFY_COMPLETE_MESSAGE = "수정이 완료되었습니다.";
	
	// 삭제 시
	String DELETE_CHECK = "정말로 삭제하시겠습니까?";
	String DELETE_COMPLETE = "삭제가 완료되었습니다.\n내가 쓴 글 목록으로 돌아갑니다.";
	String DELETE_CANCEL = "취소합니다.\n내가 쓴 글 목록으로 돌아갑니다.";
	
	// 회원정보 보기
	String MY_POST_COUNT = "내가 작성한 게시글 갯수";
	String TOTAL_PRICE = "밥값";
	String MODIFY_MEM_INFO = "회원정보 수정";
	
	// 선택
	String GRADE = "평점";
	String TYPE = "종류";
	String DISTANCE = "거리";
	String PRICE = "가격";
	String OPTION = "의견";
	
	// 타입 선택
	String CHINESE_FOOD = "중식";
	String KOREAN_FOOD = "한식";
	String JAPENES_FOOD = "일식";
	String WESTERN_FOOD = "양식";
	String SNACK_FOOD = "분식";
	String ETC = "기타";
	
	// 리뷰 시
	String REVIEW_LIST_SCREEN = "리뷰 목록 화면";
	String REVIEW_LIST = "리뷰 목록";
	String REVIEW_INFO = "리뷰하실 음식의 정보를 입력하세요.";
	String STORE_INPUT = "가게 이름을 입력해주세요.";
	String STORE_NUMBER_INPUT = "가게 전화번호를 입력해주세요.";
	String TYPE_INPUT = "종류를 입력해주세요.";
	String MENU_INPUT = "메뉴 이름을 입력해주세요.";
	String PRICE_INPUT = "가격을 입력해주세요.(원 생략)";
	String SCORE_INPUT = "평점을 입력해주세요.";
	String ONE_GRADE_OPTION = "돈 아깝다";
	String TWO_GRADE_OPTION = "아는 맛";
	String THREE_GRADE_OPTION = "찾아갈 정도는 아니지만 맛있다";
	String FOUR_GRADE_OPTION = "먹으러 찾아갈 만 하다";
	String FIVE_GRADE_OPTION = "인생 맛집";
	String CHECK_INPUT_MORE = "입력한 정보를 한번 더 확인하세요.";
	String INPUT_COMPLETE = "입력완료";
	String INPUT_RETURN = "다시입력";
	
	String DISTANCE_INPUT = "거리를 입력해주세요.(km)";
	
	String REVIEW_COMPLETE = "등록이 완료되었습니다..\n이전 화면으로 돌아갑니다";
	
	// 필터
	String FILTER_SELECT = "검색할 필터를 선택하세요.";
	String FILTER_ADD = "필터 추가";
	String RESULT = "결과";
	
	// 검색 시(평점)
	String GRADE_FILTER = "원하는 평점을 입력해주세요.(ex: 3점이상 → 3)";
	String ONE_GRADE = "1점";
	String TWO_GRADE = "2점";
	String THREE_GRADE = "3점";
	String FOUR_GRADE = "4점";
	String FIVE_GRADE = "5점";
	String MORE_THAN = "이상";
	String BELOW = "이하";
	String UNDER = "미만";
	
	// 검색 시(종류. 거리, 가격, 가게)
	String TYPE_FILTER = "원하는 종류를 선택하세요.";
	String DISTANCE_FILTER = "원하는 거리를 선택하세요.";
	String MIN_DISTANCE = "최소거리";
	String MAX_DISTANCE = "최대거리";
	String ZERO_FIVE_KM = "0.5km";
	String ONE_KM = "1km";
	String PRICE_FILTER = "원하는 가격을 선택하세요.";
	String FIVE_THOUSAND = "5,000원";
	String SIX_THOUSAND = "6,000원";
	String SEVEN_THOUSAND = "7,000원";
	String EIGHT_THOUSAND = "8,000원";
	String STORE_FILTER = "가게 이름을 입력하세요.(ex: 홍콩반점)";
	
	// 검색 없음
	String FILTER_NULL = "검색 결과가 없습니다";
	
	// 검색 결과
	String SEARCH_RESULT = "검색 결과";
	
	// 프로그램 종료
	String MORE_EXIT = "프로그램을 종료하시겠습니까?";
	String FINAL_EXIT = "프로그램을 종료합니다(ㅠㅠ)";
	
}

