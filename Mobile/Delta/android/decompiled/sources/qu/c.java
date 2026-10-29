package qu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qu.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\fR\u0013\u0010\u0012\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001e\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0013\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004R\u0013\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001f8\u0002X\u0082\u0004¨\u0006\""}, d2 = {"Lqu/c;", "N", "", "prev", "<init>", "(Lqu/c;)V", "value", "", "o", "(Lqu/c;)Z", "", "c", "()V", "m", "()Z", "n", "f", "()Lqu/c;", "next", "l", "isTail", "h", "k", "isRemoved", "g", "()Ljava/lang/Object;", "nextOrClosed", "d", "aliveSegmentLeft", "e", "aliveSegmentRight", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c<N extends c<N>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29637a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(@Nullable N n10) {
        this._prev$volatile = n10;
    }

    public final void c() {
        b.set(this, null);
    }

    public final N d() {
        N n10 = (N) h();
        while (n10 != null && n10.k()) {
            n10 = (N) b.get(n10);
        }
        return n10;
    }

    public final N e() {
        c cVarF;
        N n10 = (N) f();
        Intrinsics.checkNotNull(n10);
        while (n10.k() && (cVarF = n10.f()) != null) {
            n10 = (N) cVarF;
        }
        return n10;
    }

    @Nullable
    public final N f() {
        Object objG = g();
        if (objG == b.f29634a) {
            return null;
        }
        return (N) objG;
    }

    public final Object g() {
        return f29637a.get(this);
    }

    @Nullable
    public final N h() {
        return (N) b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return y1.b.a(f29637a, this, null, b.f29634a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            c cVarD = d();
            c cVarE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            do {
                obj = atomicReferenceFieldUpdater.get(cVarE);
            } while (!y1.b.a(atomicReferenceFieldUpdater, cVarE, obj, ((c) obj) == null ? null : cVarD));
            if (cVarD != null) {
                f29637a.set(cVarD, cVarE);
            }
            if (!cVarE.k() || cVarE.l()) {
                if (cVarD == null || !cVarD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(@NotNull N value) {
        return y1.b.a(f29637a, this, null, value);
    }
}
