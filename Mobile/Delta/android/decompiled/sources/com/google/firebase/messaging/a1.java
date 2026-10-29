package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class a1 implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f8738f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f8739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f8740h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8741a;
    public final g0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f8742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0 f8743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8744e;

    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a1 f8745a;

        public a(a1 a1Var) {
            this.f8745a = a1Var;
        }

        public void a() {
            if (a1.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            a1.this.f8741a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                a1 a1Var = this.f8745a;
                if (a1Var == null) {
                    return;
                }
                if (a1Var.i()) {
                    if (a1.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f8745a.f8743d.k(this.f8745a, 0L);
                    context.unregisterReceiver(this);
                    this.f8745a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public a1(z0 z0Var, Context context, g0 g0Var, long j10) {
        this.f8743d = z0Var;
        this.f8741a = context;
        this.f8744e = j10;
        this.b = g0Var;
        this.f8742c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    public static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (f8738f) {
            try {
                Boolean bool = f8740h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f8740h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    public static boolean h(Context context) {
        boolean zBooleanValue;
        synchronized (f8738f) {
            try {
                Boolean bool = f8739g;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f8739g = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public final synchronized boolean i() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f8741a.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th2) {
            throw th2;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (h(this.f8741a)) {
            this.f8742c.acquire(d.f8759a);
        }
        try {
            try {
                try {
                    this.f8743d.l(true);
                    if (!this.b.g()) {
                        this.f8743d.l(false);
                        if (h(this.f8741a)) {
                            try {
                                this.f8742c.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!f(this.f8741a) || i()) {
                        if (this.f8743d.o()) {
                            this.f8743d.l(false);
                        } else {
                            this.f8743d.p(this.f8744e);
                        }
                        if (h(this.f8741a)) {
                            this.f8742c.release();
                            return;
                        }
                        return;
                    }
                    new a(this).a();
                    if (h(this.f8741a)) {
                        try {
                            this.f8742c.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (Throwable th2) {
                    if (h(this.f8741a)) {
                        try {
                            this.f8742c.release();
                        } catch (RuntimeException unused3) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                this.f8743d.l(false);
                if (h(this.f8741a)) {
                    this.f8742c.release();
                }
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
