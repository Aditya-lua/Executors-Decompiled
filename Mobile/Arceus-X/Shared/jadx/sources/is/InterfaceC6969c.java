package is;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p060cs.InterfaceC4361c;
import p254ks.InterfaceC7820a;
import p254ks.InterfaceC7822c;
import p451ts.C11744a;
import p451ts.C11746c;

/* JADX INFO: renamed from: is.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J3\u0010\n\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, m31665d2 = {"Lis/c;", "Lcs/c;", "Lks/a;", "Lks/c;", "", "values", "Lkotlin/Function2;", "", "", "operator", "c", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Z", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC6969c extends InterfaceC4361c, InterfaceC7820a, InterfaceC7822c {
    /* JADX INFO: renamed from: c */
    default boolean mo29341c(@Nullable Object values, @NotNull Function2<? super Integer, ? super Integer, Boolean> operator) {
        Intrinsics.checkNotNullParameter(operator, "operator");
        List<Object> listM43971c = C11744a.m43971c(values);
        Object objMo29342k = mo29342k(CollectionsKt.firstOrNull(listM43971c));
        Object objMo29342k2 = mo29342k(C11746c.m43979b(listM43971c));
        C6970d c6970d = C6970d.f27234a;
        List<Object> listM29344a = c6970d.m29344a(objMo29342k);
        List<Object> listM29344a2 = c6970d.m29344a(objMo29342k2);
        if (listM29344a != null || listM29344a2 != null) {
            if (listM29344a != null ? listM29344a.contains(objMo29342k2) : false) {
                return true;
            }
            return listM29344a2 != null ? listM29344a2.contains(objMo29342k) : false;
        }
        List<Object> list = listM43971c;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo29340a(it.next()));
        }
        return mo22009e(arrayList, operator);
    }
}
