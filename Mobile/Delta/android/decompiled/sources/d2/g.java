package d2;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14328m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f14312e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f14312e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // d2.f
    public void d(int i10) {
        if (this.f14317j) {
            return;
        }
        this.f14317j = true;
        this.f14314g = i10;
        for (d dVar : this.f14318k) {
            dVar.a(dVar);
        }
    }
}
