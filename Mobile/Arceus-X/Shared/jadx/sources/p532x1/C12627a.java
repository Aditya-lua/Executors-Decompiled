package p532x1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: x1.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0007\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0010\u001a'\u0010\b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\b\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016\"\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001b"}, m31665d2 = {"", "need", "e", "(I)I", "f", "d", "", "a", "b", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "array", "size", "value", "([III)I", "", "", "([JIJ)I", "[I", "EMPTY_INTS", "[J", "EMPTY_LONGS", "", "[Ljava/lang/Object;", "EMPTY_OBJECTS", "collection"}, m31666k = 2, m31667mv = {1, 9, 0}, m31669xi = 48)
public final class C12627a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final int[] f44951a = new int[0];

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final long[] f44952b = new long[0];

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Object[] f44953c = new Object[0];

    /* JADX INFO: renamed from: a */
    public static final int m47047a(@NotNull int[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = array[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    /* JADX INFO: renamed from: b */
    public static final int m47048b(@NotNull long[] array, int i10, long j10) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j11 = array[i13];
            if (j11 < j10) {
                i12 = i13 + 1;
            } else {
                if (j11 <= j10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m47049c(@Nullable Object obj, @Nullable Object obj2) {
        return Intrinsics.m31980c(obj, obj2);
    }

    /* JADX INFO: renamed from: d */
    public static final int m47050d(int i10) {
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                return i12;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: e */
    public static final int m47051e(int i10) {
        return m47050d(i10 * 4) / 4;
    }

    /* JADX INFO: renamed from: f */
    public static final int m47052f(int i10) {
        return m47050d(i10 * 8) / 8;
    }
}
