
public class Student<E> {
		E id;
		
		Student(E id){
			this.id = id;
		}
		
		E getId(){
			return id;
		}
		
	public static void main(String[] args) {
		Student<Double> s = new Student<Double>(12.0);
		System.out.println(s.getId());
	}	
}
