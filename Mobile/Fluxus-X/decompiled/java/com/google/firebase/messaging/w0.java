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

/* JADX INFO: loaded from: classes2.dex */
public class w0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8731a;
    public final PowerManager.WakeLock b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseMessaging f8732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    public ExecutorService f8733d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new w9.b("firebase-iid-executor"));

    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public w0 f8734a;
        public Context b;

        public a(w0 w0Var) {
            this.f8734a = w0Var;
        }

        public void a() {
            if (w0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            w0 w0Var = this.f8734a;
            if (w0Var != null) {
                Context contextB = w0Var.b();
                this.b = contextB;
                contextB.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            w0 w0Var = this.f8734a;
            if (w0Var != null && w0Var.d()) {
                if (w0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f8734a.f8732c.l(this.f8734a, 0L);
                Context context2 = this.b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f8734a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public w0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f8732c = firebaseMessaging;
        this.f8731a = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public Context b() {
        return this.f8732c.m();
    }

    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean e() throws IOException {
        try {
            if (this.f8732c.k() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e10) {
            if (!b0.h(e10.getMessage())) {
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
        if (s0.b().e(b())) {
            this.b.acquire();
        }
        try {
            this.f8732c.y(true);
            if (!this.f8732c.x()) {
                this.f8732c.y(false);
            } else if (!s0.b().d(b()) || d()) {
                if (e()) {
                    this.f8732c.y(false);
                } else {
                    this.f8732c.C(this.f8731a);
                }
            } else {
                new a(this).a();
            }
        } catch (IOException e10) {
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
            this.f8732c.y(false);
        } finally {
            if (s0.b().e(b())) {
                this.b.release();
            }
        }
    }
}
