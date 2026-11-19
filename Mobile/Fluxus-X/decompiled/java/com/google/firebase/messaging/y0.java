package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static WeakReference<y0> f8741d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8742a;
    public u0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f8743c;

    public y0(SharedPreferences sharedPreferences, Executor executor) {
        this.f8743c = executor;
        this.f8742a = sharedPreferences;
    }

    public static synchronized y0 a(Context context, Executor executor) {
        y0 y0Var;
        try {
            WeakReference<y0> weakReference = f8741d;
            y0Var = weakReference != null ? weakReference.get() : null;
            if (y0Var == null) {
                y0Var = new y0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                y0Var.c();
                f8741d = new WeakReference<>(y0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return y0Var;
    }

    public synchronized x0 b() {
        return x0.a(this.b.e());
    }

    public final synchronized void c() {
        this.b = u0.c(this.f8742a, "topic_operation_queue", ",", this.f8743c);
    }

    public synchronized boolean d(x0 x0Var) {
        return this.b.f(x0Var.e());
    }
}
