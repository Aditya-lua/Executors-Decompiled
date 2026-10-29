package p138fv;

/* JADX INFO: renamed from: fv.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C5851n {

    /* JADX INFO: renamed from: a */
    public final Object f22318a;

    /* JADX INFO: renamed from: b */
    public final C5849l f22319b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f22320c = true;

    public C5851n(Object obj, C5849l c5849l) {
        this.f22318a = obj;
        this.f22319b = c5849l;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5851n) {
            C5851n c5851n = (C5851n) obj;
            if (this.f22318a == c5851n.f22318a && this.f22319b.equals(c5851n.f22319b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f22318a.hashCode() + this.f22319b.f22305f.hashCode();
    }
}
