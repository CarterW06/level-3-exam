import java.util.*;
import java.util.Map.Entry;

public class HashMapCalculator {
	public static void main(String[] args) throws Exception {
		new Level3CodingExam().testAddMatching();
	}

	public int commonKeyValuePairs(HashMap<String, String> hm1, HashMap<String, String> hm2) {
		int numberOfPairs = 0;
		Set<Entry<String, String>> me2 = hm2.entrySet();
		HashMap<String, String> hmss = hm1;
		for (Entry<String, String> ess1 : me2) {
			hmss.put(ess1.getKey(), ess1.getValue());
		}
		Set<Entry<String, String>> esshmss2 = hmss.entrySet();
		for(Entry<String, String> ess2 : esshmss2) {
			for(Entry<String, String> ess3 : esshmss2) {
				if(ess2.getValue().equals(ess3.getValue())) {
					numberOfPairs++;
				}
			}
		}
		return numberOfPairs / 4;
	}
}
