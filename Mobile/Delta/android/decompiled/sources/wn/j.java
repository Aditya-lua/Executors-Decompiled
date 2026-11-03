package wn;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements dt.d<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f34631a;
    public final dt.i<b0> b;

    public j(e eVar, dt.i<b0> iVar) {
        this.f34631a = eVar;
        this.b = iVar;
    }

    public static j a(e eVar, dt.i<b0> iVar) {
        return new j(eVar, iVar);
    }

    public static m c(e eVar, b0 b0Var) {
        return (m) dt.h.e(eVar.e(b0Var));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f34631a, this.b.get());
    }
}
