package ku;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aN\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "block", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
public final /* synthetic */ class j {
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    public static final <T> T a(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super p0, ? super nt.b<? super T>, ? extends Object> function2) {
        m1 m1VarA;
        CoroutineContext coroutineContextK;
        Thread threadCurrentThread = Thread.currentThread();
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContext.get(kotlin.coroutines.d.INSTANCE);
        if (dVar == null) {
            m1VarA = c3.f22770a.b();
            coroutineContextK = j0.k(w1.f22869a, coroutineContext.plus(m1VarA));
        } else {
            m1 m1Var = dVar instanceof m1 ? (m1) dVar : null;
            if (m1Var == null) {
                m1VarA = c3.f22770a.a();
            } else {
                m1 m1Var2 = m1Var.x0() ? m1Var : null;
                if (m1Var2 == null) {
                    m1VarA = c3.f22770a.a();
                } else {
                    m1VarA = m1Var2;
                }
            }
            coroutineContextK = j0.k(w1.f22869a, coroutineContext);
        }
        g gVar = new g(coroutineContextK, threadCurrentThread, m1VarA);
        gVar.W0(r0.DEFAULT, gVar, function2);
        return (T) gVar.X0();
    }

    public static /* synthetic */ Object b(CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f22525a;
        }
        return i.e(coroutineContext, function2);
    }
}
