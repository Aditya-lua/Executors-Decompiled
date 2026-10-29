package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8770a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f8771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8773e = 0;

    public g0(Context context) {
        this.f8770a = context;
    }

    public static String c(ef.e eVar) {
        String strD = eVar.n().d();
        if (strD != null) {
            return strD;
        }
        String strC = eVar.n().c();
        if (!strC.startsWith("1:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public synchronized String a() {
        try {
            if (this.b == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.b;
    }

    public synchronized String b() {
        try {
            if (this.f8771c == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f8771c;
    }

    public synchronized int d() {
        PackageInfo packageInfoF;
        try {
            if (this.f8772d == 0 && (packageInfoF = f("com.google.android.gms")) != null) {
                this.f8772d = packageInfoF.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f8772d;
    }

    public synchronized int e() {
        int i10 = this.f8773e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f8770a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!u9.m.g()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f8773e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f8773e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (u9.m.g()) {
            this.f8773e = 2;
        } else {
            this.f8773e = 1;
        }
        return this.f8773e;
    }

    public final PackageInfo f(String str) {
        try {
            return this.f8770a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public boolean g() {
        return e() != 0;
    }

    public final synchronized void h() {
        PackageInfo packageInfoF = f(this.f8770a.getPackageName());
        if (packageInfoF != null) {
            this.b = Integer.toString(packageInfoF.versionCode);
            this.f8771c = packageInfoF.versionName;
        }
    }
}
