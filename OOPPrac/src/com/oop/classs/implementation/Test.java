package com.oop.classs.implementation;

public class Test {
public static void main(String[]args){
	
	Women w= null;
	
	w=new Mom();
	w.occupation();
	w.task();
	System.out.println("aaaa");
	
	w= new Sister();
	w.occupation();
	w.task();
	System.out.println("bbbb");
}
}
