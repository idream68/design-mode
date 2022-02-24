package com.study.design.mode.singleton.way4;

public enum Entity {
    INSTANCE;

    public static void doSomething() {
        System.out.println("do something");
    }
}
