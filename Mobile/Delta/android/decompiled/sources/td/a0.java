package td;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f32226a;
    public r1 b;

    @Override // td.q0
    public final q0 a(r1 r1Var) {
        this.b = r1Var;
        return this;
    }

    @Override // td.q0
    public final q0 b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f32226a = str;
        return this;
    }

    @Override // td.q0
    public final r0 c() {
        r1 r1Var;
        String str = this.f32226a;
        if (str != null && (r1Var = this.b) != null) {
            return new r0(str, r1Var);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f32226a == null) {
            sb2.append(" token");
        }
        if (this.b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
