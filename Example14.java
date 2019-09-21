interface Animal{
	//定义抽象方法shout()
	void shout();
	
} 
//定义Cat类实现Animal接口
class Cat implements Animal{
	//实现抽象方法shout()
	public void shout (){
		System.out.println("喵喵……");
		
	}
	//定义sleep()方法
	void sleep(){
		System.out.println("猫睡觉……");
		
	}
}

public class Example14{
	public static void main(String args []){
		Cat cat = new Cat();
		animalShout(cat);     //调用animalShout()方法，将cat作为参数传入
		
	}
	//定义静态方法animalShout(), 接收一个Animal类型的参数
	public static void animalShout(Animal animal ){
		Cat cat = (Cat )animal;
		cat.shout();
		cat.sleep();
	}
	
}