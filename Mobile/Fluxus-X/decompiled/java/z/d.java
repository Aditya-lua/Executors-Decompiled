package z;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends u0.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38266a;
    public final Class<?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0.o3 f38267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0.i4<?> f38268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f38269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0.t3 f38270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<n0.j4.b> f38271g;

    public d(String str, Class<?> cls, n0.o3 o3Var, n0.i4<?> i4Var, Size size, n0.t3 t3Var, List<n0.j4.b> list) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f38266a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.b = cls;
        if (o3Var == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f38267c = o3Var;
        if (i4Var == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f38268d = i4Var;
        this.f38269e = size;
        this.f38270f = t3Var;
        this.f38271g = list;
    }

    @Override // z.u0.k
    public List<n0.j4.b> c() {
        return this.f38271g;
    }

    @Override // z.u0.k
    public n0.o3 d() {
        return this.f38267c;
    }

    @Override // z.u0.k
    public n0.t3 e() {
        return this.f38270f;
    }

    public boolean equals(Object obj) {
        Size size;
        n0.t3 t3Var;
        List<n0.j4.b> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u0.k) {
            u0.k kVar = (u0.k) obj;
            if (this.f38266a.equals(kVar.h()) && this.b.equals(kVar.i()) && this.f38267c.equals(kVar.d()) && this.f38268d.equals(kVar.g()) && ((size = this.f38269e) != null ? size.equals(kVar.f()) : kVar.f() == null) && ((t3Var = this.f38270f) != null ? t3Var.equals(kVar.e()) : kVar.e() == null) && ((list = this.f38271g) != null ? list.equals(kVar.c()) : kVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // z.u0.k
    public Size f() {
        return this.f38269e;
    }

    @Override // z.u0.k
    public n0.i4<?> g() {
        return this.f38268d;
    }

    @Override // z.u0.k
    public String h() {
        return this.f38266a;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f38266a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f38267c.hashCode()) * 1000003) ^ this.f38268d.hashCode()) * 1000003;
        Size size = this.f38269e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        n0.t3 t3Var = this.f38270f;
        int iHashCode3 = (iHashCode2 ^ (t3Var == null ? 0 : t3Var.hashCode())) * 1000003;
        List<n0.j4.b> list = this.f38271g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // z.u0.k
    public Class<?> i() {
        return this.b;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f38266a + ", useCaseType=" + this.b + ", sessionConfig=" + this.f38267c + ", useCaseConfig=" + this.f38268d + ", surfaceResolution=" + this.f38269e + ", streamSpec=" + this.f38270f + ", captureTypes=" + this.f38271g + "}";
    }
}
