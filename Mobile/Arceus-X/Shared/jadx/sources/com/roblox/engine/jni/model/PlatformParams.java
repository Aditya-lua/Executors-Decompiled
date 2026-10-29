package com.roblox.engine.jni.model;

/* JADX INFO: loaded from: classes2.dex */
public class PlatformParams {
    public String assetFolderPath;
    public float dpiScale;
    public boolean isKeyboardDevice;
    public boolean isMouseDevice;
    public boolean isTouchDevice;
    public int viewportHeightMm;
    public int viewportWidthMm;

    /* JADX INFO: renamed from: a */
    public void mo15828a(PlatformParams platformParams) {
        if (platformParams != null) {
            this.isTouchDevice = platformParams.isTouchDevice;
            this.isMouseDevice = platformParams.isMouseDevice;
            this.isKeyboardDevice = platformParams.isKeyboardDevice;
            this.dpiScale = platformParams.dpiScale;
            this.viewportWidthMm = platformParams.viewportWidthMm;
            this.viewportHeightMm = platformParams.viewportHeightMm;
            this.assetFolderPath = platformParams.assetFolderPath;
        }
    }
}
