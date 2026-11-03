package dv;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15494a;
    public final l b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f15495c = true;

    public n(Object obj, l lVar) {
        this.f15494a = obj;
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f15494a == nVar.f15494a && this.b.equals(nVar.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f15494a.hashCode() + this.b.f15483f.hashCode();
    }
}
