package i1;

import g0.r1;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class e0 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f20176a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f20179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f20180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p.a f20181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Executor f20182h;

    public e0(a aVar) {
        this.f20177c = aVar.d();
        this.f20178d = aVar.e();
    }

    public static void d(long j10) {
        long jG = j10 - g();
        if (jG > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(jG));
            } catch (InterruptedException e10) {
                r1.m("SilentAudioStream", "Ignore interruption", e10);
            }
        }
    }

    private void e() {
        x2.g.j(!this.b.get(), "AudioStream has been released.");
    }

    private void f() {
        x2.g.j(this.f20176a.get(), "AudioStream has not been started.");
    }

    public static long g() {
        return System.nanoTime();
    }

    @Override // i1.p
    public void a() {
        this.b.getAndSet(true);
    }

    @Override // i1.p
    public void b(p.a aVar, Executor executor) {
        boolean z10 = true;
        x2.g.j(!this.f20176a.get(), "AudioStream can not be started when setCallback.");
        e();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        x2.g.b(z10, "executor can't be null with non-null callback.");
        this.f20181g = aVar;
        this.f20182h = executor;
    }

    public final void h() {
        final p.a aVar = this.f20181g;
        Executor executor = this.f20182h;
        if (aVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: i1.d0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.a(true);
            }
        });
    }

    public final void i(ByteBuffer byteBuffer, int i10) {
        x2.g.i(i10 <= byteBuffer.remaining());
        byte[] bArr = this.f20179e;
        if (bArr == null || bArr.length < i10) {
            this.f20179e = new byte[i10];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.f20179e, 0, i10).limit(i10 + iPosition).position(iPosition);
    }

    @Override // i1.p
    public p.c read(ByteBuffer byteBuffer) {
        e();
        f();
        long jG = t.g(byteBuffer.remaining(), this.f20177c);
        int iE = (int) t.e(jG, this.f20177c);
        if (iE <= 0) {
            return p.c.c(0, this.f20180f);
        }
        long jD = this.f20180f + t.d(jG, this.f20178d);
        d(jD);
        i(byteBuffer, iE);
        p.c cVarC = p.c.c(iE, this.f20180f);
        this.f20180f = jD;
        return cVarC;
    }

    @Override // i1.p
    public void start() {
        e();
        if (this.f20176a.getAndSet(true)) {
            return;
        }
        this.f20180f = g();
        h();
    }

    @Override // i1.p
    public void stop() {
        e();
        this.f20176a.set(false);
    }
}
