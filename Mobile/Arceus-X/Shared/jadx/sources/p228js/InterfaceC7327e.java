package p228js;

import is.InterfaceC6969c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7701q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p451ts.C11744a;

/* JADX INFO: renamed from: js.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J3\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\r\u0018\u00010\u00102\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\f\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, m31665d2 = {"Ljs/e;", "Lis/c;", "", "values", "Lkotlin/Function2;", "", "", "operator", "c", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Z", "wrappedValue", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "first", "second", "", "d", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/util/List;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC7327e extends InterfaceC6969c {
    @Nullable
    /* JADX INFO: renamed from: a */
    default Object mo29340a(@Nullable Object wrappedValue) {
        Number number = wrappedValue instanceof Number ? (Number) wrappedValue : null;
        return number != null ? Double.valueOf(number.doubleValue()) : wrappedValue;
    }

    @Override // is.InterfaceC6969c
    /* JADX INFO: renamed from: c */
    default boolean mo29341c(@Nullable Object values, @NotNull Function2<? super Integer, ? super Integer, Boolean> operator) {
        Intrinsics.checkNotNullParameter(operator, "operator");
        List<Object> listM43971c = C11744a.m43971c(values);
        if (listM43971c.size() == 1) {
            return false;
        }
        List<Object> list = listM43971c;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo29340a(it.next()));
        }
        return mo22009e(arrayList, operator);
    }

    @Override // p060cs.InterfaceC4360b
    @Nullable
    /* JADX INFO: renamed from: d */
    default List<Comparable<?>> mo22007d(@Nullable Comparable<?> first, @Nullable Comparable<?> second) {
        return mo22008h(first, second);
    }
}
