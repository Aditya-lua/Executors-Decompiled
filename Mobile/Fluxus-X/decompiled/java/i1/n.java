package i1;

import android.content.Context;
import g0.r1;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m1.h1;
import n0.a3;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f19034a;
    public final AtomicReference<Boolean> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f19035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f19036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f19037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f19038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f19039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h1.c.a f19040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Executor f19042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f19043k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h1.c<? extends h1> f19044l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public r0.c<h1> f19045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a3.a<h1.c.a> f19046n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f19047o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f19048p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f19049q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f19050r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f19051s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public double f19052t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f19053u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f19054v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f19055w;

    public class a implements a3.a<h1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h1.c f19056a;

        public a(h1.c cVar) {
            this.f19056a = cVar;
        }

        @Override // n0.a3.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h1.c.a aVar) {
            Objects.requireNonNull(aVar);
            if (n.this.f19044l == this.f19056a) {
                r1.a("AudioSource", "Receive BufferProvider state change: " + n.this.f19040h + " to " + aVar);
                n nVar = n.this;
                if (nVar.f19040h != aVar) {
                    nVar.f19040h = aVar;
                    nVar.H();
                }
            }
        }

        @Override // n0.a3.a
        public void onError(Throwable th2) {
            n nVar = n.this;
            if (nVar.f19044l == this.f19056a) {
                nVar.r(th2);
            }
        }
    }

    public class b implements r0.c<h1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h1.c f19057a;

        public b(h1.c cVar) {
            this.f19057a = cVar;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(h1 h1Var) {
            n nVar = n.this;
            if (!nVar.f19041i || nVar.f19044l != this.f19057a) {
                h1Var.cancel();
                return;
            }
            if (nVar.f19047o && nVar.p()) {
                n.this.y();
            }
            p pVarM = n.this.m();
            ByteBuffer byteBufferV = h1Var.v();
            p.c cVar = pVarM.read(byteBufferV);
            if (cVar.a() > 0) {
                n nVar2 = n.this;
                if (nVar2.f19050r) {
                    nVar2.u(byteBufferV, cVar.a());
                }
                if (n.this.f19042j != null) {
                    long jB = cVar.b();
                    n nVar3 = n.this;
                    if (jB - nVar3.f19053u >= 200) {
                        nVar3.f19053u = cVar.b();
                        n.this.v(byteBufferV);
                    }
                }
                byteBufferV.limit(byteBufferV.position() + cVar.a());
                h1Var.c(TimeUnit.NANOSECONDS.toMicros(cVar.b()));
                h1Var.b();
            } else {
                r1.l("AudioSource", "Unable to read data from AudioStream.");
                h1Var.cancel();
            }
            n.this.z();
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (n.this.f19044l != this.f19057a) {
                return;
            }
            r1.a("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
            if (th2 instanceof IllegalStateException) {
                return;
            }
            n.this.r(th2);
        }
    }

    public interface c {
        void a(boolean z10);

        void b(double d10);

        default void c(boolean z10) {
        }

        void onError(Throwable th2);
    }

    public class d implements p.a {
        public d() {
        }

        @Override // i1.p.a
        public void a(boolean z10) {
            n nVar = n.this;
            nVar.f19049q = z10;
            if (nVar.f19039g == e.STARTED) {
                nVar.s();
            }
        }
    }

    public enum e {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    public n(i1.a aVar, Executor executor, Context context) {
        this(aVar, executor, context, new q() { // from class: i1.h
            @Override // i1.q
            public final p a(a aVar2, Context context2) {
                return new s(aVar2, context2);
            }
        }, 3000L);
    }

    public static /* synthetic */ Object a(final n nVar, final y1.c.a aVar) {
        nVar.f19034a.execute(new Runnable() { // from class: i1.k
            @Override // java.lang.Runnable
            public final void run() {
                n.f(this.f19030a, aVar);
            }
        });
        return "AudioSource-release";
    }

    public static /* synthetic */ void b(n nVar, Executor executor, c cVar) {
        int iOrdinal = nVar.f19039g.ordinal();
        if (iOrdinal == 0) {
            nVar.f19042j = executor;
            nVar.f19043k = cVar;
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
        }
    }

    public static /* synthetic */ void d(n nVar, h1.c cVar) {
        int iOrdinal = nVar.f19039g.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else if (nVar.f19044l != cVar) {
            nVar.x(cVar);
        }
    }

    public static /* synthetic */ void e(n nVar, boolean z10) {
        int iOrdinal = nVar.f19039g.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else {
            if (nVar.f19050r == z10) {
                return;
            }
            nVar.f19050r = z10;
            if (nVar.f19039g == e.STARTED) {
                nVar.s();
            }
        }
    }

    public static /* synthetic */ void f(n nVar, y1.c.a aVar) {
        nVar.getClass();
        try {
            int iOrdinal = nVar.f19039g.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                nVar.x(null);
                nVar.f19037e.a();
                nVar.f19036d.a();
                nVar.G();
                nVar.C(e.RELEASED);
            }
            aVar.c(null);
        } catch (Throwable th2) {
            aVar.f(th2);
        }
    }

    public static /* synthetic */ void g(n nVar) {
        int iOrdinal = nVar.f19039g.ordinal();
        if (iOrdinal == 1) {
            nVar.C(e.CONFIGURED);
            nVar.H();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            r1.l("AudioSource", "AudioSource is released. Calling stop() is a no-op.");
        }
    }

    public static /* synthetic */ void k(n nVar, boolean z10) {
        int iOrdinal = nVar.f19039g.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
            return;
        }
        nVar.b.set(null);
        nVar.f19035c.set(false);
        nVar.C(e.STARTED);
        nVar.q(z10);
        nVar.H();
    }

    public static h1.c.a l(h1.c<? extends h1> cVar) {
        try {
            pe.x<? extends h1> xVarB = cVar.b();
            if (xVarB.isDone()) {
                return (h1.c.a) xVarB.get();
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }

    public static long n() {
        return System.nanoTime();
    }

    public static boolean o(int i10, int i11, int i12) {
        return s.n(i10, i11, i12);
    }

    public void A(final Executor executor, final c cVar) {
        this.f19034a.execute(new Runnable() { // from class: i1.l
            @Override // java.lang.Runnable
            public final void run() {
                n.b(this.f19031a, executor, cVar);
            }
        });
    }

    public void B(final h1.c<? extends h1> cVar) {
        this.f19034a.execute(new Runnable() { // from class: i1.g
            @Override // java.lang.Runnable
            public final void run() {
                n.d(this.f19027a, cVar);
            }
        });
    }

    public void C(e eVar) {
        r1.a("AudioSource", "Transitioning internal state: " + this.f19039g + " --> " + eVar);
        this.f19039g = eVar;
    }

    public void D(final boolean z10) {
        this.f19034a.execute(new Runnable() { // from class: i1.f
            @Override // java.lang.Runnable
            public final void run() {
                n.k(this.f19026a, z10);
            }
        });
    }

    public final void E() {
        if (this.f19041i) {
            return;
        }
        try {
            r1.a("AudioSource", "startSendingAudio");
            this.f19036d.start();
            this.f19047o = false;
        } catch (p.b e10) {
            r1.m("AudioSource", "Failed to start AudioStream", e10);
            this.f19047o = true;
            this.f19037e.start();
            this.f19048p = n();
            s();
        }
        this.f19041i = true;
        z();
    }

    public void F() {
        this.f19034a.execute(new Runnable() { // from class: i1.b
            @Override // java.lang.Runnable
            public final void run() {
                n.g(this.f18999a);
            }
        });
    }

    public final void G() {
        if (this.f19041i) {
            this.f19041i = false;
            r1.a("AudioSource", "stopSendingAudio");
            this.f19036d.stop();
        }
    }

    public void H() {
        if (this.f19039g != e.STARTED) {
            G();
            return;
        }
        boolean z10 = this.f19040h == h1.c.a.ACTIVE;
        t(!z10);
        if (z10) {
            E();
        } else {
            G();
        }
    }

    public p m() {
        return this.f19047o ? this.f19037e : this.f19036d;
    }

    public boolean p() {
        x2.g.i(this.f19048p > 0);
        return n() - this.f19048p >= this.f19038f;
    }

    public void q(final boolean z10) {
        this.f19034a.execute(new Runnable() { // from class: i1.i
            @Override // java.lang.Runnable
            public final void run() {
                n.e(this.f19028a, z10);
            }
        });
    }

    public void r(final Throwable th2) {
        Executor executor = this.f19042j;
        final c cVar = this.f19043k;
        if (executor == null || cVar == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: i1.d
            @Override // java.lang.Runnable
            public final void run() {
                cVar.onError(th2);
            }
        });
    }

    public void s() {
        Executor executor = this.f19042j;
        final c cVar = this.f19043k;
        if (executor == null || cVar == null) {
            return;
        }
        final boolean z10 = this.f19050r || this.f19047o || this.f19049q;
        if (Objects.equals(this.b.getAndSet(Boolean.valueOf(z10)), Boolean.valueOf(z10))) {
            return;
        }
        executor.execute(new Runnable() { // from class: i1.j
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a(z10);
            }
        });
    }

    public void t(final boolean z10) {
        Executor executor = this.f19042j;
        final c cVar = this.f19043k;
        if (executor == null || cVar == null || this.f19035c.getAndSet(z10) == z10) {
            return;
        }
        executor.execute(new Runnable() { // from class: i1.c
            @Override // java.lang.Runnable
            public final void run() {
                cVar.c(z10);
            }
        });
    }

    public void u(ByteBuffer byteBuffer, int i10) {
        byte[] bArr = this.f19051s;
        if (bArr == null || bArr.length < i10) {
            this.f19051s = new byte[i10];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.f19051s, 0, i10);
        byteBuffer.limit(byteBuffer.position()).position(iPosition);
    }

    public void v(ByteBuffer byteBuffer) {
        Executor executor = this.f19042j;
        final c cVar = this.f19043k;
        if (this.f19054v == 2) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            double dMax = 0.0d;
            while (shortBufferAsShortBuffer.hasRemaining()) {
                dMax = Math.max(dMax, Math.abs((int) shortBufferAsShortBuffer.get()));
            }
            this.f19052t = dMax / 32767.0d;
            if (executor == null || cVar == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: i1.m
                @Override // java.lang.Runnable
                public final void run() {
                    cVar.b(this.f19033a.f19052t);
                }
            });
        }
    }

    public pe.x<Void> w() {
        return y1.c.a(new y1.c.InterfaceC0761c() { // from class: i1.e
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return n.a(this.f19018a, aVar);
            }
        });
    }

    public final void x(h1.c<? extends h1> cVar) {
        h1.c<? extends h1> cVar2 = this.f19044l;
        if (cVar2 != null) {
            a3.a<h1.c.a> aVar = this.f19046n;
            Objects.requireNonNull(aVar);
            cVar2.d(aVar);
            this.f19044l = null;
            this.f19046n = null;
            this.f19045m = null;
            this.f19040h = h1.c.a.INACTIVE;
            H();
        }
        if (cVar != null) {
            this.f19044l = cVar;
            this.f19046n = new a(cVar);
            this.f19045m = new b(cVar);
            h1.c.a aVarL = l(cVar);
            if (aVarL != null) {
                this.f19040h = aVarL;
                H();
            }
            this.f19044l.c(this.f19034a, this.f19046n);
        }
    }

    public void y() {
        x2.g.i(this.f19047o);
        try {
            this.f19036d.start();
            r1.a("AudioSource", "Retry start AudioStream succeed");
            this.f19037e.stop();
            this.f19047o = false;
        } catch (p.b e10) {
            r1.m("AudioSource", "Retry start AudioStream failed", e10);
            this.f19048p = n();
        }
    }

    public void z() {
        h1.c<? extends h1> cVar = this.f19044l;
        Objects.requireNonNull(cVar);
        pe.x<? extends h1> xVarE = cVar.e();
        r0.c<h1> cVar2 = this.f19045m;
        Objects.requireNonNull(cVar2);
        r0.n.j(xVarE, cVar2, this.f19034a);
    }

    public n(i1.a aVar, Executor executor, Context context, q qVar, long j10) throws o {
        this.b = new AtomicReference<>(null);
        this.f19035c = new AtomicBoolean(false);
        this.f19039g = e.CONFIGURED;
        this.f19040h = h1.c.a.INACTIVE;
        this.f19053u = 0L;
        Executor executorG = q0.c.g(executor);
        this.f19034a = executorG;
        this.f19038f = TimeUnit.MILLISECONDS.toNanos(j10);
        try {
            c0 c0Var = new c0(qVar.a(aVar, context), aVar);
            this.f19036d = c0Var;
            c0Var.b(new d(), executorG);
            this.f19037e = new e0(aVar);
            this.f19054v = aVar.b();
            this.f19055w = aVar.c();
        } catch (p.b | IllegalArgumentException e10) {
            throw new o("Unable to create AudioStream", e10);
        }
    }
}
