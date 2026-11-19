package d2;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11713m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f11697e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f11697e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // d2.f
    public void d(int i10) {
        if (this.f11702j) {
            return;
        }
        this.f11702j = true;
        this.f11699g = i10;
        for (d dVar : this.f11703k) {
            dVar.a(dVar);
        }
    }
}
