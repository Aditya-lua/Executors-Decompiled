package p256ku;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p395qu.C10711a0;
import p395qu.C10728j;

/* JADX INFO: renamed from: ku.c1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u000b\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¨\u0006\u0017"}, m31665d2 = {"Lku/c1;", "T", "Lqu/a0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lnt/b;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lnt/b;)V", "", "b1", "()Z", "a1", "", "state", "", "P", "(Ljava/lang/Object;)V", "T0", "Y0", "()Ljava/lang/Object;", "Lkotlinx/atomicfu/AtomicInt;", "_decision", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7844c1<T> extends C10711a0<T> {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29694e = AtomicIntegerFieldUpdater.newUpdater(C7844c1.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public C7844c1(@NotNull CoroutineContext coroutineContext, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        super(coroutineContext, interfaceC9557b);
    }

    /* JADX INFO: renamed from: a1 */
    private final boolean m32582a1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29694e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f29694e.compareAndSet(this, 0, 2));
        return true;
    }

    /* JADX INFO: renamed from: b1 */
    private final boolean m32583b1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29694e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f29694e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // p395qu.C10711a0, p256ku.C7880j2
    /* JADX INFO: renamed from: P */
    public void mo32584P(@Nullable Object state) throws C7839b1 {
        mo32551T0(state);
    }

    @Override // p395qu.C10711a0, p256ku.AbstractC7832a
    /* JADX INFO: renamed from: T0 */
    public void mo32551T0(@Nullable Object state) throws C7839b1 {
        if (m32582a1()) {
            return;
        }
        C10728j.m40867b(C10046b.m38803c(this.uCont), C7853e0.m32623a(state, this.uCont));
    }

    @Nullable
    /* JADX INFO: renamed from: Y0 */
    public final Object m32585Y0() {
        if (m32583b1()) {
            return C10047c.m38805e();
        }
        Object objM32789h = C7885k2.m32789h(m32750l0());
        if (objM32789h instanceof C7843c0) {
            throw ((C7843c0) objM32789h).cause;
        }
        return objM32789h;
    }
}
