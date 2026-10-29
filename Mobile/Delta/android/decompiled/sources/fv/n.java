package fv;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17298a;
    public final l b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f17299c = true;

    public n(Object obj, l lVar) {
        this.f17298a = obj;
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f17298a == nVar.f17298a && this.b.equals(nVar.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f17298a.hashCode() + this.b.f17287f.hashCode();
    }
}
