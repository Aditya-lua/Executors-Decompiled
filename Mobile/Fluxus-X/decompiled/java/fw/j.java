package fw;

import com.github.luben.zstd.BuildConfig;
import ew.l0;
import java.io.EOFException;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Lfw/j;", "Lew/n;", "Lew/l0;", "delegate", BuildConfig.FLAVOR, "size", BuildConfig.FLAVOR, "truncate", "<init>", "(Lew/l0;JZ)V", "Lew/e;", "sink", "byteCount", "f3", "(Lew/e;J)J", "newSize", BuildConfig.FLAVOR, "b", "(Lew/e;J)V", "J", "c", "Z", "d", "bytesReceived", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends ew.n {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean truncate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long bytesReceived;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull l0 delegate, long j10, boolean z10) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.size = j10;
        this.truncate = z10;
    }

    public final void b(ew.e eVar, long j10) throws EOFException {
        ew.e eVar2 = new ew.e();
        eVar2.h3(eVar);
        eVar.R2(eVar2, j10);
        eVar2.a();
    }

    @Override // ew.n, ew.l0
    public long f3(@NotNull ew.e sink, long byteCount) throws IOException {
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
        long jF3 = super.f3(sink, byteCount);
        if (jF3 != -1) {
            this.bytesReceived += jF3;
        }
        long j13 = this.bytesReceived;
        long j14 = this.size;
        if ((j13 >= j14 || jF3 != -1) && j13 <= j14) {
            return jF3;
        }
        if (jF3 > 0 && j13 > j14) {
            b(sink, sink.getSize() - (this.bytesReceived - this.size));
        }
        throw new IOException("expected " + this.size + " bytes but got " + this.bytesReceived);
    }
}
