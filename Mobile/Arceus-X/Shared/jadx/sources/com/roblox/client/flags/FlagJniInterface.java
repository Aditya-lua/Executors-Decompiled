package com.roblox.client.flags;

/* JADX INFO: loaded from: classes2.dex */
public class FlagJniInterface {
    public static native boolean nativeGetFFlag(String str, boolean z10);

    public static native int nativeGetFInt(String str, int i10);

    public static native String nativeGetFString(String str, String str2);

    public static native NativeFlagsInitResult nativeInitializeNativeFlags(String[] strArr);

    public static native void nativeRegisterFFlag(String str, int i10);

    public static native void nativeRegisterFInt(String str, int i10);

    public static native void nativeRegisterFString(String str, int i10);
}
