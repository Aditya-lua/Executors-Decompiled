package ku;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0012R(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lku/i3;", "T", "Lqu/a0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lnt/b;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lnt/b;)V", "", "oldValue", "", "a1", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "Y0", "()Z", "X0", "()V", "state", "T0", "(Ljava/lang/Object;)V", "Z0", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "e", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "threadLocalIsSet", "Z", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i3<T> extends qu.a0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ThreadLocal<Pair<CoroutineContext, Object>> threadStateToRecover;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public i3(@NotNull CoroutineContext coroutineContext, @NotNull nt.b<? super T> bVar) {
        j3 j3Var = j3.f22816a;
        super(coroutineContext.get(j3Var) == null ? coroutineContext.plus(j3Var) : coroutineContext, bVar);
        this.threadStateToRecover = new ThreadLocal<>();
        if (bVar.getContext().get(kotlin.coroutines.d.INSTANCE) instanceof l0) {
            return;
        }
        Object objI = qu.l0.i(coroutineContext, null);
        qu.l0.f(coroutineContext, objI);
        a1(coroutineContext, objI);
    }

    @Override // qu.a0, ku.a
    public void T0(@Nullable Object state) {
        Z0();
        Object objA = e0.a(state, this.uCont);
        nt.b<T> bVar = this.uCont;
        CoroutineContext context = bVar.getContext();
        Object objI = qu.l0.i(context, null);
        i3<?> i3VarM = objI != qu.l0.f29659a ? j0.m(bVar, context, objI) : null;
        try {
            this.uCont.resumeWith(objA);
            Unit unit = Unit.f22483a;
        } finally {
            if (i3VarM == null || i3VarM.Y0()) {
                qu.l0.f(context, objI);
            }
        }
    }

    @Override // qu.a0
    public void X0() {
        Z0();
    }

    public final boolean Y0() {
        boolean z10 = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z10;
    }

    public final void Z0() {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.threadStateToRecover.get();
            if (pair != null) {
                qu.l0.f(pair.a(), pair.b());
            }
            this.threadStateToRecover.remove();
        }
    }

    public final void a1(@NotNull CoroutineContext context, @Nullable Object oldValue) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(jt.s.a(context, oldValue));
    }
}
