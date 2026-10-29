package cs;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J;\u0010\t\u001a\u00020\u00072\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ=\u0010\f\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000b0\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¢\u0006\u0004\b\f\u0010\nJ-\u0010\u000f\u001a\u0004\u0018\u00010\u00062\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcs/c;", "Lcs/b;", "", "", "values", "Lkotlin/Function2;", "", "", "operator", "e", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Z", "", "m", "first", "second", "j", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Integer;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends b {
    default boolean e(@Nullable List<? extends Object> values, @NotNull Function2<? super Integer, ? super Integer, Boolean> operator) {
        List<Comparable<?>> listD;
        Intrinsics.checkNotNullParameter(operator, "operator");
        if (values == null || (listD = ts.a.d(values)) == null) {
            return false;
        }
        return m(listD, operator);
    }

    default Integer j(Comparable<?> first, Comparable<?> second) {
        List<Comparable<?>> listD = d(first, second);
        if (listD == null) {
            return null;
        }
        List<Comparable<?>> list = listD;
        boolean z10 = list instanceof Collection;
        if (!z10 || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Comparable) it.next()) != null) {
                    if (!z10 || !list.isEmpty()) {
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (((Comparable) it2.next()) == null) {
                                return null;
                            }
                        }
                    }
                    return Integer.valueOf(mt.a.a((Comparable) CollectionsKt.firstOrNull(listD), (Comparable) ts.c.b(listD)));
                }
            }
        }
        return Integer.valueOf(mt.a.a((Comparable) CollectionsKt.firstOrNull(listD), (Comparable) ts.c.b(listD)));
    }

    default boolean m(List<? extends Comparable<?>> values, Function2<? super Integer, ? super Integer, Boolean> operator) {
        Integer numJ = j((Comparable) CollectionsKt.firstOrNull(values), (Comparable) ts.c.b(values));
        if (numJ != null) {
            return operator.invoke(Integer.valueOf(numJ.intValue()), 0).booleanValue();
        }
        return false;
    }
}
