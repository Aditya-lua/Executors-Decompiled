package cs;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.text.w;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J9\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0018\u00010\u00052\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0018\u00010\u00052\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcs/b;", "Lcs/a;", "", "first", "second", "", "d", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/util/List;", "h", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b extends a {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    default List<Comparable<?>> d(@Nullable Comparable<?> first, @Nullable Comparable<?> second) {
        boolean z10 = first instanceof Number;
        if (z10 && (second instanceof Number)) {
            return p.n(Double.valueOf(((Number) first).doubleValue()), Double.valueOf(((Number) second).doubleValue()));
        }
        if ((first instanceof String) && (second instanceof Number)) {
            return p.n(w.r((String) first), Double.valueOf(((Number) second).doubleValue()));
        }
        if (z10 && (second instanceof String)) {
            return p.n(Double.valueOf(((Number) first).doubleValue()), w.r((String) second));
        }
        return ((first instanceof Boolean) || (second instanceof Boolean)) ? p.n(b(first), b(second)) : h(first, second);
    }

    @Nullable
    default List<Comparable<?>> h(@Nullable Comparable<?> first, @Nullable Comparable<?> second) {
        if (first != null && second != null && first.getClass() == second.getClass()) {
            return p.n(first, second);
        }
        if (first == null && second == null) {
            return p.n(first, second);
        }
        return null;
    }
}
