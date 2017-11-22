package com.hsj.test.app;
/**
 * 结果:
 * 1
 * 2
 * 
 * @Description:TODO
 * @author:hsj qq:2356899074
 * @time:2017年11月22日 上午8:52:28
 */
public class App {
    
    /**如果是在静态代码块下面就不可引用，有先后！**/
    private static int TEMP = 1;
    
    static {
	System.out.println(TEMP);
	TEMP = 2;
    }
    
    public static void init() {
	System.out.println(TEMP);
	TEMP = 1;
    }
    
    public static void main(String[] args) {
	init();
    }
    
}