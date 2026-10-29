package p060cs;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.text.C7796w;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cs.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J9\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0018\u00010\u00052\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0018\u00010\u00052\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lcs/b;", "Lcs/a;", "", "first", "second", "", "d", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/util/List;", "h", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC4360b extends InterfaceC4359a {
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Comparable<?> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Comparable<?> */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: d */
    default List<Comparable<?>> mo22007d(@Nullable Comparable<?> first, @Nullable Comparable<?> second) {
        boolean z10 = first instanceof Number;
        if (z10 && (second instanceof Number)) {
            return C7699p.m31895n(Double.valueOf(((Number) first).doubleValue()), Double.valueOf(((Number) second).doubleValue()));
        }
        if ((first instanceof String) && (second instanceof Number)) {
            return C7699p.m31895n(C7796w.m32289r((String) first), Double.valueOf(((Number) second).doubleValue()));
        }
        if (z10 && (second instanceof String)) {
            return C7699p.m31895n(Double.valueOf(((Number) first).doubleValue()), C7796w.m32289r((String) second));
        }
        return ((first instanceof Boolean) || (second instanceof Boolean)) ? C7699p.m31895n(mo22006b(first), mo22006b(second)) : mo22008h(first, second);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    default List<Comparable<?>> mo22008h(@Nullable Comparable<?> first, @Nullable Comparable<?> second) {
        if (first != null && second != null && first.getClass() == second.getClass()) {
            return C7699p.m31895n(first, second);
        }
        if (first == null && second == null) {
            return C7699p.m31895n(first, second);
        }
        return null;
    }
}
