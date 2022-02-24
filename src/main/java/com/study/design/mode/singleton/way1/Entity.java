package com.study.design.mode.singleton.way1;

public class Entity {
    private static final Entity instance = new Entity();
    private Entity() {}

    public static Entity getInstance() {
        return instance;
    }
}
