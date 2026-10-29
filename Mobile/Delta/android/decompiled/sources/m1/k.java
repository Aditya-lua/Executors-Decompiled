package m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f23820a;
    public final MediaCodec.BufferInfo b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteBuffer f23822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final me.x<Void> f23823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y1.c.a<Void> f23824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f23825g = new AtomicBoolean(false);

    public k(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        this.f23820a = (MediaCodec) x2.g.g(mediaCodec);
        this.f23821c = i10;
        this.f23822d = mediaCodec.getOutputBuffer(i10);
        this.b = (MediaCodec.BufferInfo) x2.g.g(bufferInfo);
        final AtomicReference atomicReference = new AtomicReference();
        this.f23823e = y1.c.a(new y1.c.InterfaceC0650c() { // from class: m1.j
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return k.a(atomicReference, aVar);
            }
        });
        this.f23824f = (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, y1.c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    public me.x<Void> b() {
        return r0.n.s(this.f23823e);
    }

    public final void c() {
        if (this.f23825g.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
    }

    @Override // m1.i, java.lang.AutoCloseable
    public void close() {
        if (this.f23825g.getAndSet(true)) {
            return;
        }
        try {
            this.f23820a.releaseOutputBuffer(this.f23821c, false);
            this.f23824f.c(null);
        } catch (IllegalStateException e10) {
            this.f23824f.f(e10);
        }
    }

    @Override // m1.i
    public long e1() {
        return this.b.presentationTimeUs;
    }

    @Override // m1.i
    public MediaCodec.BufferInfo m0() {
        return this.b;
    }

    @Override // m1.i
    public long size() {
        return this.b.size;
    }

    @Override // m1.i
    public ByteBuffer t() {
        c();
        this.f23822d.position(this.b.offset);
        ByteBuffer byteBuffer = this.f23822d;
        MediaCodec.BufferInfo bufferInfo = this.b;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.f23822d;
    }

    @Override // m1.i
    public boolean w0() {
        return (this.b.flags & 1) != 0;
    }
}
