package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import bb.j;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import k9.f;
import k9.i;
import k9.k;
import k9.n;
import k9.o;
import l9.j1;
import l9.u1;
import l9.v1;
import l9.w1;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public abstract class BasePendingResult<R extends n> extends i<R> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ThreadLocal f5802n = new u1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5803a;

    @NonNull
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final WeakReference f5804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CountDownLatch f5805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f5806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f5807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f5808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n f5809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Status f5810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f5811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5814m;

    @KeepName
    private w1 resultGuardian;

    public static class a<R extends n> extends j {
        public a(@NonNull Looper looper) {
            super(looper);
        }

        public final void a(@NonNull o oVar, @NonNull n nVar) {
            ThreadLocal threadLocal = BasePendingResult.f5802n;
            sendMessage(obtainMessage(1, new Pair((o) m.l(oVar), nVar)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((BasePendingResult) message.obj).f(Status.f5794n);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            o oVar = (o) pair.first;
            n nVar = (n) pair.second;
            try {
                oVar.a(nVar);
            } catch (RuntimeException e10) {
                BasePendingResult.m(nVar);
                throw e10;
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.f5803a = new Object();
        this.f5805d = new CountDownLatch(1);
        this.f5806e = new ArrayList();
        this.f5808g = new AtomicReference();
        this.f5814m = false;
        this.b = new a(Looper.getMainLooper());
        this.f5804c = new WeakReference(null);
    }

    public static void m(n nVar) {
        if (nVar instanceof k) {
            try {
                ((k) nVar).a();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(nVar)), e10);
            }
        }
    }

    @Override // k9.i
    public final void c(@NonNull i.a aVar) {
        m.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f5803a) {
            try {
                if (g()) {
                    aVar.a(this.f5810i);
                } else {
                    this.f5806e.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k9.i
    @NonNull
    @ResultIgnorabilityUnspecified
    public final R d(long j10, @NonNull TimeUnit timeUnit) {
        if (j10 > 0) {
            m.k("await must not be called on the UI thread when time is greater than zero.");
        }
        m.q(!this.f5811j, "Result has already been consumed.");
        m.q(true, "Cannot await if then() has been called.");
        try {
            if (!this.f5805d.await(j10, timeUnit)) {
                f(Status.f5794n);
            }
        } catch (InterruptedException unused) {
            f(Status.f5792l);
        }
        m.q(g(), "Result is not ready.");
        return (R) i();
    }

    @NonNull
    public abstract R e(@NonNull Status status);

    @Deprecated
    public final void f(@NonNull Status status) {
        synchronized (this.f5803a) {
            try {
                if (!g()) {
                    h(e(status));
                    this.f5813l = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean g() {
        return this.f5805d.getCount() == 0;
    }

    public final void h(@NonNull R r8) {
        synchronized (this.f5803a) {
            try {
                if (this.f5813l || this.f5812k) {
                    m(r8);
                    return;
                }
                g();
                m.q(!g(), "Results have already been set");
                m.q(!this.f5811j, "Result has already been consumed");
                j(r8);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final n i() {
        n nVar;
        synchronized (this.f5803a) {
            m.q(!this.f5811j, "Result has already been consumed.");
            m.q(g(), "Result is not ready.");
            nVar = this.f5809h;
            this.f5809h = null;
            this.f5807f = null;
            this.f5811j = true;
        }
        if (((j1) this.f5808g.getAndSet(null)) == null) {
            return (n) m.l(nVar);
        }
        throw null;
    }

    public final void j(n nVar) {
        this.f5809h = nVar;
        this.f5810i = nVar.m();
        this.f5805d.countDown();
        v1 v1Var = null;
        if (this.f5812k) {
            this.f5807f = null;
        } else {
            o oVar = this.f5807f;
            if (oVar != null) {
                this.b.removeMessages(2);
                this.b.a(oVar, i());
            } else if (this.f5809h instanceof k) {
                this.resultGuardian = new w1(this, v1Var);
            }
        }
        ArrayList arrayList = this.f5806e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((i.a) arrayList.get(i10)).a(this.f5810i);
        }
        this.f5806e.clear();
    }

    public final void l() {
        boolean z10 = true;
        if (!this.f5814m && !((Boolean) f5802n.get()).booleanValue()) {
            z10 = false;
        }
        this.f5814m = z10;
    }

    public BasePendingResult(f fVar) {
        this.f5803a = new Object();
        this.f5805d = new CountDownLatch(1);
        this.f5806e = new ArrayList();
        this.f5808g = new AtomicReference();
        this.f5814m = false;
        this.b = new a(fVar != null ? fVar.c() : Looper.getMainLooper());
        this.f5804c = new WeakReference(fVar);
    }
}
