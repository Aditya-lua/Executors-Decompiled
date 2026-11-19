package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class i1 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8689a;
    public final Intent b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f8690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Queue<a> f8691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f1 f8692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8693f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f8694a;
        public final tb.k<Void> b = new tb.k<>();

        public a(Intent intent) {
            this.f8694a = intent;
        }

        public static /* synthetic */ void b(a aVar) {
            aVar.getClass();
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar.f8694a.getAction() + " finishing.");
            aVar.d();
        }

        public void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.g1
                @Override // java.lang.Runnable
                public final void run() {
                    i1.a.b(this.f8683a);
                }
            }, 20L, TimeUnit.SECONDS);
            e().c(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.h1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        public void d() {
            this.b.e(null);
        }

        public Task<Void> e() {
            return this.b.a();
        }
    }

    public i1(Context context, String str) {
        this(context, str, a());
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new w9.b("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    public final void b() {
        while (!this.f8691d.isEmpty()) {
            this.f8691d.poll().d();
        }
    }

    public final synchronized void c() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f8691d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                f1 f1Var = this.f8692e;
                if (f1Var == null || !f1Var.isBinderAlive()) {
                    e();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f8692e.b(this.f8691d.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized Task<Void> d(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f8690c);
            this.f8691d.add(aVar);
            c();
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar.e();
    }

    public final void e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f8693f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f8693f) {
            return;
        }
        this.f8693f = true;
        try {
            if (u9.a.b().a(this.f8689a, this.b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        this.f8693f = false;
        b();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f8693f = false;
            if (iBinder instanceof f1) {
                this.f8692e = (f1) iBinder;
                c();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        c();
    }

    public i1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f8691d = new ArrayDeque();
        this.f8693f = false;
        Context applicationContext = context.getApplicationContext();
        this.f8689a = applicationContext;
        this.b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f8690c = scheduledExecutorService;
    }
}
