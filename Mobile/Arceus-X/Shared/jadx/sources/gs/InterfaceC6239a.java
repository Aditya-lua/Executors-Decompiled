package gs;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gs.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\f\u0010\b¨\u0006\rÀ\u0006\u0003"}, m31665d2 = {"Lgs/a;", "", "expression", "", "", "d", "(Ljava/lang/Object;)Ljava/util/List;", "c", "(Ljava/util/List;)Ljava/lang/Object;", "", "b", "(Ljava/lang/Object;)Z", "a", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC6239a {
    /* JADX INFO: renamed from: a */
    default Object m27442a(List<?> list) {
        Object objM27444c;
        return (list.size() <= 1 && (objM27444c = m27444c(list)) != null) ? objM27444c : list;
    }

    /* JADX INFO: renamed from: b */
    default boolean m27443b(Object obj) {
        return C7699p.m31895n(null, "", C7699p.m31892k()).contains(obj);
    }

    /* JADX INFO: renamed from: c */
    default Object m27444c(List<?> list) {
        Object objFirstOrNull = CollectionsKt.firstOrNull(list);
        if (objFirstOrNull instanceof List) {
            return m27442a((List) objFirstOrNull);
        }
        if (m27443b(objFirstOrNull)) {
            return null;
        }
        return objFirstOrNull;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    default List<String> mo26167d(@Nullable Object expression) {
        String string;
        if (expression instanceof List) {
            expression = m27444c((List) expression);
        }
        List<String> listSplit$default = null;
        if (expression instanceof List) {
            return null;
        }
        if (expression != null && (string = expression.toString()) != null) {
            listSplit$default = StringsKt.split$default(string, new String[]{"."}, false, 0, 6, null);
        }
        return listSplit$default == null ? C7699p.m31892k() : listSplit$default;
    }
}
