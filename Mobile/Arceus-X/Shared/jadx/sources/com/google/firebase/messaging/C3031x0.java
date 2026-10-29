package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.messaging.x0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3031x0 {

    /* JADX INFO: renamed from: d */
    public static WeakReference<C3031x0> f11351d;

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f11352a;

    /* JADX INFO: renamed from: b */
    public C3023t0 f11353b;

    /* JADX INFO: renamed from: c */
    public final Executor f11354c;

    public C3031x0(SharedPreferences sharedPreferences, Executor executor) {
        this.f11354c = executor;
        this.f11352a = sharedPreferences;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C3031x0 m14673a(Context context, Executor executor) {
        C3031x0 c3031x0;
        try {
            WeakReference<C3031x0> weakReference = f11351d;
            c3031x0 = weakReference != null ? weakReference.get() : null;
            if (c3031x0 == null) {
                c3031x0 = new C3031x0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                c3031x0.m14675c();
                f11351d = new WeakReference<>(c3031x0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c3031x0;
    }

    /* JADX INFO: renamed from: b */
    public synchronized C3029w0 m14674b() {
        return C3029w0.m14668a(this.f11353b.m14648e());
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m14675c() {
        this.f11353b = C3023t0.m14645c(this.f11352a, "topic_operation_queue", ",", this.f11354c);
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m14676d(C3029w0 c3029w0) {
        return this.f11353b.m14649f(c3029w0.m14672e());
    }
}
