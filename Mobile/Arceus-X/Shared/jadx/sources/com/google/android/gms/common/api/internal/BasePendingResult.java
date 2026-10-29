package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import bb.HandlerC1302j;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p242k9.AbstractC7496f;
import p242k9.AbstractC7499i;
import p242k9.InterfaceC7501k;
import p242k9.InterfaceC7504n;
import p242k9.InterfaceC7505o;
import p268l9.C8047j1;
import p268l9.C8080u1;
import p268l9.C8083v1;
import p268l9.C8086w1;
import p305n9.C8953m;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public abstract class BasePendingResult<R extends InterfaceC7504n> extends AbstractC7499i<R> {

    /* JADX INFO: renamed from: n */
    public static final ThreadLocal f7416n = new C8080u1();

    /* JADX INFO: renamed from: a */
    public final Object f7417a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final HandlerC1898a f7418b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final WeakReference f7419c;

    /* JADX INFO: renamed from: d */
    public final CountDownLatch f7420d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f7421e;

    /* JADX INFO: renamed from: f */
    public InterfaceC7505o f7422f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference f7423g;

    /* JADX INFO: renamed from: h */
    public InterfaceC7504n f7424h;

    /* JADX INFO: renamed from: i */
    public Status f7425i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f7426j;

    /* JADX INFO: renamed from: k */
    public boolean f7427k;

    /* JADX INFO: renamed from: l */
    public boolean f7428l;

    /* JADX INFO: renamed from: m */
    public boolean f7429m;

    @KeepName
    private C8086w1 resultGuardian;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class HandlerC1898a<R extends InterfaceC7504n> extends HandlerC1302j {
        public HandlerC1898a(@NonNull Looper looper) {
            super(looper);
        }

        /* JADX INFO: renamed from: a */
        public final void m9180a(@NonNull InterfaceC7505o interfaceC7505o, @NonNull InterfaceC7504n interfaceC7504n) {
            ThreadLocal threadLocal = BasePendingResult.f7416n;
            sendMessage(obtainMessage(1, new Pair((InterfaceC7505o) C8953m.m36047l(interfaceC7505o), interfaceC7504n)));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: k9.o */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((BasePendingResult) message.obj).m9174f(Status.f7408n);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            InterfaceC7505o interfaceC7505o = (InterfaceC7505o) pair.first;
            InterfaceC7504n interfaceC7504n = (InterfaceC7504n) pair.second;
            try {
                interfaceC7505o.m31164a(interfaceC7504n);
            } catch (RuntimeException e10) {
                BasePendingResult.m9170m(interfaceC7504n);
                throw e10;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public BasePendingResult() {
        this.f7417a = new Object();
        this.f7420d = new CountDownLatch(1);
        this.f7421e = new ArrayList();
        this.f7423g = new AtomicReference();
        this.f7429m = false;
        this.f7418b = new HandlerC1898a(Looper.getMainLooper());
        this.f7419c = new WeakReference(null);
    }

    /* JADX INFO: renamed from: m */
    public static void m9170m(InterfaceC7504n interfaceC7504n) {
        if (interfaceC7504n instanceof InterfaceC7501k) {
            try {
                ((InterfaceC7501k) interfaceC7504n).mo31162a();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(interfaceC7504n)), e10);
            }
        }
    }

    @Override // p242k9.AbstractC7499i
    /* JADX INFO: renamed from: c */
    public final void mo9171c(@NonNull AbstractC7499i.a aVar) {
        C8953m.m36037b(aVar != null, "Callback cannot be null.");
        synchronized (this.f7417a) {
            try {
                if (m9175g()) {
                    aVar.mo31159a(this.f7425i);
                } else {
                    this.f7421e.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p242k9.AbstractC7499i
    @NonNull
    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: d */
    public final R mo9172d(long j10, @NonNull TimeUnit timeUnit) {
        if (j10 > 0) {
            C8953m.m36046k("await must not be called on the UI thread when time is greater than zero.");
        }
        C8953m.m36052q(!this.f7426j, "Result has already been consumed.");
        C8953m.m36052q(true, "Cannot await if then() has been called.");
        try {
            if (!this.f7420d.await(j10, timeUnit)) {
                m9174f(Status.f7408n);
            }
        } catch (InterruptedException unused) {
            m9174f(Status.f7406l);
        }
        C8953m.m36052q(m9175g(), "Result is not ready.");
        return (R) m9177i();
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public abstract R mo9173e(@NonNull Status status);

    @Deprecated
    /* JADX INFO: renamed from: f */
    public final void m9174f(@NonNull Status status) {
        synchronized (this.f7417a) {
            try {
                if (!m9175g()) {
                    m9176h(mo9173e(status));
                    this.f7428l = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m9175g() {
        return this.f7420d.getCount() == 0;
    }

    /* JADX INFO: renamed from: h */
    public final void m9176h(@NonNull R r8) {
        synchronized (this.f7417a) {
            try {
                if (this.f7428l || this.f7427k) {
                    m9170m(r8);
                    return;
                }
                m9175g();
                C8953m.m36052q(!m9175g(), "Results have already been set");
                C8953m.m36052q(!this.f7426j, "Result has already been consumed");
                m9178j(r8);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC7504n m9177i() {
        InterfaceC7504n interfaceC7504n;
        synchronized (this.f7417a) {
            C8953m.m36052q(!this.f7426j, "Result has already been consumed.");
            C8953m.m36052q(m9175g(), "Result is not ready.");
            interfaceC7504n = this.f7424h;
            this.f7424h = null;
            this.f7422f = null;
            this.f7426j = true;
        }
        if (((C8047j1) this.f7423g.getAndSet(null)) == null) {
            return (InterfaceC7504n) C8953m.m36047l(interfaceC7504n);
        }
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public final void m9178j(InterfaceC7504n interfaceC7504n) {
        this.f7424h = interfaceC7504n;
        this.f7425i = interfaceC7504n.mo8183m();
        this.f7420d.countDown();
        C8083v1 c8083v1 = null;
        if (this.f7427k) {
            this.f7422f = null;
        } else {
            InterfaceC7505o interfaceC7505o = this.f7422f;
            if (interfaceC7505o != null) {
                this.f7418b.removeMessages(2);
                this.f7418b.m9180a(interfaceC7505o, m9177i());
            } else if (this.f7424h instanceof InterfaceC7501k) {
                this.resultGuardian = new C8086w1(this, c8083v1);
            }
        }
        ArrayList arrayList = this.f7421e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC7499i.a) arrayList.get(i10)).mo31159a(this.f7425i);
        }
        this.f7421e.clear();
    }

    /* JADX INFO: renamed from: l */
    public final void m9179l() {
        boolean z10 = true;
        if (!this.f7429m && !((Boolean) f7416n.get()).booleanValue()) {
            z10 = false;
        }
        this.f7429m = z10;
    }

    public BasePendingResult(AbstractC7496f abstractC7496f) {
        this.f7417a = new Object();
        this.f7420d = new CountDownLatch(1);
        this.f7421e = new ArrayList();
        this.f7423g = new AtomicReference();
        this.f7429m = false;
        this.f7418b = new HandlerC1898a(abstractC7496f != null ? abstractC7496f.mo31156c() : Looper.getMainLooper());
        this.f7419c = new WeakReference(abstractC7496f);
    }
}
