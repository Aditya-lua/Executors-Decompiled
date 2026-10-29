package com.roblox.engine.jni.reporter;

import rk.a;
import rk.b;

/* JADX INFO: loaded from: classes2.dex */
public class SessionReporterJavaInterface {
    private static a sImplementation = new b();

    public static String getAppVersion() {
        return sImplementation.e();
    }

    public static String getFilesDir() {
        return sImplementation.a();
    }

    public static String getLastLoggedInUser() {
        return sImplementation.d();
    }

    public static String getLastLoggedInUserId() {
        return sImplementation.c();
    }

    public static void sendSessionReport(String str, String str2) {
        sImplementation.b(str, str2);
    }

    public static void setEventTrackingGoogleAnalytics(String str, String str2, String str3, long j10) {
        sImplementation.f(str, str2, str3, j10);
    }

    public static void setImplementation(a aVar) {
        if (aVar != null) {
            sImplementation = aVar;
        }
    }
}
