package p395qu;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.InterfaceC7836a3;

/* JADX INFO: renamed from: qu.l0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"*\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"2\u0010\u0017\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00150\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013\"&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013¨\u0006\u001b"}, m31665d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "g", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "countOrElement", "i", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "", "f", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lqu/e0;", "a", "Lqu/e0;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "b", "Lkotlin/jvm/functions/Function2;", "countAll", "Lku/a3;", "c", "findOne", "Lqu/r0;", "d", "updateState", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10733l0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10719e0 f38295a = new C10719e0("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Function2<Object, CoroutineContext.Element, Object> f38296b = new Function2() { // from class: qu.i0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C10733l0.m40884d(obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Function2<InterfaceC7836a3<?>, CoroutineContext.Element, InterfaceC7836a3<?>> f38297c = new Function2() { // from class: qu.j0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C10733l0.m40885e((InterfaceC7836a3) obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Function2<C10745r0, CoroutineContext.Element, C10745r0> f38298d = new Function2() { // from class: qu.k0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C10733l0.m40888h((C10745r0) obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: renamed from: d */
    public static final Object m40884d(Object obj, CoroutineContext.Element element) {
        if (!(element instanceof InterfaceC7836a3)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC7836a3<?> m40885e(InterfaceC7836a3<?> interfaceC7836a3, CoroutineContext.Element element) {
        if (interfaceC7836a3 != null) {
            return interfaceC7836a3;
        }
        if (element instanceof InterfaceC7836a3) {
            return (InterfaceC7836a3) element;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final void m40886f(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == f38295a) {
            return;
        }
        if (obj instanceof C10745r0) {
            ((C10745r0) obj).m40948b(coroutineContext);
            return;
        }
        Object objFold = coroutineContext.fold(null, f38297c);
        Intrinsics.m31981d(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((InterfaceC7836a3) objFold).restoreThreadContext(coroutineContext, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final Object m40887g(@NotNull CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, f38296b);
        Intrinsics.checkNotNull(objFold);
        return objFold;
    }

    /* JADX INFO: renamed from: h */
    public static final C10745r0 m40888h(C10745r0 c10745r0, CoroutineContext.Element element) {
        if (element instanceof InterfaceC7836a3) {
            InterfaceC7836a3<?> interfaceC7836a3 = (InterfaceC7836a3) element;
            c10745r0.m40947a(interfaceC7836a3, interfaceC7836a3.updateThreadContext(c10745r0.context));
        }
        return c10745r0;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static final Object m40889i(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == null) {
            obj = m40887g(coroutineContext);
        }
        if (obj == 0) {
            return f38295a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new C10745r0(coroutineContext, ((Number) obj).intValue()), f38298d);
        }
        Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((InterfaceC7836a3) obj).updateThreadContext(coroutineContext);
    }
}
