package ce;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f5022a;
    public final /* synthetic */ int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f5024d;

    public z0(a1 a1Var, e eVar, int i10, int i11) {
        this.f5024d = a1Var;
        this.f5022a = eVar;
        this.b = i10;
        this.f5023c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a1 a1Var = this.f5024d;
        e eVar = this.f5022a;
        a1Var.j(new g(eVar.h(), this.b, this.f5023c, eVar.a(), eVar.j(), eVar.l(), eVar.k(), eVar.g(), eVar.m()));
    }
}
