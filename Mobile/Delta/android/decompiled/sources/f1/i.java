package f1;

/* JADX INFO: loaded from: classes.dex */
public final class i extends z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f15863a;
    public final int b;

    public i(x xVar, int i10) {
        if (xVar == null) {
            throw new NullPointerException("Null quality");
        }
        this.f15863a = xVar;
        this.b = i10;
    }

    @Override // f1.z.a
    public int a() {
        return this.b;
    }

    @Override // f1.z.a
    public x b() {
        return this.f15863a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z.a) {
            z.a aVar = (z.a) obj;
            if (this.f15863a.equals(aVar.b()) && this.b == aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f15863a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        return "QualityRatio{quality=" + this.f15863a + ", aspectRatio=" + this.b + "}";
    }
}
