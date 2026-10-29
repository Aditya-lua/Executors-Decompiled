package p140g0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import ne.InterfaceFutureC9440x;
import p296n0.AbstractC8827t3;
import p296n0.AbstractC8830u1;
import p296n0.InterfaceC8804p0;
import p366q0.C10417c;
import p397r0.C10773n;
import p397r0.InterfaceC10762c;
import p533x2.C12637g;
import p533x2.InterfaceC12631a;
import p563y1.C12997c;

/* JADX INFO: renamed from: g0.v2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5948v2 {

    /* JADX INFO: renamed from: q */
    public static final Range<Integer> f22651q = AbstractC8827t3.f32104a;

    /* JADX INFO: renamed from: a */
    public final Object f22652a = new Object();

    /* JADX INFO: renamed from: b */
    public final Size f22653b;

    /* JADX INFO: renamed from: c */
    public final C5902k0 f22654c;

    /* JADX INFO: renamed from: d */
    public final Range<Integer> f22655d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC8804p0 f22656e;

    /* JADX INFO: renamed from: f */
    public final boolean f22657f;

    /* JADX INFO: renamed from: g */
    public final int f22658g;

    /* JADX INFO: renamed from: h */
    public final InterfaceFutureC9440x<Surface> f22659h;

    /* JADX INFO: renamed from: i */
    public final C12997c.a<Surface> f22660i;

    /* JADX INFO: renamed from: j */
    public final InterfaceFutureC9440x<Void> f22661j;

    /* JADX INFO: renamed from: k */
    public final C12997c.a<Void> f22662k;

    /* JADX INFO: renamed from: l */
    public final C12997c.a<Void> f22663l;

    /* JADX INFO: renamed from: m */
    public final AbstractC8830u1 f22664m;

    /* JADX INFO: renamed from: n */
    public h f22665n;

    /* JADX INFO: renamed from: o */
    public i f22666o;

    /* JADX INFO: renamed from: p */
    public Executor f22667p;

    /* JADX INFO: renamed from: g0.v2$a */
    public class a implements InterfaceC10762c<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C12997c.a f22668a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceFutureC9440x f22669b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(C12997c.a aVar, InterfaceFutureC9440x interfaceFutureC9440x) {
            this.f22668a = aVar;
            this.f22669b = interfaceFutureC9440x;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            C12637g.m47077i(this.f22668a.m48314c(null));
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            if (th2 instanceof f) {
                C12637g.m47077i(this.f22669b.cancel(false));
            } else {
                C12637g.m47077i(this.f22668a.m48314c(null));
            }
        }
    }

    /* JADX INFO: renamed from: g0.v2$b */
    public class b extends AbstractC8830u1 {
        public b(Size size, int i10) {
            super(size, i10);
        }

        @Override // p296n0.AbstractC8830u1
        /* JADX INFO: renamed from: o */
        public InterfaceFutureC9440x<Surface> mo26666o() {
            return C5948v2.this.f22659h;
        }
    }

    /* JADX INFO: renamed from: g0.v2$c */
    public class c implements InterfaceC10762c<Surface> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceFutureC9440x f22672a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C12997c.a f22673b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f22674c;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(InterfaceFutureC9440x interfaceFutureC9440x, C12997c.a aVar, String str) {
            this.f22672a = interfaceFutureC9440x;
            this.f22673b = aVar;
            this.f22674c = str;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            C10773n.m40997t(this.f22672a, this.f22673b);
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                this.f22673b.m48314c(null);
                return;
            }
            C12637g.m47077i(this.f22673b.m48317f(new f(this.f22674c + " cancelled.", th2)));
        }
    }

    /* JADX INFO: renamed from: g0.v2$d */
    public class d implements InterfaceC10762c<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC12631a f22676a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Surface f22677b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public d(InterfaceC12631a interfaceC12631a, Surface surface) {
            this.f22676a = interfaceC12631a;
            this.f22677b = surface;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            this.f22676a.accept(g.m26670c(0, this.f22677b));
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            C12637g.m47078j(th2 instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2);
            this.f22676a.accept(g.m26670c(1, this.f22677b));
        }
    }

    /* JADX INFO: renamed from: g0.v2$e */
    public class e implements InterfaceC10762c<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f22679a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public e(Runnable runnable) {
            this.f22679a = runnable;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            this.f22679a.run();
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
        }
    }

    /* JADX INFO: renamed from: g0.v2$f */
    public static final class f extends RuntimeException {
        public f(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* JADX INFO: renamed from: g0.v2$g */
    public static abstract class g {
        /* JADX INFO: renamed from: c */
        public static g m26670c(int i10, Surface surface) {
            return new C5897j(i10, surface);
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo26499a();

        /* JADX INFO: renamed from: b */
        public abstract Surface mo26500b();
    }

    /* JADX INFO: renamed from: g0.v2$h */
    public static abstract class h {
        /* JADX INFO: renamed from: g */
        public static h m26671g(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
            return new C5901k(rect, i10, i11, z10, matrix, z11);
        }

        /* JADX INFO: renamed from: a */
        public abstract Rect mo26509a();

        /* JADX INFO: renamed from: b */
        public abstract int mo26510b();

        /* JADX INFO: renamed from: c */
        public abstract Matrix mo26511c();

        /* JADX INFO: renamed from: d */
        public abstract int mo26512d();

        /* JADX INFO: renamed from: e */
        public abstract boolean mo26513e();

        /* JADX INFO: renamed from: f */
        public abstract boolean mo26514f();
    }

    /* JADX INFO: renamed from: g0.v2$i */
    public interface i {
        /* JADX INFO: renamed from: a */
        void mo24343a(h hVar);
    }

    public C5948v2(Size size, InterfaceC8804p0 interfaceC8804p0, boolean z10, C5902k0 c5902k0, int i10, Range<Integer> range, Runnable runnable) {
        this.f22653b = size;
        this.f22656e = interfaceC8804p0;
        this.f22657f = z10;
        C12637g.m47070b(c5902k0.m26519e(), "SurfaceRequest's DynamicRange must always be fully specified.");
        this.f22654c = c5902k0;
        this.f22658g = i10;
        this.f22655d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        InterfaceFutureC9440x interfaceFutureC9440xM48311a = C12997c.m48311a(new C12997c.c() { // from class: g0.m2
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C5948v2.m26639a(atomicReference, str, aVar);
            }
        });
        C12997c.a<Void> aVar = (C12997c.a) C12637g.m47075g((C12997c.a) atomicReference.get());
        this.f22663l = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        InterfaceFutureC9440x<Void> interfaceFutureC9440xM48311a2 = C12997c.m48311a(new C12997c.c() { // from class: g0.n2
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar2) {
                return C5948v2.m26648j(atomicReference2, str, aVar2);
            }
        });
        this.f22661j = interfaceFutureC9440xM48311a2;
        C10773n.m40987j(interfaceFutureC9440xM48311a2, new a(aVar, interfaceFutureC9440xM48311a), C10417c.m40081b());
        C12997c.a aVar2 = (C12997c.a) C12637g.m47075g((C12997c.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        InterfaceFutureC9440x<Surface> interfaceFutureC9440xM48311a3 = C12997c.m48311a(new C12997c.c() { // from class: g0.o2
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar3) {
                return C5948v2.m26641c(atomicReference3, str, aVar3);
            }
        });
        this.f22659h = interfaceFutureC9440xM48311a3;
        this.f22660i = (C12997c.a) C12637g.m47075g((C12997c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f22664m = bVar;
        InterfaceFutureC9440x<Void> interfaceFutureC9440xM35437k = bVar.m35437k();
        C10773n.m40987j(interfaceFutureC9440xM48311a3, new c(interfaceFutureC9440xM35437k, aVar2, str), C10417c.m40081b());
        interfaceFutureC9440xM35437k.mo37173a(new Runnable() { // from class: g0.p2
            @Override // java.lang.Runnable
            public final void run() {
                this.f22587a.f22659h.cancel(true);
            }
        }, C10417c.m40081b());
        this.f22662k = m26657s(C10417c.m40081b(), runnable);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m26639a(AtomicReference atomicReference, String str, C12997c.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m26641c(AtomicReference atomicReference, String str, C12997c.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m26645g(C5948v2 c5948v2, AtomicReference atomicReference, C12997c.a aVar) {
        c5948v2.getClass();
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + c5948v2.hashCode() + ")";
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Object m26648j(AtomicReference atomicReference, String str, C12997c.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    @SuppressLint({"PairedRegistration"})
    /* JADX INFO: renamed from: k */
    public void m26649k(Executor executor, Runnable runnable) {
        this.f22663l.m48312a(runnable, executor);
    }

    /* JADX INFO: renamed from: l */
    public void m26650l() {
        synchronized (this.f22652a) {
            this.f22666o = null;
            this.f22667p = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC8804p0 m26651m() {
        return this.f22656e;
    }

    /* JADX INFO: renamed from: n */
    public AbstractC8830u1 m26652n() {
        return this.f22664m;
    }

    /* JADX INFO: renamed from: o */
    public C5902k0 m26653o() {
        return this.f22654c;
    }

    /* JADX INFO: renamed from: p */
    public Range<Integer> m26654p() {
        return this.f22655d;
    }

    /* JADX INFO: renamed from: q */
    public Size m26655q() {
        return this.f22653b;
    }

    /* JADX INFO: renamed from: r */
    public int m26656r() {
        return this.f22658g;
    }

    /* JADX INFO: renamed from: s */
    public final C12997c.a<Void> m26657s(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        C10773n.m40987j(C12997c.m48311a(new C12997c.c() { // from class: g0.r2
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C5948v2.m26645g(this.f22601a, atomicReference, aVar);
            }
        }), new e(runnable), executor);
        return (C12997c.a) C12637g.m47075g((C12997c.a) atomicReference.get());
    }

    /* JADX INFO: renamed from: t */
    public boolean m26658t() {
        m26664z();
        return this.f22662k.m48314c(null);
    }

    /* JADX INFO: renamed from: u */
    public boolean m26659u() {
        return this.f22657f;
    }

    /* JADX INFO: renamed from: v */
    public boolean m26660v() {
        return this.f22659h.isDone();
    }

    /* JADX INFO: renamed from: w */
    public void m26661w(final Surface surface, Executor executor, final InterfaceC12631a<g> interfaceC12631a) {
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: g0.s2
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC12631a.accept(C5948v2.g.m26670c(2, surface));
                }
            });
            return;
        }
        if (this.f22660i.m48314c(surface) || this.f22659h.isCancelled()) {
            C10773n.m40987j(this.f22661j, new d(interfaceC12631a, surface), executor);
            return;
        }
        C12637g.m47077i(this.f22659h.isDone());
        try {
            this.f22659h.get();
            executor.execute(new Runnable() { // from class: g0.t2
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC12631a.accept(C5948v2.g.m26670c(3, surface));
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: g0.u2
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC12631a.accept(C5948v2.g.m26670c(4, surface));
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public void m26662x(Executor executor, final i iVar) {
        final h hVar;
        synchronized (this.f22652a) {
            this.f22666o = iVar;
            this.f22667p = executor;
            hVar = this.f22665n;
        }
        if (hVar != null) {
            executor.execute(new Runnable() { // from class: g0.q2
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.mo24343a(hVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public void m26663y(final h hVar) {
        final i iVar;
        Executor executor;
        synchronized (this.f22652a) {
            this.f22665n = hVar;
            iVar = this.f22666o;
            executor = this.f22667p;
        }
        if (iVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: g0.l2
            @Override // java.lang.Runnable
            public final void run() {
                iVar.mo24343a(hVar);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public boolean m26664z() {
        return this.f22660i.m48317f(new AbstractC8830u1.b("Surface request will not complete."));
    }
}
