package g0;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends x0 {

    public class a implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.camera.core.d f17628a;

        public a(androidx.camera.core.d dVar) {
            this.f17628a = dVar;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            this.f17628a.close();
        }
    }

    @Override // g0.x0
    public androidx.camera.core.d d(n0.j2 j2Var) {
        return j2Var.g();
    }

    @Override // g0.x0
    public void f() {
    }

    @Override // g0.x0
    public void l(androidx.camera.core.d dVar) {
        r0.n.j(e(dVar), new a(dVar), q0.c.b());
    }
}
