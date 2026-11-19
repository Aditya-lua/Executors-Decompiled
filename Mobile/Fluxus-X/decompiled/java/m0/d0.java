package m0;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import n0.g2;
import n0.h2;
import n0.m1;
import n0.o3;
import n0.u1;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f22588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v0.b f22589g = new v0.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f22590a;
    public final n0.l1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f22591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0 f22592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x.c f22593e;

    public d0(g2 g2Var, Size size, CameraCharacteristics cameraCharacteristics, g0.n nVar, boolean z10, k0 k0Var) {
        p0.z.b();
        this.f22590a = g2Var;
        this.b = n0.l1.a.j(g2Var).h();
        x xVar = new x();
        this.f22591c = xVar;
        Executor executorM0 = g2Var.m0(q0.c.d());
        Objects.requireNonNull(executorM0);
        u0 u0Var = new u0(executorM0, cameraCharacteristics, nVar != null ? new x0.y(nVar) : null);
        this.f22592d = u0Var;
        ArrayList arrayList = new ArrayList();
        if (g2Var.Z() != 0) {
            arrayList.add(32);
            arrayList.add(Integer.valueOf(Barcode.FORMAT_QR_CODE));
        } else {
            arrayList.add(Integer.valueOf(i()));
        }
        x.c cVarN = x.c.n(size, g2Var.p(), arrayList, z10, g2Var.l0(), k0Var);
        this.f22593e = cVarN;
        u0Var.r(xVar.s(cVarN));
    }

    public void a() {
        p0.z.b();
        this.f22591c.n();
        this.f22592d.n();
    }

    public final n b(int i10, n0.k1 k1Var, l1 l1Var, a1 a1Var) {
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(k1Var.hashCode());
        List<m1> listA = k1Var.a();
        Objects.requireNonNull(listA);
        for (m1 m1Var : listA) {
            n0.l1.a aVar = new n0.l1.a();
            aVar.v(this.b.k());
            aVar.e(this.b.g());
            aVar.a(l1Var.q());
            aVar.f(this.f22593e.l());
            if (this.f22593e.e().size() > 1 && this.f22593e.j() != null) {
                aVar.f(this.f22593e.j());
            }
            boolean zL = l();
            if (zL) {
                u1 u1VarG = this.f22593e.g();
                Objects.requireNonNull(u1VarG);
                aVar.f(u1VarG);
            }
            aVar.t(zL);
            if (w0.b.j(this.f22593e.d()) || w0.b.k(this.f22593e.d())) {
                if (f22589g.a()) {
                    aVar.d(n0.l1.f25026i, Integer.valueOf(l1Var.n()));
                }
                aVar.d(n0.l1.f25027j, Integer.valueOf(g(l1Var)));
            }
            aVar.e(m1Var.a().g());
            aVar.g(strValueOf, Integer.valueOf(m1Var.getId()));
            aVar.r(i10);
            aVar.c(this.f22593e.a());
            if (this.f22593e.e().size() > 1 && this.f22593e.i() != null) {
                aVar.c(this.f22593e.i());
            }
            arrayList.add(aVar.h());
        }
        return new n(arrayList, a1Var);
    }

    public final n0.k1 c() {
        n0.k1 k1VarH0 = this.f22590a.h0(g0.h0.b());
        Objects.requireNonNull(k1VarH0);
        return k1VarH0;
    }

    public final v0 d(int i10, n0.k1 k1Var, l1 l1Var, a1 a1Var, pe.x<Void> xVar) {
        return new v0(k1Var, l1Var, a1Var, xVar, i10);
    }

    public x2.c<n, v0> e(l1 l1Var, a1 a1Var, pe.x<Void> xVar) {
        p0.z.b();
        n0.k1 k1VarC = c();
        int i10 = f22588f;
        f22588f = i10 + 1;
        return new x2.c<>(b(i10, k1VarC, l1Var, a1Var), d(i10, k1VarC, l1Var, a1Var, xVar));
    }

    public o3.b f(Size size) {
        o3.b bVarR = o3.b.r(this.f22590a, size);
        bVarR.h(this.f22593e.l());
        if (this.f22593e.e().size() > 1 && this.f22593e.j() != null) {
            bVarR.h(this.f22593e.j());
        }
        if (this.f22593e.g() != null) {
            bVarR.y(this.f22593e.g());
        }
        return bVarR;
    }

    public int g(l1 l1Var) {
        boolean z10 = l1Var.l() != null;
        boolean zH = p0.a0.h(l1Var.i(), this.f22593e.k());
        if (z10 && zH) {
            return l1Var.h() == 0 ? 100 : 95;
        }
        return l1Var.k();
    }

    public int h() {
        p0.z.b();
        return this.f22591c.i();
    }

    public final int i() {
        Integer num = (Integer) this.f22590a.h(g2.T, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.f22590a.h(h2.f24968j, null);
        if (num2 != null && num2.intValue() == 4101) {
            return 4101;
        }
        if (num2 == null || num2.intValue() != 32) {
            return Barcode.FORMAT_QR_CODE;
        }
        return 32;
    }

    public void j(b1.a aVar) {
        p0.z.b();
        this.f22593e.b().accept(aVar);
    }

    public void k(androidx.camera.core.b.a aVar) {
        p0.z.b();
        this.f22591c.r(aVar);
    }

    public final boolean l() {
        return this.f22593e.g() != null;
    }

    public void m(v0 v0Var) {
        p0.z.b();
        this.f22593e.h().accept(v0Var);
    }
}
