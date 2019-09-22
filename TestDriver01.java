//车接口
 interface Car{
	//车会跑
	void run();
	
}
//实现车接口的类
class Aodi implements Car{
	public void run(){
		System.out.println("奥迪车在跑");
		
	}
}

class Byd implements Car{
	public void run(){
		System.out.println("比亚迪在跑");
		
	}
}

//车工厂

class CarFactory{
	public static Car create(String str){
		if(str.equals("奥迪")){
     		return new Aodi();
		}
		else if(str.equals("比亚迪")){
			return new Byd();
		}
		return null;
	}
}

//定义一个开车的类
public class TestDriver01{
	public static void main(String[] args){
		Car aodi = CarFactory.create("奥迪");
		Car byd = CarFactory.create("比亚迪");
		//开车
		aodi.run();
		byd.run();
	}
}