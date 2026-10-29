package nu;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a=\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"T", "value", "Lnu/c0;", "a", "(Ljava/lang/Object;)Lnu/c0;", "Lnu/p0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "Lnu/h;", "d", "(Lnu/p0;Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lnu/h;", "Lqu/e0;", "Lqu/e0;", "NONE", "b", "PENDING", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final qu.e0 f26796a = new qu.e0("NONE");

    @NotNull
    public static final qu.e0 b = new qu.e0("PENDING");

    @NotNull
    public static final <T> c0<T> a(T t8) {
        if (t8 == null) {
            t8 = (T) p001ou.t.f28008a;
        }
        return new q0(t8);
    }

    @NotNull
    public static final <T> h<T> d(@NotNull p0<? extends T> p0Var, @NotNull CoroutineContext coroutineContext, int i10, @NotNull mu.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != mu.a.DROP_OLDEST) ? i0.e(p0Var, coroutineContext, i10, aVar) : p0Var;
    }
}
