package p443t6;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7328a;
import p315nt.InterfaceC9557b;
import p560xu.AbstractC12938l;
import p560xu.C12919b0;
import p560xu.C12931h0;
import p560xu.InterfaceC12926f;
import p560xu.InterfaceC12928g;
import pt.C10340b;

/* JADX INFO: renamed from: t6.s */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006 "}, m31665d2 = {"Lt6/s;", "Lt6/r;", "Lxu/g;", Payload.SOURCE, "c", "(Lxu/g;)Lxu/g;", "Lxu/f;", "sink", "", "h", "(Lxu/g;Lxu/f;Lnt/b;)Ljava/lang/Object;", "Lxu/l;", "fileSystem", "Lxu/h0;", "path", "j", "(Lxu/g;Lxu/l;Lxu/h0;Lnt/b;)Ljava/lang/Object;", "b", "(Lxu/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxu/g;", "coil-network-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11549s implements InterfaceC11548r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12928g source;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [t6.s.a(xu.g):t6.s] */
    public /* synthetic */ C11549s(InterfaceC12928g interfaceC12928g) {
        this.source = interfaceC12928g;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 xu.g) A[MD:(xu.g):void (m)] call: t6.s.<init>(xu.g):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C11549s m43169a(InterfaceC12928g interfaceC12928g) {
        return new C11549s(interfaceC12928g);
    }

    /* JADX INFO: renamed from: b */
    public static void m43170b(InterfaceC12928g interfaceC12928g) {
        interfaceC12928g.close();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static InterfaceC12928g m43171c(@NotNull InterfaceC12928g interfaceC12928g) {
        return interfaceC12928g;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m43172d(InterfaceC12928g interfaceC12928g, Object obj) {
        return (obj instanceof C11549s) && Intrinsics.m31980c(interfaceC12928g, ((C11549s) obj).getSource());
    }

    /* JADX INFO: renamed from: e */
    public static int m43173e(InterfaceC12928g interfaceC12928g) {
        return interfaceC12928g.hashCode();
    }

    /* JADX INFO: renamed from: f */
    public static String m43174f(InterfaceC12928g interfaceC12928g) {
        return "SourceResponseBody(source=" + interfaceC12928g + ')';
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static Object m43175h(InterfaceC12928g interfaceC12928g, @NotNull InterfaceC12926f interfaceC12926f, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        interfaceC12928g.mo48003K2(interfaceC12926f);
        return Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static Object m43176j(InterfaceC12928g interfaceC12928g, @NotNull AbstractC12938l abstractC12938l, @NotNull C12931h0 c12931h0, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
        InterfaceC12926f interfaceC12926fM47960b = C12919b0.m47960b(abstractC12938l.sink(c12931h0, false));
        try {
            C10340b.m39662e(interfaceC12928g.mo48003K2(interfaceC12926fM47960b));
            if (interfaceC12926fM47960b != null) {
                try {
                    interfaceC12926fM47960b.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = null;
        } catch (Throwable th3) {
            th = th3;
            if (interfaceC12926fM47960b != null) {
                try {
                    interfaceC12926fM47960b.close();
                } catch (Throwable th4) {
                    C7328a.m30429a(th, th4);
                }
            }
        }
        if (th == null) {
            return Unit.f29331a;
        }
        throw th;
    }

    @Override // p443t6.InterfaceC11548r
    @Nullable
    /* JADX INFO: renamed from: I2 */
    public Object mo43167I2(@NotNull AbstractC12938l abstractC12938l, @NotNull C12931h0 c12931h0, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m43176j(this.source, abstractC12938l, c12931h0, interfaceC9557b);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        m43170b(this.source);
    }

    public boolean equals(Object other) {
        return m43172d(this.source, other);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final /* synthetic */ InterfaceC12928g getSource() {
        return this.source;
    }

    public int hashCode() {
        return m43173e(this.source);
    }

    public String toString() {
        return m43174f(this.source);
    }

    @Override // p443t6.InterfaceC11548r
    @Nullable
    /* JADX INFO: renamed from: x */
    public Object mo43168x(@NotNull InterfaceC12926f interfaceC12926f, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m43175h(this.source, interfaceC12926f, interfaceC9557b);
    }
}
