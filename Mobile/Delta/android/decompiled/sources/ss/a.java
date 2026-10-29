package ss;

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
import wr.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J;\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00022\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\t\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lss/a;", "", "", "expression", "data", "Lwr/l;", "evaluator", "m", "(Ljava/util/List;Ljava/lang/Object;Lwr/l;)Ljava/util/List;", "g", "(Ljava/lang/Object;Ljava/lang/Object;Lwr/l;)Ljava/lang/Object;", "operations-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    default Object g(Object obj, Object obj2, l lVar) {
        if (!(obj instanceof List)) {
            if (!ts.a.f(obj)) {
                return obj;
            }
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            return lVar.a((Map) obj, obj2);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(q.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(g(it.next(), obj2, lVar));
        }
        return arrayList;
    }

    @Nullable
    default List<Object> m(@NotNull List<? extends Object> expression, @Nullable Object data, @NotNull l evaluator) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Object objG = g(CollectionsKt.firstOrNull(expression), data, evaluator);
        if (objG instanceof List) {
            return (List) objG;
        }
        return null;
    }
}
