package com.roblox.engine.jni.locale;

import pk.C10291a;

/* JADX INFO: loaded from: classes2.dex */
public class NativeLocaleJavaInterface {
    private static C10291a sImplementation = new C10291a();

    public static String getGameLocale() {
        return sImplementation.mo37343a();
    }

    public static String getLocale() {
        return sImplementation.mo37344b();
    }

    public static String getRobloxLocale() {
        return sImplementation.mo37345c();
    }

    public static void setImplementation(C10291a c10291a) {
        sImplementation = c10291a;
    }
}
