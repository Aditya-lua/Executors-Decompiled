package g0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends j2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17452a;
    public final j2 b;

    public i(int i10, j2 j2Var) {
        this.f17452a = i10;
        if (j2Var == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.b = j2Var;
    }

    @Override // g0.j2.b
    public int a() {
        return this.f17452a;
    }

    @Override // g0.j2.b
    public j2 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2.b) {
            j2.b bVar = (j2.b) obj;
            if (this.f17452a == bVar.a() && this.b.equals(bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f17452a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f17452a + ", surfaceOutput=" + this.b + "}";
    }
}
