package ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lku/n;", "Lku/m;", "handler", "", "c", "(Lku/n;Lku/m;)V", "Lnt/b;", "delegate", "Lku/p;", "b", "(Lnt/b;)Lku/p;", "Lku/i1;", "handle", "a", "(Lku/n;Lku/i1;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {
    public static final void a(@NotNull n<?> nVar, @NotNull i1 i1Var) {
        c(nVar, new j1(i1Var));
    }

    @NotNull
    public static final <T> p<T> b(@NotNull nt.b<? super T> bVar) {
        if (!(bVar instanceof qu.i)) {
            return new p<>(bVar, 1);
        }
        p<T> pVarM = ((qu.i) bVar).m();
        if (pVarM != null) {
            if (!pVarM.R()) {
                pVarM = null;
            }
            if (pVarM != null) {
                return pVarM;
            }
        }
        return new p<>(bVar, 2);
    }

    public static final <T> void c(@NotNull n<? super T> nVar, @NotNull m mVar) {
        if (!(nVar instanceof p)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((p) nVar).L(mVar);
    }
}
