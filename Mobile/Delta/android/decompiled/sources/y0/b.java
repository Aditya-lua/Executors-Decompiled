package y0;

import java.util.List;
import x0.n0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends r.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f36286a;
    public final n0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<d> f36287c;

    public b(n0 n0Var, n0 n0Var2, List<d> list) {
        if (n0Var == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f36286a = n0Var;
        if (n0Var2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.b = n0Var2;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f36287c = list;
    }

    @Override // y0.r.b
    public List<d> a() {
        return this.f36287c;
    }

    @Override // y0.r.b
    public n0 b() {
        return this.f36286a;
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
            if (this.f36286a.equals(bVar.b()) && this.b.equals(bVar.c()) && this.f36287c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f36286a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f36287c.hashCode();
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.f36286a + ", secondarySurfaceEdge=" + this.b + ", outConfigs=" + this.f36287c + "}";
    }
}
