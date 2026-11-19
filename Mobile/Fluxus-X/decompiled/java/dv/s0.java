package dv;

import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ldv/s0;", "Lev/d;", "Ldv/q0;", "<init>", "()V", "flow", BuildConfig.FLAVOR, "d", "(Ldv/q0;)Z", BuildConfig.FLAVOR, "Leu/b;", BuildConfig.FLAVOR, "f", "(Ldv/q0;)[Leu/b;", "g", "h", "()Z", "e", "(Leu/b;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s0 extends kotlin.d<q0<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicReference<Object> _state = new AtomicReference<>(null);

    @Override // kotlin.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NotNull q0<?> flow) {
        if (gv.d.a(this._state) != null) {
            return false;
        }
        gv.d.b(this._state, r0.f12842a);
        return true;
    }

    @Nullable
    public final Object e(@NotNull eu.b<? super Unit> bVar) {
        av.p pVar = new av.p(fu.b.c(bVar), 1);
        pVar.G();
        if (!p1.t.a(this._state, r0.f12842a, pVar)) {
            zt.n.Companion companion = zt.n.INSTANCE;
            pVar.resumeWith(zt.n.b(Unit.f21506a));
        }
        Object objY = pVar.y();
        if (objY == fu.c.e()) {
            gu.h.c(bVar);
        }
        return objY == fu.c.e() ? objY : Unit.f21506a;
    }

    @Override // kotlin.d
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public eu.b<Unit>[] b(@NotNull q0<?> flow) {
        gv.d.b(this._state, null);
        return kotlin.c.f14687a;
    }

    public final void g() {
        AtomicReference<Object> atomicReference = this._state;
        while (true) {
            Object objA = gv.d.a(atomicReference);
            if (objA == null || objA == r0.b) {
                return;
            }
            if (objA == r0.f12842a) {
                if (p1.t.a(this._state, objA, r0.b)) {
                    return;
                }
            } else if (p1.t.a(this._state, objA, r0.f12842a)) {
                zt.n.Companion companion = zt.n.INSTANCE;
                ((av.p) objA).resumeWith(zt.n.b(Unit.f21506a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this._state.getAndSet(r0.f12842a);
        Intrinsics.checkNotNull(andSet);
        return andSet == r0.b;
    }
}
