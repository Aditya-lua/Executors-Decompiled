package ms;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J;\u0010\t\u001a\u00020\u00072\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ9\u0010\f\u001a\u00020\u0007*\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000b0\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¢\u0006\u0004\b\f\u0010\n¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lms/i;", "Lcs/c;", "", "", "values", "Lkotlin/Function2;", "", "", "operator", "i", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Z", "", "n", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i extends cs.c {
    default boolean i(@Nullable List<? extends Object> values, @NotNull Function2<? super Integer, ? super Integer, Boolean> operator) {
        List<Comparable<?>> listD;
        Intrinsics.checkNotNullParameter(operator, "operator");
        if (values != null && (listD = ts.a.d(values)) != null) {
            if (listD.size() == 2) {
                return e(listD, operator);
            }
            if (listD.size() > 2) {
                return n(listD, operator);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    default boolean n(List<? extends Comparable<?>> list, Function2<? super Integer, ? super Integer, Boolean> function2) {
        return e(p.n(CollectionsKt.firstOrNull(list), ts.c.b(list)), function2) && e(p.n(ts.c.b(list), ts.c.c(list)), function2);
    }
}
