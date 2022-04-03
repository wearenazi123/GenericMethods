package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GenericMethods gm =new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f(gm);
    }
}
