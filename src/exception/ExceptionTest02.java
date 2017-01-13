package exception;

public class ExceptionTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
		int a=0;
		int b= 100 / a ;
		System.out.println("some codes1");
		}catch(Exception ex){
			
			System.out.println("예외발생-" + ex);
			//ex.printStackTrace();
			return;
		}finally{
			//주로 자원 정리 코드를 넣게 된다.
			System.out.println("some codes2");
		}
		System.out.println("some codes3");
	}

}
