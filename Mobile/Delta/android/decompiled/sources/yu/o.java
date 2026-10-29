package yu;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xu.h0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0010!\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0019\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b%\u0010(R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b)\u0010.R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010.R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b2\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=R\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b!\u0010ER\u0016\u0010G\u001a\u0004\u0018\u00010\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u00105R\u0016\u0010H\u001a\u0004\u0018\u00010\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u00105R\u0016\u0010I\u001a\u0004\u0018\u00010\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u00105¨\u0006J"}, d2 = {"Lyu/o;", "", "Lxu/h0;", "canonicalPath", "", "isDirectory", "", "comment", "", "crc", "compressedSize", "size", "", "compressionMethod", "offset", "dosLastModifiedAtDate", "dosLastModifiedAtTime", "ntfsLastModifiedAtFiletime", "ntfsLastAccessedAtFiletime", "ntfsCreatedAtFiletime", "extendedLastModifiedAtSeconds", "extendedLastAccessedAtSeconds", "extendedCreatedAtSeconds", "<init>", "(Lxu/h0;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lyu/o;", "Lxu/h0;", "b", "()Lxu/h0;", "Z", "k", "()Z", "c", "Ljava/lang/String;", "getComment", "()Ljava/lang/String;", "d", "J", "getCrc", "()J", "e", "f", "j", "g", "I", "()I", "h", "i", "getDosLastModifiedAtDate", "getDosLastModifiedAtTime", "Ljava/lang/Long;", "getNtfsLastModifiedAtFiletime", "()Ljava/lang/Long;", "l", "getNtfsLastAccessedAtFiletime", "m", "getNtfsCreatedAtFiletime", "n", "Ljava/lang/Integer;", "getExtendedLastModifiedAtSeconds", "()Ljava/lang/Integer;", "o", "getExtendedLastAccessedAtSeconds", "p", "getExtendedCreatedAtSeconds", "", "q", "Ljava/util/List;", "()Ljava/util/List;", "children", "lastAccessedAtMillis", "lastModifiedAtMillis", "createdAtMillis", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 canonicalPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isDirectory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String comment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long crc;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long compressedSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long size;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int compressionMethod;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final long offset;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final int dosLastModifiedAtDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int dosLastModifiedAtTime;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long ntfsLastModifiedAtFiletime;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long ntfsLastAccessedAtFiletime;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long ntfsCreatedAtFiletime;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer extendedLastModifiedAtSeconds;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer extendedLastAccessedAtSeconds;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer extendedCreatedAtSeconds;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<h0> children;

    public o(@NotNull h0 canonicalPath, boolean z10, @NotNull String comment, long j10, long j11, long j12, int i10, long j13, int i11, int i12, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.canonicalPath = canonicalPath;
        this.isDirectory = z10;
        this.comment = comment;
        this.crc = j10;
        this.compressedSize = j11;
        this.size = j12;
        this.compressionMethod = i10;
        this.offset = j13;
        this.dosLastModifiedAtDate = i11;
        this.dosLastModifiedAtTime = i12;
        this.ntfsLastModifiedAtFiletime = l10;
        this.ntfsLastAccessedAtFiletime = l11;
        this.ntfsCreatedAtFiletime = l12;
        this.extendedLastModifiedAtSeconds = num;
        this.extendedLastAccessedAtSeconds = num2;
        this.extendedCreatedAtSeconds = num3;
        this.children = new ArrayList();
    }

    @NotNull
    public final o a(@Nullable Integer extendedLastModifiedAtSeconds, @Nullable Integer extendedLastAccessedAtSeconds, @Nullable Integer extendedCreatedAtSeconds) {
        return new o(this.canonicalPath, this.isDirectory, this.comment, this.crc, this.compressedSize, this.size, this.compressionMethod, this.offset, this.dosLastModifiedAtDate, this.dosLastModifiedAtTime, this.ntfsLastModifiedAtFiletime, this.ntfsLastAccessedAtFiletime, this.ntfsCreatedAtFiletime, extendedLastModifiedAtSeconds, extendedLastAccessedAtSeconds, extendedCreatedAtSeconds);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final h0 getCanonicalPath() {
        return this.canonicalPath;
    }

    @NotNull
    public final List<h0> c() {
        return this.children;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getCompressedSize() {
        return this.compressedSize;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getCompressionMethod() {
        return this.compressionMethod;
    }

    @Nullable
    public final Long f() {
        Long l10 = this.ntfsCreatedAtFiletime;
        if (l10 != null) {
            return Long.valueOf(t.g(l10.longValue()));
        }
        Integer num = this.extendedCreatedAtSeconds;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    @Nullable
    public final Long g() {
        Long l10 = this.ntfsLastAccessedAtFiletime;
        if (l10 != null) {
            return Long.valueOf(t.g(l10.longValue()));
        }
        Integer num = this.extendedLastAccessedAtSeconds;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    @Nullable
    public final Long h() {
        Long l10 = this.ntfsLastModifiedAtFiletime;
        if (l10 != null) {
            return Long.valueOf(t.g(l10.longValue()));
        }
        Integer num = this.extendedLastModifiedAtSeconds;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        int i10 = this.dosLastModifiedAtTime;
        if (i10 != -1) {
            return t.f(this.dosLastModifiedAtDate, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsDirectory() {
        return this.isDirectory;
    }

    public /* synthetic */ o(h0 h0Var, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(h0Var, (i13 & 2) != 0 ? false : z10, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? -1L : j10, (i13 & 16) != 0 ? -1L : j11, (i13 & 32) != 0 ? -1L : j12, (i13 & 64) != 0 ? -1 : i10, (i13 & 128) == 0 ? j13 : -1L, (i13 & Barcode.FORMAT_QR_CODE) != 0 ? -1 : i11, (i13 & Barcode.FORMAT_UPC_A) == 0 ? i12 : -1, (i13 & Barcode.FORMAT_UPC_E) != 0 ? null : l10, (i13 & Barcode.FORMAT_PDF417) != 0 ? null : l11, (i13 & Barcode.FORMAT_AZTEC) != 0 ? null : l12, (i13 & 8192) != 0 ? null : num, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : num2, (i13 & 32768) != 0 ? null : num3);
    }
}
