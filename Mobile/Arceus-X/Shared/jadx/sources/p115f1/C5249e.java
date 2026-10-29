package p115f1;

/* JADX INFO: renamed from: f1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5249e extends C5282p.b {

    /* JADX INFO: renamed from: b */
    public final C5306x f20335b;

    /* JADX INFO: renamed from: c */
    public final int f20336c;

    public C5249e(C5306x c5306x, int i10) {
        if (c5306x == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.f20335b = c5306x;
        this.f20336c = i10;
    }

    @Override // p115f1.C5282p.b
    /* JADX INFO: renamed from: c */
    public C5306x mo24282c() {
        return this.f20335b;
    }

    @Override // p115f1.C5282p.b
    /* JADX INFO: renamed from: d */
    public int mo24283d() {
        return this.f20336c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5282p.b) {
            C5282p.b bVar = (C5282p.b) obj;
            if (this.f20335b.equals(bVar.mo24282c()) && this.f20336c == bVar.mo24283d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f20335b.hashCode() ^ 1000003) * 1000003) ^ this.f20336c;
    }

    public String toString() {
        return "RuleStrategy{fallbackQuality=" + this.f20335b + ", fallbackRule=" + this.f20336c + "}";
    }
}
