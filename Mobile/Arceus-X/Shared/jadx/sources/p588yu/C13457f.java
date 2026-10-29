package p588yu;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p560xu.C12918b;
import p560xu.C12924e;
import p560xu.C12930h;
import p560xu.buffer;

/* JADX INFO: renamed from: yu.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aA\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\r\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lxu/l0;", "Lxu/h;", "bytes", "", "bytesOffset", "byteCount", "", "fromIndex", "toIndex", "a", "(Lxu/l0;Lxu/h;IIJJ)J", "Lxu/e;", "", "c", "(Lxu/e;Lxu/h;IIJJ)Z", "okio"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13457f {
    /* JADX INFO: renamed from: a */
    public static final long m49096a(@NotNull buffer bufferVar, @NotNull C12930h c12930h, int i10, int i11, long j10, long j11) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        C12930h bytes = c12930h;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i12 = i10;
        long j12 = i11;
        C12918b.m47948b(bytes.m48089I(), i12, j12);
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        long jMax = j10;
        while (true) {
            long jM49052b = C13452a.m49052b(bufferVar.bufferField, bytes, jMax, j11, i12, i11);
            if (jM49052b != -1) {
                return jM49052b;
            }
            long size = (bufferVar.bufferField.getSize() - j12) + 1;
            if (size >= j11) {
                return -1L;
            }
            long j13 = jMax;
            if (!m49098c(bufferVar.bufferField, c12930h, i10, i11, j13, j11) || bufferVar.com.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String.read(bufferVar.bufferField, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(j13, size);
            bytes = c12930h;
            i12 = i10;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m49097b(buffer bufferVar, C12930h c12930h, int i10, int i11, long j10, long j11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = c12930h.m48089I();
        }
        return m49096a(bufferVar, c12930h, i13, i11, j10, (i12 & 16) != 0 ? Long.MAX_VALUE : j11);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m49098c(C12924e c12924e, C12930h c12930h, int i10, int i11, long j10, long j11) {
        if (c12924e.getSize() < j11) {
            return true;
        }
        int iMax = (int) Math.max(1L, (c12924e.getSize() - j11) + 1);
        int iMin = ((int) Math.min(i11, (c12924e.getSize() - j10) + 1)) - 1;
        if (iMax > iMin) {
            return false;
        }
        int i12 = iMin;
        while (true) {
            C12924e c12924e2 = c12924e;
            C12930h c12930h2 = c12930h;
            int i13 = i10;
            if (c12924e2.m48047r(c12924e.getSize() - ((long) i12), c12930h2, i13, i12)) {
                return true;
            }
            if (i12 == iMax) {
                return false;
            }
            i12--;
            c12924e = c12924e2;
            c12930h = c12930h2;
            i10 = i13;
        }
    }
}
