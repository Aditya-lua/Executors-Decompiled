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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p488v9.ThreadFactoryC12109b;

/* JADX INFO: renamed from: com.google.firebase.messaging.v0 */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC3027v0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final long f11335a;

    /* JADX INFO: renamed from: b */
    public final PowerManager.WakeLock f11336b;

    /* JADX INFO: renamed from: c */
    public final FirebaseMessaging f11337c;

    /* JADX INFO: renamed from: d */
    @SuppressLint({"ThreadPoolCreation"})
    public ExecutorService f11338d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC12109b("firebase-iid-executor"));

    /* JADX INFO: renamed from: com.google.firebase.messaging.v0$a */
    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public RunnableC3027v0 f11339a;

        /* JADX INFO: renamed from: b */
        public Context f11340b;

        public a(RunnableC3027v0 runnableC3027v0) {
            this.f11339a = runnableC3027v0;
        }

        /* JADX INFO: renamed from: a */
        public void m14667a() {
            if (RunnableC3027v0.m14663c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            RunnableC3027v0 runnableC3027v0 = this.f11339a;
            if (runnableC3027v0 != null) {
                Context contextM14664b = runnableC3027v0.m14664b();
                this.f11340b = contextM14664b;
                contextM14664b.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC3027v0 runnableC3027v0 = this.f11339a;
            if (runnableC3027v0 != null && runnableC3027v0.m14665d()) {
                if (RunnableC3027v0.m14663c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f11339a.f11337c.m14430l(this.f11339a, 0L);
                Context context2 = this.f11340b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f11339a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public RunnableC3027v0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f11337c = firebaseMessaging;
        this.f11335a = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) m14664b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f11336b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m14663c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX INFO: renamed from: b */
    public Context m14664b() {
        return this.f11337c.m14431m();
    }

    /* JADX INFO: renamed from: d */
    public boolean m14665d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m14664b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: e */
    public boolean m14666e() throws IOException {
        try {
            if (this.f11337c.m14429k() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e10) {
            if (!C2980b0.m14473h(e10.getMessage())) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (C3019r0.m14637b().m14641e(m14664b())) {
            this.f11336b.acquire();
        }
        try {
            this.f11337c.m14441z(true);
            if (!this.f11337c.m14439x()) {
                this.f11337c.m14441z(false);
            } else if (!C3019r0.m14637b().m14640d(m14664b()) || m14665d()) {
                if (m14666e()) {
                    this.f11337c.m14441z(false);
                } else {
                    this.f11337c.m14427D(this.f11335a);
                }
            } else {
                new a(this).m14667a();
            }
        } catch (IOException e10) {
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
            this.f11337c.m14441z(false);
        } finally {
            if (C3019r0.m14637b().m14641e(m14664b())) {
                this.f11336b.release();
            }
        }
    }
}
