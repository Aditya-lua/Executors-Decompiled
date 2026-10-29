package yf;

/* JADX INFO: loaded from: classes2.dex */
public class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f35880a;
    public final sb.k<m> b;

    public k(p pVar, sb.k<m> kVar) {
        this.f35880a = pVar;
        this.b = kVar;
    }

    @Override // yf.o
    public boolean a(ag.d dVar) {
        if (!dVar.k() || this.f35880a.f(dVar)) {
            return false;
        }
        this.b.c(m.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }

    @Override // yf.o
    public boolean b(Exception exc) {
        this.b.d(exc);
        return true;
    }
}
