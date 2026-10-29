package p183i1;

import android.content.Context;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ne.InterfaceFutureC9440x;
import p140g0.C5931r1;
import p156h1.InterfaceC6262c;
import p282m1.InterfaceC8359h1;
import p296n0.InterfaceC8722a3;
import p366q0.C10417c;
import p397r0.C10773n;
import p397r0.InterfaceC10762c;
import p533x2.C12637g;
import p563y1.C12997c;

/* JADX INFO: renamed from: i1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6619n {

    /* JADX INFO: renamed from: a */
    public final Executor f25513a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<Boolean> f25514b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f25515c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6621p f25516d;

    /* JADX INFO: renamed from: e */
    public final C6610e0 f25517e;

    /* JADX INFO: renamed from: f */
    public final long f25518f;

    /* JADX INFO: renamed from: g */
    public e f25519g;

    /* JADX INFO: renamed from: h */
    public InterfaceC6262c.a f25520h;

    /* JADX INFO: renamed from: i */
    public boolean f25521i;

    /* JADX INFO: renamed from: j */
    public Executor f25522j;

    /* JADX INFO: renamed from: k */
    public c f25523k;

    /* JADX INFO: renamed from: l */
    public InterfaceC6262c<? extends InterfaceC8359h1> f25524l;

    /* JADX INFO: renamed from: m */
    public InterfaceC10762c<InterfaceC8359h1> f25525m;

    /* JADX INFO: renamed from: n */
    public InterfaceC8722a3.a<InterfaceC6262c.a> f25526n;

    /* JADX INFO: renamed from: o */
    public boolean f25527o;

    /* JADX INFO: renamed from: p */
    public long f25528p;

    /* JADX INFO: renamed from: q */
    public boolean f25529q;

    /* JADX INFO: renamed from: r */
    public boolean f25530r;

    /* JADX INFO: renamed from: s */
    public byte[] f25531s;

    /* JADX INFO: renamed from: t */
    public double f25532t;

    /* JADX INFO: renamed from: u */
    public long f25533u;

    /* JADX INFO: renamed from: v */
    public final int f25534v;

    /* JADX INFO: renamed from: w */
    public final int f25535w;

    /* JADX INFO: renamed from: i1.n$a */
    public class a implements InterfaceC8722a3.a<InterfaceC6262c.a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC6262c f25536a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(InterfaceC6262c interfaceC6262c) {
            this.f25536a = interfaceC6262c;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p296n0.InterfaceC8722a3.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2367a(InterfaceC6262c.a aVar) {
            Objects.requireNonNull(aVar);
            if (C6619n.this.f25524l == this.f25536a) {
                C5931r1.m26561a("AudioSource", "Receive BufferProvider state change: " + C6619n.this.f25520h + " to " + aVar);
                C6619n c6619n = C6619n.this;
                if (c6619n.f25520h != aVar) {
                    c6619n.f25520h = aVar;
                    c6619n.m28567H();
                }
            }
        }

        @Override // p296n0.InterfaceC8722a3.a
        public void onError(Throwable th2) {
            C6619n c6619n = C6619n.this;
            if (c6619n.f25524l == this.f25536a) {
                c6619n.m28571r(th2);
            }
        }
    }

    /* JADX INFO: renamed from: i1.n$b */
    public class b implements InterfaceC10762c<InterfaceC8359h1> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC6262c f25538a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(InterfaceC6262c interfaceC6262c) {
            this.f25538a = interfaceC6262c;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InterfaceC8359h1 interfaceC8359h1) {
            C6619n c6619n = C6619n.this;
            if (!c6619n.f25521i || c6619n.f25524l != this.f25538a) {
                interfaceC8359h1.cancel();
                return;
            }
            if (c6619n.f25527o && c6619n.m28569p()) {
                C6619n.this.m28578y();
            }
            InterfaceC6621p interfaceC6621pM28568m = C6619n.this.m28568m();
            ByteBuffer byteBufferMo33941t = interfaceC8359h1.mo33941t();
            InterfaceC6621p.c cVar = interfaceC6621pM28568m.read(byteBufferMo33941t);
            if (cVar.mo28586a() > 0) {
                C6619n c6619n2 = C6619n.this;
                if (c6619n2.f25530r) {
                    c6619n2.m28574u(byteBufferMo33941t, cVar.mo28586a());
                }
                if (C6619n.this.f25522j != null) {
                    long jMo28587b = cVar.mo28587b();
                    C6619n c6619n3 = C6619n.this;
                    if (jMo28587b - c6619n3.f25533u >= 200) {
                        c6619n3.f25533u = cVar.mo28587b();
                        C6619n.this.m28575v(byteBufferMo33941t);
                    }
                }
                byteBufferMo33941t.limit(byteBufferMo33941t.position() + cVar.mo28586a());
                interfaceC8359h1.mo33939c(TimeUnit.NANOSECONDS.toMicros(cVar.mo28587b()));
                interfaceC8359h1.mo33938b();
            } else {
                C5931r1.m26572l("AudioSource", "Unable to read data from AudioStream.");
                interfaceC8359h1.cancel();
            }
            C6619n.this.m28579z();
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            if (C6619n.this.f25524l != this.f25538a) {
                return;
            }
            C5931r1.m26561a("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
            if (th2 instanceof IllegalStateException) {
                return;
            }
            C6619n.this.m28571r(th2);
        }
    }

    /* JADX INFO: renamed from: i1.n$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo24520a(boolean z10);

        /* JADX INFO: renamed from: b */
        void mo24521b(double d10);

        /* JADX INFO: renamed from: c */
        default void m28582c(boolean z10) {
        }

        void onError(Throwable th2);
    }

    /* JADX INFO: renamed from: i1.n$d */
    public class d implements InterfaceC6621p.a {
        public d() {
        }

        @Override // p183i1.InterfaceC6621p.a
        /* JADX INFO: renamed from: a */
        public void mo28583a(boolean z10) {
            C6619n c6619n = C6619n.this;
            c6619n.f25529q = z10;
            if (c6619n.f25519g == e.STARTED) {
                c6619n.m28572s();
            }
        }
    }

    /* JADX INFO: renamed from: i1.n$e */
    public enum e {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6619n(AbstractC6601a abstractC6601a, Executor executor, Context context) {
        this(abstractC6601a, executor, context, new InterfaceC6622q() { // from class: i1.h
            @Override // p183i1.InterfaceC6622q
            /* JADX INFO: renamed from: a */
            public final InterfaceC6621p mo28545a(AbstractC6601a abstractC6601a2, Context context2) {
                return new C6624s(abstractC6601a2, context2);
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m28546a(final C6619n c6619n, final C12997c.a aVar) {
        c6619n.f25513a.execute(new Runnable() { // from class: i1.k
            @Override // java.lang.Runnable
            public final void run() {
                C6619n.m28551f(this.f25506a, aVar);
            }
        });
        return "AudioSource-release";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m28547b(C6619n c6619n, Executor executor, c cVar) {
        int iOrdinal = c6619n.f25519g.ordinal();
        if (iOrdinal == 0) {
            c6619n.f25522j = executor;
            c6619n.f25523k = cVar;
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m28549d(C6619n c6619n, InterfaceC6262c interfaceC6262c) {
        int iOrdinal = c6619n.f25519g.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else if (c6619n.f25524l != interfaceC6262c) {
            c6619n.m28577x(interfaceC6262c);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m28550e(C6619n c6619n, boolean z10) {
        int iOrdinal = c6619n.f25519g.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else {
            if (c6619n.f25530r == z10) {
                return;
            }
            c6619n.f25530r = z10;
            if (c6619n.f25519g == e.STARTED) {
                c6619n.m28572s();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m28551f(C6619n c6619n, C12997c.a aVar) {
        c6619n.getClass();
        try {
            int iOrdinal = c6619n.f25519g.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                c6619n.m28577x(null);
                c6619n.f25517e.mo28530a();
                c6619n.f25516d.mo28530a();
                c6619n.m28566G();
                c6619n.m28562C(e.RELEASED);
            }
            aVar.m48314c(null);
        } catch (Throwable th2) {
            aVar.m48317f(th2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m28552g(C6619n c6619n) {
        int iOrdinal = c6619n.f25519g.ordinal();
        if (iOrdinal == 1) {
            c6619n.m28562C(e.CONFIGURED);
            c6619n.m28567H();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            C5931r1.m26572l("AudioSource", "AudioSource is released. Calling stop() is a no-op.");
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m28556k(C6619n c6619n, boolean z10) {
        int iOrdinal = c6619n.f25519g.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
            return;
        }
        c6619n.f25514b.set(null);
        c6619n.f25515c.set(false);
        c6619n.m28562C(e.STARTED);
        c6619n.m28570q(z10);
        c6619n.m28567H();
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC6262c.a m28557l(InterfaceC6262c<? extends InterfaceC8359h1> interfaceC6262c) {
        try {
            InterfaceFutureC9440x<? extends InterfaceC8359h1> interfaceFutureC9440xMo34017b = interfaceC6262c.mo34017b();
            if (interfaceFutureC9440xMo34017b.isDone()) {
                return (InterfaceC6262c.a) interfaceFutureC9440xMo34017b.get();
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static long m28558n() {
        return System.nanoTime();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m28559o(int i10, int i11, int i12) {
        return C6624s.m28596n(i10, i11, i12);
    }

    /* JADX INFO: renamed from: A */
    public void m28560A(final Executor executor, final c cVar) {
        this.f25513a.execute(new Runnable() { // from class: i1.l
            @Override // java.lang.Runnable
            public final void run() {
                C6619n.m28547b(this.f25508a, executor, cVar);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public void m28561B(final InterfaceC6262c<? extends InterfaceC8359h1> interfaceC6262c) {
        this.f25513a.execute(new Runnable() { // from class: i1.g
            @Override // java.lang.Runnable
            public final void run() {
                C6619n.m28549d(this.f25500a, interfaceC6262c);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public void m28562C(e eVar) {
        C5931r1.m26561a("AudioSource", "Transitioning internal state: " + this.f25519g + " --> " + eVar);
        this.f25519g = eVar;
    }

    /* JADX INFO: renamed from: D */
    public void m28563D(final boolean z10) {
        this.f25513a.execute(new Runnable() { // from class: i1.f
            @Override // java.lang.Runnable
            public final void run() {
                C6619n.m28556k(this.f25498a, z10);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m28564E() {
        if (this.f25521i) {
            return;
        }
        try {
            C5931r1.m26561a("AudioSource", "startSendingAudio");
            this.f25516d.start();
            this.f25527o = false;
        } catch (InterfaceC6621p.b e10) {
            C5931r1.m26573m("AudioSource", "Failed to start AudioStream", e10);
            this.f25527o = true;
            this.f25517e.start();
            this.f25528p = m28558n();
            m28572s();
        }
        this.f25521i = true;
        m28579z();
    }

    /* JADX INFO: renamed from: F */
    public void m28565F() {
        this.f25513a.execute(new Runnable() { // from class: i1.b
            @Override // java.lang.Runnable
            public final void run() {
                C6619n.m28552g(this.f25466a);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final void m28566G() {
        if (this.f25521i) {
            this.f25521i = false;
            C5931r1.m26561a("AudioSource", "stopSendingAudio");
            this.f25516d.stop();
        }
    }

    /* JADX INFO: renamed from: H */
    public void m28567H() {
        if (this.f25519g != e.STARTED) {
            m28566G();
            return;
        }
        boolean z10 = this.f25520h == InterfaceC6262c.a.ACTIVE;
        m28573t(!z10);
        if (z10) {
            m28564E();
        } else {
            m28566G();
        }
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC6621p m28568m() {
        return this.f25527o ? this.f25517e : this.f25516d;
    }

    /* JADX INFO: renamed from: p */
    public boolean m28569p() {
        C12637g.m47077i(this.f25528p > 0);
        return m28558n() - this.f25528p >= this.f25518f;
    }

    /* JADX INFO: renamed from: q */
    public void m28570q(final boolean z10) {
        this.f25513a.execute(new Runnable() { // from class: i1.i
            @Override // java.lang.Runnable
            public final void run() {
                C6619n.m28550e(this.f25502a, z10);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m28571r(final Throwable th2) {
        Executor executor = this.f25522j;
        final c cVar = this.f25523k;
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

    /* JADX INFO: renamed from: s */
    public void m28572s() {
        Executor executor = this.f25522j;
        final c cVar = this.f25523k;
        if (executor == null || cVar == null) {
            return;
        }
        final boolean z10 = this.f25530r || this.f25527o || this.f25529q;
        if (Objects.equals(this.f25514b.getAndSet(Boolean.valueOf(z10)), Boolean.valueOf(z10))) {
            return;
        }
        executor.execute(new Runnable() { // from class: i1.j
            @Override // java.lang.Runnable
            public final void run() {
                cVar.mo24520a(z10);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public void m28573t(final boolean z10) {
        Executor executor = this.f25522j;
        final c cVar = this.f25523k;
        if (executor == null || cVar == null || this.f25515c.getAndSet(z10) == z10) {
            return;
        }
        executor.execute(new Runnable() { // from class: i1.c
            @Override // java.lang.Runnable
            public final void run() {
                cVar.m28582c(z10);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m28574u(ByteBuffer byteBuffer, int i10) {
        byte[] bArr = this.f25531s;
        if (bArr == null || bArr.length < i10) {
            this.f25531s = new byte[i10];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.f25531s, 0, i10);
        byteBuffer.limit(byteBuffer.position()).position(iPosition);
    }

    /* JADX INFO: renamed from: v */
    public void m28575v(ByteBuffer byteBuffer) {
        Executor executor = this.f25522j;
        final c cVar = this.f25523k;
        if (this.f25534v == 2) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            double dMax = 0.0d;
            while (shortBufferAsShortBuffer.hasRemaining()) {
                dMax = Math.max(dMax, Math.abs((int) shortBufferAsShortBuffer.get()));
            }
            this.f25532t = dMax / 32767.0d;
            if (executor == null || cVar == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: i1.m
                @Override // java.lang.Runnable
                public final void run() {
                    cVar.mo24521b(this.f25511a.f25532t);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public InterfaceFutureC9440x<Void> m28576w() {
        return C12997c.m48311a(new C12997c.c() { // from class: i1.e
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C6619n.m28546a(this.f25489a, aVar);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m28577x(InterfaceC6262c<? extends InterfaceC8359h1> interfaceC6262c) {
        InterfaceC6262c<? extends InterfaceC8359h1> interfaceC6262c2 = this.f25524l;
        if (interfaceC6262c2 != null) {
            InterfaceC8722a3.a<InterfaceC6262c.a> aVar = this.f25526n;
            Objects.requireNonNull(aVar);
            interfaceC6262c2.mo34019d(aVar);
            this.f25524l = null;
            this.f25526n = null;
            this.f25525m = null;
            this.f25520h = InterfaceC6262c.a.INACTIVE;
            m28567H();
        }
        if (interfaceC6262c != null) {
            this.f25524l = interfaceC6262c;
            this.f25526n = new a(interfaceC6262c);
            this.f25525m = new b(interfaceC6262c);
            InterfaceC6262c.a aVarM28557l = m28557l(interfaceC6262c);
            if (aVarM28557l != null) {
                this.f25520h = aVarM28557l;
                m28567H();
            }
            this.f25524l.mo34018c(this.f25513a, this.f25526n);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m28578y() {
        C12637g.m47077i(this.f25527o);
        try {
            this.f25516d.start();
            C5931r1.m26561a("AudioSource", "Retry start AudioStream succeed");
            this.f25517e.stop();
            this.f25527o = false;
        } catch (InterfaceC6621p.b e10) {
            C5931r1.m26573m("AudioSource", "Retry start AudioStream failed", e10);
            this.f25528p = m28558n();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m28579z() {
        InterfaceC6262c<? extends InterfaceC8359h1> interfaceC6262c = this.f25524l;
        Objects.requireNonNull(interfaceC6262c);
        InterfaceFutureC9440x<? extends InterfaceC8359h1> interfaceFutureC9440xMo27506e = interfaceC6262c.mo27506e();
        InterfaceC10762c<InterfaceC8359h1> interfaceC10762c = this.f25525m;
        Objects.requireNonNull(interfaceC10762c);
        C10773n.m40987j(interfaceFutureC9440xMo27506e, interfaceC10762c, this.f25513a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6619n(AbstractC6601a abstractC6601a, Executor executor, Context context, InterfaceC6622q interfaceC6622q, long j10) throws C6620o {
        this.f25514b = new AtomicReference<>(null);
        this.f25515c = new AtomicBoolean(false);
        this.f25519g = e.CONFIGURED;
        this.f25520h = InterfaceC6262c.a.INACTIVE;
        this.f25533u = 0L;
        Executor executorM40086g = C10417c.m40086g(executor);
        this.f25513a = executorM40086g;
        this.f25518f = TimeUnit.MILLISECONDS.toNanos(j10);
        try {
            C6606c0 c6606c0 = new C6606c0(interfaceC6622q.mo28545a(abstractC6601a, context), abstractC6601a);
            this.f25516d = c6606c0;
            c6606c0.mo28531b(new d(), executorM40086g);
            this.f25517e = new C6610e0(abstractC6601a);
            this.f25534v = abstractC6601a.mo28509b();
            this.f25535w = abstractC6601a.mo28510c();
        } catch (InterfaceC6621p.b | IllegalArgumentException e10) {
            throw new C6620o("Unable to create AudioStream", e10);
        }
    }
}
