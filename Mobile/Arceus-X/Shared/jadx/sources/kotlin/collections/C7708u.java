package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7739h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.collections.u */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00008\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\u001a-\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\r\u0010\u0006\u001a-\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000e\u0010\u0006\u001a1\u0010\u0012\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u0019\u001a!\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0007¢\u0006\u0004\b\u001b\u0010\u0019\u001a1\u0010\u001c\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010\u001e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m31665d2 = {"T", "", "", "elements", "", "z", "(Ljava/util/Collection;Ljava/lang/Iterable;)Z", "", "A", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "B", "(Ljava/lang/Iterable;)Ljava/util/Collection;", "E", "K", "", "Lkotlin/Function1;", "predicate", "J", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Z", "predicateResultToRemove", "C", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;Z)Z", "", "G", "(Ljava/util/List;)Ljava/lang/Object;", "H", "I", "F", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z", "D", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Z)Z", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/collections/CollectionsKt")
public class C7708u extends C7707t {
    /* JADX INFO: renamed from: A */
    public static <T> boolean m31920A(@NotNull Collection<? super T> collection, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection.addAll(C7691l.m31810e(elements));
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public static final <T> Collection<T> m31921B(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : CollectionsKt___CollectionsKt.m31687M0(iterable);
    }

    /* JADX INFO: renamed from: C */
    public static final <T> boolean m31922C(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1, boolean z10) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: D */
    public static final <T> boolean m31923D(List<T> list, Function1<? super T, Boolean> function1, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            Intrinsics.m31981d(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return m31922C(C7739h0.m32037b(list), function1, z10);
        }
        int iM31894m = C7699p.m31894m(list);
        if (iM31894m >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                T t8 = list.get(i11);
                if (function1.invoke(t8).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, t8);
                    }
                    i10++;
                }
                if (i11 == iM31894m) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int iM31894m2 = C7699p.m31894m(list);
        if (i10 > iM31894m2) {
            return true;
        }
        while (true) {
            list.remove(iM31894m2);
            if (iM31894m2 == i10) {
                return true;
            }
            iM31894m2--;
        }
    }

    /* JADX INFO: renamed from: E */
    public static <T> boolean m31924E(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection.removeAll(m31921B(elements));
    }

    /* JADX INFO: renamed from: F */
    public static <T> boolean m31925F(@NotNull List<T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return m31923D(list, predicate, true);
    }

    /* JADX INFO: renamed from: G */
    public static <T> T m31926G(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    /* JADX INFO: renamed from: H */
    public static <T> T m31927H(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(C7699p.m31894m(list));
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public static <T> T m31928I(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(C7699p.m31894m(list));
    }

    /* JADX INFO: renamed from: J */
    public static <T> boolean m31929J(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return m31922C(iterable, predicate, false);
    }

    /* JADX INFO: renamed from: K */
    public static final <T> boolean m31930K(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection.retainAll(m31921B(elements));
    }

    /* JADX INFO: renamed from: z */
    public static <T> boolean m31931z(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }
}
