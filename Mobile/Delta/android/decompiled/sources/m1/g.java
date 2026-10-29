package m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f23745a;
    public final MediaCodec.BufferInfo b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final me.x<Void> f23746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1.c.a<Void> f23747d;

    public g(i iVar) {
        this.b = c(iVar);
        this.f23745a = b(iVar);
        final AtomicReference atomicReference = new AtomicReference();
        this.f23746c = y1.c.a(new y1.c.InterfaceC0650c() { // from class: m1.f
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return g.a(atomicReference, aVar);
            }
        });
        this.f23747d = (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, y1.c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    public final ByteBuffer b(i iVar) {
        ByteBuffer byteBufferT = iVar.t();
        MediaCodec.BufferInfo bufferInfoM0 = iVar.m0();
        byteBufferT.position(bufferInfoM0.offset);
        byteBufferT.limit(bufferInfoM0.offset + bufferInfoM0.size);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfoM0.size);
        byteBufferAllocate.order(byteBufferT.order());
        byteBufferAllocate.put(byteBufferT);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public final MediaCodec.BufferInfo c(i iVar) {
        MediaCodec.BufferInfo bufferInfoM0 = iVar.m0();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, bufferInfoM0.size, bufferInfoM0.presentationTimeUs, bufferInfoM0.flags);
        return bufferInfo;
    }

    @Override // m1.i, java.lang.AutoCloseable
    public void close() {
        this.f23747d.c(null);
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
        return this.f23745a;
    }

    @Override // m1.i
    public boolean w0() {
        return (this.b.flags & 1) != 0;
    }
}
