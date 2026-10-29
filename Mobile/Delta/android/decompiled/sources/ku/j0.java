package ku;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001a\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u00020\u0016H\u0080\u0010¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lku/p0;", "Lkotlin/coroutines/CoroutineContext;", "context", "k", "(Lku/p0;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "addedContext", "j", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "", "h", "(Lkotlin/coroutines/CoroutineContext;)Z", "originalContext", "appendContext", "isNewCoroutine", "d", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Z)Lkotlin/coroutines/CoroutineContext;", "Lnt/b;", "", "oldValue", "Lku/i3;", "m", "(Lnt/b;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Lku/i3;", "Lpt/e;", "l", "(Lpt/e;)Lku/i3;", "", "g", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final CoroutineContext d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z10) {
        boolean zH = h(coroutineContext);
        boolean zH2 = h(coroutineContext2);
        if (!zH && !zH2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f22552a = coroutineContext2;
        kotlin.coroutines.e eVar = kotlin.coroutines.e.f22525a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(eVar, new Function2() { // from class: ku.h0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return j0.e(c0Var, z10, (CoroutineContext) obj, (CoroutineContext.Element) obj2);
            }
        });
        if (zH2) {
            c0Var.f22552a = ((CoroutineContext) c0Var.f22552a).fold(eVar, new Function2() { // from class: ku.i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return j0.f((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) c0Var.f22552a);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlin.coroutines.CoroutineContext] */
    public static final CoroutineContext e(kotlin.jvm.internal.c0 c0Var, boolean z10, CoroutineContext coroutineContext, CoroutineContext.Element element) {
        if (!(element instanceof f0)) {
            return coroutineContext.plus(element);
        }
        CoroutineContext.Element element2 = ((CoroutineContext) c0Var.f22552a).get(element.getKey());
        if (element2 == null) {
            return coroutineContext.plus(z10 ? ((f0) element).copyForChild() : (f0) element);
        }
        c0Var.f22552a = ((CoroutineContext) c0Var.f22552a).minusKey(element.getKey());
        return coroutineContext.plus(((f0) element).mergeForChild(element2));
    }

    public static final CoroutineContext f(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return element instanceof f0 ? coroutineContext.plus(((f0) element).copyForChild()) : coroutineContext.plus(element);
    }

    @Nullable
    public static final String g(@NotNull CoroutineContext coroutineContext) {
        return null;
    }

    public static final boolean h(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new Function2() { // from class: ku.g0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(j0.i(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2));
            }
        })).booleanValue();
    }

    public static final boolean i(boolean z10, CoroutineContext.Element element) {
        return z10 || (element instanceof f0);
    }

    @NotNull
    public static final CoroutineContext j(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2) {
        return !h(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : d(coroutineContext, coroutineContext2, false);
    }

    @NotNull
    public static final CoroutineContext k(@NotNull p0 p0Var, @NotNull CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextD = d(p0Var.getCoroutineContext(), coroutineContext, true);
        return (coroutineContextD == g1.a() || coroutineContextD.get(kotlin.coroutines.d.INSTANCE) != null) ? coroutineContextD : coroutineContextD.plus(g1.a());
    }

    @Nullable
    public static final i3<?> l(@NotNull pt.e eVar) {
        while (!(eVar instanceof c1) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof i3) {
                return (i3) eVar;
            }
        }
        return null;
    }

    @Nullable
    public static final i3<?> m(@NotNull nt.b<?> bVar, @NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (!(bVar instanceof pt.e) || coroutineContext.get(j3.f22816a) == null) {
            return null;
        }
        i3<?> i3VarL = l((pt.e) bVar);
        if (i3VarL != null) {
            i3VarL.a1(coroutineContext, obj);
        }
        return i3VarL;
    }
}
