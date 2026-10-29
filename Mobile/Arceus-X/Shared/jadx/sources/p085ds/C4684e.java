package p085ds;

import bs.InterfaceC1489b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7697o;
import kotlin.collections.C7708u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p451ts.C11744a;

/* JADX INFO: renamed from: ds.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lds/e;", "Lbs/b;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "a", "(Ljava/util/List;)Ljava/util/List;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4684e implements InterfaceC1489b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4684e f19170a = new C4684e();

    /* JADX INFO: renamed from: a */
    public final List<Object> m22987a(List<? extends Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C7708u.m31931z(arrayList, obj instanceof List ? (List) obj : C7697o.m31878d(obj));
        }
        return arrayList;
    }

    @Override // bs.InterfaceC1489b
    @NotNull
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        return m22987a(C11744a.m43971c(expression));
    }
}
