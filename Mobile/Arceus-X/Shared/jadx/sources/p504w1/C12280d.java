package p504w1;

import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p532x1.C12627a;

/* JADX INFO: renamed from: w1.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"E", "Lw1/b;", "", "hash", "b", "(Lw1/b;I)I", "", "key", "c", "(Lw1/b;Ljava/lang/Object;I)I", "d", "(Lw1/b;)I", "size", "", "a", "(Lw1/b;I)V", "collection"}, m31666k = 2, m31667mv = {1, 9, 0}, m31669xi = 48)
public final class C12280d {
    /* JADX INFO: renamed from: a */
    public static final <E> void m45594a(@NotNull C12278b<E> c12278b, int i10) {
        Intrinsics.checkNotNullParameter(c12278b, "<this>");
        c12278b.m45590k(new int[i10]);
        c12278b.m45589i(new Object[i10]);
    }

    /* JADX INFO: renamed from: b */
    public static final <E> int m45595b(@NotNull C12278b<E> c12278b, int i10) {
        Intrinsics.checkNotNullParameter(c12278b, "<this>");
        try {
            return C12627a.m47047a(c12278b.getHashes(), c12278b.m45587f(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final <E> int m45596c(@NotNull C12278b<E> c12278b, @Nullable Object obj, int i10) {
        Intrinsics.checkNotNullParameter(c12278b, "<this>");
        int iM45587f = c12278b.m45587f();
        if (iM45587f == 0) {
            return -1;
        }
        int iM45595b = m45595b(c12278b, i10);
        if (iM45595b < 0 || Intrinsics.m31980c(obj, c12278b.getArray()[iM45595b])) {
            return iM45595b;
        }
        int i11 = iM45595b + 1;
        while (i11 < iM45587f && c12278b.getHashes()[i11] == i10) {
            if (Intrinsics.m31980c(obj, c12278b.getArray()[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iM45595b - 1; i12 >= 0 && c12278b.getHashes()[i12] == i10; i12--) {
            if (Intrinsics.m31980c(obj, c12278b.getArray()[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    /* JADX INFO: renamed from: d */
    public static final <E> int m45597d(@NotNull C12278b<E> c12278b) {
        Intrinsics.checkNotNullParameter(c12278b, "<this>");
        return m45596c(c12278b, null, 0);
    }
}
