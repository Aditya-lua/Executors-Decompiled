package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Settings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xu.e;
import xu.r0;
import xu.u;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lxu/e;", "buffer", "", "inflate", "(Lxu/e;)V", "close", "()V", "Z", "deflatedBytes", "Lxu/e;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "Lxu/u;", "inflaterSource", "Lxu/u;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MessageInflater implements Closeable {

    @NotNull
    private final e deflatedBytes = new e();

    @Nullable
    private Inflater inflater;

    @Nullable
    private u inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z10) {
        this.noContextTakeover = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        u uVar = this.inflaterSource;
        if (uVar != null) {
            uVar.close();
        }
        this.inflaterSource = null;
        this.inflater = null;
    }

    public final void inflate(@NotNull e buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.deflatedBytes.getSize() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Inflater inflater = this.inflater;
        if (inflater == null) {
            inflater = new Inflater(true);
            this.inflater = inflater;
        }
        u uVar = this.inflaterSource;
        if (uVar == null) {
            uVar = new u((r0) this.deflatedBytes, inflater);
            this.inflaterSource = uVar;
        }
        if (this.noContextTakeover) {
            inflater.reset();
        }
        this.deflatedBytes.g2(buffer);
        this.deflatedBytes.writeInt(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        long bytesRead = inflater.getBytesRead() + this.deflatedBytes.getSize();
        do {
            uVar.a(buffer, Long.MAX_VALUE);
            if (inflater.getBytesRead() >= bytesRead) {
                break;
            }
        } while (!inflater.finished());
        if (inflater.getBytesRead() < bytesRead) {
            this.deflatedBytes.a();
            uVar.close();
            this.inflaterSource = null;
            this.inflater = null;
        }
    }
}
