package com.wunai.design.build;

public class Director {

    public IBuild build;
    public Director(IBuild build){
        this.build = build;
    }

    public Product build(){
        build.createUnit1();
        build.createUnit2();
        build.createUnit3();
        return build.composite();
    }

    public static void main(String[] args) {
        IBuild build = new BuildProduct();
        Director director = new Director(build);
        Product p = director.build();
    }
}
