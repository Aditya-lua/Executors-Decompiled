package mw;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24875a;
    public final l b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f24876c = true;

    public n(Object obj, l lVar) {
        this.f24875a = obj;
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f24875a == nVar.f24875a && this.b.equals(nVar.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f24875a.hashCode() + this.b.f24864f.hashCode();
    }
}
