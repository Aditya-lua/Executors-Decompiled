package m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class j1 implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f22823a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f22824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pe.x<Void> f22825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y1.c.a<Void> f22826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f22827f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22828g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22829h = false;

    public j1(MediaCodec mediaCodec, int i10) {
        this.f22823a = (MediaCodec) x2.g.g(mediaCodec);
        this.b = x2.g.d(i10);
        this.f22824c = mediaCodec.getInputBuffer(i10);
        final AtomicReference atomicReference = new AtomicReference();
        this.f22825d = y1.c.a(new y1.c.InterfaceC0761c() { // from class: m1.i1
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return j1.e(atomicReference, aVar);
            }
        });
        this.f22826e = (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
    }

    public static /* synthetic */ Object e(AtomicReference atomicReference, y1.c.a aVar) {
        atomicReference.set(aVar);
        return "Terminate InputBuffer";
    }

    @Override // m1.h1
    public void a(boolean z10) {
        f();
        this.f22829h = z10;
    }

    @Override // m1.h1
    public boolean b() {
        if (this.f22827f.getAndSet(true)) {
            return false;
        }
        try {
            this.f22823a.queueInputBuffer(this.b, this.f22824c.position(), this.f22824c.limit(), this.f22828g, this.f22829h ? 4 : 0);
            this.f22826e.c(null);
            return true;
        } catch (IllegalStateException e10) {
            this.f22826e.f(e10);
            return false;
        }
    }

    @Override // m1.h1
    public void c(long j10) {
        f();
        x2.g.a(j10 >= 0);
        this.f22828g = j10;
    }

    @Override // m1.h1
    public boolean cancel() {
        if (this.f22827f.getAndSet(true)) {
            return false;
        }
        try {
            this.f22823a.queueInputBuffer(this.b, 0, 0, 0L, 0);
            this.f22826e.c(null);
        } catch (IllegalStateException e10) {
            this.f22826e.f(e10);
        }
        return true;
    }

    @Override // m1.h1
    public pe.x<Void> d() {
        return r0.n.s(this.f22825d);
    }

    public final void f() {
        if (this.f22827f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    @Override // m1.h1
    public ByteBuffer v() {
        f();
        return this.f22824c;
    }
}
