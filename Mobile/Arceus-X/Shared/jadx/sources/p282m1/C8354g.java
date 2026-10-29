package p282m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import ne.InterfaceFutureC9440x;
import p533x2.C12637g;
import p563y1.C12997c;

/* JADX INFO: renamed from: m1.g */
/* JADX INFO: loaded from: classes.dex */
public class C8354g implements InterfaceC8360i {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f30807a;

    /* JADX INFO: renamed from: b */
    public final MediaCodec.BufferInfo f30808b;

    /* JADX INFO: renamed from: c */
    public final InterfaceFutureC9440x<Void> f30809c;

    /* JADX INFO: renamed from: d */
    public final C12997c.a<Void> f30810d;

    public C8354g(InterfaceC8360i interfaceC8360i) {
        this.f30808b = m33932c(interfaceC8360i);
        this.f30807a = m33931b(interfaceC8360i);
        final AtomicReference atomicReference = new AtomicReference();
        this.f30809c = C12997c.m48311a(new C12997c.c() { // from class: m1.f
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C8354g.m33930a(atomicReference, aVar);
            }
        });
        this.f30810d = (C12997c.a) C12637g.m47075g((C12997c.a) atomicReference.get());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m33930a(AtomicReference atomicReference, C12997c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    /* JADX INFO: renamed from: b */
    public final ByteBuffer m33931b(InterfaceC8360i interfaceC8360i) {
        ByteBuffer byteBufferMo33935t = interfaceC8360i.mo33935t();
        MediaCodec.BufferInfo bufferInfoMo33934m0 = interfaceC8360i.mo33934m0();
        byteBufferMo33935t.position(bufferInfoMo33934m0.offset);
        byteBufferMo33935t.limit(bufferInfoMo33934m0.offset + bufferInfoMo33934m0.size);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfoMo33934m0.size);
        byteBufferAllocate.order(byteBufferMo33935t.order());
        byteBufferAllocate.put(byteBufferMo33935t);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: c */
    public final MediaCodec.BufferInfo m33932c(InterfaceC8360i interfaceC8360i) {
        MediaCodec.BufferInfo bufferInfoMo33934m0 = interfaceC8360i.mo33934m0();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, bufferInfoMo33934m0.size, bufferInfoMo33934m0.presentationTimeUs, bufferInfoMo33934m0.flags);
        return bufferInfo;
    }

    @Override // p282m1.InterfaceC8360i, java.lang.AutoCloseable
    public void close() {
        this.f30810d.m48314c(null);
    }

    @Override // p282m1.InterfaceC8360i
    /* JADX INFO: renamed from: f1 */
    public long mo33933f1() {
        return this.f30808b.presentationTimeUs;
    }

    @Override // p282m1.InterfaceC8360i
    /* JADX INFO: renamed from: m0 */
    public MediaCodec.BufferInfo mo33934m0() {
        return this.f30808b;
    }

    @Override // p282m1.InterfaceC8360i
    public long size() {
        return this.f30808b.size;
    }

    @Override // p282m1.InterfaceC8360i
    /* JADX INFO: renamed from: t */
    public ByteBuffer mo33935t() {
        return this.f30807a;
    }

    @Override // p282m1.InterfaceC8360i
    /* JADX INFO: renamed from: w0 */
    public boolean mo33936w0() {
        return (this.f30808b.flags & 1) != 0;
    }
}
