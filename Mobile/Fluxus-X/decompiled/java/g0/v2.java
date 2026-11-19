package g0;

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
import n0.t3;

/* JADX INFO: loaded from: classes.dex */
public final class v2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Range<Integer> f16941q = t3.f25159a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16942a = new Object();
    public final Size b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f16943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Range<Integer> f16944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0.p0 f16945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pe.x<Surface> f16948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y1.c.a<Surface> f16949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pe.x<Void> f16950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y1.c.a<Void> f16951k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y1.c.a<Void> f16952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n0.u1 f16953m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f16954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i f16955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Executor f16956p;

    public class a implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y1.c.a f16957a;
        public final /* synthetic */ pe.x b;

        public a(y1.c.a aVar, pe.x xVar) {
            this.f16957a = aVar;
            this.b = xVar;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r10) {
            x2.g.i(this.f16957a.c(null));
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (th2 instanceof f) {
                x2.g.i(this.b.cancel(false));
            } else {
                x2.g.i(this.f16957a.c(null));
            }
        }
    }

    public class b extends n0.u1 {
        public b(Size size, int i10) {
            super(size, i10);
        }

        @Override // n0.u1
        public pe.x<Surface> o() {
            return v2.this.f16948h;
        }
    }

    public class c implements r0.c<Surface> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pe.x f16960a;
        public final /* synthetic */ y1.c.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f16961c;

        public c(pe.x xVar, y1.c.a aVar, String str) {
            this.f16960a = xVar;
            this.b = aVar;
            this.f16961c = str;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            r0.n.t(this.f16960a, this.b);
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                this.b.c(null);
                return;
            }
            x2.g.i(this.b.f(new f(this.f16961c + " cancelled.", th2)));
        }
    }

    public class d implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x2.a f16963a;
        public final /* synthetic */ Surface b;

        public d(x2.a aVar, Surface surface) {
            this.f16963a = aVar;
            this.b = surface;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r10) {
            this.f16963a.accept(g.c(0, this.b));
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            x2.g.j(th2 instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2);
            this.f16963a.accept(g.c(1, this.b));
        }
    }

    public class e implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f16965a;

        public e(Runnable runnable) {
            this.f16965a = runnable;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r10) {
            this.f16965a.run();
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
        }
    }

    public static final class f extends RuntimeException {
        public f(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public static abstract class g {
        public static g c(int i10, Surface surface) {
            return new j(i10, surface);
        }

        public abstract int a();

        public abstract Surface b();
    }

    public static abstract class h {
        public static h g(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
            return new k(rect, i10, i11, z10, matrix, z11);
        }

        public abstract Rect a();

        public abstract int b();

        public abstract Matrix c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();
    }

    public interface i {
        void a(h hVar);
    }

    public v2(Size size, n0.p0 p0Var, boolean z10, k0 k0Var, int i10, Range<Integer> range, Runnable runnable) {
        this.b = size;
        this.f16945e = p0Var;
        this.f16946f = z10;
        x2.g.b(k0Var.e(), "SurfaceRequest's DynamicRange must always be fully specified.");
        this.f16943c = k0Var;
        this.f16947g = i10;
        this.f16944d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        pe.x xVarA = y1.c.a(new y1.c.InterfaceC0761c() { // from class: g0.m2
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return v2.a(atomicReference, str, aVar);
            }
        });
        y1.c.a<Void> aVar = (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
        this.f16952l = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        pe.x<Void> xVarA2 = y1.c.a(new y1.c.InterfaceC0761c() { // from class: g0.n2
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar2) {
                return v2.j(atomicReference2, str, aVar2);
            }
        });
        this.f16950j = xVarA2;
        r0.n.j(xVarA2, new a(aVar, xVarA), q0.c.b());
        y1.c.a aVar2 = (y1.c.a) x2.g.g((y1.c.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        pe.x<Surface> xVarA3 = y1.c.a(new y1.c.InterfaceC0761c() { // from class: g0.o2
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar3) {
                return v2.c(atomicReference3, str, aVar3);
            }
        });
        this.f16948h = xVarA3;
        this.f16949i = (y1.c.a) x2.g.g((y1.c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f16953m = bVar;
        pe.x<Void> xVarK = bVar.k();
        r0.n.j(xVarA3, new c(xVarK, aVar2, str), q0.c.b());
        xVarK.a(new Runnable() { // from class: g0.p2
            @Override // java.lang.Runnable
            public final void run() {
                this.f16895a.f16948h.cancel(true);
            }
        }, q0.c.b());
        this.f16951k = s(q0.c.b(), runnable);
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, String str, y1.c.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    public static /* synthetic */ Object c(AtomicReference atomicReference, String str, y1.c.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    public static /* synthetic */ Object g(v2 v2Var, AtomicReference atomicReference, y1.c.a aVar) {
        v2Var.getClass();
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + v2Var.hashCode() + ")";
    }

    public static /* synthetic */ Object j(AtomicReference atomicReference, String str, y1.c.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    @SuppressLint({"PairedRegistration"})
    public void k(Executor executor, Runnable runnable) {
        this.f16952l.a(runnable, executor);
    }

    public void l() {
        synchronized (this.f16942a) {
            this.f16955o = null;
            this.f16956p = null;
        }
    }

    public n0.p0 m() {
        return this.f16945e;
    }

    public n0.u1 n() {
        return this.f16953m;
    }

    public k0 o() {
        return this.f16943c;
    }

    public Range<Integer> p() {
        return this.f16944d;
    }

    public Size q() {
        return this.b;
    }

    public int r() {
        return this.f16947g;
    }

    public final y1.c.a<Void> s(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        r0.n.j(y1.c.a(new y1.c.InterfaceC0761c() { // from class: g0.r2
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return v2.g(this.f16905a, atomicReference, aVar);
            }
        }), new e(runnable), executor);
        return (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
    }

    public boolean t() {
        z();
        return this.f16951k.c(null);
    }

    public boolean u() {
        return this.f16946f;
    }

    public boolean v() {
        return this.f16948h.isDone();
    }

    public void w(final Surface surface, Executor executor, final x2.a<g> aVar) {
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: g0.s2
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.accept(v2.g.c(2, surface));
                }
            });
            return;
        }
        if (this.f16949i.c(surface) || this.f16948h.isCancelled()) {
            r0.n.j(this.f16950j, new d(aVar, surface), executor);
            return;
        }
        x2.g.i(this.f16948h.isDone());
        try {
            this.f16948h.get();
            executor.execute(new Runnable() { // from class: g0.t2
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.accept(v2.g.c(3, surface));
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: g0.u2
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.accept(v2.g.c(4, surface));
                }
            });
        }
    }

    public void x(Executor executor, final i iVar) {
        final h hVar;
        synchronized (this.f16942a) {
            this.f16955o = iVar;
            this.f16956p = executor;
            hVar = this.f16954n;
        }
        if (hVar != null) {
            executor.execute(new Runnable() { // from class: g0.q2
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.a(hVar);
                }
            });
        }
    }

    public void y(final h hVar) {
        final i iVar;
        Executor executor;
        synchronized (this.f16942a) {
            this.f16954n = hVar;
            iVar = this.f16955o;
            executor = this.f16956p;
        }
        if (iVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: g0.l2
            @Override // java.lang.Runnable
            public final void run() {
                iVar.a(hVar);
            }
        });
    }

    public boolean z() {
        return this.f16949i.f(new n0.u1.b("Surface request will not complete."));
    }
}
