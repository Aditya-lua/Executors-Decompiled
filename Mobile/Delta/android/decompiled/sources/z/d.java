package z;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends u0.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37161a;
    public final Class<?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0.o3 f37162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0.i4<?> f37163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f37164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0.t3 f37165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<n0.j4.b> f37166g;

    public d(String str, Class<?> cls, n0.o3 o3Var, n0.i4<?> i4Var, Size size, n0.t3 t3Var, List<n0.j4.b> list) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f37161a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.b = cls;
        if (o3Var == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f37162c = o3Var;
        if (i4Var == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f37163d = i4Var;
        this.f37164e = size;
        this.f37165f = t3Var;
        this.f37166g = list;
    }

    @Override // z.u0.k
    public List<n0.j4.b> c() {
        return this.f37166g;
    }

    @Override // z.u0.k
    public n0.o3 d() {
        return this.f37162c;
    }

    @Override // z.u0.k
    public n0.t3 e() {
        return this.f37165f;
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
            if (this.f37161a.equals(kVar.h()) && this.b.equals(kVar.i()) && this.f37162c.equals(kVar.d()) && this.f37163d.equals(kVar.g()) && ((size = this.f37164e) != null ? size.equals(kVar.f()) : kVar.f() == null) && ((t3Var = this.f37165f) != null ? t3Var.equals(kVar.e()) : kVar.e() == null) && ((list = this.f37166g) != null ? list.equals(kVar.c()) : kVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // z.u0.k
    public Size f() {
        return this.f37164e;
    }

    @Override // z.u0.k
    public n0.i4<?> g() {
        return this.f37163d;
    }

    @Override // z.u0.k
    public String h() {
        return this.f37161a;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f37161a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f37162c.hashCode()) * 1000003) ^ this.f37163d.hashCode()) * 1000003;
        Size size = this.f37164e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        n0.t3 t3Var = this.f37165f;
        int iHashCode3 = (iHashCode2 ^ (t3Var == null ? 0 : t3Var.hashCode())) * 1000003;
        List<n0.j4.b> list = this.f37166g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // z.u0.k
    public Class<?> i() {
        return this.b;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f37161a + ", useCaseType=" + this.b + ", sessionConfig=" + this.f37162c + ", useCaseConfig=" + this.f37163d + ", surfaceResolution=" + this.f37164e + ", streamSpec=" + this.f37165f + ", captureTypes=" + this.f37166g + "}";
    }
}
