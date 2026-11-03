package hi;

import ek.q;

/* JADX INFO: loaded from: classes2.dex */
public class j extends rk.b {

    public class a implements rk.b.a {
        @Override // rk.b.a
        public void a(rk.a aVar) {
            q.i("RBHybridModuleOverlay", "RBHybridModuleOverlay CloseOverlay.execute() " + aVar.f());
            dv.c.d().j(new oh.d());
        }

        public a() {
        }
    }

    public class b implements rk.b.a {
        @Override // rk.b.a
        public void a(rk.a aVar) {
            q.i("RBHybridModuleOverlay", "RBHybridModuleOverlay SetSubmitState.execute() " + aVar.f());
        }

        public b() {
        }
    }

    public j() {
        super("Overlay");
        d("close", new a());
        d("setSubmitState", new b());
    }
}
