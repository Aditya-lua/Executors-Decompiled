package nu;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p256ku.C7905p;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p348p1.C10146t;
import p395qu.C10716d;
import p617ou.AbstractC10054d;
import p617ou.C10052c;
import pt.C10346h;

/* JADX INFO: renamed from: nu.s0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m31665d2 = {"Lnu/s0;", "Lou/d;", "Lnu/q0;", "<init>", "()V", "flow", "", "d", "(Lnu/q0;)Z", "", "Lnt/b;", "", "f", "(Lnu/q0;)[Lnt/b;", "g", "h", "()Z", "e", "(Lnt/b;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "_state", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C9598s0 extends AbstractC10054d<C9594q0<?>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AtomicReference<Object> _state = new AtomicReference<>(null);

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Z */
    @Override // p617ou.AbstractC10054d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo37810a(@NotNull C9594q0<?> flow) {
        if (C10716d.m40835a(this._state) != null) {
            return false;
        }
        C10716d.m40836b(this._state, C9596r0.f34682a);
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m37865e(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        if (!C10146t.m39085a(this._state, C9596r0.f34682a, c7905p)) {
            C7347n.Companion companion = C7347n.INSTANCE;
            c7905p.resumeWith(C7347n.m30460b(Unit.f29331a));
        }
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A == C10047c.m38805e() ? objM32857A : Unit.f29331a;
    }

    /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;)[Lnt/b; */
    @Override // p617ou.AbstractC10054d
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC9557b<Unit>[] mo37811b(@NotNull C9594q0<?> flow) {
        C10716d.m40836b(this._state, null);
        return C10052c.f36192a;
    }

    /* JADX INFO: renamed from: g */
    public final void m37867g() {
        AtomicReference<Object> atomicReference = this._state;
        while (true) {
            Object objM40835a = C10716d.m40835a(atomicReference);
            if (objM40835a == null || objM40835a == C9596r0.f34683b) {
                return;
            }
            if (objM40835a == C9596r0.f34682a) {
                if (C10146t.m39085a(this._state, objM40835a, C9596r0.f34683b)) {
                    return;
                }
            } else if (C10146t.m39085a(this._state, objM40835a, C9596r0.f34682a)) {
                C7347n.Companion companion = C7347n.INSTANCE;
                ((C7905p) objM40835a).resumeWith(C7347n.m30460b(Unit.f29331a));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m37868h() {
        Object andSet = this._state.getAndSet(C9596r0.f34682a);
        Intrinsics.checkNotNull(andSet);
        return andSet == C9596r0.f34683b;
    }
}
