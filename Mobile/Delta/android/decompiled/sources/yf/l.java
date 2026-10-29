package yf;

/* JADX INFO: loaded from: classes2.dex */
public class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.k<String> f35881a;

    public l(sb.k<String> kVar) {
        this.f35881a = kVar;
    }

    @Override // yf.o
    public boolean a(ag.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f35881a.e(dVar.d());
        return true;
    }

    @Override // yf.o
    public boolean b(Exception exc) {
        return false;
    }
}
