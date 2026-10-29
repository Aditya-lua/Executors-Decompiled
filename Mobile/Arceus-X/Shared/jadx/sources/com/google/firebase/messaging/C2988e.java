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
import p235k2.C7419k;
import p462u9.C11822m;
import sb.C11268m;

/* JADX INFO: renamed from: com.google.firebase.messaging.e */
/* JADX INFO: loaded from: classes2.dex */
public class C2988e {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f11264a;

    /* JADX INFO: renamed from: b */
    public final Context f11265b;

    /* JADX INFO: renamed from: c */
    public final C2998h0 f11266c;

    public C2988e(Context context, C2998h0 c2998h0, ExecutorService executorService) {
        this.f11264a = executorService;
        this.f11265b = context;
        this.f11266c = c2998h0;
    }

    /* JADX INFO: renamed from: a */
    public boolean m14515a() {
        if (this.f11266c.m14570a("gcm.n.noui")) {
            return true;
        }
        if (m14516b()) {
            return false;
        }
        C2986d0 c2986d0M14518d = m14518d();
        C2982c.a aVarM14488e = C2982c.m14488e(this.f11265b, this.f11266c);
        m14519e(aVarM14488e.f11251a, c2986d0M14518d);
        m14517c(aVarM14488e);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14516b() {
        if (((KeyguardManager) this.f11265b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!C11822m.m44198e()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f11265b.getSystemService("activity")).getRunningAppProcesses();
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

    /* JADX INFO: renamed from: c */
    public final void m14517c(C2982c.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f11265b.getSystemService("notification")).notify(aVar.f11252b, aVar.f11253c, aVar.f11251a.m30780c());
    }

    /* JADX INFO: renamed from: d */
    public final C2986d0 m14518d() {
        C2986d0 c2986d0M14510d = C2986d0.m14510d(this.f11266c.m14584p("gcm.n.image"));
        if (c2986d0M14510d != null) {
            c2986d0M14510d.m14514f(this.f11264a);
        }
        return c2986d0M14510d;
    }

    /* JADX INFO: renamed from: e */
    public final void m14519e(C7419k.f fVar, C2986d0 c2986d0) {
        if (c2986d0 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) C11268m.m42332b(c2986d0.m14513e(), 5L, TimeUnit.SECONDS);
            fVar.m30795s(bitmap);
            fVar.m30772B(new C7419k.c().m30762i(bitmap).m30761h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            c2986d0.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            c2986d0.close();
        }
    }
}
