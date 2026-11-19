package m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f22755a;
    public final MediaCodec.BufferInfo b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pe.x<Void> f22756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1.c.a<Void> f22757d;

    public g(i iVar) {
        this.b = c(iVar);
        this.f22755a = b(iVar);
        final AtomicReference atomicReference = new AtomicReference();
        this.f22756c = y1.c.a(new y1.c.InterfaceC0761c() { // from class: m1.f
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return g.a(atomicReference, aVar);
            }
        });
        this.f22757d = (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, y1.c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    public final ByteBuffer b(i iVar) {
        ByteBuffer byteBufferV = iVar.v();
        MediaCodec.BufferInfo bufferInfoO0 = iVar.o0();
        byteBufferV.position(bufferInfoO0.offset);
        byteBufferV.limit(bufferInfoO0.offset + bufferInfoO0.size);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfoO0.size);
        byteBufferAllocate.order(byteBufferV.order());
        byteBufferAllocate.put(byteBufferV);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public final MediaCodec.BufferInfo c(i iVar) {
        MediaCodec.BufferInfo bufferInfoO0 = iVar.o0();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, bufferInfoO0.size, bufferInfoO0.presentationTimeUs, bufferInfoO0.flags);
        return bufferInfo;
    }

    @Override // m1.i, java.lang.AutoCloseable
    public void close() {
        this.f22757d.c(null);
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
        return this.f22755a;
    }

    @Override // m1.i
    public boolean v0() {
        return (this.b.flags & 1) != 0;
    }
}
