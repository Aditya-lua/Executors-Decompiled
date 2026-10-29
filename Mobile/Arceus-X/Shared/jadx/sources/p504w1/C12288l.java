package p504w1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p532x1.C12627a;

/* JADX INFO: renamed from: w1.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, m31665d2 = {"E", "Lw1/k;", "", "key", "c", "(Lw1/k;I)Ljava/lang/Object;", "", "d", "(Lw1/k;)V", "", "a", "Ljava/lang/Object;", "DELETED", "collection"}, m31666k = 2, m31667mv = {1, 9, 0}, m31669xi = 48)
public final class C12288l {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Object f43530a = new Object();

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <E> E m45641c(@NotNull C12287k<E> c12287k, int i10) {
        E e10;
        Intrinsics.checkNotNullParameter(c12287k, "<this>");
        int iM47047a = C12627a.m47047a(c12287k.f43527b, c12287k.f43529d, i10);
        if (iM47047a < 0 || (e10 = (E) c12287k.f43528c[iM47047a]) == f43530a) {
            return null;
        }
        return e10;
    }

    /* JADX INFO: renamed from: d */
    public static final <E> void m45642d(C12287k<E> c12287k) {
        int i10 = c12287k.f43529d;
        int[] iArr = c12287k.f43527b;
        Object[] objArr = c12287k.f43528c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f43530a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        c12287k.f43526a = false;
        c12287k.f43529d = i11;
    }
}
