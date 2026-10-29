package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import p128ff.C5590e;
import p462u9.C11822m;

/* JADX INFO: renamed from: com.google.firebase.messaging.g0 */
/* JADX INFO: loaded from: classes2.dex */
public class C2995g0 {

    /* JADX INFO: renamed from: a */
    public final Context f11274a;

    /* JADX INFO: renamed from: b */
    public String f11275b;

    /* JADX INFO: renamed from: c */
    public String f11276c;

    /* JADX INFO: renamed from: d */
    public int f11277d;

    /* JADX INFO: renamed from: e */
    public int f11278e = 0;

    public C2995g0(Context context) {
        this.f11274a = context;
    }

    /* JADX INFO: renamed from: c */
    public static String m14554c(C5590e c5590e) {
        String strM25286d = c5590e.m25270n().m25286d();
        if (strM25286d != null) {
            return strM25286d;
        }
        String strM25285c = c5590e.m25270n().m25285c();
        if (!strM25285c.startsWith("1:")) {
            return strM25285c;
        }
        String[] strArrSplit = strM25285c.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public synchronized String m14555a() {
        try {
            if (this.f11275b == null) {
                m14561h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f11275b;
    }

    /* JADX INFO: renamed from: b */
    public synchronized String m14556b() {
        try {
            if (this.f11276c == null) {
                m14561h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f11276c;
    }

    /* JADX INFO: renamed from: d */
    public synchronized int m14557d() {
        PackageInfo packageInfoM14559f;
        try {
            if (this.f11277d == 0 && (packageInfoM14559f = m14559f("com.google.android.gms")) != null) {
                this.f11277d = packageInfoM14559f.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f11277d;
    }

    /* JADX INFO: renamed from: e */
    public synchronized int m14558e() {
        int i10 = this.f11278e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f11274a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C11822m.m44200g()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f11278e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f11278e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (C11822m.m44200g()) {
            this.f11278e = 2;
        } else {
            this.f11278e = 1;
        }
        return this.f11278e;
    }

    /* JADX INFO: renamed from: f */
    public final PackageInfo m14559f(String str) {
        try {
            return this.f11274a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m14560g() {
        return m14558e() != 0;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m14561h() {
        PackageInfo packageInfoM14559f = m14559f(this.f11274a.getPackageName());
        if (packageInfoM14559f != null) {
            this.f11275b = Integer.toString(packageInfoM14559f.versionCode);
            this.f11276c = packageInfoM14559f.versionName;
        }
    }
}
