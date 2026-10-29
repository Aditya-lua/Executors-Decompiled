package p282m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ne.InterfaceFutureC9440x;
import p397r0.C10773n;
import p533x2.C12637g;
import p563y1.C12997c;

/* JADX INFO: renamed from: m1.k */
/* JADX INFO: loaded from: classes.dex */
public class C8366k implements InterfaceC8360i {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f30901a;

    /* JADX INFO: renamed from: b */
    public final MediaCodec.BufferInfo f30902b;

    /* JADX INFO: renamed from: c */
    public final int f30903c;

    /* JADX INFO: renamed from: d */
    public final ByteBuffer f30904d;

    /* JADX INFO: renamed from: e */
    public final InterfaceFutureC9440x<Void> f30905e;

    /* JADX INFO: renamed from: f */
    public final C12997c.a<Void> f30906f;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f30907g = new AtomicBoolean(false);

    public C8366k(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        this.f30901a = (MediaCodec) C12637g.m47075g(mediaCodec);
        this.f30903c = i10;
        this.f30904d = mediaCodec.getOutputBuffer(i10);
        this.f30902b = (MediaCodec.BufferInfo) C12637g.m47075g(bufferInfo);
        final AtomicReference atomicReference = new AtomicReference();
        this.f30905e = C12997c.m48311a(new C12997c.c() { // from class: m1.j
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C8366k.m34048a(atomicReference, aVar);
            }
        });
        this.f30906f = (C12997c.a) C12637g.m47075g((C12997c.a) atomicReference.get());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m34048a(AtomicReference atomicReference, C12997c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    /* JADX INFO: renamed from: b */
    public InterfaceFutureC9440x<Void> m34049b() {
        return C10773n.m40996s(this.f30905e);
    }

    /* JADX INFO: renamed from: c */
    public final void m34050c() {
        if (this.f30907g.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
    }

    @Override // p282m1.InterfaceC8360i, java.lang.AutoCloseable
    public void close() {
        if (this.f30907g.getAndSet(true)) {
            return;
        }
        try {
            this.f30901a.releaseOutputBuffer(this.f30903c, false);
            this.f30906f.m48314c(null);
        } catch (IllegalStateException e10) {
            this.f30906f.m48317f(e10);
        }
    }

    @Override // p282m1.InterfaceC8360i
    /* JADX INFO: renamed from: f1 */
    public long mo33933f1() {
        return this.f30902b.presentationTimeUs;
    }

    @Override // p282m1.InterfaceC8360i
    /* JADX INFO: renamed from: m0 */
    public MediaCodec.BufferInfo mo33934m0() {
        return this.f30902b;
    }

    @Override // p282m1.InterfaceC8360i
    public long size() {
        return this.f30902b.size;
    }

    @Override // p282m1.InterfaceC8360i
    /* JADX INFO: renamed from: t */
    public ByteBuffer mo33935t() {
        m34050c();
        this.f30904d.position(this.f30902b.offset);
        ByteBuffer byteBuffer = this.f30904d;
        MediaCodec.BufferInfo bufferInfo = this.f30902b;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.f30904d;
    }

    @Override // p282m1.InterfaceC8360i
    /* JADX INFO: renamed from: w0 */
    public boolean mo33936w0() {
        return (this.f30902b.flags & 1) != 0;
    }
}
