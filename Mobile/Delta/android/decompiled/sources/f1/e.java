package f1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p.b {
    public final x b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15837c;

    public e(x xVar, int i10) {
        if (xVar == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.b = xVar;
        this.f15837c = i10;
    }

    @Override // f1.p.b
    public x c() {
        return this.b;
    }

    @Override // f1.p.b
    public int d() {
        return this.f15837c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p.b) {
            p.b bVar = (p.b) obj;
            if (this.b.equals(bVar.c()) && this.f15837c == bVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.f15837c;
    }

    public String toString() {
        return "RuleStrategy{fallbackQuality=" + this.b + ", fallbackRule=" + this.f15837c + "}";
    }
}
