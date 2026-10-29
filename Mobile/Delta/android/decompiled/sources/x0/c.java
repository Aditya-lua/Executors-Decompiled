package x0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c extends v0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f34563a;
    public final List<z0.f> b;

    public c(n0 n0Var, List<z0.f> list) {
        if (n0Var == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f34563a = n0Var;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.b = list;
    }

    @Override // x0.v0.b
    public List<z0.f> a() {
        return this.b;
    }

    @Override // x0.v0.b
    public n0 b() {
        return this.f34563a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0.b) {
            v0.b bVar = (v0.b) obj;
            if (this.f34563a.equals(bVar.b()) && this.b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f34563a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f34563a + ", outConfigs=" + this.b + "}";
    }
}
