package m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class j1 implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f23813a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f23814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final me.x<Void> f23815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y1.c.a<Void> f23816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f23817f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f23818g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23819h = false;

    public j1(MediaCodec mediaCodec, int i10) {
        this.f23813a = (MediaCodec) x2.g.g(mediaCodec);
        this.b = x2.g.d(i10);
        this.f23814c = mediaCodec.getInputBuffer(i10);
        final AtomicReference atomicReference = new AtomicReference();
        this.f23815d = y1.c.a(new y1.c.InterfaceC0650c() { // from class: m1.i1
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return j1.e(atomicReference, aVar);
            }
        });
        this.f23816e = (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
    }

    public static /* synthetic */ Object e(AtomicReference atomicReference, y1.c.a aVar) {
        atomicReference.set(aVar);
        return "Terminate InputBuffer";
    }

    @Override // m1.h1
    public void a(boolean z10) {
        f();
        this.f23819h = z10;
    }

    @Override // m1.h1
    public boolean b() {
        if (this.f23817f.getAndSet(true)) {
            return false;
        }
        try {
            this.f23813a.queueInputBuffer(this.b, this.f23814c.position(), this.f23814c.limit(), this.f23818g, this.f23819h ? 4 : 0);
            this.f23816e.c(null);
            return true;
        } catch (IllegalStateException e10) {
            this.f23816e.f(e10);
            return false;
        }
    }

    @Override // m1.h1
    public void c(long j10) {
        f();
        x2.g.a(j10 >= 0);
        this.f23818g = j10;
    }

    @Override // m1.h1
    public boolean cancel() {
        if (this.f23817f.getAndSet(true)) {
            return false;
        }
        try {
            this.f23813a.queueInputBuffer(this.b, 0, 0, 0L, 0);
            this.f23816e.c(null);
        } catch (IllegalStateException e10) {
            this.f23816e.f(e10);
        }
        return true;
    }

    @Override // m1.h1
    public me.x<Void> d() {
        return r0.n.s(this.f23815d);
    }

    public final void f() {
        if (this.f23817f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    @Override // m1.h1
    public ByteBuffer t() {
        f();
        return this.f23814c;
    }
}
