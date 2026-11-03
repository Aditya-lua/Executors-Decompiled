package qs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ur.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J;\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00022\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\t\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lqs/a;", "", "", "expression", "data", "Lur/l;", "evaluator", "h", "(Ljava/util/List;Ljava/lang/Object;Lur/l;)Ljava/util/List;", "l", "(Ljava/lang/Object;Ljava/lang/Object;Lur/l;)Ljava/lang/Object;", "operations-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @Nullable
    default List<Object> h(@NotNull List<? extends Object> expression, @Nullable Object data, @NotNull l evaluator) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Object objL = l(CollectionsKt.firstOrNull(expression), data, evaluator);
        if (objL instanceof List) {
            return (List) objL;
        }
        return null;
    }

    default Object l(Object obj, Object obj2, l lVar) {
        if (!(obj instanceof List)) {
            if (!rs.a.f(obj)) {
                return obj;
            }
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            return lVar.a((Map) obj, obj2);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(q.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(l(it.next(), obj2, lVar));
        }
        return arrayList;
    }
}
