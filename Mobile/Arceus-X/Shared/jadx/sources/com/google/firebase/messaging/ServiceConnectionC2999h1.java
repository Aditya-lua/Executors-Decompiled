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
import p445t9.C11555a;
import p488v9.ThreadFactoryC12109b;
import sb.C11264k;

/* JADX INFO: renamed from: com.google.firebase.messaging.h1 */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceConnectionC2999h1 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final Context f11282a;

    /* JADX INFO: renamed from: b */
    public final Intent f11283b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f11284c;

    /* JADX INFO: renamed from: d */
    public final Queue<a> f11285d;

    /* JADX INFO: renamed from: e */
    public BinderC2990e1 f11286e;

    /* JADX INFO: renamed from: f */
    public boolean f11287f;

    /* JADX INFO: renamed from: com.google.firebase.messaging.h1$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Intent f11288a;

        /* JADX INFO: renamed from: b */
        public final C11264k<Void> f11289b = new C11264k<>();

        public a(Intent intent) {
            this.f11288a = intent;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m14596b(a aVar) {
            aVar.getClass();
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar.f11288a.getAction() + " finishing.");
            aVar.m14598d();
        }

        /* JADX INFO: renamed from: c */
        public void m14597c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.f1
                @Override // java.lang.Runnable
                public final void run() {
                    ServiceConnectionC2999h1.a.m14596b(this.f11270a);
                }
            }, 20L, TimeUnit.SECONDS);
            m14599e().mo11889c(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.g1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        /* JADX INFO: renamed from: d */
        public void m14598d() {
            this.f11289b.m42330e(null);
        }

        /* JADX INFO: renamed from: e */
        public Task<Void> m14599e() {
            return this.f11289b.m42326a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ServiceConnectionC2999h1(Context context, String str) {
        this(context, str, m14590a());
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* JADX INFO: renamed from: a */
    public static ScheduledThreadPoolExecutor m14590a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC12109b("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: b */
    public final void m14591b() {
        while (!this.f11285d.isEmpty()) {
            this.f11285d.poll().m14598d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m14592c() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f11285d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                BinderC2990e1 binderC2990e1 = this.f11286e;
                if (binderC2990e1 == null || !binderC2990e1.isBinderAlive()) {
                    m14594e();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f11286e.m14521b(this.f11285d.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized Task<Void> m14593d(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.m14597c(this.f11284c);
            this.f11285d.add(aVar);
            m14592c();
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar.m14599e();
    }

    /* JADX INFO: renamed from: e */
    public final void m14594e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f11287f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f11287f) {
            return;
        }
        this.f11287f = true;
        try {
            if (C11555a.m43201b().m43205a(this.f11282a, this.f11283b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        this.f11287f = false;
        m14591b();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f11287f = false;
            if (iBinder instanceof BinderC2990e1) {
                this.f11286e = (BinderC2990e1) iBinder;
                m14592c();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            m14591b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m14592c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ServiceConnectionC2999h1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f11285d = new ArrayDeque();
        this.f11287f = false;
        Context applicationContext = context.getApplicationContext();
        this.f11282a = applicationContext;
        this.f11283b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f11284c = scheduledExecutorService;
    }
}
