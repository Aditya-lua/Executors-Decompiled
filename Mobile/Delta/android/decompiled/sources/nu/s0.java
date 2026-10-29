package nu;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lnu/s0;", "Lou/d;", "Lnu/q0;", "<init>", "()V", "flow", "", "d", "(Lnu/q0;)Z", "", "Lnt/b;", "", "f", "(Lnu/q0;)[Lnt/b;", "g", "h", "()Z", "e", "(Lnt/b;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s0 extends p001ou.d<q0<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicReference<Object> _state = new AtomicReference<>(null);

    @Override // p001ou.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NotNull q0<?> flow) {
        if (qu.d.a(this._state) != null) {
            return false;
        }
        qu.d.b(this._state, r0.f26796a);
        return true;
    }

    @Nullable
    public final Object e(@NotNull nt.b<? super Unit> bVar) {
        ku.p pVar = new ku.p(ot.b.c(bVar), 1);
        pVar.H();
        if (!p1.t.a(this._state, r0.f26796a, pVar)) {
            jt.n.Companion companion = jt.n.INSTANCE;
            pVar.resumeWith(jt.n.b(Unit.f22483a));
        }
        Object objA = pVar.A();
        if (objA == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objA == ot.c.e() ? objA : Unit.f22483a;
    }

    @Override // p001ou.d
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public nt.b<Unit>[] b(@NotNull q0<?> flow) {
        qu.d.b(this._state, null);
        return p001ou.c.f27943a;
    }

    public final void g() {
        AtomicReference<Object> atomicReference = this._state;
        while (true) {
            Object objA = qu.d.a(atomicReference);
            if (objA == null || objA == r0.b) {
                return;
            }
            if (objA == r0.f26796a) {
                if (p1.t.a(this._state, objA, r0.b)) {
                    return;
                }
            } else if (p1.t.a(this._state, objA, r0.f26796a)) {
                jt.n.Companion companion = jt.n.INSTANCE;
                ((ku.p) objA).resumeWith(jt.n.b(Unit.f22483a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this._state.getAndSet(r0.f26796a);
        Intrinsics.checkNotNull(andSet);
        return andSet == r0.b;
    }
}
