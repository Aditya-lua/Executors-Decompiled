package zd;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f37519a;
    public final /* synthetic */ int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f37520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f37521d;

    public z0(a1 a1Var, e eVar, int i10, int i11) {
        this.f37521d = a1Var;
        this.f37519a = eVar;
        this.b = i10;
        this.f37520c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a1 a1Var = this.f37521d;
        e eVar = this.f37519a;
        a1Var.j(new g(eVar.h(), this.b, this.f37520c, eVar.a(), eVar.j(), eVar.l(), eVar.k(), eVar.g(), eVar.m()));
    }
}
