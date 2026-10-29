package com.roblox.engine.jni.memstorage;

/* JADX INFO: loaded from: classes2.dex */
public class MemStorage {
    public static native Connection bind(String str, Callback callback);

    public static native void fire(String str, String str2);

    public static native String getItem(String str, String str2);

    public static native boolean hasItem(String str);

    public static native boolean removeItem(String str);

    public static native void setItem(String str, String str2);
}
