package com.roblox.engine.jni.reporter;

import p415rk.C10892b;
import p415rk.InterfaceC10891a;

/* JADX INFO: loaded from: classes2.dex */
public class SessionReporterJavaInterface {
    private static InterfaceC10891a sImplementation = new C10892b();

    public static String getAppVersion() {
        return sImplementation.mo37350e();
    }

    public static String getFilesDir() {
        return sImplementation.mo37346a();
    }

    public static String getLastLoggedInUser() {
        return sImplementation.mo37349d();
    }

    public static String getLastLoggedInUserId() {
        return sImplementation.mo37348c();
    }

    public static void sendSessionReport(String str, String str2) {
        sImplementation.mo37347b(str, str2);
    }

    public static void setEventTrackingGoogleAnalytics(String str, String str2, String str3, long j10) {
        sImplementation.mo37351f(str, str2, str3, j10);
    }

    public static void setImplementation(InterfaceC10891a interfaceC10891a) {
        if (interfaceC10891a != null) {
            sImplementation = interfaceC10891a;
        }
    }
}
