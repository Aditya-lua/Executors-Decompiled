package mo;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements wt.d<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f23415a;
    public final wt.i<b0> b;

    public j(e eVar, wt.i<b0> iVar) {
        this.f23415a = eVar;
        this.b = iVar;
    }

    public static j a(e eVar, wt.i<b0> iVar) {
        return new j(eVar, iVar);
    }

    public static m c(e eVar, b0 b0Var) {
        return (m) wt.h.e(eVar.e(b0Var));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f23415a, this.b.get());
    }
}
