package p588yu;

import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p560xu.AbstractC12946p;
import p560xu.C12924e;
import p560xu.InterfaceC12951r0;

/* JADX INFO: renamed from: yu.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, m31665d2 = {"Lyu/j;", "Lxu/p;", "Lxu/r0;", "delegate", "", "size", "", "truncate", "<init>", "(Lxu/r0;JZ)V", "Lxu/e;", "sink", "byteCount", "read", "(Lxu/e;J)J", "newSize", "", "a", "(Lxu/e;J)V", "J", "b", "Z", "c", "bytesReceived", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13461j extends AbstractC12946p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean truncate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long bytesReceived;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13461j(@NotNull InterfaceC12951r0 delegate, long j10, boolean z10) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.size = j10;
        this.truncate = z10;
    }

    /* JADX INFO: renamed from: a */
    public final void m49108a(C12924e c12924e, long j10) throws EOFException {
        C12924e c12924e2 = new C12924e();
        c12924e2.mo48028g2(c12924e);
        c12924e.write(c12924e2, j10);
        c12924e2.m48017a();
    }

    @Override // p560xu.AbstractC12946p, p560xu.InterfaceC12951r0
    public long read(@NotNull C12924e sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = this.bytesReceived;
        long j11 = this.size;
        if (j10 > j11) {
            byteCount = 0;
        } else if (this.truncate) {
            long j12 = j11 - j10;
            if (j12 == 0) {
                return -1L;
            }
            byteCount = Math.min(byteCount, j12);
        }
        long j13 = super.read(sink, byteCount);
        if (j13 != -1) {
            this.bytesReceived += j13;
        }
        long j14 = this.bytesReceived;
        long j15 = this.size;
        if ((j14 >= j15 || j13 != -1) && j14 <= j15) {
            return j13;
        }
        if (j13 > 0 && j14 > j15) {
            m49108a(sink, sink.getSize() - (this.bytesReceived - this.size));
        }
        throw new IOException("expected " + this.size + " bytes but got " + this.bytesReceived);
    }
}
