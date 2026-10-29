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
    public static final Range<Integer> f17544q = t3.f24861a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17545a = new Object();
    public final Size b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f17546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Range<Integer> f17547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0.p0 f17548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final me.x<Surface> f17551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y1.c.a<Surface> f17552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final me.x<Void> f17553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y1.c.a<Void> f17554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y1.c.a<Void> f17555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n0.u1 f17556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f17557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i f17558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Executor f17559p;

    public class a implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y1.c.a f17560a;
        public final /* synthetic */ me.x b;

        public a(y1.c.a aVar, me.x xVar) {
            this.f17560a = aVar;
            this.b = xVar;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            x2.g.i(this.f17560a.c(null));
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (th2 instanceof f) {
                x2.g.i(this.b.cancel(false));
            } else {
                x2.g.i(this.f17560a.c(null));
            }
        }
    }

    public class b extends n0.u1 {
        public b(Size size, int i10) {
            super(size, i10);
        }

        @Override // n0.u1
        public me.x<Surface> o() {
            return v2.this.f17551h;
        }
    }

    public class c implements r0.c<Surface> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ me.x f17563a;
        public final /* synthetic */ y1.c.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f17564c;

        public c(me.x xVar, y1.c.a aVar, String str) {
            this.f17563a = xVar;
            this.b = aVar;
            this.f17564c = str;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            r0.n.t(this.f17563a, this.b);
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                this.b.c(null);
                return;
            }
            x2.g.i(this.b.f(new f(this.f17564c + " cancelled.", th2)));
        }
    }

    public class d implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x2.a f17566a;
        public final /* synthetic */ Surface b;

        public d(x2.a aVar, Surface surface) {
            this.f17566a = aVar;
            this.b = surface;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            this.f17566a.accept(g.c(0, this.b));
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            x2.g.j(th2 instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2);
            this.f17566a.accept(g.c(1, this.b));
        }
    }

    public class e implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f17568a;

        public e(Runnable runnable) {
            this.f17568a = runnable;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            this.f17568a.run();
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
        this.f17548e = p0Var;
        this.f17549f = z10;
        x2.g.b(k0Var.e(), "SurfaceRequest's DynamicRange must always be fully specified.");
        this.f17546c = k0Var;
        this.f17550g = i10;
        this.f17547d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        me.x xVarA = y1.c.a(new y1.c.InterfaceC0650c() { // from class: g0.m2
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return v2.a(atomicReference, str, aVar);
            }
        });
        y1.c.a<Void> aVar = (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
        this.f17555l = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        me.x<Void> xVarA2 = y1.c.a(new y1.c.InterfaceC0650c() { // from class: g0.n2
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar2) {
                return v2.j(atomicReference2, str, aVar2);
            }
        });
        this.f17553j = xVarA2;
        r0.n.j(xVarA2, new a(aVar, xVarA), q0.c.b());
        y1.c.a aVar2 = (y1.c.a) x2.g.g((y1.c.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        me.x<Surface> xVarA3 = y1.c.a(new y1.c.InterfaceC0650c() { // from class: g0.o2
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar3) {
                return v2.c(atomicReference3, str, aVar3);
            }
        });
        this.f17551h = xVarA3;
        this.f17552i = (y1.c.a) x2.g.g((y1.c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f17556m = bVar;
        me.x<Void> xVarK = bVar.k();
        r0.n.j(xVarA3, new c(xVarK, aVar2, str), q0.c.b());
        xVarK.a(new Runnable() { // from class: g0.p2
            @Override // java.lang.Runnable
            public final void run() {
                this.f17498a.f17551h.cancel(true);
            }
        }, q0.c.b());
        this.f17554k = s(q0.c.b(), runnable);
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
        this.f17555l.a(runnable, executor);
    }

    public void l() {
        synchronized (this.f17545a) {
            this.f17558o = null;
            this.f17559p = null;
        }
    }

    public n0.p0 m() {
        return this.f17548e;
    }

    public n0.u1 n() {
        return this.f17556m;
    }

    public k0 o() {
        return this.f17546c;
    }

    public Range<Integer> p() {
        return this.f17547d;
    }

    public Size q() {
        return this.b;
    }

    public int r() {
        return this.f17550g;
    }

    public final y1.c.a<Void> s(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        r0.n.j(y1.c.a(new y1.c.InterfaceC0650c() { // from class: g0.r2
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return v2.g(this.f17508a, atomicReference, aVar);
            }
        }), new e(runnable), executor);
        return (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
    }

    public boolean t() {
        z();
        return this.f17554k.c(null);
    }

    public boolean u() {
        return this.f17549f;
    }

    public boolean v() {
        return this.f17551h.isDone();
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
        if (this.f17552i.c(surface) || this.f17551h.isCancelled()) {
            r0.n.j(this.f17553j, new d(aVar, surface), executor);
            return;
        }
        x2.g.i(this.f17551h.isDone());
        try {
            this.f17551h.get();
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
        synchronized (this.f17545a) {
            this.f17558o = iVar;
            this.f17559p = executor;
            hVar = this.f17557n;
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
        synchronized (this.f17545a) {
            this.f17557n = hVar;
            iVar = this.f17558o;
            executor = this.f17559p;
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
        return this.f17552i.f(new n0.u1.b("Surface request will not complete."));
    }
}
