package ou;

import iu.b1;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0017\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lou/a0;", "T", "Liu/a;", "Lnt/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/CoroutineContext;", "context", "Llt/b;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Llt/b;)V", "", "state", "", "P", "(Ljava/lang/Object;)V", "X0", "()V", "T0", "d", "Llt/b;", "getCallerFrame", "()Lnt/e;", "callerFrame", "", "s0", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a0<T> extends iu.a<T> implements nt.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lt.b<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(@NotNull CoroutineContext coroutineContext, @NotNull lt.b<? super T> bVar) {
        super(coroutineContext, true, true);
        this.uCont = bVar;
    }

    @Override // iu.j2
    public void P(@Nullable Object state) throws b1 {
        j.b(mt.b.c(this.uCont), iu.e0.a(state, this.uCont));
    }

    @Override // iu.a
    public void T0(@Nullable Object state) {
        lt.b<T> bVar = this.uCont;
        bVar.resumeWith(iu.e0.a(state, bVar));
    }

    public void X0() {
    }

    @Override // nt.e
    @Nullable
    public final nt.e getCallerFrame() {
        lt.b<T> bVar = this.uCont;
        if (bVar instanceof nt.e) {
            return (nt.e) bVar;
        }
        return null;
    }

    @Override // iu.j2
    public final boolean s0() {
        return true;
    }
}
