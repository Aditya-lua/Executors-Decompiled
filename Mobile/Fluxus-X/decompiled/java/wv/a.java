package wv;

import com.github.luben.zstd.BuildConfig;
import ew.f;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lwv/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "sections", "ranges", "mappings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", BuildConfig.FLAVOR, "codePoint", "Lew/f;", "sink", BuildConfig.FLAVOR, "c", "(ILew/f;)Z", "b", "(I)I", "position", "limit", "a", "(III)I", "Ljava/lang/String;", "getSections", "()Ljava/lang/String;", "getRanges", "getMappings", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String sections;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String ranges;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String mappings;

    public a(@NotNull String sections, @NotNull String ranges, @NotNull String mappings) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(ranges, "ranges");
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        this.sections = sections;
        this.ranges = ranges;
        this.mappings = mappings;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    public final int a(int codePoint, int position, int limit) {
        int i10;
        int i11 = codePoint & 127;
        int i12 = limit - 1;
        while (position <= i12) {
            i10 = (position + i12) / 2;
            int iF = Intrinsics.f(i11, this.ranges.charAt(i10 * 4));
            if (iF < 0) {
                i12 = i10 - 1;
            } else {
                if (iF <= 0) {
                    return i10 >= 0 ? i10 * 4 : ((-i10) - 2) * 4;
                }
                position = i10 + 1;
            }
        }
        i10 = (-position) - 1;
        if (i10 >= 0) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    public final int b(int codePoint) {
        int i10;
        int i11 = (codePoint & 2097024) >> 7;
        int length = (this.sections.length() / 4) - 1;
        int i12 = 0;
        while (i12 <= length) {
            i10 = (i12 + length) / 2;
            int iF = Intrinsics.f(i11, c.a(this.sections, i10 * 4));
            if (iF < 0) {
                length = i10 - 1;
            } else {
                if (iF <= 0) {
                    return i10 >= 0 ? i10 * 4 : ((-i10) - 2) * 4;
                }
                i12 = i10 + 1;
            }
        }
        i10 = (-i12) - 1;
        if (i10 >= 0) {
        }
    }

    public final boolean c(int codePoint, @NotNull f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int iB = b(codePoint);
        int iA = a(codePoint, c.a(this.sections, iB + 2), iB + 4 < this.sections.length() ? c.a(this.sections, iB + 6) : this.ranges.length() / 4);
        char cCharAt = this.ranges.charAt(iA + 1);
        if (cCharAt >= 0 && cCharAt < '@') {
            int iA2 = c.a(this.ranges, iA + 2);
            sink.L0(this.mappings, iA2, cCharAt + iA2);
            return true;
        }
        if ('@' <= cCharAt && cCharAt < 'P') {
            sink.X(codePoint - (this.ranges.charAt(iA + 3) | (((cCharAt & 15) << 14) | (this.ranges.charAt(iA + 2) << 7))));
            return true;
        }
        if ('P' <= cCharAt && cCharAt < '`') {
            sink.X(codePoint + (this.ranges.charAt(iA + 3) | ((cCharAt & 15) << 14) | (this.ranges.charAt(iA + 2) << 7)));
            return true;
        }
        if (cCharAt == 'w') {
            Unit unit = Unit.f21506a;
            return true;
        }
        if (cCharAt == 'x') {
            sink.X(codePoint);
            return true;
        }
        if (cCharAt == 'y') {
            sink.X(codePoint);
            return false;
        }
        if (cCharAt == 'z') {
            sink.writeByte(this.ranges.charAt(iA + 2));
            return true;
        }
        if (cCharAt == '{') {
            sink.writeByte(this.ranges.charAt(iA + 2) | 128);
            return true;
        }
        if (cCharAt == '|') {
            sink.writeByte(this.ranges.charAt(iA + 2));
            sink.writeByte(this.ranges.charAt(iA + 3));
            return true;
        }
        if (cCharAt == '}') {
            sink.writeByte(this.ranges.charAt(iA + 2) | 128);
            sink.writeByte(this.ranges.charAt(iA + 3));
            return true;
        }
        if (cCharAt == '~') {
            sink.writeByte(this.ranges.charAt(iA + 2));
            sink.writeByte(this.ranges.charAt(iA + 3) | 128);
            return true;
        }
        if (cCharAt == 127) {
            sink.writeByte(this.ranges.charAt(iA + 2) | 128);
            sink.writeByte(this.ranges.charAt(iA + 3) | 128);
            return true;
        }
        throw new IllegalStateException(("unexpected rangesIndex for " + codePoint).toString());
    }
}
