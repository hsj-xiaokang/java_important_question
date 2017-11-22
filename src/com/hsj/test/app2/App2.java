package com.hsj.test.app2;
/**
 * 结果：
 * Parent
   Children
 * @Description:TODO
 * @author:hsj qq:2356899074
 * @time:2017年11月22日 上午8:58:09
 */
class Parent {
    public Parent(){
	System.out.println("Parent");
    }
    public final int id = 10;
    
}

class Children extends Parent {
    public Children() {
	System.out.println("Children");
    }
    private final int id = 20;
}

public class App2 {
    public static void main(String[] args) {
	new Children();
    }
}

