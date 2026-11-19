package ri;

import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class j extends al.b {

    public class a implements al.b.a {
        @Override // al.b.a
        public void a(al.a aVar) {
            q.i("RBHybridModuleOverlay", "RBHybridModuleOverlay CloseOverlay.execute() " + aVar.f());
            mw.c.d().j(new yh.d());
        }

        public a() {
        }
    }

    public class b implements al.b.a {
        @Override // al.b.a
        public void a(al.a aVar) {
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
