package com.redemastery.oldapi.pojav.customcontrols.gamepad;

import org.lwjgl.glfw.CallbackBridge;

import com.redemastery.oldapi.pojav.GrabListener;

public class DefaultDataProvider implements GamepadDataProvider {
    public static final DefaultDataProvider INSTANCE = new DefaultDataProvider();

    // Cannot instantiate this class publicly
    private DefaultDataProvider() {}

    @Override
    public GamepadMap getGameMap() {
        return GamepadMapStore.getGameMap();
    }


    @Override
    public GamepadMap getMenuMap() {
        return GamepadMapStore.getMenuMap();
    }

    @Override
    public boolean isGrabbing() {
        return CallbackBridge.isGrabbing();
    }

    @Override
    public void attachGrabListener(GrabListener grabListener) {
        CallbackBridge.addGrabListener(grabListener);
    }

    @Override
    public void detachGrabListener(GrabListener grabListener) {
        CallbackBridge.removeGrabListener(grabListener);
    }
}
