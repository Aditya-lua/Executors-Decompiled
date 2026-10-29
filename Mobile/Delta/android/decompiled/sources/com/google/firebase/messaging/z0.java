package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class z0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f8837i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8838a;
    public final g0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f8839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f8840d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f8842f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0 f8844h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, ArrayDeque<sb.k<Void>>> f8841e = new w1.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8843g = false;

    public z0(FirebaseMessaging firebaseMessaging, g0 g0Var, x0 x0Var, b0 b0Var, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f8840d = firebaseMessaging;
        this.b = g0Var;
        this.f8844h = x0Var;
        this.f8839c = b0Var;
        this.f8838a = context;
        this.f8842f = scheduledExecutorService;
    }

    public static /* synthetic */ z0 a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, g0 g0Var, b0 b0Var) {
        return new z0(firebaseMessaging, g0Var, x0.a(context, scheduledExecutorService), b0Var, context, scheduledExecutorService);
    }

    public static <T> void b(Task<T> task) throws IOException {
        try {
            sb.m.b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Task<z0> e(final FirebaseMessaging firebaseMessaging, final g0 g0Var, final b0 b0Var, final Context context, @NonNull final ScheduledExecutorService scheduledExecutorService) {
        return sb.m.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return z0.a(context, scheduledExecutorService, firebaseMessaging, g0Var, b0Var);
            }
        });
    }

    public static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void c(String str) throws IOException {
        b(this.f8839c.l(this.f8840d.k(), str));
    }

    public final void d(String str) throws IOException {
        b(this.f8839c.m(this.f8840d.k(), str));
    }

    public boolean f() {
        return this.f8844h.b() != null;
    }

    public synchronized boolean h() {
        return this.f8843g;
    }

    public final void i(w0 w0Var) {
        synchronized (this.f8841e) {
            try {
                String strE = w0Var.e();
                if (this.f8841e.containsKey(strE)) {
                    ArrayDeque<sb.k<Void>> arrayDeque = this.f8841e.get(strE);
                    sb.k<Void> kVarPoll = arrayDeque.poll();
                    if (kVarPoll != null) {
                        kVarPoll.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f8841e.remove(strE);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean j(w0 w0Var) throws IOException {
        try {
            String strB = w0Var.b();
            int iHashCode = strB.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && strB.equals("U")) {
                    d(w0Var.c());
                    if (!g()) {
                        return true;
                    }
                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + w0Var.c() + " succeeded.");
                    return true;
                }
            } else if (strB.equals("S")) {
                c(w0Var.c());
                if (!g()) {
                    return true;
                }
                Log.d("FirebaseMessaging", "Subscribe to topic: " + w0Var.c() + " succeeded.");
                return true;
            }
            if (!g()) {
                return true;
            }
            Log.d("FirebaseMessaging", "Unknown topic operation" + w0Var + ".");
            return true;
        } catch (IOException e10) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e10.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e10.getMessage())) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    public void k(Runnable runnable, long j10) {
        this.f8842f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    public synchronized void l(boolean z10) {
        this.f8843g = z10;
    }

    public final void m() {
        if (h()) {
            return;
        }
        p(0L);
    }

    public void n() {
        if (f()) {
            m();
        }
    }

    public boolean o() {
        while (true) {
            synchronized (this) {
                try {
                    w0 w0VarB = this.f8844h.b();
                    if (w0VarB == null) {
                        if (g()) {
                            Log.d("FirebaseMessaging", "topic sync succeeded");
                        }
                        return true;
                    }
                    if (!j(w0VarB)) {
                        return false;
                    }
                    this.f8844h.d(w0VarB);
                    i(w0VarB);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void p(long j10) {
        k(new a1(this, this.f8838a, this.b, Math.min(Math.max(30L, 2 * j10), f8837i)), j10);
        l(true);
    }
}
