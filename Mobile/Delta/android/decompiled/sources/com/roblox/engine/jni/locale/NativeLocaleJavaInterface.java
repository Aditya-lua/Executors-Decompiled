package com.roblox.engine.jni.locale;

import pk.a;

/* JADX INFO: loaded from: classes2.dex */
public class NativeLocaleJavaInterface {
    private static a sImplementation = new a();

    public static String getGameLocale() {
        return sImplementation.a();
    }

    public static String getLocale() {
        return sImplementation.b();
    }

    public static String getRobloxLocale() {
        return sImplementation.c();
    }

    public static void setImplementation(a aVar) {
        sImplementation = aVar;
    }
}
