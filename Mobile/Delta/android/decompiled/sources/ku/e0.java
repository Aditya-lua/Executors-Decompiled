package ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "Ljt/n;", "", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lku/n;", "caller", "c", "(Ljava/lang/Object;Lku/n;)Ljava/lang/Object;", "state", "Lnt/b;", "uCont", "a", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e0 {
    @NotNull
    public static final <T> Object a(@Nullable Object obj, @NotNull nt.b<? super T> bVar) {
        if (!(obj instanceof c0)) {
            return jt.n.b(obj);
        }
        jt.n.Companion companion = jt.n.INSTANCE;
        return jt.n.b(jt.o.a(((c0) obj).cause));
    }

    @Nullable
    public static final <T> Object b(@NotNull Object obj) {
        Throwable thE = jt.n.e(obj);
        return thE == null ? obj : new c0(thE, false, 2, null);
    }

    @Nullable
    public static final <T> Object c(@NotNull Object obj, @NotNull n<?> nVar) {
        Throwable thE = jt.n.e(obj);
        return thE == null ? obj : new c0(thE, false, 2, null);
    }
}
