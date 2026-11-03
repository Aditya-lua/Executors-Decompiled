package m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class j1 implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f24463a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f24464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ne.x<Void> f24465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y1.c.a<Void> f24466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f24467f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f24468g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24469h = false;

    public j1(MediaCodec mediaCodec, int i10) {
        this.f24463a = (MediaCodec) x2.g.g(mediaCodec);
        this.b = x2.g.d(i10);
        this.f24464c = mediaCodec.getInputBuffer(i10);
        final AtomicReference atomicReference = new AtomicReference();
        this.f24465d = y1.c.a(new y1.c.InterfaceC0665c() { // from class: m1.i1
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return j1.e(atomicReference, aVar);
            }
        });
        this.f24466e = (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
    }

    public static /* synthetic */ Object e(AtomicReference atomicReference, y1.c.a aVar) {
        atomicReference.set(aVar);
        return "Terminate InputBuffer";
    }

    @Override // m1.h1
    public void a(boolean z10) {
        f();
        this.f24469h = z10;
    }

    @Override // m1.h1
    public boolean b() {
        if (this.f24467f.getAndSet(true)) {
            return false;
        }
        try {
            this.f24463a.queueInputBuffer(this.b, this.f24464c.position(), this.f24464c.limit(), this.f24468g, this.f24469h ? 4 : 0);
            this.f24466e.c(null);
            return true;
        } catch (IllegalStateException e10) {
            this.f24466e.f(e10);
            return false;
        }
    }

    @Override // m1.h1
    public void c(long j10) {
        f();
        x2.g.a(j10 >= 0);
        this.f24468g = j10;
    }

    @Override // m1.h1
    public boolean cancel() {
        if (this.f24467f.getAndSet(true)) {
            return false;
        }
        try {
            this.f24463a.queueInputBuffer(this.b, 0, 0, 0L, 0);
            this.f24466e.c(null);
        } catch (IllegalStateException e10) {
            this.f24466e.f(e10);
        }
        return true;
    }

    @Override // m1.h1
    public ne.x<Void> d() {
        return r0.n.s(this.f24465d);
    }

    public final void f() {
        if (this.f24467f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    @Override // m1.h1
    public ByteBuffer t() {
        f();
        return this.f24464c;
    }
}
