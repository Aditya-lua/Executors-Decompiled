package tu;

import kotlin.Metadata;
import ku.l0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Lku/n;", "result", "", "c", "(Lku/n;Ljava/lang/Object;)V", "", "exception", "d", "(Lku/n;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void c(ku.n<? super T> nVar, T t8) {
        l0 l0Var = (l0) nVar.getContext().get(l0.INSTANCE);
        if (l0Var != null) {
            nVar.x(l0Var, t8);
        } else {
            nVar.resumeWith(jt.n.b(t8));
        }
    }

    public static final void d(ku.n<?> nVar, Throwable th2) {
        l0 l0Var = (l0) nVar.getContext().get(l0.INSTANCE);
        if (l0Var != null) {
            nVar.f(l0Var, th2);
        } else {
            jt.n.Companion companion = jt.n.INSTANCE;
            nVar.resumeWith(jt.n.b(jt.o.a(th2)));
        }
    }
}
