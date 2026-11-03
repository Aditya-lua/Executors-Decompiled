package zf;

/* JADX INFO: loaded from: classes2.dex */
public class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.k<String> f38120a;

    public l(sb.k<String> kVar) {
        this.f38120a = kVar;
    }

    @Override // zf.o
    public boolean a(Exception exc) {
        return false;
    }

    @Override // zf.o
    public boolean b(bg.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f38120a.e(dVar.d());
        return true;
    }
}
