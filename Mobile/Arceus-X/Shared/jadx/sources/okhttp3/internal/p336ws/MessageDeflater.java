package okhttp3.internal.p336ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p477ut.C11958c;
import p560xu.C12924e;
import p560xu.C12930h;
import p560xu.DeflaterSink;
import p560xu.InterfaceC12947p0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m31665d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lxu/e;", "Lxu/h;", "suffix", "endsWith", "(Lxu/e;Lxu/h;)Z", "buffer", "", "deflate", "(Lxu/e;)V", "close", "()V", "Z", "deflatedBytes", "Lxu/e;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Lxu/i;", "deflaterSink", "Lxu/i;", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class MessageDeflater implements Closeable {

    @NotNull
    private final C12924e deflatedBytes;

    @NotNull
    private final Deflater deflater;

    @NotNull
    private final DeflaterSink deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z10) {
        this.noContextTakeover = z10;
        C12924e c12924e = new C12924e();
        this.deflatedBytes = c12924e;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink((InterfaceC12947p0) c12924e, deflater);
    }

    private final boolean endsWith(C12924e c12924e, C12930h c12930h) {
        return c12924e.mo48044o0(c12924e.getSize() - ((long) c12930h.m48089I()), c12930h);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.deflaterSink.close();
    }

    public final void deflate(@NotNull C12924e buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.deflatedBytes.getSize() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(buffer, buffer.getSize());
        this.deflaterSink.flush();
        if (endsWith(this.deflatedBytes, MessageDeflaterKt.EMPTY_DEFLATE_BLOCK)) {
            long size = this.deflatedBytes.getSize() - ((long) 4);
            C12924e.a aVarM47989v = C12924e.m47989v(this.deflatedBytes, null, 1, null);
            try {
                aVarM47989v.m48062c(size);
                C11958c.m44629a(aVarM47989v, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C11958c.m44629a(aVarM47989v, th2);
                    throw th3;
                }
            }
        } else {
            this.deflatedBytes.writeByte(0);
        }
        C12924e c12924e = this.deflatedBytes;
        buffer.write(c12924e, c12924e.getSize());
    }
}
