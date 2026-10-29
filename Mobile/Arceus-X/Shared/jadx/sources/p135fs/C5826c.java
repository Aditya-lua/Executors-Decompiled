package p135fs;

import bs.InterfaceC1489b;
import gs.InterfaceC6239a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p451ts.C11744a;
import p451ts.C11746c;
import p451ts.C11747d;

/* JADX INFO: renamed from: fs.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u0004\u0018\u00010\u0005*\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0016\u001a\u0004\u0018\u00010\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lfs/c;", "Lbs/b;", "Lgs/a;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "e", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "value", "indexParts", "f", "(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;", "", "h", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "indexes", "g", "(Ljava/util/List;Ljava/util/List;)Ljava/lang/Object;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5826c implements InterfaceC1489b, InterfaceC6239a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5826c f22225a = new C5826c();

    @Override // gs.InterfaceC6239a
    @Nullable
    /* JADX INFO: renamed from: d */
    public List<String> mo26167d(@Nullable Object obj) {
        return super.mo26167d(obj);
    }

    /* JADX INFO: renamed from: e */
    public final Object m26168e(List<String> list, Object obj, Object obj2) {
        if (!list.isEmpty()) {
            obj2 = m26169f(obj2, list);
        }
        if (m26171h(obj2, obj)) {
            obj2 = null;
            List list2 = obj instanceof List ? (List) obj : null;
            if (list2 != null) {
                return C11746c.m43979b(list2);
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: f */
    public final Object m26169f(Object value, List<String> indexParts) {
        if (value instanceof List) {
            return indexParts.size() == 1 ? ((List) value).get(C11747d.m43982b((String) CollectionsKt.m31706d0(indexParts))) : m26170g(indexParts, (List) value);
        }
        if (value instanceof Map) {
            value = ((Map) value).get(CollectionsKt.m31706d0(indexParts));
            for (String str : CollectionsKt.m31701Y(indexParts, 1)) {
                Map map = value instanceof Map ? (Map) value : null;
                value = map != null ? map.get(str) : null;
            }
        }
        return value;
    }

    /* JADX INFO: renamed from: g */
    public final Object m26170g(List<String> indexes, List<? extends Object> data) {
        String str = (String) CollectionsKt.firstOrNull(indexes);
        if (str == null) {
            return null;
        }
        Object objF0 = CollectionsKt.m31708f0(data, C11747d.m43982b(str));
        return objF0 instanceof List ? f22225a.m26170g(indexes.subList(1, indexes.size()), (List) objF0) : CollectionsKt.m31708f0(data, C11747d.m43982b(str));
    }

    /* JADX INFO: renamed from: h */
    public final boolean m26171h(Object value, Object expression) {
        return (Intrinsics.m31980c(value, expression) || value == null) && (expression instanceof List) && ((List) expression).size() > 1;
    }

    @Override // bs.InterfaceC1489b
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        List<String> listMo26167d = mo26167d(C11744a.m43971c(expression));
        if (listMo26167d != null) {
            return m26168e(listMo26167d, expression, data);
        }
        return null;
    }
}
