package ms;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p060cs.InterfaceC4361c;
import p451ts.C11744a;
import p451ts.C11746c;

/* JADX INFO: renamed from: ms.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J;\u0010\t\u001a\u00020\u00072\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ9\u0010\f\u001a\u00020\u0007*\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000b0\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¢\u0006\u0004\b\f\u0010\n¨\u0006\rÀ\u0006\u0003"}, m31665d2 = {"Lms/i;", "Lcs/c;", "", "", "values", "Lkotlin/Function2;", "", "", "operator", "i", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Z", "", "n", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC8661i extends InterfaceC4361c {
    /* JADX INFO: renamed from: i */
    default boolean mo34739i(@Nullable List<? extends Object> values, @NotNull Function2<? super Integer, ? super Integer, Boolean> operator) {
        List<Comparable<?>> listM43972d;
        Intrinsics.checkNotNullParameter(operator, "operator");
        if (values != null && (listM43972d = C11744a.m43972d(values)) != null) {
            if (listM43972d.size() == 2) {
                return mo22009e(listM43972d, operator);
            }
            if (listM43972d.size() > 2) {
                return m34742n(listM43972d, operator);
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Comparable[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Comparable[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    default boolean m34742n(List<? extends Comparable<?>> list, Function2<? super Integer, ? super Integer, Boolean> function2) {
        return mo22009e(C7699p.m31895n(CollectionsKt.firstOrNull(list), C11746c.m43979b(list)), function2) && mo22009e(C7699p.m31895n(C11746c.m43979b(list), C11746c.m43980c(list)), function2);
    }
}
