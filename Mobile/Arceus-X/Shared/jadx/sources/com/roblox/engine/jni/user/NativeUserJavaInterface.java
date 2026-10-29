package com.roblox.engine.jni.user;

import sk.C11390a;

/* JADX INFO: loaded from: classes2.dex */
public class NativeUserJavaInterface {
    private static C11390a sImplementation;

    public static String getAlternateName() {
        return sImplementation.mo37352a();
    }

    public static String getDisplayName() {
        return sImplementation.mo37353b();
    }

    public static boolean getHasRobloxSubscription() {
        return sImplementation.mo37358h();
    }

    public static boolean getIsUnder13() {
        return sImplementation.mo37359i();
    }

    public static int getMembershipType() {
        return sImplementation.mo37354c();
    }

    public static String getPlatformName() {
        return sImplementation.m42709d();
    }

    public static String getTheme() {
        return sImplementation.mo37355e();
    }

    public static long getUserId() {
        return sImplementation.mo37356f();
    }

    public static String getUsername() {
        return sImplementation.mo37357g();
    }

    public static void setImplementation(C11390a c11390a) {
        if (c11390a != null) {
            sImplementation = c11390a;
        }
    }
}
