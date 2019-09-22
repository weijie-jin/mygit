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

//定义一个开车的类
public class TestDriver {
	public static void main(String[] args){
		Car aodi = new Aodi();   //创建一个奥迪车
		Car byd = new Byd();
		//开车
		aodi.run();
		byd.run();
	}
	
}
