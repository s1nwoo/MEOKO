package meoko.view;

//향후 extends 되는 다국어 버전의
//메서드를 강제하기 위하여,
//super class에게 ViewMenuIF 를 implements 시킴
public interface ViewMenuIF {

	void selectLang(); // V0

	public void fristView(); // V1

	public void idInputScreen(); // V1_1

	public void pwInputScreen(); // V1_1a

	public void loginFailScreen(); // V1_1b

	public void signUpNameInput(); // V1_2

	public void signUpIdInput(); // V1_2a

	public void signUpIdOverlap(); // V1_2b

	public void signUpPwInput(); // V1_2c

	public void signUpComplete(); // V1_2c_1

	public void mainMenu(); // V2

	public void newMemNotice(); // V2_1

	public void postListScreen(); // V2_3

	public void postDetailsScreen(); // V2_3a

	public void deleteCheck(); // V2_3b

	public void deleteCompete(); // V2_3b_1

	public void deleteCancel(); // V2_3b_2

	public void myInfoScreen(); // V2_4

	public void myInfoModifyNameInput(); // V2_4_1

	public void myInfoModifyPwInput(); // V2_4_1a

	public void myInfoModifyMoreCheck(); // V2_4_1b

	public void myInfoModifyComplete(); // V2_4_1c

	public void reviewList(); // V3

	public void postStoreNameInput(); // V3_1

	public void postStoreNumberInput(); // V3_1a

	public void postTypeInput(); // V3_1b

	public void postDistanceInput(); // V3_1c

	public void postMenuInput(); // V3_1d

	public void postPriceInput(); // V3_1e

	public void postGradeInput(); // V3_1f

	public void postInputCheck(); // V3_1g

	public void reviewComplete(); // V3_1h

	public void filterSelect(); // V3_2

	public void filterGrade(); // V3_2_1

	public void filterType(); // V3_2_2

	public void filterDistance(); // V3_2_3

	public void filterPrice(); // V3_2_4

	public void filterStore(); // V3_2_5

	public void filterAdd(); // V3_2_0

	public void searchResult(); // V3_2_0a

	public void searchResultNull(); // V3_3

	public void exitCheck(); // V4

	public void exitFinal(); // V4_1
	
	public void wrongValue();//  ???
	
	public void inputMark(); // ???		

}
