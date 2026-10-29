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
import p504w1.C12277a;
import sb.C11264k;
import sb.C11268m;

/* JADX INFO: renamed from: com.google.firebase.messaging.z0 */
/* JADX INFO: loaded from: classes2.dex */
public class C3035z0 {

    /* JADX INFO: renamed from: i */
    public static final long f11362i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: a */
    public final Context f11363a;

    /* JADX INFO: renamed from: b */
    public final C2995g0 f11364b;

    /* JADX INFO: renamed from: c */
    public final C2980b0 f11365c;

    /* JADX INFO: renamed from: d */
    public final FirebaseMessaging f11366d;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f11368f;

    /* JADX INFO: renamed from: h */
    public final C3031x0 f11370h;

    /* JADX INFO: renamed from: e */
    public final Map<String, ArrayDeque<C11264k<Void>>> f11367e = new C12277a();

    /* JADX INFO: renamed from: g */
    public boolean f11369g = false;

    public C3035z0(FirebaseMessaging firebaseMessaging, C2995g0 c2995g0, C3031x0 c3031x0, C2980b0 c2980b0, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f11366d = firebaseMessaging;
        this.f11364b = c2995g0;
        this.f11370h = c3031x0;
        this.f11365c = c2980b0;
        this.f11363a = context;
        this.f11368f = scheduledExecutorService;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
      (r9v0 com.google.firebase.messaging.FirebaseMessaging)
      (r10v0 com.google.firebase.messaging.g0)
      (wrap com.google.firebase.messaging.x0:0x0000: INVOKE (r7v0 android.content.Context), (r8v0 java.util.concurrent.ScheduledExecutorService) STATIC call: com.google.firebase.messaging.x0.a(android.content.Context, java.util.concurrent.Executor):com.google.firebase.messaging.x0 A[MD:(android.content.Context, java.util.concurrent.Executor):com.google.firebase.messaging.x0 (m), WRAPPED])
      (r11v0 com.google.firebase.messaging.b0)
      (r7v0 android.content.Context)
      (r8v0 java.util.concurrent.ScheduledExecutorService)
     A[MD:(com.google.firebase.messaging.FirebaseMessaging, com.google.firebase.messaging.g0, com.google.firebase.messaging.x0, com.google.firebase.messaging.b0, android.content.Context, java.util.concurrent.ScheduledExecutorService):void (m)] call: com.google.firebase.messaging.z0.<init>(com.google.firebase.messaging.FirebaseMessaging, com.google.firebase.messaging.g0, com.google.firebase.messaging.x0, com.google.firebase.messaging.b0, android.content.Context, java.util.concurrent.ScheduledExecutorService):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C3035z0 m14678a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C2995g0 c2995g0, C2980b0 c2980b0) {
        return new C3035z0(firebaseMessaging, c2995g0, C3031x0.m14673a(context, scheduledExecutorService), c2980b0, context, scheduledExecutorService);
    }

    /* JADX INFO: renamed from: b */
    public static <T> void m14679b(Task<T> task) throws IOException {
        try {
            C11268m.m42332b(task, 30L, TimeUnit.SECONDS);
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

    /* JADX INFO: renamed from: e */
    public static Task<C3035z0> m14680e(final FirebaseMessaging firebaseMessaging, final C2995g0 c2995g0, final C2980b0 c2980b0, final Context context, @NonNull final ScheduledExecutorService scheduledExecutorService) {
        return C11268m.m42333c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C3035z0.m14678a(context, scheduledExecutorService, firebaseMessaging, c2995g0, c2980b0);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static boolean m14681g() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX INFO: renamed from: c */
    public final void m14682c(String str) throws IOException {
        m14679b(this.f11365c.m14482l(this.f11366d.m14429k(), str));
    }

    /* JADX INFO: renamed from: d */
    public final void m14683d(String str) throws IOException {
        m14679b(this.f11365c.m14483m(this.f11366d.m14429k(), str));
    }

    /* JADX INFO: renamed from: f */
    public boolean m14684f() {
        return this.f11370h.m14674b() != null;
    }

    /* JADX INFO: renamed from: h */
    public synchronized boolean m14685h() {
        return this.f11369g;
    }

    /* JADX INFO: renamed from: i */
    public final void m14686i(C3029w0 c3029w0) {
        synchronized (this.f11367e) {
            try {
                String strM14672e = c3029w0.m14672e();
                if (this.f11367e.containsKey(strM14672e)) {
                    ArrayDeque<C11264k<Void>> arrayDeque = this.f11367e.get(strM14672e);
                    C11264k<Void> c11264kPoll = arrayDeque.poll();
                    if (c11264kPoll != null) {
                        c11264kPoll.m42328c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f11367e.remove(strM14672e);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m14687j(C3029w0 c3029w0) throws IOException {
        try {
            String strM14670b = c3029w0.m14670b();
            int iHashCode = strM14670b.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && strM14670b.equals("U")) {
                    m14683d(c3029w0.m14671c());
                    if (!m14681g()) {
                        return true;
                    }
                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + c3029w0.m14671c() + " succeeded.");
                    return true;
                }
            } else if (strM14670b.equals("S")) {
                m14682c(c3029w0.m14671c());
                if (!m14681g()) {
                    return true;
                }
                Log.d("FirebaseMessaging", "Subscribe to topic: " + c3029w0.m14671c() + " succeeded.");
                return true;
            }
            if (!m14681g()) {
                return true;
            }
            Log.d("FirebaseMessaging", "Unknown topic operation" + c3029w0 + ".");
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

    /* JADX INFO: renamed from: k */
    public void m14688k(Runnable runnable, long j10) {
        this.f11368f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m14689l(boolean z10) {
        this.f11369g = z10;
    }

    /* JADX INFO: renamed from: m */
    public final void m14690m() {
        if (m14685h()) {
            return;
        }
        m14693p(0L);
    }

    /* JADX INFO: renamed from: n */
    public void m14691n() {
        if (m14684f()) {
            m14690m();
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m14692o() {
        while (true) {
            synchronized (this) {
                try {
                    C3029w0 c3029w0M14674b = this.f11370h.m14674b();
                    if (c3029w0M14674b == null) {
                        if (m14681g()) {
                            Log.d("FirebaseMessaging", "topic sync succeeded");
                        }
                        return true;
                    }
                    if (!m14687j(c3029w0M14674b)) {
                        return false;
                    }
                    this.f11370h.m14676d(c3029w0M14674b);
                    m14686i(c3029w0M14674b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m14693p(long j10) {
        m14688k(new RunnableC2978a1(this, this.f11363a, this.f11364b, Math.min(Math.max(30L, 2 * j10), f11362i)), j10);
        m14689l(true);
    }
}
