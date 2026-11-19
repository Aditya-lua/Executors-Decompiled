package m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f22830a;
    public final MediaCodec.BufferInfo b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteBuffer f22832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pe.x<Void> f22833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y1.c.a<Void> f22834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f22835g = new AtomicBoolean(false);

    public k(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        this.f22830a = (MediaCodec) x2.g.g(mediaCodec);
        this.f22831c = i10;
        this.f22832d = mediaCodec.getOutputBuffer(i10);
        this.b = (MediaCodec.BufferInfo) x2.g.g(bufferInfo);
        final AtomicReference atomicReference = new AtomicReference();
        this.f22833e = y1.c.a(new y1.c.InterfaceC0761c() { // from class: m1.j
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return k.a(atomicReference, aVar);
            }
        });
        this.f22834f = (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, y1.c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    public pe.x<Void> b() {
        return r0.n.s(this.f22833e);
    }

    public final void c() {
        if (this.f22835g.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
    }

    @Override // m1.i, java.lang.AutoCloseable
    public void close() {
        if (this.f22835g.getAndSet(true)) {
            return;
        }
        try {
            this.f22830a.releaseOutputBuffer(this.f22831c, false);
            this.f22834f.c(null);
        } catch (IllegalStateException e10) {
            this.f22834f.f(e10);
        }
    }

    @Override // m1.i
    public long d1() {
        return this.b.presentationTimeUs;
    }

    @Override // m1.i
    public MediaCodec.BufferInfo o0() {
        return this.b;
    }

    @Override // m1.i
    public long size() {
        return this.b.size;
    }

    @Override // m1.i
    public ByteBuffer v() {
        c();
        this.f22832d.position(this.b.offset);
        ByteBuffer byteBuffer = this.f22832d;
        MediaCodec.BufferInfo bufferInfo = this.b;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.f22832d;
    }

    @Override // m1.i
    public boolean v0() {
        return (this.b.flags & 1) != 0;
    }
}
