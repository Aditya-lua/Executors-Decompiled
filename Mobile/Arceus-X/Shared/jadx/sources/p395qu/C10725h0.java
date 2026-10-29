package p395qu;

import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: qu.h0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"", "propertyName", "", "defaultValue", "d", "(Ljava/lang/String;Z)Z", "", "minValue", "maxValue", "a", "(Ljava/lang/String;III)I", "", "b", "(Ljava/lang/String;JJJ)J", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/internal/SystemPropsKt")
public final /* synthetic */ class C10725h0 {
    /* JADX INFO: renamed from: a */
    public static final int m40851a(@NotNull String str, int i10, int i11, int i12) {
        return (int) C10721f0.m40842c(str, i10, i11, i12);
    }

    /* JADX INFO: renamed from: b */
    public static final long m40852b(@NotNull String str, long j10, long j11, long j12) {
        String strM40843d = C10721f0.m40843d(str);
        if (strM40843d == null) {
            return j10;
        }
        Long lT = StringsKt.m32118t(strM40843d);
        if (lT == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strM40843d + '\'').toString());
        }
        long jLongValue = lT.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + jLongValue + '\'').toString());
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m40853c(@NotNull String str, @NotNull String str2) {
        String strM40843d = C10721f0.m40843d(str);
        return strM40843d == null ? str2 : strM40843d;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m40854d(@NotNull String str, boolean z10) {
        String strM40843d = C10721f0.m40843d(str);
        return strM40843d != null ? Boolean.parseBoolean(strM40843d) : z10;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m40855e(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return C10721f0.m40841b(str, i10, i11, i12);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ long m40856f(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return C10721f0.m40842c(str, j10, j13, j12);
    }
}
