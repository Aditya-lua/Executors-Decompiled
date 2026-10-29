package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import mt.C8662a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.collections.p */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000e\u0010\f\u001a7\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0000*\u00020\u00132\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\f\u001a%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aG\u0010\u001c\u001a\u00020\u0019\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0017*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00072\b\u0010\u0018\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001d\u001a'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010!\u001a\u000f\u0010\"\u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#\u001a\u000f\u0010$\u001a\u00020\u001fH\u0001¢\u0006\u0004\b$\u0010#\"\u0019\u0010(\u001a\u00020%*\u0006\u0012\u0002\b\u00030\u00048F¢\u0006\u0006\u001a\u0004\b&\u0010'\"!\u0010+\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00078F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, m31665d2 = {"T", "", "", "isVarargs", "", "g", "([Ljava/lang/Object;Z)Ljava/util/Collection;", "", "k", "()Ljava/util/List;", "elements", "n", "([Ljava/lang/Object;)Ljava/util/List;", "", "p", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "f", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "", "o", "q", "(Ljava/util/List;)Ljava/util/List;", "", "element", "", "fromIndex", "toIndex", "i", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "size", "", "r", "(III)V", "t", "()V", "s", "Lkotlin/ranges/IntRange;", "l", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "indices", "m", "(Ljava/util/List;)I", "lastIndex", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/collections/CollectionsKt")
public class C7699p extends C7697o {
    @NotNull
    /* JADX INFO: renamed from: f */
    public static <T> ArrayList<T> m31887f(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(m31888g(elements, true));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final <T> Collection<T> m31888g(@NotNull T[] tArr, boolean z10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new C7683h(tArr, z10);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Collection m31889h(Object[] objArr, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m31888g(objArr, z10);
    }

    /* JADX INFO: renamed from: i */
    public static final <T extends Comparable<? super T>> int m31890i(@NotNull List<? extends T> list, @Nullable T t8, int i10, int i11) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        m31899r(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iM34743a = C8662a.m34743a(list.get(i13), t8);
            if (iM34743a < 0) {
                i10 = i13 + 1;
            } else {
                if (iM34743a <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m31891j(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return m31890i(list, comparable, i10, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static <T> List<T> m31892k() {
        return C7713z.f29386a;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static IntRange m31893l(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new IntRange(0, collection.size() - 1);
    }

    /* JADX INFO: renamed from: m */
    public static <T> int m31894m(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static <T> List<T> m31895n(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? C7691l.m31810e(elements) : m31892k();
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static <T> List<T> m31896o(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7693m.m31840I(elements);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static <T> List<T> m31897p(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(m31888g(elements, true));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: q */
    public static final <T> List<T> m31898q(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : C7697o.m31878d(list.get(0));
        }
        return m31892k();
    }

    /* JADX INFO: renamed from: r */
    public static final void m31899r(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    /* JADX INFO: renamed from: s */
    public static void m31900s() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* JADX INFO: renamed from: t */
    public static void m31901t() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
