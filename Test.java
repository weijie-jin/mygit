public class Test {
	public static void main(String [] args){
		Student p1 = new Student("³Â½Ü",100);
		Student p2 = new Student();
		p2.name = "Àî·¼";
		p2.grade = 90;
		
		p1.speak();
		p2.speak();
		
	}
}