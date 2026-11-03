package ae;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f475a;
    public final /* synthetic */ int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f477d;

    public z0(a1 a1Var, e eVar, int i10, int i11) {
        this.f477d = a1Var;
        this.f475a = eVar;
        this.b = i10;
        this.f476c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a1 a1Var = this.f477d;
        e eVar = this.f475a;
        a1Var.j(new g(eVar.h(), this.b, this.f476c, eVar.a(), eVar.j(), eVar.l(), eVar.k(), eVar.g(), eVar.m()));
    }
}
