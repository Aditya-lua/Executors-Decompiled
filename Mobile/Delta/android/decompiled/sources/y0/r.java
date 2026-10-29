package y0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import g0.j2;
import g0.r1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import n0.p0;
import p0.a0;
import p0.z;
import x0.n0;
import x0.r0;
import x0.z0;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f35464a;
    public final p0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f35465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f35466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f35467e;

    public class a implements r0.c<j2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n0 f35468a;

        public a(n0 n0Var) {
            this.f35468a = n0Var;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(j2 j2Var) {
            x2.g.g(j2Var);
            r.this.f35464a.d(j2Var);
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (this.f35468a.t() == 2 && (th2 instanceof CancellationException)) {
                r1.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            r1.m("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + z0.b(this.f35468a.t()), th2);
        }
    }

    public static abstract class b {
        public static b d(n0 n0Var, n0 n0Var2, List<d> list) {
            return new y0.b(n0Var, n0Var2, list);
        }

        public abstract List<d> a();

        public abstract n0 b();

        public abstract n0 c();
    }

    public static class c extends HashMap<d, n0> {
    }

    public r(p0 p0Var, p0 p0Var2, r0 r0Var) {
        this.b = p0Var;
        this.f35465c = p0Var2;
        this.f35464a = r0Var;
    }

    public static /* synthetic */ void a(r rVar) {
        c cVar = rVar.f35466d;
        if (cVar != null) {
            Iterator<n0> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().i();
            }
        }
    }

    public final void c(p0 p0Var, p0 p0Var2, n0 n0Var, n0 n0Var2, Map.Entry<d, n0> entry) {
        n0 value = entry.getValue();
        r1.a("DualSurfaceProcessorNode", "     -> outputEdge = " + value);
        Size sizeF = n0Var.s().f();
        Rect rectA = entry.getKey().a().a();
        if (!n0Var.u()) {
            p0Var = null;
        }
        j2.a aVarF = j2.a.f(sizeF, rectA, p0Var, entry.getKey().a().c(), entry.getKey().a().g());
        Size sizeF2 = n0Var2.s().f();
        Rect rectA2 = entry.getKey().b().a();
        if (!n0Var2.u()) {
            p0Var2 = null;
        }
        r0.n.j(value.j(entry.getKey().a().b(), aVarF, j2.a.f(sizeF2, rectA2, p0Var2, entry.getKey().b().c(), entry.getKey().b().g())), new a(value), q0.c.e());
    }

    public void d() {
        this.f35464a.a();
        z.e(new Runnable() { // from class: y0.p
            @Override // java.lang.Runnable
            public final void run() {
                r.a(this.f35458a);
            }
        });
    }

    public final void e(p0 p0Var, p0 p0Var2, n0 n0Var, n0 n0Var2, Map<d, n0> map) {
        for (final Map.Entry<d, n0> entry : map.entrySet()) {
            final p0 p0Var3 = p0Var;
            final p0 p0Var4 = p0Var2;
            final n0 n0Var3 = n0Var;
            final n0 n0Var4 = n0Var2;
            c(p0Var3, p0Var4, n0Var3, n0Var4, entry);
            entry.getValue().e(new Runnable() { // from class: y0.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35459a.c(p0Var3, p0Var4, n0Var3, n0Var4, entry);
                }
            });
            p0Var = p0Var3;
            p0Var2 = p0Var4;
            n0Var = n0Var3;
            n0Var2 = n0Var4;
        }
    }

    public final void f(p0 p0Var, n0 n0Var, boolean z10) {
        this.f35464a.b(n0Var.l(p0Var, z10));
    }

    public c g(b bVar) {
        z.b();
        r1.a("DualSurfaceProcessorNode", "DualSurfaceProcessorNode Transform Processor = " + this.f35464a + "\n   primary input = " + bVar.b() + "\n   secondary input = " + bVar.c());
        Iterator<d> it = bVar.a().iterator();
        while (it.hasNext()) {
            r1.a("SurfaceProcessorNode", "   outputConfig = " + it.next());
        }
        this.f35467e = bVar;
        this.f35466d = new c();
        n0 n0VarB = this.f35467e.b();
        n0 n0VarC = this.f35467e.c();
        for (d dVar : this.f35467e.a()) {
            this.f35466d.put(dVar, h(n0VarB, dVar.a()));
        }
        f(this.b, n0VarB, true);
        f(this.f35465c, n0VarC, false);
        e(this.b, this.f35465c, n0VarB, n0VarC, this.f35466d);
        return this.f35466d;
    }

    public final n0 h(n0 n0Var, z0.f fVar) {
        Rect rectA = fVar.a();
        int iC = fVar.c();
        boolean zG = fVar.g();
        Matrix matrix = new Matrix(n0Var.r());
        matrix.postConcat(a0.e(new RectF(rectA), a0.t(fVar.d()), iC, zG));
        x2.g.a(a0.j(a0.f(rectA, iC), fVar.d()));
        Rect rectR = a0.r(fVar.d());
        return new n0(fVar.e(), fVar.b(), n0Var.s().i().f(fVar.d()).a(), matrix, false, rectR, n0Var.q() - iC, -1, n0Var.w() != zG);
    }
}
