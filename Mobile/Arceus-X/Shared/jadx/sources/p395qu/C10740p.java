package p395qu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C7752s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.C7922t0;
import p563y1.C12996b;

/* JADX INFO: renamed from: qu.p */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0004H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001f\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u001e\u001a\u00060\u0000j\u0002`\u0004H\u0082\u0010¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u000e2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0004H\u0082\u0010¢\u0006\u0004\b#\u0010\u0017R\u0014\u0010%\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0015\u0010)\u001a\u00060\u0000j\u0002`\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010\u0017R\u0015\u0010+\u001a\u00060\u0000j\u0002`\u00048F¢\u0006\u0006\u001a\u0004\b*\u0010\u0017R\u0011\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010,8\u0002X\u0082\u0004R\u0011\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000,8\u0002X\u0082\u0004R\u0013\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0,8\u0002X\u0082\u0004¨\u00060"}, m31665d2 = {"Lqu/p;", "", "<init>", "()V", "Lkotlinx/coroutines/internal/Node;", "node", "", "g", "(Lqu/p;)Z", "", "permissionsBitmask", "e", "(Lqu/p;I)Z", "forbiddenElementsBit", "", "h", "(I)V", "next", "f", "(Lqu/p;Lqu/p;)Z", "s", "()Z", "t", "()Lqu/p;", "", "toString", "()Ljava/lang/String;", "Lqu/y;", "u", "()Lqu/y;", "current", "j", "(Lqu/p;)Lqu/p;", "k", "(Lqu/p;)V", "i", "r", "isRemoved", "l", "()Ljava/lang/Object;", "m", "nextNode", "n", "prevNode", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "_removedRef", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C10740p {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38304a = AtomicReferenceFieldUpdater.newUpdater(C10740p.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38305b = AtomicReferenceFieldUpdater.newUpdater(C10740p.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38306c = AtomicReferenceFieldUpdater.newUpdater(C10740p.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: e */
    public final boolean m40897e(@NotNull C10740p node, int permissionsBitmask) {
        C10740p c10740pM40906n;
        do {
            c10740pM40906n = m40906n();
            if (c10740pM40906n instanceof C10736n) {
                return (((C10736n) c10740pM40906n).forbiddenElementsBitmask & permissionsBitmask) == 0 && c10740pM40906n.m40897e(node, permissionsBitmask);
            }
        } while (!c10740pM40906n.m40898f(node, this));
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m40898f(@NotNull C10740p node, @NotNull C10740p next) {
        f38305b.set(node, this);
        f38304a.set(node, next);
        if (!C12996b.m48310a(f38304a, this, next, node)) {
            return false;
        }
        node.m40903k(next);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m40899g(@NotNull C10740p node) {
        f38305b.set(node, this);
        f38304a.set(node, this);
        while (m40904l() == this) {
            if (C12996b.m48310a(f38304a, this, this, node)) {
                node.m40903k(this);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m40900h(int forbiddenElementsBit) {
        m40897e(new C10736n(forbiddenElementsBit), forbiddenElementsBit);
    }

    /* JADX INFO: renamed from: i */
    public final C10740p m40901i() {
        C10740p c10740p;
        Object obj;
        while (true) {
            C10740p c10740p2 = (C10740p) f38305b.get(this);
            c10740p = c10740p2;
            while (true) {
                C10740p c10740p3 = null;
                while (true) {
                    obj = f38304a.get(c10740p);
                    if (obj == this) {
                        if (c10740p2 != c10740p && !C12996b.m48310a(f38305b, this, c10740p2, c10740p)) {
                            break;
                        }
                        break;
                    }
                    if (mo40892r()) {
                        return null;
                    }
                    if (!(obj instanceof C10753y)) {
                        Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        c10740p3 = c10740p;
                        c10740p = (C10740p) obj;
                    } else {
                        if (c10740p3 != null) {
                            break;
                        }
                        c10740p = (C10740p) f38305b.get(c10740p);
                    }
                }
                if (!C12996b.m48310a(f38304a, c10740p3, c10740p, ((C10753y) obj).ref)) {
                    break;
                }
                c10740p = c10740p3;
            }
        }
        return c10740p;
    }

    /* JADX INFO: renamed from: j */
    public final C10740p m40902j(C10740p current) {
        while (current.mo40892r()) {
            current = (C10740p) f38305b.get(current);
        }
        return current;
    }

    /* JADX INFO: renamed from: k */
    public final void m40903k(C10740p next) {
        C10740p c10740p;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38305b;
        do {
            c10740p = (C10740p) atomicReferenceFieldUpdater.get(next);
            if (m40904l() != next) {
                return;
            }
        } while (!C12996b.m48310a(f38305b, next, c10740p, this));
        if (mo40892r()) {
            next.m40901i();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final Object m40904l() {
        return f38304a.get(this);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final C10740p m40905m() {
        C10740p c10740p;
        Object objM40904l = m40904l();
        C10753y c10753y = objM40904l instanceof C10753y ? (C10753y) objM40904l : null;
        if (c10753y != null && (c10740p = c10753y.ref) != null) {
            return c10740p;
        }
        Intrinsics.m31981d(objM40904l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C10740p) objM40904l;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final C10740p m40906n() {
        C10740p c10740pM40901i = m40901i();
        return c10740pM40901i == null ? m40902j((C10740p) f38305b.get(this)) : c10740pM40901i;
    }

    /* JADX INFO: renamed from: r */
    public boolean mo40892r() {
        return m40904l() instanceof C10753y;
    }

    /* JADX INFO: renamed from: s */
    public boolean m40907s() {
        return m40908t() == null;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final C10740p m40908t() {
        Object objM40904l;
        C10740p c10740p;
        do {
            objM40904l = m40904l();
            if (objM40904l instanceof C10753y) {
                return ((C10753y) objM40904l).ref;
            }
            if (objM40904l == this) {
                return (C10740p) objM40904l;
            }
            Intrinsics.m31981d(objM40904l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            c10740p = (C10740p) objM40904l;
        } while (!C12996b.m48310a(f38304a, this, objM40904l, c10740p.m40909u()));
        c10740p.m40901i();
        return null;
    }

    @NotNull
    public String toString() {
        return new C7752s(this) { // from class: qu.p.a
            @Override // hu.InterfaceC6573i
            public Object get() {
                return C7922t0.m32908a(this.receiver);
            }
        } + '@' + C7922t0.m32909b(this);
    }

    /* JADX INFO: renamed from: u */
    public final C10753y m40909u() {
        C10753y c10753y = (C10753y) f38306c.get(this);
        if (c10753y != null) {
            return c10753y;
        }
        C10753y c10753y2 = new C10753y(this);
        f38306c.set(this, c10753y2);
        return c10753y2;
    }
}
