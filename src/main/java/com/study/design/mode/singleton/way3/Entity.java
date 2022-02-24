package com.study.design.mode.singleton.way3;

public class Entity {
    private static class EntityInstance {
        private static final Entity INSTANCE = new Entity();
    }

    private Entity() {}

    public static Entity getInstance() {
        return EntityInstance.INSTANCE;
    }
}
