package p183i1;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p140g0.C5931r1;
import p533x2.C12637g;

/* JADX INFO: renamed from: i1.e0 */
/* JADX INFO: loaded from: classes.dex */
public class C6610e0 implements InterfaceC6621p {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f25490a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f25491b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final int f25492c;

    /* JADX INFO: renamed from: d */
    public final int f25493d;

    /* JADX INFO: renamed from: e */
    public byte[] f25494e;

    /* JADX INFO: renamed from: f */
    public long f25495f;

    /* JADX INFO: renamed from: g */
    public InterfaceC6621p.a f25496g;

    /* JADX INFO: renamed from: h */
    public Executor f25497h;

    public C6610e0(AbstractC6601a abstractC6601a) {
        this.f25492c = abstractC6601a.m28511d();
        this.f25493d = abstractC6601a.mo28512e();
    }

    /* JADX INFO: renamed from: d */
    public static void m28539d(long j10) {
        long jM28542g = j10 - m28542g();
        if (jM28542g > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(jM28542g));
            } catch (InterruptedException e10) {
                C5931r1.m26573m("SilentAudioStream", "Ignore interruption", e10);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m28540e() {
        C12637g.m47078j(!this.f25491b.get(), "AudioStream has been released.");
    }

    /* JADX INFO: renamed from: f */
    private void m28541f() {
        C12637g.m47078j(this.f25490a.get(), "AudioStream has not been started.");
    }

    /* JADX INFO: renamed from: g */
    public static long m28542g() {
        return System.nanoTime();
    }

    @Override // p183i1.InterfaceC6621p
    /* JADX INFO: renamed from: a */
    public void mo28530a() {
        this.f25491b.getAndSet(true);
    }

    @Override // p183i1.InterfaceC6621p
    /* JADX INFO: renamed from: b */
    public void mo28531b(InterfaceC6621p.a aVar, Executor executor) {
        boolean z10 = true;
        C12637g.m47078j(!this.f25490a.get(), "AudioStream can not be started when setCallback.");
        m28540e();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        C12637g.m47070b(z10, "executor can't be null with non-null callback.");
        this.f25496g = aVar;
        this.f25497h = executor;
    }

    /* JADX INFO: renamed from: h */
    public final void m28543h() {
        final InterfaceC6621p.a aVar = this.f25496g;
        Executor executor = this.f25497h;
        if (aVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: i1.d0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.mo28583a(true);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m28544i(ByteBuffer byteBuffer, int i10) {
        C12637g.m47077i(i10 <= byteBuffer.remaining());
        byte[] bArr = this.f25494e;
        if (bArr == null || bArr.length < i10) {
            this.f25494e = new byte[i10];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.f25494e, 0, i10).limit(i10 + iPosition).position(iPosition);
    }

    @Override // p183i1.InterfaceC6621p
    public InterfaceC6621p.c read(ByteBuffer byteBuffer) {
        m28540e();
        m28541f();
        long jM28607g = C6625t.m28607g(byteBuffer.remaining(), this.f25492c);
        int iM28605e = (int) C6625t.m28605e(jM28607g, this.f25492c);
        if (iM28605e <= 0) {
            return InterfaceC6621p.c.m28585c(0, this.f25495f);
        }
        long jM28604d = this.f25495f + C6625t.m28604d(jM28607g, this.f25493d);
        m28539d(jM28604d);
        m28544i(byteBuffer, iM28605e);
        InterfaceC6621p.c cVarM28585c = InterfaceC6621p.c.m28585c(iM28605e, this.f25495f);
        this.f25495f = jM28604d;
        return cVarM28585c;
    }

    @Override // p183i1.InterfaceC6621p
    public void start() {
        m28540e();
        if (this.f25490a.getAndSet(true)) {
            return;
        }
        this.f25495f = m28542g();
        m28543h();
    }

    @Override // p183i1.InterfaceC6621p
    public void stop() {
        m28540e();
        this.f25490a.set(false);
    }
}
