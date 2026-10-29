package w1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"E", "Lw1/k;", "", "key", "c", "(Lw1/k;I)Ljava/lang/Object;", "", "d", "(Lw1/k;)V", "", "a", "Ljava/lang/Object;", "DELETED", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object f33625a = new Object();

    @Nullable
    public static final <E> E c(@NotNull k<E> kVar, int i10) {
        E e10;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        int iA = x1.a.a(kVar.b, kVar.f33624d, i10);
        if (iA < 0 || (e10 = (E) kVar.f33623c[iA]) == f33625a) {
            return null;
        }
        return e10;
    }

    public static final <E> void d(k<E> kVar) {
        int i10 = kVar.f33624d;
        int[] iArr = kVar.b;
        Object[] objArr = kVar.f33623c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f33625a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        kVar.f33622a = false;
        kVar.f33624d = i11;
    }
}
