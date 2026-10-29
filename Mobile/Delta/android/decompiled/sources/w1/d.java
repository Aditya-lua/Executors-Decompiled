package w1;

import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"E", "Lw1/b;", "", "hash", "b", "(Lw1/b;I)I", "", "key", "c", "(Lw1/b;Ljava/lang/Object;I)I", "d", "(Lw1/b;)I", "size", "", "a", "(Lw1/b;I)V", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {
    public static final <E> void a(@NotNull b<E> bVar, int i10) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        bVar.k(new int[i10]);
        bVar.i(new Object[i10]);
    }

    public static final <E> int b(@NotNull b<E> bVar, int i10) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        try {
            return x1.a.a(bVar.getHashes(), bVar.f(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> int c(@NotNull b<E> bVar, @Nullable Object obj, int i10) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int iF = bVar.f();
        if (iF == 0) {
            return -1;
        }
        int iB = b(bVar, i10);
        if (iB < 0 || Intrinsics.c(obj, bVar.getArray()[iB])) {
            return iB;
        }
        int i11 = iB + 1;
        while (i11 < iF && bVar.getHashes()[i11] == i10) {
            if (Intrinsics.c(obj, bVar.getArray()[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iB - 1; i12 >= 0 && bVar.getHashes()[i12] == i10; i12--) {
            if (Intrinsics.c(obj, bVar.getArray()[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    public static final <E> int d(@NotNull b<E> bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return c(bVar, null, 0);
    }
}
