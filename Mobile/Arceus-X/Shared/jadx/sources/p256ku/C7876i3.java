package p256ku;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.InterfaceC7720d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7352s;
import p315nt.InterfaceC9557b;
import p395qu.C10711a0;
import p395qu.C10733l0;

/* JADX INFO: renamed from: ku.i3 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0012R(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m31665d2 = {"Lku/i3;", "T", "Lqu/a0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lnt/b;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lnt/b;)V", "", "oldValue", "", "a1", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "Y0", "()Z", "X0", "()V", "state", "T0", "(Ljava/lang/Object;)V", "Z0", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "e", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "threadLocalIsSet", "Z", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7876i3<T> extends C10711a0<T> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ThreadLocal<Pair<CoroutineContext, Object>> threadStateToRecover;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7876i3(@NotNull CoroutineContext coroutineContext, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        C7881j3 c7881j3 = C7881j3.f29750a;
        super(coroutineContext.get(c7881j3) == null ? coroutineContext.plus(c7881j3) : coroutineContext, interfaceC9557b);
        this.threadStateToRecover = new ThreadLocal<>();
        if (interfaceC9557b.getContext().get(InterfaceC7720d.INSTANCE) instanceof AbstractC7888l0) {
            return;
        }
        Object objM40889i = C10733l0.m40889i(coroutineContext, null);
        C10733l0.m40886f(coroutineContext, objM40889i);
        m32692a1(coroutineContext, objM40889i);
    }

    @Override // p395qu.C10711a0, p256ku.AbstractC7832a
    /* JADX INFO: renamed from: T0 */
    public void mo32551T0(@Nullable Object state) {
        m32691Z0();
        Object objM32623a = C7853e0.m32623a(state, this.uCont);
        InterfaceC9557b<T> interfaceC9557b = this.uCont;
        CoroutineContext context = interfaceC9557b.getContext();
        Object objM40889i = C10733l0.m40889i(context, null);
        C7876i3<?> c7876i3M32707m = objM40889i != C10733l0.f38295a ? C7878j0.m32707m(interfaceC9557b, context, objM40889i) : null;
        try {
            this.uCont.resumeWith(objM32623a);
            Unit unit = Unit.f29331a;
        } finally {
            if (c7876i3M32707m == null || c7876i3M32707m.m32690Y0()) {
                C10733l0.m40886f(context, objM40889i);
            }
        }
    }

    @Override // p395qu.C10711a0
    /* JADX INFO: renamed from: X0 */
    public void mo32689X0() {
        m32691Z0();
    }

    /* JADX INFO: renamed from: Y0 */
    public final boolean m32690Y0() {
        boolean z10 = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z10;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m32691Z0() {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.threadStateToRecover.get();
            if (pair != null) {
                C10733l0.m40886f(pair.m31671a(), pair.m31672b());
            }
            this.threadStateToRecover.remove();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m32692a1(@NotNull CoroutineContext context, @Nullable Object oldValue) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(C7352s.m30477a(context, oldValue));
    }
}
