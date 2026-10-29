package p395qu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p395qu.AbstractC10714c;
import p563y1.C12996b;

/* JADX INFO: renamed from: qu.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\fR\u0013\u0010\u0012\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001e\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0013\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004R\u0013\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001f8\u0002X\u0082\u0004¨\u0006\""}, m31665d2 = {"Lqu/c;", "N", "", "prev", "<init>", "(Lqu/c;)V", "value", "", "o", "(Lqu/c;)Z", "", "c", "()V", "m", "()Z", "n", "f", "()Lqu/c;", "next", "l", "isTail", "h", "k", "isRemoved", "g", "()Ljava/lang/Object;", "nextOrClosed", "d", "aliveSegmentLeft", "e", "aliveSegmentRight", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC10714c<N extends AbstractC10714c<N>> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38269a = AtomicReferenceFieldUpdater.newUpdater(AbstractC10714c.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38270b = AtomicReferenceFieldUpdater.newUpdater(AbstractC10714c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC10714c(@Nullable N n10) {
        this._prev$volatile = n10;
    }

    /* JADX INFO: renamed from: c */
    public final void m40822c() {
        f38270b.set(this, null);
    }

    /* JADX INFO: renamed from: d */
    public final N m40823d() {
        N n10 = (N) m40827h();
        while (n10 != null && n10.mo40815k()) {
            n10 = (N) f38270b.get(n10);
        }
        return n10;
    }

    /* JADX INFO: renamed from: e */
    public final N m40824e() {
        AbstractC10714c abstractC10714cM40825f;
        N n10 = (N) m40825f();
        Intrinsics.checkNotNull(n10);
        while (n10.mo40815k() && (abstractC10714cM40825f = n10.m40825f()) != null) {
            n10 = (N) abstractC10714cM40825f;
        }
        return n10;
    }

    /* JADX DEBUG: Class process forced to load method for inline: qu.b.a():qu.e0 */
    @Nullable
    /* JADX INFO: renamed from: f */
    public final N m40825f() {
        Object objM40826g = m40826g();
        if (objM40826g == C10712b.f38266a) {
            return null;
        }
        return (N) objM40826g;
    }

    /* JADX INFO: renamed from: g */
    public final Object m40826g() {
        return f38269a.get(this);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final N m40827h() {
        return (N) f38270b.get(this);
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo40815k();

    /* JADX INFO: renamed from: l */
    public final boolean m40828l() {
        return m40825f() == null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m40829m() {
        return C12996b.m48310a(f38269a, this, null, C10712b.f38266a);
    }

    /* JADX INFO: renamed from: n */
    public final void m40830n() {
        Object obj;
        if (m40828l()) {
            return;
        }
        while (true) {
            AbstractC10714c abstractC10714cM40823d = m40823d();
            AbstractC10714c abstractC10714cM40824e = m40824e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38270b;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC10714cM40824e);
            } while (!C12996b.m48310a(atomicReferenceFieldUpdater, abstractC10714cM40824e, obj, ((AbstractC10714c) obj) == null ? null : abstractC10714cM40823d));
            if (abstractC10714cM40823d != null) {
                f38269a.set(abstractC10714cM40823d, abstractC10714cM40824e);
            }
            if (!abstractC10714cM40824e.mo40815k() || abstractC10714cM40824e.m40828l()) {
                if (abstractC10714cM40823d == null || !abstractC10714cM40823d.mo40815k()) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m40831o(@NotNull N value) {
        return C12996b.m48310a(f38269a, this, null, value);
    }
}
