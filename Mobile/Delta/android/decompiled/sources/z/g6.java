package z;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f37275a;
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h6 f37276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.p000lifecycle.d0<g0.z2> f37277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f37278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37279f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y.c f37280g = new a();

    public class a implements y.c {
        public a() {
        }

        @Override // z.y.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            g6.this.f37278e.a(totalCaptureResult);
            return false;
        }
    }

    public interface b {
        void a(TotalCaptureResult totalCaptureResult);

        float b();

        void c();

        float d();

        void e(float f10, y1.c.a<Void> aVar);

        Rect f();

        void g(y.a.C0662a c0662a);
    }

    public g6(y yVar, a0.c0 c0Var, Executor executor) {
        this.f37275a = yVar;
        this.b = executor;
        b bVarF = f(c0Var);
        this.f37278e = bVarF;
        h6 h6Var = new h6(bVarF.d(), bVarF.b());
        this.f37276c = h6Var;
        h6Var.f(1.0f);
        this.f37277d = new androidx.p000lifecycle.d0<>(s0.h.f(h6Var));
        yVar.B(this.f37280g);
    }

    public static /* synthetic */ Object c(final g6 g6Var, final g0.z2 z2Var, final y1.c.a aVar) {
        g6Var.b.execute(new Runnable() { // from class: z.d6
            @Override // java.lang.Runnable
            public final void run() {
                this.f37171a.o(aVar, z2Var);
            }
        });
        return "setLinearZoom";
    }

    public static /* synthetic */ Object d(final g6 g6Var, final g0.z2 z2Var, final y1.c.a aVar) {
        g6Var.b.execute(new Runnable() { // from class: z.c6
            @Override // java.lang.Runnable
            public final void run() {
                this.f37159a.o(aVar, z2Var);
            }
        });
        return "setZoomRatio";
    }

    public static b f(a0.c0 c0Var) {
        return k(c0Var) ? new c(c0Var) : new p3(c0Var);
    }

    public static g0.z2 h(a0.c0 c0Var) {
        b bVarF = f(c0Var);
        h6 h6Var = new h6(bVarF.d(), bVarF.b());
        h6Var.f(1.0f);
        return s0.h.f(h6Var);
    }

    public static Range<Float> i(a0.c0 c0Var) {
        try {
            return (Range) c0Var.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e10) {
            g0.r1.m("ZoomControl", "AssertionError, fail to get camera characteristic.", e10);
            return null;
        }
    }

    public static boolean k(a0.c0 c0Var) {
        return Build.VERSION.SDK_INT >= 30 && i(c0Var) != null;
    }

    public void e(y.a.C0662a c0662a) {
        this.f37278e.g(c0662a);
    }

    public Rect g() {
        return this.f37278e.f();
    }

    public androidx.p000lifecycle.a0<g0.z2> j() {
        return this.f37277d;
    }

    public void l(boolean z10) {
        g0.z2 z2VarF;
        if (this.f37279f == z10) {
            return;
        }
        this.f37279f = z10;
        if (z10) {
            return;
        }
        synchronized (this.f37276c) {
            this.f37276c.f(1.0f);
            z2VarF = s0.h.f(this.f37276c);
        }
        p(z2VarF);
        this.f37278e.c();
        this.f37275a.s0();
    }

    public ne.x<Void> m(float f10) {
        final g0.z2 z2VarF;
        synchronized (this.f37276c) {
            try {
                this.f37276c.e(f10);
                z2VarF = s0.h.f(this.f37276c);
            } catch (IllegalArgumentException e10) {
                return r0.n.n(e10);
            }
        }
        p(z2VarF);
        return y1.c.a(new y1.c.InterfaceC0665c() { // from class: z.f6
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return g6.c(this.f37203a, z2VarF, aVar);
            }
        });
    }

    public ne.x<Void> n(float f10) {
        final g0.z2 z2VarF;
        synchronized (this.f37276c) {
            try {
                this.f37276c.f(f10);
                z2VarF = s0.h.f(this.f37276c);
            } catch (IllegalArgumentException e10) {
                return r0.n.n(e10);
            }
        }
        p(z2VarF);
        return y1.c.a(new y1.c.InterfaceC0665c() { // from class: z.e6
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return g6.d(this.f37185a, z2VarF, aVar);
            }
        });
    }

    public final void o(y1.c.a<Void> aVar, g0.z2 z2Var) {
        g0.z2 z2VarF;
        if (this.f37279f) {
            this.f37278e.e(z2Var.d(), aVar);
            this.f37275a.s0();
            return;
        }
        synchronized (this.f37276c) {
            this.f37276c.f(1.0f);
            z2VarF = s0.h.f(this.f37276c);
        }
        p(z2VarF);
        aVar.f(new g0.m.a("Camera is not active."));
    }

    public final void p(g0.z2 z2Var) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f37277d.o(z2Var);
        } else {
            this.f37277d.m(z2Var);
        }
    }
}
