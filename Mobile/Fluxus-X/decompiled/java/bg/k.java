package bg;

/* JADX INFO: loaded from: classes2.dex */
public class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f4011a;
    public final tb.k<m> b;

    public k(p pVar, tb.k<m> kVar) {
        this.f4011a = pVar;
        this.b = kVar;
    }

    @Override // bg.o
    public boolean a(Exception exc) {
        this.b.d(exc);
        return true;
    }

    @Override // bg.o
    public boolean b(dg.d dVar) {
        if (!dVar.k() || this.f4011a.f(dVar)) {
            return false;
        }
        this.b.c(m.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
