package p560xu;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xu.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001a\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0018H$¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H$¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u0013H$¢\u0006\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0016\u0010&\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010-\u001a\u00060'j\u0002`(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, m31665d2 = {"Lxu/j;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "readWrite", "<init>", "(Z)V", "", "fileOffset", "Lxu/e;", "sink", "byteCount", "j", "(JLxu/e;J)J", "size", "()J", "Lxu/r0;", "l", "(J)Lxu/r0;", "", "close", "()V", "", "array", "", "arrayOffset", "g", "(J[BII)I", "h", "f", "a", "Z", "getReadWrite", "()Z", "b", "closed", "c", "I", "openStreamCount", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "d", "Ljava/util/concurrent/locks/ReentrantLock;", "e", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC12934j implements Closeable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean readWrite;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean closed;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int openStreamCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ReentrantLock lock = C12959v0.m48203b();

    /* JADX INFO: renamed from: xu.j$a */
    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, m31665d2 = {"Lxu/j$a;", "Lxu/r0;", "Lxu/j;", "fileHandle", "", "position", "<init>", "(Lxu/j;J)V", "Lxu/e;", "sink", "byteCount", "read", "(Lxu/e;J)J", "Lxu/s0;", "timeout", "()Lxu/s0;", "", "close", "()V", "a", "Lxu/j;", "getFileHandle", "()Lxu/j;", "b", "J", "getPosition", "()J", "setPosition", "(J)V", "", "c", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC12951r0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final AbstractC12934j fileHandle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public long position;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean closed;

        public a(@NotNull AbstractC12934j fileHandle, long j10) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.fileHandle = fileHandle;
            this.position = j10;
        }

        @Override // p560xu.InterfaceC12951r0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ReentrantLock lock = this.fileHandle.getLock();
            lock.lock();
            try {
                this.fileHandle.openStreamCount--;
                if (this.fileHandle.openStreamCount == 0 && this.fileHandle.closed) {
                    Unit unit = Unit.f29331a;
                    lock.unlock();
                    this.fileHandle.mo48147f();
                    return;
                }
                lock.unlock();
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }

        @Override // p560xu.InterfaceC12951r0
        public long read(@NotNull C12924e sink, long byteCount) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            long jM48150j = this.fileHandle.m48150j(this.position, sink, byteCount);
            if (jM48150j != -1) {
                this.position += jM48150j;
            }
            return jM48150j;
        }

        @Override // p560xu.InterfaceC12951r0
        @NotNull
        public C12953s0 timeout() {
            return C12953s0.NONE;
        }
    }

    public AbstractC12934j(boolean z10) {
        this.readWrite = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                reentrantLock.unlock();
                return;
            }
            this.closed = true;
            if (this.openStreamCount != 0) {
                reentrantLock.unlock();
                return;
            }
            Unit unit = Unit.f29331a;
            reentrantLock.unlock();
            mo48147f();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ReentrantLock getLock() {
        return this.lock;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo48147f();

    /* JADX INFO: renamed from: g */
    public abstract int mo48148g(long fileOffset, @NotNull byte[] array, int arrayOffset, int byteCount);

    /* JADX INFO: renamed from: h */
    public abstract long mo48149h();

    /* JADX INFO: renamed from: j */
    public final long m48150j(long fileOffset, C12924e sink, long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        long j10 = byteCount + fileOffset;
        long j11 = fileOffset;
        while (j11 < j10) {
            C12941m0 c12941m0M48015Z = sink.m48015Z(1);
            byte[] bArr = c12941m0M48015Z.data;
            int i10 = c12941m0M48015Z.limit;
            int iMo48148g = mo48148g(j11, bArr, i10, (int) Math.min(j10 - j11, 8192 - i10));
            if (iMo48148g == -1) {
                if (c12941m0M48015Z.pos == c12941m0M48015Z.limit) {
                    sink.head = c12941m0M48015Z.m48171b();
                    C12943n0.m48178b(c12941m0M48015Z);
                }
                if (fileOffset != j11) {
                    break;
                }
                return -1L;
            }
            c12941m0M48015Z.limit += iMo48148g;
            long j12 = iMo48148g;
            j11 += j12;
            sink.m48010U(sink.getSize() + j12);
        }
        return j11 - fileOffset;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final InterfaceC12951r0 m48151l(long fileOffset) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            this.openStreamCount++;
            reentrantLock.unlock();
            return new a(this, fileOffset);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.f29331a;
            reentrantLock.unlock();
            return mo48149h();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
