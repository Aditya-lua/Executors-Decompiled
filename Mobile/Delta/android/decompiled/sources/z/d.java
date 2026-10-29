package z;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends u0.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36466a;
    public final Class<?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0.o3 f36467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0.i4<?> f36468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f36469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0.t3 f36470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<n0.j4.b> f36471g;

    public d(String str, Class<?> cls, n0.o3 o3Var, n0.i4<?> i4Var, Size size, n0.t3 t3Var, List<n0.j4.b> list) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f36466a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.b = cls;
        if (o3Var == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f36467c = o3Var;
        if (i4Var == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f36468d = i4Var;
        this.f36469e = size;
        this.f36470f = t3Var;
        this.f36471g = list;
    }

    @Override // z.u0.k
    public List<n0.j4.b> c() {
        return this.f36471g;
    }

    @Override // z.u0.k
    public n0.o3 d() {
        return this.f36467c;
    }

    @Override // z.u0.k
    public n0.t3 e() {
        return this.f36470f;
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
            if (this.f36466a.equals(kVar.h()) && this.b.equals(kVar.i()) && this.f36467c.equals(kVar.d()) && this.f36468d.equals(kVar.g()) && ((size = this.f36469e) != null ? size.equals(kVar.f()) : kVar.f() == null) && ((t3Var = this.f36470f) != null ? t3Var.equals(kVar.e()) : kVar.e() == null) && ((list = this.f36471g) != null ? list.equals(kVar.c()) : kVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // z.u0.k
    public Size f() {
        return this.f36469e;
    }

    @Override // z.u0.k
    public n0.i4<?> g() {
        return this.f36468d;
    }

    @Override // z.u0.k
    public String h() {
        return this.f36466a;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f36466a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f36467c.hashCode()) * 1000003) ^ this.f36468d.hashCode()) * 1000003;
        Size size = this.f36469e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        n0.t3 t3Var = this.f36470f;
        int iHashCode3 = (iHashCode2 ^ (t3Var == null ? 0 : t3Var.hashCode())) * 1000003;
        List<n0.j4.b> list = this.f36471g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // z.u0.k
    public Class<?> i() {
        return this.b;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f36466a + ", useCaseType=" + this.b + ", sessionConfig=" + this.f36467c + ", useCaseConfig=" + this.f36468d + ", surfaceResolution=" + this.f36469e + ", streamSpec=" + this.f36470f + ", captureTypes=" + this.f36471g + "}";
    }
}
