package okhttp3.internal.p336ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p560xu.C12924e;
import p560xu.C12956u;
import p560xu.InterfaceC12951r0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lxu/e;", "buffer", "", "inflate", "(Lxu/e;)V", "close", "()V", "Z", "deflatedBytes", "Lxu/e;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "Lxu/u;", "inflaterSource", "Lxu/u;", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class MessageInflater implements Closeable {

    @NotNull
    private final C12924e deflatedBytes = new C12924e();

    @Nullable
    private Inflater inflater;

    @Nullable
    private C12956u inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z10) {
        this.noContextTakeover = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C12956u c12956u = this.inflaterSource;
        if (c12956u != null) {
            c12956u.close();
        }
        this.inflaterSource = null;
        this.inflater = null;
    }

    public final void inflate(@NotNull C12924e buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.deflatedBytes.getSize() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Inflater inflater = this.inflater;
        if (inflater == null) {
            inflater = new Inflater(true);
            this.inflater = inflater;
        }
        C12956u c12956u = this.inflaterSource;
        if (c12956u == null) {
            c12956u = new C12956u((InterfaceC12951r0) this.deflatedBytes, inflater);
            this.inflaterSource = c12956u;
        }
        if (this.noContextTakeover) {
            inflater.reset();
        }
        this.deflatedBytes.mo48028g2(buffer);
        this.deflatedBytes.writeInt(65535);
        long bytesRead = inflater.getBytesRead() + this.deflatedBytes.getSize();
        do {
            c12956u.m48197a(buffer, Long.MAX_VALUE);
            if (inflater.getBytesRead() >= bytesRead) {
                break;
            }
        } while (!inflater.finished());
        if (inflater.getBytesRead() < bytesRead) {
            this.deflatedBytes.m48017a();
            c12956u.close();
            this.inflaterSource = null;
            this.inflater = null;
        }
    }
}
