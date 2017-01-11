package person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s= new Student();
		Student s2= new Student("둘리");
		
		Person p= s; //Upcasting, Implicity
		Student s3= (Student)p;//DownCasting, explicity 명시적으로 적어줘야한다.
	
		
		
		//레퍼런스 p로 객체의 기능 사용하다가..
		//자식의 메소드를 사용해야 되는 경우
		//(Student)p.test(); // 에러 
		
		((Student)p).test(); //캐스팅해서 접근해야한다.
	}

}
