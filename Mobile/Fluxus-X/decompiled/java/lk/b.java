package lk;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mk.a f22276a = new mk.a();
    public InterfaceC0432b b;

    public class a implements lk.a {
        public a() {
        }

        @Override // lk.a
        public void a(String str) {
            cm.a aVarB = cm.a.b(str);
            nk.c.c().u(aVarB);
            b.this.c(aVarB);
        }
    }

    /* JADX INFO: renamed from: lk.b$b, reason: collision with other inner class name */
    public interface InterfaceC0432b {
        void a(cm.a aVar);
    }

    public void b(InterfaceC0432b interfaceC0432b) {
        this.b = interfaceC0432b;
        this.f22276a.d(nk.c.c().j(), new a());
    }

    public final void c(cm.a aVar) {
        InterfaceC0432b interfaceC0432b = this.b;
        if (interfaceC0432b != null) {
            interfaceC0432b.a(aVar);
        }
    }
}
