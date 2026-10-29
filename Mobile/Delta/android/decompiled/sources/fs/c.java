package fs;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ts.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u0004\u0018\u00010\u0005*\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0016\u001a\u0004\u0018\u00010\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lfs/c;", "Lbs/b;", "Lgs/a;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "e", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "value", "indexParts", "f", "(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;", "", "h", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "indexes", "g", "(Ljava/util/List;Ljava/util/List;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements bs.b, gs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f17223a = new c();

    @Override // gs.a
    @Nullable
    public List<String> d(@Nullable Object obj) {
        return super.d(obj);
    }

    public final Object e(List<String> list, Object obj, Object obj2) {
        if (!list.isEmpty()) {
            obj2 = f(obj2, list);
        }
        if (h(obj2, obj)) {
            obj2 = null;
            List list2 = obj instanceof List ? (List) obj : null;
            if (list2 != null) {
                return ts.c.b(list2);
            }
        }
        return obj2;
    }

    public final Object f(Object value, List<String> indexParts) {
        if (value instanceof List) {
            return indexParts.size() == 1 ? ((List) value).get(d.b((String) CollectionsKt.d0(indexParts))) : g(indexParts, (List) value);
        }
        if (value instanceof Map) {
            value = ((Map) value).get(CollectionsKt.d0(indexParts));
            for (String str : CollectionsKt.Y(indexParts, 1)) {
                Map map = value instanceof Map ? (Map) value : null;
                value = map != null ? map.get(str) : null;
            }
        }
        return value;
    }

    public final Object g(List<String> indexes, List<? extends Object> data) {
        String str = (String) CollectionsKt.firstOrNull(indexes);
        if (str == null) {
            return null;
        }
        Object objF0 = CollectionsKt.f0(data, d.b(str));
        return objF0 instanceof List ? f17223a.g(indexes.subList(1, indexes.size()), (List) objF0) : CollectionsKt.f0(data, d.b(str));
    }

    public final boolean h(Object value, Object expression) {
        return (Intrinsics.c(value, expression) || value == null) && (expression instanceof List) && ((List) expression).size() > 1;
    }

    @Override // bs.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        List<String> listD = d(ts.a.c(expression));
        if (listD != null) {
            return e(listD, expression, data);
        }
        return null;
    }
}
