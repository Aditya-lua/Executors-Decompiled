package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.collections.r0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001c\n\u0002\b\b\u001a4\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0005¨\u0006\n"}, m31665d2 = {"T", "", "", "elements", "h", "(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;", "element", "j", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "i", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/collections/SetsKt")
public class C7704r0 extends C7702q0 {
    @NotNull
    /* JADX INFO: renamed from: h */
    public static <T> Set<T> m31912h(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<?> collectionM31921B = C7708u.m31921B(elements);
        if (collectionM31921B.isEmpty()) {
            return CollectionsKt___CollectionsKt.m31691Q0(set);
        }
        if (!(collectionM31921B instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionM31921B);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t8 : set) {
            if (!((Set) collectionM31921B).contains(t8)) {
                linkedHashSet2.add(t8);
            }
        }
        return linkedHashSet2;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static <T> Set<T> m31913i(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> elements) {
        int size;
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Integer numM31906v = C7701q.m31906v(elements);
        if (numM31906v != null) {
            size = set.size() + numM31906v.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C7688j0.m31790f(size));
        linkedHashSet.addAll(set);
        C7708u.m31931z(linkedHashSet, elements);
        return linkedHashSet;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static <T> Set<T> m31914j(@NotNull Set<? extends T> set, T t8) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C7688j0.m31790f(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t8);
        return linkedHashSet;
    }
}
