package com.hsj.test.app1;
/**
 * 结果：
 * 10
 * 不可访问
 * @Description:TODO
 * @author:hsj qq:2356899074
 * @time:2017年11月22日 上午8:58:34
 */
class Parent {
    private int id = 10;
    public int age = 10;
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
}

class Children extends Parent {
    public int id = 10;
    private int age = 20;
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
}

public class App1 {
    public static void main(String[] args) {
	System.out.println(new Children().id);
	//覆盖了父亲的变量，自己的却是private的，那么不可以访问
//	System.out.println(new Children().age);
    }
}

