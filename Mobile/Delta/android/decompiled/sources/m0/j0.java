package m0;

import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import g0.h2;
import java.util.concurrent.Executor;
import n0.j2;
import n0.z3;

/* JADX INFO: loaded from: classes.dex */
public class j0 implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f23615a;
    public v0 b;

    public j0(j2 j2Var) {
        this.f23615a = j2Var;
    }

    public static /* synthetic */ void a(j0 j0Var, j2.a aVar, j2 j2Var) {
        j0Var.getClass();
        aVar.a(j0Var);
    }

    @Override // n0.j2
    public androidx.camera.core.d b() {
        return j(this.f23615a.b());
    }

    @Override // n0.j2
    public int c() {
        return this.f23615a.c();
    }

    @Override // n0.j2
    public void close() {
        this.f23615a.close();
    }

    @Override // n0.j2
    public void d() {
        this.f23615a.d();
    }

    @Override // n0.j2
    public int e() {
        return this.f23615a.e();
    }

    @Override // n0.j2
    public void f(final j2.a aVar, Executor executor) {
        this.f23615a.f(new j2.a() { // from class: m0.i0
            @Override // n0.j2.a
            public final void a(j2 j2Var) {
                j0.a(this.f23601a, aVar, j2Var);
            }
        }, executor);
    }

    @Override // n0.j2
    public androidx.camera.core.d g() {
        return j(this.f23615a.g());
    }

    @Override // n0.j2
    public int getHeight() {
        return this.f23615a.getHeight();
    }

    @Override // n0.j2
    public Surface getSurface() {
        return this.f23615a.getSurface();
    }

    @Override // n0.j2
    public int getWidth() {
        return this.f23615a.getWidth();
    }

    public void h(v0 v0Var) {
        x2.g.j(this.b == null, "Pending request should be null");
        this.b = v0Var;
    }

    public void i() {
        this.b = null;
    }

    public final androidx.camera.core.d j(androidx.camera.core.d dVar) {
        if (dVar == null) {
            return null;
        }
        z3 z3VarB = this.b == null ? z3.b() : z3.a(new Pair(this.b.j(), this.b.i().get(0)));
        this.b = null;
        return new h2(dVar, new Size(dVar.getWidth(), dVar.getHeight()), new s0.c(new b1.l(z3VarB, dVar.H2().getTimestamp())));
    }
}
