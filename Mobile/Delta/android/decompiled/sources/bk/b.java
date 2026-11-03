package bk;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ck.a f4332a = new ck.a();
    public InterfaceC0085b b;

    public class a implements bk.a {
        public a() {
        }

        @Override // bk.a
        public void a(String str) {
            ml.a aVarB = ml.a.b(str);
            dk.c.c().u(aVarB);
            b.this.c(aVarB);
        }
    }

    /* JADX INFO: renamed from: bk.b$b, reason: collision with other inner class name */
    public interface InterfaceC0085b {
        void a(ml.a aVar);
    }

    public void b(InterfaceC0085b interfaceC0085b) {
        this.b = interfaceC0085b;
        this.f4332a.d(dk.c.c().j(), new a());
    }

    public final void c(ml.a aVar) {
        InterfaceC0085b interfaceC0085b = this.b;
        if (interfaceC0085b != null) {
            interfaceC0085b.a(aVar);
        }
    }
}
