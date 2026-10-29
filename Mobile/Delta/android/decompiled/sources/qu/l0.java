package qu;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.a3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"*\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"2\u0010\u0017\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00150\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013\"&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013¨\u0006\u001b"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "g", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "countOrElement", "i", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "", "f", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lqu/e0;", "a", "Lqu/e0;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "b", "Lkotlin/jvm/functions/Function2;", "countAll", "Lku/a3;", "c", "findOne", "Lqu/r0;", "d", "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e0 f29659a = new e0("NO_THREAD_ELEMENTS");

    @NotNull
    public static final Function2<Object, CoroutineContext.Element, Object> b = new Function2() { // from class: qu.i0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return l0.d(obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Function2<a3<?>, CoroutineContext.Element, a3<?>> f29660c = new Function2() { // from class: qu.j0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return l0.e((a3) obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Function2<r0, CoroutineContext.Element, r0> f29661d = new Function2() { // from class: qu.k0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return l0.h((r0) obj, (CoroutineContext.Element) obj2);
        }
    };

    public static final Object d(Object obj, CoroutineContext.Element element) {
        if (!(element instanceof a3)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
    }

    public static final a3<?> e(a3<?> a3Var, CoroutineContext.Element element) {
        if (a3Var != null) {
            return a3Var;
        }
        if (element instanceof a3) {
            return (a3) element;
        }
        return null;
    }

    public static final void f(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == f29659a) {
            return;
        }
        if (obj instanceof r0) {
            ((r0) obj).b(coroutineContext);
            return;
        }
        Object objFold = coroutineContext.fold(null, f29660c);
        Intrinsics.d(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((a3) objFold).restoreThreadContext(coroutineContext, obj);
    }

    @NotNull
    public static final Object g(@NotNull CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, b);
        Intrinsics.checkNotNull(objFold);
        return objFold;
    }

    public static final r0 h(r0 r0Var, CoroutineContext.Element element) {
        if (element instanceof a3) {
            a3<?> a3Var = (a3) element;
            r0Var.a(a3Var, a3Var.updateThreadContext(r0Var.context));
        }
        return r0Var;
    }

    @Nullable
    public static final Object i(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == null) {
            obj = g(coroutineContext);
        }
        if (obj == 0) {
            return f29659a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new r0(coroutineContext, ((Number) obj).intValue()), f29661d);
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((a3) obj).updateThreadContext(coroutineContext);
    }
}
