
import java.util.*;

public class VoteProcessor {
	public String calculateElectionWinner(ArrayList<String> votes) {
		int name1Count = 0, name2Count = 0;
		boolean foundName1 = false, foundName2 = false;
		String name1 = "", name2 = "";
		for(String name : votes) {
			name.toLowerCase();
			if(foundName1 == false) {
				foundName1 = true;
				name1 = name;
				name1Count++;
			} else if(foundName2 == false) {
				foundName2 = true;
				name2 = name;
				name2Count++;
			} else if(foundName1 == true && name.equalsIgnoreCase(name1)) {
				name1Count++;
			} else if(foundName2 == true && name.equalsIgnoreCase(name2)) {
				name2Count++;
			}
		}
		name1.toLowerCase();
		name2.toLowerCase();
		if(name1Count > name2Count) {
			return name1;
		} else if(name2Count > name1Count) {
			return name2;
		} else if(name1Count == name2Count) {
			return "TIE";
		} else {
			return "ERROR";
		}
	}
	
	public static void main(String[] args) {
		Level3CodingExam l3ce = new Level3CodingExam();
		l3ce.testWinner();
		l3ce.testATie();
	}
}
