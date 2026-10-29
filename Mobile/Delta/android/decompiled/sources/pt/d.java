package pt;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lpt/d;", "Lpt/a;", "Lnt/b;", "", "completion", "Lkotlin/coroutines/CoroutineContext;", "_context", "<init>", "(Lnt/b;Lkotlin/coroutines/CoroutineContext;)V", "(Lnt/b;)V", "intercepted", "()Lnt/b;", "", "releaseIntercepted", "()V", "Lkotlin/coroutines/CoroutineContext;", "Lnt/b;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class d extends a {

    @Nullable
    private final CoroutineContext _context;

    @Nullable
    private transient nt.b<Object> intercepted;

    public d(@Nullable nt.b<Object> bVar, @Nullable CoroutineContext coroutineContext) {
        super(bVar);
        this._context = coroutineContext;
    }

    @Override // nt.b
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    @NotNull
    public final nt.b<Object> intercepted() {
        nt.b<Object> bVarV = this.intercepted;
        if (bVarV == null) {
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) getContext().get(kotlin.coroutines.d.INSTANCE);
            if (dVar == null || (bVarV = dVar.v(this)) == null) {
                bVarV = this;
            }
            this.intercepted = bVarV;
        }
        return bVarV;
    }

    @Override // pt.a
    public void releaseIntercepted() {
        nt.b<?> bVar = this.intercepted;
        if (bVar != null && bVar != this) {
            CoroutineContext.Element element = getContext().get(kotlin.coroutines.d.INSTANCE);
            Intrinsics.checkNotNull(element);
            ((kotlin.coroutines.d) element).M(bVar);
        }
        this.intercepted = c.f28886a;
    }

    public d(@Nullable nt.b<Object> bVar) {
        this(bVar, bVar != null ? bVar.getContext() : null);
    }
}
