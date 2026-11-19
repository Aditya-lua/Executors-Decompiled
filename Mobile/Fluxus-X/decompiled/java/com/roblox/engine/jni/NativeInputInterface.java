package com.roblox.engine.jni;

/* JADX INFO: loaded from: classes2.dex */
public class NativeInputInterface {
    public static native void nativeGamepadAxisEvent(int i10, int i11, float f10, float f11, float f12);

    public static native void nativeGamepadButtonEvent(int i10, int i11, int i12);

    public static native void nativeGamepadConnectEventWithGamepadType(int i10, int i11);

    public static native void nativeGamepadDisconnectEvent(int i10);

    public static native boolean nativeGetMainWindowIsMouseLockedCenter();

    public static native void nativePassAccelerometerChange(float f10, float f11, float f12);

    public static native void nativePassGravityChange(float f10, float f11, float f12);

    public static native void nativePassGyroscopeChange(float f10, float f11, float f12, float f13, float f14, float f15, float f16);

    public static native void nativePassInput(int i10, float f10, float f11, int i11, int i12, int i13);

    public static native void nativePassInputBatch(int[] iArr, float[] fArr, int i10, int i11, int i12, int i13);

    public static native void nativePassLongPressGesture(int i10, float f10, float f11);

    public static native void nativePassMouseButton(float f10, float f11, boolean z10, int i10);

    public static native void nativePassMouseMove(float f10, float f11, float f12, float f13);

    public static native void nativePassMousePan(float f10, float f11, float f12, float f13);

    public static native void nativePassMousePinch(float f10, float f11, float f12);

    public static native void nativePassMouseWheel(float f10, float f11, float f12);

    public static native void nativePassPanGestureMultitouch(int i10, float[] fArr, float f10, float f11, float f12, float f13);

    public static native void nativePassPanGestureWithVelocity(int i10, float f10, float f11, float f12, float f13, float f14, float f15);

    public static native void nativePassPinchGesture(int i10, float f10, float f11, float f12, float f13, float f14, float f15);

    public static native void nativePassRotateGesture(int i10, float f10, float f11, float f12, float f13, float f14, float f15);

    public static native void nativePassSwipeGesture(int i10, float f10, float f11);

    public static native void nativePassTapGesture(float f10, float f11);

    public static native void nativePassTouchEndVelocity(int i10, float f10, float f11);

    public static native void nativeSetAccelerometerEnabled(boolean z10);

    public static native void nativeSetGamepadSupportedKeyWithGamepadType(int i10, int i11, boolean z10, int i12);

    public static native void nativeSetGamepadSupportedMotionWithGamepadType(int i10, int i11, int i12, boolean z10, int i13);

    public static native void nativeSetGyroscopeEnabled(boolean z10);

    public static native void nativeSetTVRemoteSupportedKey(int i10, int i11, boolean z10);

    public static native void nativeSignalGameStreamingResolutionReady();

    public static native void nativeTVRemoteButtonEvent(int i10, int i11, int i12);

    public static native void nativeTVRemoteConnectEvent(int i10);

    public static native void nativeTVRemoteDisconnectEvent(int i10);

    public static native void nativeUpdateScreenOrientation(int i10);
}
