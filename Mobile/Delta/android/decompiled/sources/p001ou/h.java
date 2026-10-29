package p001ou;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mu.a;
import nt.b;
import nu.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lou/h;", "T", "Lou/g;", "Lnu/h;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "<init>", "(Lnu/h;Lkotlin/coroutines/CoroutineContext;ILmu/a;)V", "Lou/e;", "f", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lou/e;", "h", "()Lnu/h;", "Lnu/i;", "collector", "", "q", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h<T> extends g<T, T> {
    public /* synthetic */ h(nu.h hVar, CoroutineContext coroutineContext, int i10, a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, (i11 & 2) != 0 ? e.f22525a : coroutineContext, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? a.SUSPEND : aVar);
    }

    @Override // p001ou.e
    @NotNull
    public e<T> f(@NotNull CoroutineContext context, int capacity, @NotNull a onBufferOverflow) {
        return new h(this.flow, context, capacity, onBufferOverflow);
    }

    @Override // p001ou.e
    @NotNull
    public nu.h<T> h() {
        return (nu.h<T>) this.flow;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p001ou.g
    @Nullable
    public Object q(@NotNull i<? super T> iVar, @NotNull b<? super Unit> bVar) {
        Object objCollect = this.flow.collect((i<? super S>) iVar, bVar);
        return objCollect == c.e() ? objCollect : Unit.f22483a;
    }

    public h(@NotNull nu.h<? extends T> hVar, @NotNull CoroutineContext coroutineContext, int i10, @NotNull a aVar) {
        super(hVar, coroutineContext, i10, aVar);
    }
}
