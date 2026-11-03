package iu;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Liu/x0;", "T", "Liu/a;", "Liu/w0;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Z)V", "f", "()Ljava/lang/Object;", "n", "(Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class x0<T> extends a<T> implements w0<T> {
    public x0(@NotNull CoroutineContext coroutineContext, boolean z10) {
        super(coroutineContext, true, z10);
    }

    public static /* synthetic */ <T> Object X0(x0<T> x0Var, lt.b<? super T> bVar) throws Throwable {
        Object objQ = x0Var.Q(bVar);
        mt.c.e();
        return objQ;
    }

    @Override // iu.w0
    public T f() {
        return (T) d0();
    }

    @Override // iu.w0
    @Nullable
    public Object n(@NotNull lt.b<? super T> bVar) {
        return X0(this, bVar);
    }
}
