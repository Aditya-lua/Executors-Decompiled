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
    public static final Range<Integer> f18083q = t3.f25682a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18084a = new Object();
    public final Size b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f18085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Range<Integer> f18086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0.p0 f18087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ne.x<Surface> f18090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y1.c.a<Surface> f18091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ne.x<Void> f18092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y1.c.a<Void> f18093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y1.c.a<Void> f18094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n0.u1 f18095m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f18096n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i f18097o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Executor f18098p;

    public class a implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y1.c.a f18099a;
        public final /* synthetic */ ne.x b;

        public a(y1.c.a aVar, ne.x xVar) {
            this.f18099a = aVar;
            this.b = xVar;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            x2.g.i(this.f18099a.c(null));
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (th2 instanceof f) {
                x2.g.i(this.b.cancel(false));
            } else {
                x2.g.i(this.f18099a.c(null));
            }
        }
    }

    public class b extends n0.u1 {
        public b(Size size, int i10) {
            super(size, i10);
        }

        @Override // n0.u1
        public ne.x<Surface> o() {
            return v2.this.f18090h;
        }
    }

    public class c implements r0.c<Surface> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ne.x f18102a;
        public final /* synthetic */ y1.c.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f18103c;

        public c(ne.x xVar, y1.c.a aVar, String str) {
            this.f18102a = xVar;
            this.b = aVar;
            this.f18103c = str;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            r0.n.t(this.f18102a, this.b);
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                this.b.c(null);
                return;
            }
            x2.g.i(this.b.f(new f(this.f18103c + " cancelled.", th2)));
        }
    }

    public class d implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x2.a f18105a;
        public final /* synthetic */ Surface b;

        public d(x2.a aVar, Surface surface) {
            this.f18105a = aVar;
            this.b = surface;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            this.f18105a.accept(g.c(0, this.b));
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            x2.g.j(th2 instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2);
            this.f18105a.accept(g.c(1, this.b));
        }
    }

    public class e implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f18107a;

        public e(Runnable runnable) {
            this.f18107a = runnable;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            this.f18107a.run();
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
        this.f18087e = p0Var;
        this.f18088f = z10;
        x2.g.b(k0Var.e(), "SurfaceRequest's DynamicRange must always be fully specified.");
        this.f18085c = k0Var;
        this.f18089g = i10;
        this.f18086d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        ne.x xVarA = y1.c.a(new y1.c.InterfaceC0665c() { // from class: g0.m2
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return v2.a(atomicReference, str, aVar);
            }
        });
        y1.c.a<Void> aVar = (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
        this.f18094l = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        ne.x<Void> xVarA2 = y1.c.a(new y1.c.InterfaceC0665c() { // from class: g0.n2
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar2) {
                return v2.j(atomicReference2, str, aVar2);
            }
        });
        this.f18092j = xVarA2;
        r0.n.j(xVarA2, new a(aVar, xVarA), q0.c.b());
        y1.c.a aVar2 = (y1.c.a) x2.g.g((y1.c.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        ne.x<Surface> xVarA3 = y1.c.a(new y1.c.InterfaceC0665c() { // from class: g0.o2
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar3) {
                return v2.c(atomicReference3, str, aVar3);
            }
        });
        this.f18090h = xVarA3;
        this.f18091i = (y1.c.a) x2.g.g((y1.c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f18095m = bVar;
        ne.x<Void> xVarK = bVar.k();
        r0.n.j(xVarA3, new c(xVarK, aVar2, str), q0.c.b());
        xVarK.a(new Runnable() { // from class: g0.p2
            @Override // java.lang.Runnable
            public final void run() {
                this.f18037a.f18090h.cancel(true);
            }
        }, q0.c.b());
        this.f18093k = s(q0.c.b(), runnable);
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
        this.f18094l.a(runnable, executor);
    }

    public void l() {
        synchronized (this.f18084a) {
            this.f18097o = null;
            this.f18098p = null;
        }
    }

    public n0.p0 m() {
        return this.f18087e;
    }

    public n0.u1 n() {
        return this.f18095m;
    }

    public k0 o() {
        return this.f18085c;
    }

    public Range<Integer> p() {
        return this.f18086d;
    }

    public Size q() {
        return this.b;
    }

    public int r() {
        return this.f18089g;
    }

    public final y1.c.a<Void> s(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        r0.n.j(y1.c.a(new y1.c.InterfaceC0665c() { // from class: g0.r2
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return v2.g(this.f18047a, atomicReference, aVar);
            }
        }), new e(runnable), executor);
        return (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
    }

    public boolean t() {
        z();
        return this.f18093k.c(null);
    }

    public boolean u() {
        return this.f18088f;
    }

    public boolean v() {
        return this.f18090h.isDone();
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
        if (this.f18091i.c(surface) || this.f18090h.isCancelled()) {
            r0.n.j(this.f18092j, new d(aVar, surface), executor);
            return;
        }
        x2.g.i(this.f18090h.isDone());
        try {
            this.f18090h.get();
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
        synchronized (this.f18084a) {
            this.f18097o = iVar;
            this.f18098p = executor;
            hVar = this.f18096n;
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
        synchronized (this.f18084a) {
            this.f18096n = hVar;
            iVar = this.f18097o;
            executor = this.f18098p;
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
        return this.f18091i.f(new n0.u1.b("Surface request will not complete."));
    }
}
