package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;
import p407rb.C10807a;

/* JADX INFO: renamed from: com.google.firebase.messaging.c1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2984c1 {

    /* JADX INFO: renamed from: a */
    public static final long f11256a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b */
    public static final Object f11257b = new Object();

    /* JADX INFO: renamed from: c */
    public static C10807a f11258c;

    /* JADX INFO: renamed from: b */
    public static void m14502b(Context context) {
        if (f11258c == null) {
            C10807a c10807a = new C10807a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f11258c = c10807a;
            c10807a.m41175d(true);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m14503c(@NonNull Intent intent) {
        synchronized (f11257b) {
            try {
                if (f11258c != null && m14504d(intent)) {
                    m14506f(intent, false);
                    f11258c.m41174c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m14504d(@NonNull Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    @SuppressLint({"TaskMainThread"})
    /* JADX INFO: renamed from: e */
    public static void m14505e(Context context, ServiceConnectionC2999h1 serviceConnectionC2999h1, final Intent intent) {
        synchronized (f11257b) {
            try {
                m14502b(context);
                boolean zM14504d = m14504d(intent);
                m14506f(intent, true);
                if (!zM14504d) {
                    f11258c.m41172a(f11256a);
                }
                serviceConnectionC2999h1.m14593d(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.b1
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        C2984c1.m14503c(intent);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m14506f(@NonNull Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    /* JADX INFO: renamed from: g */
    public static ComponentName m14507g(@NonNull Context context, @NonNull Intent intent) {
        synchronized (f11257b) {
            try {
                m14502b(context);
                boolean zM14504d = m14504d(intent);
                m14506f(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zM14504d) {
                    f11258c.m41172a(f11256a);
                }
                return componentNameStartService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
