package m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f24395a;
    public final MediaCodec.BufferInfo b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne.x<Void> f24396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1.c.a<Void> f24397d;

    public g(i iVar) {
        this.b = c(iVar);
        this.f24395a = b(iVar);
        final AtomicReference atomicReference = new AtomicReference();
        this.f24396c = y1.c.a(new y1.c.InterfaceC0665c() { // from class: m1.f
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return g.a(atomicReference, aVar);
            }
        });
        this.f24397d = (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, y1.c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    @Override // m1.i
    public long a1() {
        return this.b.presentationTimeUs;
    }

    public final ByteBuffer b(i iVar) {
        ByteBuffer byteBufferT = iVar.t();
        MediaCodec.BufferInfo bufferInfoJ0 = iVar.j0();
        byteBufferT.position(bufferInfoJ0.offset);
        byteBufferT.limit(bufferInfoJ0.offset + bufferInfoJ0.size);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfoJ0.size);
        byteBufferAllocate.order(byteBufferT.order());
        byteBufferAllocate.put(byteBufferT);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public final MediaCodec.BufferInfo c(i iVar) {
        MediaCodec.BufferInfo bufferInfoJ0 = iVar.j0();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, bufferInfoJ0.size, bufferInfoJ0.presentationTimeUs, bufferInfoJ0.flags);
        return bufferInfo;
    }

    @Override // m1.i, java.lang.AutoCloseable
    public void close() {
        this.f24397d.c(null);
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
        return this.f24395a;
    }
}
