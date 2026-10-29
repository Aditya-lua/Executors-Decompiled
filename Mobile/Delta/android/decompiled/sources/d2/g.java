package d2;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14348m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f14332e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f14332e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // d2.f
    public void d(int i10) {
        if (this.f14337j) {
            return;
        }
        this.f14337j = true;
        this.f14334g = i10;
        for (d dVar : this.f14338k) {
            dVar.a(dVar);
        }
    }
}
