package x0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import g0.j2;
import g0.r1;
import g0.v2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f34653a;
    public final n0.p0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f34654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f34655d;

    public class a implements r0.c<j2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n0 f34656a;

        public a(n0 n0Var) {
            this.f34656a = n0Var;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(j2 j2Var) {
            x2.g.g(j2Var);
            v0.this.f34653a.d(j2Var);
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (this.f34656a.t() == 2 && (th2 instanceof CancellationException)) {
                r1.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            r1.m("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + z0.b(this.f34656a.t()), th2);
        }
    }

    public static abstract class b {
        public static b c(n0 n0Var, List<z0.f> list) {
            return new x0.c(n0Var, list);
        }

        public abstract List<z0.f> a();

        public abstract n0 b();
    }

    public static class c extends HashMap<z0.f, n0> {
    }

    public v0(n0.p0 p0Var, r0 r0Var) {
        this.b = p0Var;
        this.f34653a = r0Var;
    }

    public static /* synthetic */ void b(Map map, v2.h hVar) {
        for (Map.Entry entry : map.entrySet()) {
            int iB = hVar.b() - ((z0.f) entry.getKey()).c();
            if (((z0.f) entry.getKey()).g()) {
                iB = -iB;
            }
            ((n0) entry.getValue()).z(p0.a0.w(iB), -1);
        }
    }

    public static /* synthetic */ void c(v0 v0Var) {
        c cVar = v0Var.f34654c;
        if (cVar != null) {
            Iterator<n0> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().i();
            }
        }
    }

    public final void d(n0 n0Var, Map.Entry<z0.f, n0> entry) {
        n0 value = entry.getValue();
        r1.a("SurfaceProcessorNode", "     -> outputEdge = " + value);
        r0.n.j(value.j(entry.getKey().b(), j2.a.f(n0Var.s().f(), entry.getKey().a(), n0Var.u() ? this.b : null, entry.getKey().c(), entry.getKey().g()), null), new a(value), q0.c.e());
    }

    public r0 e() {
        return this.f34653a;
    }

    public void f() {
        this.f34653a.a();
        p0.z.e(new Runnable() { // from class: x0.u0
            @Override // java.lang.Runnable
            public final void run() {
                v0.c(this.f34651a);
            }
        });
    }

    public final void g(final n0 n0Var, Map<z0.f, n0> map) {
        for (final Map.Entry<z0.f, n0> entry : map.entrySet()) {
            d(n0Var, entry);
            entry.getValue().e(new Runnable() { // from class: x0.s0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34636a.d(n0Var, entry);
                }
            });
        }
    }

    public final void h(n0 n0Var) {
        this.f34653a.b(n0Var.k(this.b));
    }

    public void i(n0 n0Var, final Map<z0.f, n0> map) {
        n0Var.f(new x2.a() { // from class: x0.t0
            @Override // x2.a
            public final void accept(Object obj) {
                v0.b(map, (v2.h) obj);
            }
        });
    }

    public c j(b bVar) {
        p0.z.b();
        r1.a("SurfaceProcessorNode", "SurfaceProcessorNode Transform (Processor=" + this.f34653a + "\n   inputEdge = " + bVar.b());
        Iterator<z0.f> it = bVar.a().iterator();
        while (it.hasNext()) {
            r1.a("SurfaceProcessorNode", "   outputConfig = " + it.next());
        }
        this.f34655d = bVar;
        this.f34654c = new c();
        n0 n0VarB = bVar.b();
        for (z0.f fVar : bVar.a()) {
            this.f34654c.put(fVar, k(n0VarB, fVar));
        }
        h(n0VarB);
        g(n0VarB, this.f34654c);
        i(n0VarB, this.f34654c);
        return this.f34654c;
    }

    public final n0 k(n0 n0Var, z0.f fVar) {
        Rect rectR;
        Rect rectA = fVar.a();
        int iC = fVar.c();
        boolean zG = fVar.g();
        Matrix matrix = new Matrix(n0Var.r());
        Matrix matrixE = p0.a0.e(new RectF(rectA), p0.a0.t(fVar.d()), iC, zG);
        matrix.postConcat(matrixE);
        x2.g.a(p0.a0.j(p0.a0.f(rectA, iC), fVar.d()));
        if (fVar.k()) {
            x2.g.b(fVar.a().contains(n0Var.n()), String.format("Output crop rect %s must contain input crop rect %s", fVar.a(), n0Var.n()));
            rectR = new Rect();
            RectF rectF = new RectF(n0Var.n());
            matrixE.mapRect(rectF);
            rectF.round(rectR);
        } else {
            rectR = p0.a0.r(fVar.d());
        }
        Rect rect = rectR;
        return new n0(fVar.e(), fVar.b(), n0Var.s().i().f(fVar.d()).a(), matrix, false, rect, n0Var.q() - iC, -1, n0Var.w() != zG);
    }
}
