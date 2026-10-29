package ji;

/* JADX INFO: loaded from: classes2.dex */
public class j extends tk.b {

    public class a implements tk.b.a {
        @Override // tk.b.a
        public void a(tk.a aVar) {
            gk.p.i("RBHybridModuleOverlay", "RBHybridModuleOverlay CloseOverlay.execute() " + aVar.f());
            fv.c.d().j(new ph.d());
        }

        public a() {
        }
    }

    public class b implements tk.b.a {
        @Override // tk.b.a
        public void a(tk.a aVar) {
            gk.p.i("RBHybridModuleOverlay", "RBHybridModuleOverlay SetSubmitState.execute() " + aVar.f());
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
