package y0;

import java.util.List;
import x0.n0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends r.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f35429a;
    public final n0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<d> f35430c;

    public b(n0 n0Var, n0 n0Var2, List<d> list) {
        if (n0Var == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f35429a = n0Var;
        if (n0Var2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.b = n0Var2;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f35430c = list;
    }

    @Override // y0.r.b
    public List<d> a() {
        return this.f35430c;
    }

    @Override // y0.r.b
    public n0 b() {
        return this.f35429a;
    }

    @Override // y0.r.b
    public n0 c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r.b) {
            r.b bVar = (r.b) obj;
            if (this.f35429a.equals(bVar.b()) && this.b.equals(bVar.c()) && this.f35430c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f35429a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f35430c.hashCode();
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.f35429a + ", secondarySurfaceEdge=" + this.b + ", outConfigs=" + this.f35430c + "}";
    }
}
