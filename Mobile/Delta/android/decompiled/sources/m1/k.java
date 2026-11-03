package m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f24470a;
    public final MediaCodec.BufferInfo b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteBuffer f24472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ne.x<Void> f24473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y1.c.a<Void> f24474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f24475g = new AtomicBoolean(false);

    public k(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        this.f24470a = (MediaCodec) x2.g.g(mediaCodec);
        this.f24471c = i10;
        this.f24472d = mediaCodec.getOutputBuffer(i10);
        this.b = (MediaCodec.BufferInfo) x2.g.g(bufferInfo);
        final AtomicReference atomicReference = new AtomicReference();
        this.f24473e = y1.c.a(new y1.c.InterfaceC0665c() { // from class: m1.j
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return k.a(atomicReference, aVar);
            }
        });
        this.f24474f = (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, y1.c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    @Override // m1.i
    public long a1() {
        return this.b.presentationTimeUs;
    }

    public ne.x<Void> b() {
        return r0.n.s(this.f24473e);
    }

    public final void c() {
        if (this.f24475g.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
    }

    @Override // m1.i, java.lang.AutoCloseable
    public void close() {
        if (this.f24475g.getAndSet(true)) {
            return;
        }
        try {
            this.f24470a.releaseOutputBuffer(this.f24471c, false);
            this.f24474f.c(null);
        } catch (IllegalStateException e10) {
            this.f24474f.f(e10);
        }
    }

    @Override // m1.i
    public MediaCodec.BufferInfo j0() {
        return this.b;
    }

    @Override // m1.i
    public boolean s0() {
        return (this.b.flags & 1) != 0;
    }

    @Override // m1.i
    public long size() {
        return this.b.size;
    }

    @Override // m1.i
    public ByteBuffer t() {
        c();
        this.f24472d.position(this.b.offset);
        ByteBuffer byteBuffer = this.f24472d;
        MediaCodec.BufferInfo bufferInfo = this.b;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.f24472d;
    }
}
