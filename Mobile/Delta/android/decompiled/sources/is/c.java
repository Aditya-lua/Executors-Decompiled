package is;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J3\u0010\n\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lis/c;", "Lcs/c;", "Lks/a;", "Lks/c;", "", "values", "Lkotlin/Function2;", "", "", "operator", "c", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Z", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends cs.c, ks.a, ks.c {
    default boolean c(@Nullable Object values, @NotNull Function2<? super Integer, ? super Integer, Boolean> operator) {
        Intrinsics.checkNotNullParameter(operator, "operator");
        List<Object> listC = ts.a.c(values);
        Object objK = k(CollectionsKt.firstOrNull(listC));
        Object objK2 = k(ts.c.b(listC));
        d dVar = d.f20850a;
        List<Object> listA = dVar.a(objK);
        List<Object> listA2 = dVar.a(objK2);
        if (listA != null || listA2 != null) {
            if (listA != null ? listA.contains(objK2) : false) {
                return true;
            }
            return listA2 != null ? listA2.contains(objK) : false;
        }
        List<Object> list = listC;
        ArrayList arrayList = new ArrayList(q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return e(arrayList, operator);
    }
}
