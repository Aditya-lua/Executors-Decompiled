package qu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0004H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001f\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u001e\u001a\u00060\u0000j\u0002`\u0004H\u0082\u0010¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u000e2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0004H\u0082\u0010¢\u0006\u0004\b#\u0010\u0017R\u0014\u0010%\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0015\u0010)\u001a\u00060\u0000j\u0002`\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010\u0017R\u0015\u0010+\u001a\u00060\u0000j\u0002`\u00048F¢\u0006\u0006\u001a\u0004\b*\u0010\u0017R\u0011\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010,8\u0002X\u0082\u0004R\u0011\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000,8\u0002X\u0082\u0004R\u0013\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0,8\u0002X\u0082\u0004¨\u00060"}, d2 = {"Lqu/p;", "", "<init>", "()V", "Lkotlinx/coroutines/internal/Node;", "node", "", "g", "(Lqu/p;)Z", "", "permissionsBitmask", "e", "(Lqu/p;I)Z", "forbiddenElementsBit", "", "h", "(I)V", "next", "f", "(Lqu/p;Lqu/p;)Z", "s", "()Z", "t", "()Lqu/p;", "", "toString", "()Ljava/lang/String;", "Lqu/y;", "u", "()Lqu/y;", "current", "j", "(Lqu/p;)Lqu/p;", "k", "(Lqu/p;)V", "i", "r", "isRemoved", "l", "()Ljava/lang/Object;", "m", "nextNode", "n", "prevNode", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "_removedRef", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29666a = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29667c = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(@NotNull p node, int permissionsBitmask) {
        p pVarN;
        do {
            pVarN = n();
            if (pVarN instanceof n) {
                return (((n) pVarN).forbiddenElementsBitmask & permissionsBitmask) == 0 && pVarN.e(node, permissionsBitmask);
            }
        } while (!pVarN.f(node, this));
        return true;
    }

    public final boolean f(@NotNull p node, @NotNull p next) {
        b.set(node, this);
        f29666a.set(node, next);
        if (!y1.b.a(f29666a, this, next, node)) {
            return false;
        }
        node.k(next);
        return true;
    }

    public final boolean g(@NotNull p node) {
        b.set(node, this);
        f29666a.set(node, this);
        while (l() == this) {
            if (y1.b.a(f29666a, this, this, node)) {
                node.k(this);
                return true;
            }
        }
        return false;
    }

    public final void h(int forbiddenElementsBit) {
        e(new n(forbiddenElementsBit), forbiddenElementsBit);
    }

    public final p i() {
        p pVar;
        Object obj;
        while (true) {
            p pVar2 = (p) b.get(this);
            pVar = pVar2;
            while (true) {
                p pVar3 = null;
                while (true) {
                    obj = f29666a.get(pVar);
                    if (obj == this) {
                        if (pVar2 != pVar && !y1.b.a(b, this, pVar2, pVar)) {
                            break;
                        }
                        break;
                    }
                    if (r()) {
                        return null;
                    }
                    if (!(obj instanceof y)) {
                        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        pVar3 = pVar;
                        pVar = (p) obj;
                    } else {
                        if (pVar3 != null) {
                            break;
                        }
                        pVar = (p) b.get(pVar);
                    }
                }
                if (!y1.b.a(f29666a, pVar3, pVar, ((y) obj).ref)) {
                    break;
                }
                pVar = pVar3;
            }
        }
        return pVar;
    }

    public final p j(p current) {
        while (current.r()) {
            current = (p) b.get(current);
        }
        return current;
    }

    public final void k(p next) {
        p pVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        do {
            pVar = (p) atomicReferenceFieldUpdater.get(next);
            if (l() != next) {
                return;
            }
        } while (!y1.b.a(b, next, pVar, this));
        if (r()) {
            next.i();
        }
    }

    @NotNull
    public final Object l() {
        return f29666a.get(this);
    }

    @NotNull
    public final p m() {
        p pVar;
        Object objL = l();
        y yVar = objL instanceof y ? (y) objL : null;
        if (yVar != null && (pVar = yVar.ref) != null) {
            return pVar;
        }
        Intrinsics.d(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (p) objL;
    }

    @NotNull
    public final p n() {
        p pVarI = i();
        return pVarI == null ? j((p) b.get(this)) : pVarI;
    }

    public boolean r() {
        return l() instanceof y;
    }

    public boolean s() {
        return t() == null;
    }

    @Nullable
    public final p t() {
        Object objL;
        p pVar;
        do {
            objL = l();
            if (objL instanceof y) {
                return ((y) objL).ref;
            }
            if (objL == this) {
                return (p) objL;
            }
            Intrinsics.d(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            pVar = (p) objL;
        } while (!y1.b.a(f29666a, this, objL, pVar.u()));
        pVar.i();
        return null;
    }

    @NotNull
    public String toString() {
        return new kotlin.jvm.internal.s(this) { // from class: qu.p.a
            @Override // hu.i
            public Object get() {
                return t0.a(this.receiver);
            }
        } + '@' + t0.b(this);
    }

    public final y u() {
        y yVar = (y) f29667c.get(this);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this);
        f29667c.set(this, yVar2);
        return yVar2;
    }
}
