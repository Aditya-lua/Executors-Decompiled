package dk;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ek.a f14740a = new ek.a();
    public InterfaceC0273b b;

    public class a implements dk.a {
        public a() {
        }

        @Override // dk.a
        public void a(String str) {
            ol.a aVarB = ol.a.b(str);
            fk.c.c().u(aVarB);
            b.this.c(aVarB);
        }
    }

    /* JADX INFO: renamed from: dk.b$b, reason: collision with other inner class name */
    public interface InterfaceC0273b {
        void a(ol.a aVar);
    }

    public void b(InterfaceC0273b interfaceC0273b) {
        this.b = interfaceC0273b;
        this.f14740a.d(fk.c.c().j(), new a());
    }

    public final void c(ol.a aVar) {
        InterfaceC0273b interfaceC0273b = this.b;
        if (interfaceC0273b != null) {
            interfaceC0273b.a(aVar);
        }
    }
}
