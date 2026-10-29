package yn;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements ft.d<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f36002a;
    public final ft.i<b0> b;

    public j(e eVar, ft.i<b0> iVar) {
        this.f36002a = eVar;
        this.b = iVar;
    }

    public static j a(e eVar, ft.i<b0> iVar) {
        return new j(eVar, iVar);
    }

    public static m c(e eVar, b0 b0Var) {
        return (m) ft.h.e(eVar.e(b0Var));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f36002a, this.b.get());
    }
}
