package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import cb.j;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l9.h;
import l9.k;
import l9.m;
import l9.p;
import l9.q;
import m9.j1;
import m9.u1;
import m9.v1;
import m9.w1;
import o9.s;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public abstract class BasePendingResult<R extends p> extends k<R> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ThreadLocal f6119n = new u1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6120a;

    @NonNull
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final WeakReference f6121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CountDownLatch f6122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f6123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f6124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f6125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p f6126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Status f6127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f6128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6131m;

    @KeepName
    private w1 resultGuardian;

    public static class a<R extends p> extends j {
        public a(@NonNull Looper looper) {
            super(looper);
        }

        public final void a(@NonNull q qVar, @NonNull p pVar) {
            ThreadLocal threadLocal = BasePendingResult.f6119n;
            sendMessage(obtainMessage(1, new Pair((q) s.l(qVar), pVar)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((BasePendingResult) message.obj).f(Status.f6111n);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            q qVar = (q) pair.first;
            p pVar = (p) pair.second;
            try {
                qVar.a(pVar);
            } catch (RuntimeException e10) {
                BasePendingResult.m(pVar);
                throw e10;
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.f6120a = new Object();
        this.f6122d = new CountDownLatch(1);
        this.f6123e = new ArrayList();
        this.f6125g = new AtomicReference();
        this.f6131m = false;
        this.b = new a(Looper.getMainLooper());
        this.f6121c = new WeakReference(null);
    }

    public static void m(p pVar) {
        if (pVar instanceof m) {
            try {
                ((m) pVar).a();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(pVar)), e10);
            }
        }
    }

    @Override // l9.k
    public final void c(@NonNull k.a aVar) {
        s.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f6120a) {
            try {
                if (g()) {
                    aVar.a(this.f6127i);
                } else {
                    this.f6123e.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l9.k
    @NonNull
    @ResultIgnorabilityUnspecified
    public final R d(long j10, @NonNull TimeUnit timeUnit) {
        if (j10 > 0) {
            s.k("await must not be called on the UI thread when time is greater than zero.");
        }
        s.q(!this.f6128j, "Result has already been consumed.");
        s.q(true, "Cannot await if then() has been called.");
        try {
            if (!this.f6122d.await(j10, timeUnit)) {
                f(Status.f6111n);
            }
        } catch (InterruptedException unused) {
            f(Status.f6109l);
        }
        s.q(g(), "Result is not ready.");
        return (R) i();
    }

    @NonNull
    public abstract R e(@NonNull Status status);

    @Deprecated
    public final void f(@NonNull Status status) {
        synchronized (this.f6120a) {
            try {
                if (!g()) {
                    h(e(status));
                    this.f6130l = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean g() {
        return this.f6122d.getCount() == 0;
    }

    public final void h(@NonNull R r10) {
        synchronized (this.f6120a) {
            try {
                if (this.f6130l || this.f6129k) {
                    m(r10);
                    return;
                }
                g();
                s.q(!g(), "Results have already been set");
                s.q(!this.f6128j, "Result has already been consumed");
                j(r10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final p i() {
        p pVar;
        synchronized (this.f6120a) {
            s.q(!this.f6128j, "Result has already been consumed.");
            s.q(g(), "Result is not ready.");
            pVar = this.f6126h;
            this.f6126h = null;
            this.f6124f = null;
            this.f6128j = true;
        }
        if (((j1) this.f6125g.getAndSet(null)) == null) {
            return (p) s.l(pVar);
        }
        throw null;
    }

    public final void j(p pVar) {
        this.f6126h = pVar;
        this.f6127i = pVar.n();
        this.f6122d.countDown();
        v1 v1Var = null;
        if (this.f6129k) {
            this.f6124f = null;
        } else {
            q qVar = this.f6124f;
            if (qVar != null) {
                this.b.removeMessages(2);
                this.b.a(qVar, i());
            } else if (this.f6126h instanceof m) {
                this.resultGuardian = new w1(this, v1Var);
            }
        }
        ArrayList arrayList = this.f6123e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((k.a) arrayList.get(i10)).a(this.f6127i);
        }
        this.f6123e.clear();
    }

    public final void l() {
        boolean z10 = true;
        if (!this.f6131m && !((Boolean) f6119n.get()).booleanValue()) {
            z10 = false;
        }
        this.f6131m = z10;
    }

    public BasePendingResult(h hVar) {
        this.f6120a = new Object();
        this.f6122d = new CountDownLatch(1);
        this.f6123e = new ArrayList();
        this.f6125g = new AtomicReference();
        this.f6131m = false;
        this.b = new a(hVar != null ? hVar.c() : Looper.getMainLooper());
        this.f6121c = new WeakReference(hVar);
    }
}
