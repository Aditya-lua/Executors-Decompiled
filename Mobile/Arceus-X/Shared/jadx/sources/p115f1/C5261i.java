package p115f1;

/* JADX INFO: renamed from: f1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5261i extends C5312z.a {

    /* JADX INFO: renamed from: a */
    public final C5306x f20372a;

    /* JADX INFO: renamed from: b */
    public final int f20373b;

    public C5261i(C5306x c5306x, int i10) {
        if (c5306x == null) {
            throw new NullPointerException("Null quality");
        }
        this.f20372a = c5306x;
        this.f20373b = i10;
    }

    @Override // p115f1.C5312z.a
    /* JADX INFO: renamed from: a */
    public int mo24321a() {
        return this.f20373b;
    }

    @Override // p115f1.C5312z.a
    /* JADX INFO: renamed from: b */
    public C5306x mo24322b() {
        return this.f20372a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5312z.a) {
            C5312z.a aVar = (C5312z.a) obj;
            if (this.f20372a.equals(aVar.mo24322b()) && this.f20373b == aVar.mo24321a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f20372a.hashCode() ^ 1000003) * 1000003) ^ this.f20373b;
    }

    public String toString() {
        return "QualityRatio{quality=" + this.f20372a + ", aspectRatio=" + this.f20373b + "}";
    }
}
