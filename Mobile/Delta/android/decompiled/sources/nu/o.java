package nu;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\t\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"T", "Lnu/h;", "", "capacity", "Lmu/a;", "onBufferOverflow", "a", "(Lnu/h;ILmu/a;)Lnu/h;", "e", "(Lnu/h;)Lnu/h;", "Lkotlin/coroutines/CoroutineContext;", "context", "f", "(Lnu/h;Lkotlin/coroutines/CoroutineContext;)Lnu/h;", "c", "", "d", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class o {
    @NotNull
    public static final <T> h<T> a(@NotNull h<? extends T> hVar, int i10, @NotNull mu.a aVar) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && aVar != mu.a.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            aVar = mu.a.DROP_OLDEST;
            i10 = 0;
        }
        int i11 = i10;
        mu.a aVar2 = aVar;
        if (hVar instanceof p001ou.q) {
            return ou.q.a.a((p001ou.q) hVar, null, i11, aVar2, 1, null);
        }
        return new p001ou.h(hVar, null, i11, aVar2, 2, null);
    }

    public static /* synthetic */ h b(h hVar, int i10, mu.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            aVar = mu.a.SUSPEND;
        }
        return j.b(hVar, i10, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> h<T> c(@NotNull h<? extends T> hVar) {
        return hVar instanceof c ? hVar : new d(hVar);
    }

    public static final void d(CoroutineContext coroutineContext) {
        if (coroutineContext.get(d2.INSTANCE) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    @NotNull
    public static final <T> h<T> e(@NotNull h<? extends T> hVar) {
        return b(hVar, -1, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> h<T> f(@NotNull h<? extends T> hVar, @NotNull CoroutineContext coroutineContext) {
        d(coroutineContext);
        if (Intrinsics.c(coroutineContext, kotlin.coroutines.e.f22525a)) {
            return hVar;
        }
        if (hVar instanceof p001ou.q) {
            return ou.q.a.a((p001ou.q) hVar, coroutineContext, 0, null, 6, null);
        }
        return new p001ou.h(hVar, coroutineContext, 0, null, 12, null);
    }
}
