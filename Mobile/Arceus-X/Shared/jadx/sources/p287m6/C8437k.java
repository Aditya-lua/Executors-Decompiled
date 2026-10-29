package p287m6;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: m6.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\nJ'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Lm6/k;", "Ljava/io/InputStream;", "delegate", "<init>", "(Ljava/io/InputStream;)V", "", "read", "()I", "", "b", "([B)I", "off", "len", "([BII)I", "", "n", "skip", "(J)J", "available", "", "close", "()V", "bytesRead", "a", "(I)I", "Ljava/io/InputStream;", "I", "availableBytes", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8437k extends InputStream {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InputStream delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int availableBytes = 1073741824;

    public C8437k(@NotNull InputStream inputStream) {
        this.delegate = inputStream;
    }

    /* JADX INFO: renamed from: a */
    public final int m34201a(int bytesRead) {
        if (bytesRead == -1) {
            this.availableBytes = 0;
        }
        return bytesRead;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.availableBytes;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public int read() {
        return m34201a(this.delegate.read());
    }

    @Override // java.io.InputStream
    public long skip(long n10) {
        return this.delegate.skip(n10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.io.InputStream
    public int read(@NotNull byte[] b) {
        return m34201a(this.delegate.read(b));
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] b, int off, int len) {
        return m34201a(this.delegate.read(b, off, len));
    }
}
