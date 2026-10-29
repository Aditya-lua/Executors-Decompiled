package kotlin.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.collections.l */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aS\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\r\u001a\u00020\f*\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u0010\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0013\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00122\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u0019\u001a\u00020\f*\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a9\u0010\u001d\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00028\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010 \u001a\u00020\u001c*\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001f2\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b \u0010!\u001a-\u0010\"\u001a\u00020\u001c*\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#\u001a-\u0010&\u001a\u00020\u001c*\u00020$2\u0006\u0010\u001b\u001a\u00020%2\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'\u001a6\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b)\u0010*\u001a\u001c\u0010+\u001a\u00020\f*\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010.\u001a\u00020-*\u00020-2\u0006\u0010(\u001a\u00020-H\u0086\u0002¢\u0006\u0004\b.\u0010/\u001a\u001f\u00100\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b0\u00101\u001a;\u00105\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u00104\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000002j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`3¢\u0006\u0004\b5\u00106¨\u00067"}, m31665d2 = {"T", "", "", "e", "([Ljava/lang/Object;)Ljava/util/List;", "destination", "", "destinationOffset", "startIndex", "endIndex", "i", "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;", "", "f", "([B[BIII)[B", "", "g", "([I[IIII)[I", "", "h", "([J[JIII)[J", "fromIndex", "toIndex", "n", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "m", "([BII)[B", "element", "", "q", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "", "o", "([BBII)V", "p", "([IIII)V", "", "", "r", "([ZZII)V", "elements", "x", "([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;", "v", "([B[B)[B", "", "w", "([C[C)[C", "y", "([Ljava/lang/Object;)V", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "z", "([Ljava/lang/Object;Ljava/util/Comparator;)V", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/collections/ArraysKt")
public class C7691l extends C7689k {
    @NotNull
    /* JADX INFO: renamed from: e */
    public static <T> List<T> m31810e(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        List<T> listM31873a = C7695n.m31873a(tArr);
        Intrinsics.checkNotNullExpressionValue(listM31873a, "asList(...)");
        return listM31873a;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static byte[] m31811f(@NotNull byte[] bArr, @NotNull byte[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static int[] m31812g(@NotNull int[] iArr, @NotNull int[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static long[] m31813h(@NotNull long[] jArr, @NotNull long[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static <T> T[] m31814i(@NotNull T[] tArr, @NotNull T[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(tArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ byte[] m31815j(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return m31811f(bArr, bArr2, i10, i11, i12);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int[] m31816k(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return m31812g(iArr, iArr2, i10, i11, i12);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Object[] m31817l(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return m31814i(objArr, objArr2, i10, i11, i12);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static byte[] m31818m(@NotNull byte[] bArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        C7687j.m31786c(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static <T> T[] m31819n(@NotNull T[] tArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        C7687j.m31786c(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    /* JADX INFO: renamed from: o */
    public static void m31820o(@NotNull byte[] bArr, byte b, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Arrays.fill(bArr, i10, i11, b);
    }

    /* JADX INFO: renamed from: p */
    public static final void m31821p(@NotNull int[] iArr, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    /* JADX INFO: renamed from: q */
    public static <T> void m31822q(@NotNull T[] tArr, T t8, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t8);
    }

    /* JADX INFO: renamed from: r */
    public static final void m31823r(@NotNull boolean[] zArr, boolean z10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Arrays.fill(zArr, i10, i11, z10);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m31824s(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        m31821p(iArr, i10, i11, i12);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m31825t(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        m31822q(objArr, obj, i10, i11);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m31826u(boolean[] zArr, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = zArr.length;
        }
        m31823r(zArr, z10, i10, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static byte[] m31827v(@NotNull byte[] bArr, @NotNull byte[] elements) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        Intrinsics.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public static char[] m31828w(@NotNull char[] cArr, @NotNull char[] elements) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = cArr.length;
        int length2 = elements.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(elements, 0, cArrCopyOf, length, length2);
        Intrinsics.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public static <T> T[] m31829x(@NotNull T[] tArr, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, tArr2, length, length2);
        Intrinsics.checkNotNull(tArr2);
        return tArr2;
    }

    /* JADX INFO: renamed from: y */
    public static final <T> void m31830y(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    /* JADX INFO: renamed from: z */
    public static final <T> void m31831z(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
