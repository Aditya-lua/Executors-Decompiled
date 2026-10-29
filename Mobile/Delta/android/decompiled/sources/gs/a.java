package gs;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\f\u0010\b¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lgs/a;", "", "expression", "", "", "d", "(Ljava/lang/Object;)Ljava/util/List;", "c", "(Ljava/util/List;)Ljava/lang/Object;", "", "b", "(Ljava/lang/Object;)Z", "a", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    default Object a(List<?> list) {
        Object objC;
        return (list.size() <= 1 && (objC = c(list)) != null) ? objC : list;
    }

    default boolean b(Object obj) {
        return p.n(null, "", p.k()).contains(obj);
    }

    default Object c(List<?> list) {
        Object objFirstOrNull = CollectionsKt.firstOrNull(list);
        if (objFirstOrNull instanceof List) {
            return a((List) objFirstOrNull);
        }
        if (b(objFirstOrNull)) {
            return null;
        }
        return objFirstOrNull;
    }

    @Nullable
    default List<String> d(@Nullable Object expression) {
        String string;
        if (expression instanceof List) {
            expression = c((List) expression);
        }
        List<String> listSplit$default = null;
        if (expression instanceof List) {
            return null;
        }
        if (expression != null && (string = expression.toString()) != null) {
            listSplit$default = StringsKt.split$default(string, new String[]{"."}, false, 0, 6, null);
        }
        return listSplit$default == null ? p.k() : listSplit$default;
    }
}
