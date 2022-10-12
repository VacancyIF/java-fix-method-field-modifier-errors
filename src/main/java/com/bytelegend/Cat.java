package com.bytelegend;

public class Cat extends Pet {
    private final int age;
    private final String desc;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
        this.desc = buildDescription();
    }

    protected String buildDescription() {
        return "I am a cat named " + getName() + " and I am " + age + " years old";
    }

    @Override
    public void describeMyself() {
        System.out.println(desc);
    }
}
