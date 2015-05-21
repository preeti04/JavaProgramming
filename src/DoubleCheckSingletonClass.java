
public class DoubleCheckSingletonClass {
	public static volatile DoubleCheckSingletonClass instance;
	
	private DoubleCheckSingletonClass(){
		
	}
	
	public static DoubleCheckSingletonClass getInstance(){
		if(instance == null){
			synchronized (DoubleCheckSingletonClass.class) {
				if(instance == null)
					instance = new DoubleCheckSingletonClass();
					
				
			}
		}
		return instance;
	}
	
	public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }
     
    public static void main(String a[]){
    	DoubleCheckSingletonClass ms = getInstance();
        ms.testMe();
    }
}
