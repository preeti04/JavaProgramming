
public class SingletonClass {
	private static SingletonClass instance;
	
	private SingletonClass(){
		
	}

	public static SingletonClass getInstance(){
		if(instance == null)
			return new SingletonClass();
		else
			return instance;
	}
	public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }
     
    public static void main(String a[]){
    	SingletonClass ms = getInstance();
        ms.testMe();
    }

}

