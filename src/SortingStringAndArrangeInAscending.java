import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortingStringAndArrangeInAscending implements Comparator<String> {
	public static void main(String []a){
   List<String> list = new ArrayList <String>();
   SortingStringAndArrangeInAscending s = new SortingStringAndArrangeInAscending();
   list.add("sdfdgdfg");
   list.add("gd");
   list.add("trwwd");
   list.add("1");
   Collections.sort(list,s);
   System.out.println("In ascending order " + list);
	}
   
	public int compare(String o, String b){
		return  b.length() - o.length() ;
		
	}
}
