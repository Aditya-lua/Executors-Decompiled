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
    public final Executor f20191a;
    public final AtomicReference<Boolean> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f20192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f20193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f20194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f20196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h1.c.a f20197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Executor f20199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f20200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h1.c<? extends h1> f20201l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public r0.c<h1> f20202m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a3.a<h1.c.a> f20203n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f20204o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f20205p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f20206q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f20207r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f20208s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public double f20209t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f20210u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f20211v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f20212w;

    public class a implements a3.a<h1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h1.c f20213a;

        public a(h1.c cVar) {
            this.f20213a = cVar;
        }

        @Override // n0.a3.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h1.c.a aVar) {
            Objects.requireNonNull(aVar);
            if (n.this.f20201l == this.f20213a) {
                r1.a("AudioSource", "Receive BufferProvider state change: " + n.this.f20197h + " to " + aVar);
                n nVar = n.this;
                if (nVar.f20197h != aVar) {
                    nVar.f20197h = aVar;
                    nVar.H();
                }
            }
        }

        @Override // n0.a3.a
        public void onError(Throwable th2) {
            n nVar = n.this;
            if (nVar.f20201l == this.f20213a) {
                nVar.r(th2);
            }
        }
    }

    public class b implements r0.c<h1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h1.c f20214a;

        public b(h1.c cVar) {
            this.f20214a = cVar;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(h1 h1Var) {
            n nVar = n.this;
            if (!nVar.f20198i || nVar.f20201l != this.f20214a) {
                h1Var.cancel();
                return;
            }
            if (nVar.f20204o && nVar.p()) {
                n.this.y();
            }
            p pVarM = n.this.m();
            ByteBuffer byteBufferT = h1Var.t();
            p.c cVar = pVarM.read(byteBufferT);
            if (cVar.a() > 0) {
                n nVar2 = n.this;
                if (nVar2.f20207r) {
                    nVar2.u(byteBufferT, cVar.a());
                }
                if (n.this.f20199j != null) {
                    long jB = cVar.b();
                    n nVar3 = n.this;
                    if (jB - nVar3.f20210u >= 200) {
                        nVar3.f20210u = cVar.b();
                        n.this.v(byteBufferT);
                    }
                }
                byteBufferT.limit(byteBufferT.position() + cVar.a());
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
            if (n.this.f20201l != this.f20214a) {
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
            nVar.f20206q = z10;
            if (nVar.f20196g == e.STARTED) {
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
        nVar.f20191a.execute(new Runnable() { // from class: i1.k
            @Override // java.lang.Runnable
            public final void run() {
                n.f(this.f20187a, aVar);
            }
        });
        return "AudioSource-release";
    }

    public static /* synthetic */ void b(n nVar, Executor executor, c cVar) {
        int iOrdinal = nVar.f20196g.ordinal();
        if (iOrdinal == 0) {
            nVar.f20199j = executor;
            nVar.f20200k = cVar;
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
        }
    }

    public static /* synthetic */ void d(n nVar, h1.c cVar) {
        int iOrdinal = nVar.f20196g.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else if (nVar.f20201l != cVar) {
            nVar.x(cVar);
        }
    }

    public static /* synthetic */ void e(n nVar, boolean z10) {
        int iOrdinal = nVar.f20196g.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else {
            if (nVar.f20207r == z10) {
                return;
            }
            nVar.f20207r = z10;
            if (nVar.f20196g == e.STARTED) {
                nVar.s();
            }
        }
    }

    public static /* synthetic */ void f(n nVar, y1.c.a aVar) {
        nVar.getClass();
        try {
            int iOrdinal = nVar.f20196g.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                nVar.x(null);
                nVar.f20194e.a();
                nVar.f20193d.a();
                nVar.G();
                nVar.C(e.RELEASED);
            }
            aVar.c(null);
        } catch (Throwable th2) {
            aVar.f(th2);
        }
    }

    public static /* synthetic */ void g(n nVar) {
        int iOrdinal = nVar.f20196g.ordinal();
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
        int iOrdinal = nVar.f20196g.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
            return;
        }
        nVar.b.set(null);
        nVar.f20192c.set(false);
        nVar.C(e.STARTED);
        nVar.q(z10);
        nVar.H();
    }

    public static h1.c.a l(h1.c<? extends h1> cVar) {
        try {
            me.x<? extends h1> xVarB = cVar.b();
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
        this.f20191a.execute(new Runnable() { // from class: i1.l
            @Override // java.lang.Runnable
            public final void run() {
                n.b(this.f20188a, executor, cVar);
            }
        });
    }

    public void B(final h1.c<? extends h1> cVar) {
        this.f20191a.execute(new Runnable() { // from class: i1.g
            @Override // java.lang.Runnable
            public final void run() {
                n.d(this.f20184a, cVar);
            }
        });
    }

    public void C(e eVar) {
        r1.a("AudioSource", "Transitioning internal state: " + this.f20196g + " --> " + eVar);
        this.f20196g = eVar;
    }

    public void D(final boolean z10) {
        this.f20191a.execute(new Runnable() { // from class: i1.f
            @Override // java.lang.Runnable
            public final void run() {
                n.k(this.f20183a, z10);
            }
        });
    }

    public final void E() {
        if (this.f20198i) {
            return;
        }
        try {
            r1.a("AudioSource", "startSendingAudio");
            this.f20193d.start();
            this.f20204o = false;
        } catch (p.b e10) {
            r1.m("AudioSource", "Failed to start AudioStream", e10);
            this.f20204o = true;
            this.f20194e.start();
            this.f20205p = n();
            s();
        }
        this.f20198i = true;
        z();
    }

    public void F() {
        this.f20191a.execute(new Runnable() { // from class: i1.b
            @Override // java.lang.Runnable
            public final void run() {
                n.g(this.f20156a);
            }
        });
    }

    public final void G() {
        if (this.f20198i) {
            this.f20198i = false;
            r1.a("AudioSource", "stopSendingAudio");
            this.f20193d.stop();
        }
    }

    public void H() {
        if (this.f20196g != e.STARTED) {
            G();
            return;
        }
        boolean z10 = this.f20197h == h1.c.a.ACTIVE;
        t(!z10);
        if (z10) {
            E();
        } else {
            G();
        }
    }

    public p m() {
        return this.f20204o ? this.f20194e : this.f20193d;
    }

    public boolean p() {
        x2.g.i(this.f20205p > 0);
        return n() - this.f20205p >= this.f20195f;
    }

    public void q(final boolean z10) {
        this.f20191a.execute(new Runnable() { // from class: i1.i
            @Override // java.lang.Runnable
            public final void run() {
                n.e(this.f20185a, z10);
            }
        });
    }

    public void r(final Throwable th2) {
        Executor executor = this.f20199j;
        final c cVar = this.f20200k;
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
        Executor executor = this.f20199j;
        final c cVar = this.f20200k;
        if (executor == null || cVar == null) {
            return;
        }
        final boolean z10 = this.f20207r || this.f20204o || this.f20206q;
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
        Executor executor = this.f20199j;
        final c cVar = this.f20200k;
        if (executor == null || cVar == null || this.f20192c.getAndSet(z10) == z10) {
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
        byte[] bArr = this.f20208s;
        if (bArr == null || bArr.length < i10) {
            this.f20208s = new byte[i10];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.f20208s, 0, i10);
        byteBuffer.limit(byteBuffer.position()).position(iPosition);
    }

    public void v(ByteBuffer byteBuffer) {
        Executor executor = this.f20199j;
        final c cVar = this.f20200k;
        if (this.f20211v == 2) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            double dMax = 0.0d;
            while (shortBufferAsShortBuffer.hasRemaining()) {
                dMax = Math.max(dMax, Math.abs((int) shortBufferAsShortBuffer.get()));
            }
            this.f20209t = dMax / 32767.0d;
            if (executor == null || cVar == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: i1.m
                @Override // java.lang.Runnable
                public final void run() {
                    cVar.b(this.f20190a.f20209t);
                }
            });
        }
    }

    public me.x<Void> w() {
        return y1.c.a(new y1.c.InterfaceC0650c() { // from class: i1.e
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return n.a(this.f20175a, aVar);
            }
        });
    }

    public final void x(h1.c<? extends h1> cVar) {
        h1.c<? extends h1> cVar2 = this.f20201l;
        if (cVar2 != null) {
            a3.a<h1.c.a> aVar = this.f20203n;
            Objects.requireNonNull(aVar);
            cVar2.d(aVar);
            this.f20201l = null;
            this.f20203n = null;
            this.f20202m = null;
            this.f20197h = h1.c.a.INACTIVE;
            H();
        }
        if (cVar != null) {
            this.f20201l = cVar;
            this.f20203n = new a(cVar);
            this.f20202m = new b(cVar);
            h1.c.a aVarL = l(cVar);
            if (aVarL != null) {
                this.f20197h = aVarL;
                H();
            }
            this.f20201l.c(this.f20191a, this.f20203n);
        }
    }

    public void y() {
        x2.g.i(this.f20204o);
        try {
            this.f20193d.start();
            r1.a("AudioSource", "Retry start AudioStream succeed");
            this.f20194e.stop();
            this.f20204o = false;
        } catch (p.b e10) {
            r1.m("AudioSource", "Retry start AudioStream failed", e10);
            this.f20205p = n();
        }
    }

    public void z() {
        h1.c<? extends h1> cVar = this.f20201l;
        Objects.requireNonNull(cVar);
        me.x<? extends h1> xVarE = cVar.e();
        r0.c<h1> cVar2 = this.f20202m;
        Objects.requireNonNull(cVar2);
        r0.n.j(xVarE, cVar2, this.f20191a);
    }

    public n(i1.a aVar, Executor executor, Context context, q qVar, long j10) throws o {
        this.b = new AtomicReference<>(null);
        this.f20192c = new AtomicBoolean(false);
        this.f20196g = e.CONFIGURED;
        this.f20197h = h1.c.a.INACTIVE;
        this.f20210u = 0L;
        Executor executorG = q0.c.g(executor);
        this.f20191a = executorG;
        this.f20195f = TimeUnit.MILLISECONDS.toNanos(j10);
        try {
            c0 c0Var = new c0(qVar.a(aVar, context), aVar);
            this.f20193d = c0Var;
            c0Var.b(new d(), executorG);
            this.f20194e = new e0(aVar);
            this.f20211v = aVar.b();
            this.f20212w = aVar.c();
        } catch (p.b | IllegalArgumentException e10) {
            throw new o("Unable to create AudioStream", e10);
        }
    }
}
