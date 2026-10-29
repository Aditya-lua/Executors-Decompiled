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

/* JADX INFO: renamed from: com.google.firebase.messaging.a1 */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC2978a1 implements Runnable {

    /* JADX INFO: renamed from: f */
    public static final Object f11231f = new Object();

    /* JADX INFO: renamed from: g */
    public static Boolean f11232g;

    /* JADX INFO: renamed from: h */
    public static Boolean f11233h;

    /* JADX INFO: renamed from: a */
    public final Context f11234a;

    /* JADX INFO: renamed from: b */
    public final C2995g0 f11235b;

    /* JADX INFO: renamed from: c */
    public final PowerManager.WakeLock f11236c;

    /* JADX INFO: renamed from: d */
    public final C3035z0 f11237d;

    /* JADX INFO: renamed from: e */
    public final long f11238e;

    /* JADX INFO: renamed from: com.google.firebase.messaging.a1$a */
    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public RunnableC2978a1 f11239a;

        public a(RunnableC2978a1 runnableC2978a1) {
            this.f11239a = runnableC2978a1;
        }

        /* JADX INFO: renamed from: a */
        public void m14465a() {
            if (RunnableC2978a1.m14463j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            RunnableC2978a1.this.f11234a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                RunnableC2978a1 runnableC2978a1 = this.f11239a;
                if (runnableC2978a1 == null) {
                    return;
                }
                if (runnableC2978a1.m14464i()) {
                    if (RunnableC2978a1.m14463j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f11239a.f11237d.m14688k(this.f11239a, 0L);
                    context.unregisterReceiver(this);
                    this.f11239a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public RunnableC2978a1(C3035z0 c3035z0, Context context, C2995g0 c2995g0, long j10) {
        this.f11237d = c3035z0;
        this.f11234a = context;
        this.f11238e = j10;
        this.f11235b = c2995g0;
        this.f11236c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* JADX INFO: renamed from: e */
    public static String m14459e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* JADX INFO: renamed from: f */
    public static boolean m14460f(Context context) {
        boolean zBooleanValue;
        synchronized (f11231f) {
            try {
                Boolean bool = f11233h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? m14461g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f11233h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m14461g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", m14459e(str));
        }
        return z10;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m14462h(Context context) {
        boolean zBooleanValue;
        synchronized (f11231f) {
            try {
                Boolean bool = f11232g;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? m14461g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f11232g = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m14463j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized boolean m14464i() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f11234a.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th2) {
            throw th2;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (m14462h(this.f11234a)) {
            this.f11236c.acquire(C2985d.f11259a);
        }
        try {
            try {
                try {
                    this.f11237d.m14689l(true);
                    if (!this.f11235b.m14560g()) {
                        this.f11237d.m14689l(false);
                        if (m14462h(this.f11234a)) {
                            try {
                                this.f11236c.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!m14460f(this.f11234a) || m14464i()) {
                        if (this.f11237d.m14692o()) {
                            this.f11237d.m14689l(false);
                        } else {
                            this.f11237d.m14693p(this.f11238e);
                        }
                        if (m14462h(this.f11234a)) {
                            this.f11236c.release();
                            return;
                        }
                        return;
                    }
                    new a(this).m14465a();
                    if (m14462h(this.f11234a)) {
                        try {
                            this.f11236c.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (Throwable th2) {
                    if (m14462h(this.f11234a)) {
                        try {
                            this.f11236c.release();
                        } catch (RuntimeException unused3) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                this.f11237d.m14689l(false);
                if (m14462h(this.f11234a)) {
                    this.f11236c.release();
                }
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
