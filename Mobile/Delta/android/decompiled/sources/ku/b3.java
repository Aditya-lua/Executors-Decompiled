package ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import qu.ThreadLocal;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Ljava/lang/ThreadLocal;", "value", "Lku/a3;", "a", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lku/a3;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b3 {
    @NotNull
    public static final <T> a3<T> a(@NotNull ThreadLocal<T> threadLocal, T t8) {
        return new ThreadLocal(t8, threadLocal);
    }
}
