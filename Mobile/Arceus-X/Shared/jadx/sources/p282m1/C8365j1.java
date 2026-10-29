package p282m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ne.InterfaceFutureC9440x;
import p397r0.C10773n;
import p533x2.C12637g;
import p563y1.C12997c;

/* JADX INFO: renamed from: m1.j1 */
/* JADX INFO: loaded from: classes.dex */
public class C8365j1 implements InterfaceC8359h1 {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f30893a;

    /* JADX INFO: renamed from: b */
    public final int f30894b;

    /* JADX INFO: renamed from: c */
    public final ByteBuffer f30895c;

    /* JADX INFO: renamed from: d */
    public final InterfaceFutureC9440x<Void> f30896d;

    /* JADX INFO: renamed from: e */
    public final C12997c.a<Void> f30897e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f30898f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    public long f30899g = 0;

    /* JADX INFO: renamed from: h */
    public boolean f30900h = false;

    public C8365j1(MediaCodec mediaCodec, int i10) {
        this.f30893a = (MediaCodec) C12637g.m47075g(mediaCodec);
        this.f30894b = C12637g.m47072d(i10);
        this.f30895c = mediaCodec.getInputBuffer(i10);
        final AtomicReference atomicReference = new AtomicReference();
        this.f30896d = C12997c.m48311a(new C12997c.c() { // from class: m1.i1
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C8365j1.m34046e(atomicReference, aVar);
            }
        });
        this.f30897e = (C12997c.a) C12637g.m47075g((C12997c.a) atomicReference.get());
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m34046e(AtomicReference atomicReference, C12997c.a aVar) {
        atomicReference.set(aVar);
        return "Terminate InputBuffer";
    }

    @Override // p282m1.InterfaceC8359h1
    /* JADX INFO: renamed from: a */
    public void mo33937a(boolean z10) {
        m34047f();
        this.f30900h = z10;
    }

    @Override // p282m1.InterfaceC8359h1
    /* JADX INFO: renamed from: b */
    public boolean mo33938b() {
        if (this.f30898f.getAndSet(true)) {
            return false;
        }
        try {
            this.f30893a.queueInputBuffer(this.f30894b, this.f30895c.position(), this.f30895c.limit(), this.f30899g, this.f30900h ? 4 : 0);
            this.f30897e.m48314c(null);
            return true;
        } catch (IllegalStateException e10) {
            this.f30897e.m48317f(e10);
            return false;
        }
    }

    @Override // p282m1.InterfaceC8359h1
    /* JADX INFO: renamed from: c */
    public void mo33939c(long j10) {
        m34047f();
        C12637g.m47069a(j10 >= 0);
        this.f30899g = j10;
    }

    @Override // p282m1.InterfaceC8359h1
    public boolean cancel() {
        if (this.f30898f.getAndSet(true)) {
            return false;
        }
        try {
            this.f30893a.queueInputBuffer(this.f30894b, 0, 0, 0L, 0);
            this.f30897e.m48314c(null);
        } catch (IllegalStateException e10) {
            this.f30897e.m48317f(e10);
        }
        return true;
    }

    @Override // p282m1.InterfaceC8359h1
    /* JADX INFO: renamed from: d */
    public InterfaceFutureC9440x<Void> mo33940d() {
        return C10773n.m40996s(this.f30896d);
    }

    /* JADX INFO: renamed from: f */
    public final void m34047f() {
        if (this.f30898f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    @Override // p282m1.InterfaceC8359h1
    /* JADX INFO: renamed from: t */
    public ByteBuffer mo33941t() {
        m34047f();
        return this.f30895c;
    }
}
