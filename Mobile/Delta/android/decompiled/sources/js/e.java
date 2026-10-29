package js;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J3\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\r\u0018\u00010\u00102\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\f\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Ljs/e;", "Lis/c;", "", "values", "Lkotlin/Function2;", "", "", "operator", "c", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Z", "wrappedValue", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "first", "second", "", "d", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/util/List;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends is.c {
    @Nullable
    default Object a(@Nullable Object wrappedValue) {
        Number number = wrappedValue instanceof Number ? (Number) wrappedValue : null;
        return number != null ? Double.valueOf(number.doubleValue()) : wrappedValue;
    }

    @Override // is.c
    default boolean c(@Nullable Object values, @NotNull Function2<? super Integer, ? super Integer, Boolean> operator) {
        Intrinsics.checkNotNullParameter(operator, "operator");
        List<Object> listC = ts.a.c(values);
        if (listC.size() == 1) {
            return false;
        }
        List<Object> list = listC;
        ArrayList arrayList = new ArrayList(q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return e(arrayList, operator);
    }

    @Override // cs.b
    @Nullable
    default List<Comparable<?>> d(@Nullable Comparable<?> first, @Nullable Comparable<?> second) {
        return h(first, second);
    }
}
