package com.wunai.design.build;

public class BuildProduct2 implements  IBuild{
    @Override
    public void createUnit1() {
        System.out.println("步骤1");
    }

    @Override
    public void createUnit2() {
        System.out.println("步骤2");
    }

    @Override
    public void createUnit3() {
        System.out.println("步骤3");
    }

    @Override
    public Product composite() {
        System.out.println("生成成功！");
        return null;
    }
}
