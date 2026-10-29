package com.roblox.engine.jni.user;

import sk.a;

/* JADX INFO: loaded from: classes2.dex */
public class NativeUserJavaInterface {
    private static a sImplementation;

    public static String getAlternateName() {
        return sImplementation.a();
    }

    public static String getDisplayName() {
        return sImplementation.b();
    }

    public static boolean getHasRobloxSubscription() {
        return sImplementation.h();
    }

    public static boolean getIsUnder13() {
        return sImplementation.i();
    }

    public static int getMembershipType() {
        return sImplementation.c();
    }

    public static String getPlatformName() {
        return sImplementation.d();
    }

    public static String getTheme() {
        return sImplementation.e();
    }

    public static long getUserId() {
        return sImplementation.f();
    }

    public static String getUsername() {
        return sImplementation.g();
    }

    public static void setImplementation(a aVar) {
        if (aVar != null) {
            sImplementation = aVar;
        }
    }
}
