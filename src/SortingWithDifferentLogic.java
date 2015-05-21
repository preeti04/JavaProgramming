
public class SortingWithDifferentLogic {
 public static void main(String[] args) {
	String [] a = {"rt", " eete", "tet ", " reg "};
	String temp ="";
	for(int i = 0; i<a.length; i++){
		for(int j=i+1;j<a.length; j++){
			 if(a[i].compareTo(a[j])<0)
	         {
	             temp= a[j];
	             a[j]= a[i]; 
	             a[i]=temp;


	         }
			 
		}
		System.out.println("New array is " + a[i]);
	}
}
}
