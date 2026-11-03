package td;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f32230a;
    public r1 b;

    @Override // td.r
    public final r a(r1 r1Var) {
        this.b = r1Var;
        return this;
    }

    @Override // td.r
    public final r b(String str) {
        this.f32230a = str;
        return this;
    }

    @Override // td.r
    public final s c() {
        r1 r1Var;
        String str = this.f32230a;
        if (str != null && (r1Var = this.b) != null) {
            return new s(str, r1Var);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f32230a == null) {
            sb2.append(" token");
        }
        if (this.b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
