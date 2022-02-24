package com.study.design.mode.singleton.way2;


public class Entity {
    private static volatile Entity entity;

    private Entity() {}

    public static Entity getInstance() {
        if (entity == null) {
            synchronized (Entity.class) {
                if (entity == null) {
                    entity = new Entity();
                }
            }
        }
        return entity;
    }
}
