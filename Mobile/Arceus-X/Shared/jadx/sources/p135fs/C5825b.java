package p135fs;

import bs.InterfaceC1489b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p451ts.C11746c;
import p451ts.C11747d;

/* JADX INFO: renamed from: fs.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lfs/b;", "Lbs/b;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5825b implements InterfaceC1489b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5825b f22224a = new C5825b();

    @Override // bs.InterfaceC1489b
    @NotNull
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        Object objFirstOrNull;
        String string;
        boolean z10 = expression instanceof List;
        List list = z10 ? (List) expression : null;
        long jM43983c = (list == null || (objFirstOrNull = CollectionsKt.firstOrNull(list)) == null || (string = objFirstOrNull.toString()) == null) ? 0L : C11747d.m43983c(string);
        List list2 = z10 ? (List) expression : null;
        Object objM43979b = list2 != null ? C11746c.m43979b(list2) : null;
        List listM31892k = objM43979b instanceof List ? (List) objM43979b : null;
        if (listM31892k == null) {
            listM31892k = C7699p.m31892k();
        }
        List<Object> listMo6534l = C5824a.f22223a.mo6534l(listM31892k, data);
        List<Object> list3 = ((long) (listM31892k.size() - listMo6534l.size())) < jM43983c ? listMo6534l : null;
        return list3 == null ? C7699p.m31892k() : list3;
    }
}
