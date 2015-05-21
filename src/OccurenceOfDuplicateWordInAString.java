import java.util.HashMap;
import java.util.Set;
import java.util.Map;



public class OccurenceOfDuplicateWordInAString {
  public static void main(String[] args) {
	
	  printDuplicateCharFromString("delhidell");
	  printDuplicateCharFromString("apple");
	  printDuplicateCharFromString("java");
}

private static void printDuplicateCharFromString(String string) {
	// TODO Auto-generated method stub
	char[] ch = string.toCharArray();
	Map<Character,Integer> m = new HashMap<Character,Integer>();
	for(Character c : ch){
		if(m.containsKey(c)){
			m.put(c, m.get(c) + 1);
		}
		else{
			m.put(c,1);
		}
	}
	
	Set<Map.Entry<Character,Integer>> entrySet = m.entrySet();
	 System.out.printf("List of duplicate characters in String '%s' %n", ch);
	 for(Map.Entry<Character,Integer> entry : entrySet){
		 if(entry.getValue() > 1)
			 System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
		 
	 }
}
	
}
