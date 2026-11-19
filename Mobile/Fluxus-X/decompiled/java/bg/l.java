package bg;

/* JADX INFO: loaded from: classes2.dex */
public class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tb.k<String> f4012a;

    public l(tb.k<String> kVar) {
        this.f4012a = kVar;
    }

    @Override // bg.o
    public boolean a(Exception exc) {
        return false;
    }

    @Override // bg.o
    public boolean b(dg.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f4012a.e(dVar.d());
        return true;
    }
}
