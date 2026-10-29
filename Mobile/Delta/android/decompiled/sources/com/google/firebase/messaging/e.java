package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f8763a;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f8764c;

    public e(Context context, h0 h0Var, ExecutorService executorService) {
        this.f8763a = executorService;
        this.b = context;
        this.f8764c = h0Var;
    }

    public boolean a() {
        if (this.f8764c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        d0 d0VarD = d();
        c.a aVarE = c.e(this.b, this.f8764c);
        e(aVarE.f8754a, d0VarD);
        c(aVarE);
        return true;
    }

    public final boolean b() {
        if (((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!u9.m.e()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    if (runningAppProcessInfo.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void c(c.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.b.getSystemService("notification")).notify(aVar.b, aVar.f8755c, aVar.f8754a.c());
    }

    public final d0 d() {
        d0 d0VarD = d0.d(this.f8764c.p("gcm.n.image"));
        if (d0VarD != null) {
            d0VarD.f(this.f8763a);
        }
        return d0VarD;
    }

    public final void e(k2.k.f fVar, d0 d0Var) {
        if (d0Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) sb.m.b(d0Var.e(), 5L, TimeUnit.SECONDS);
            fVar.s(bitmap);
            fVar.B(new k2.k.c().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            d0Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            d0Var.close();
        }
    }
}
