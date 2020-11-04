package meoko.function;

import java.util.ArrayList;
import java.util.Map;

import meoko.object.Mco;

public interface ManagerIF {

	boolean input(Map<String, String> map);
	boolean modify(Map<String, String> map);
	boolean delete(Map<String, String> map);
	ArrayList<Mco> search(Map<String, String> map);
	
}
