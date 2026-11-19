package m0;

import android.util.Size;
import g0.m1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends x.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Size f22575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<Integer> f22577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f22578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m1 f22579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k0 f22580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x0.u<v0> f22581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x0.u<b1.a> f22582m;

    public b(Size size, int i10, List<Integer> list, boolean z10, m1 m1Var, k0 k0Var, x0.u<v0> uVar, x0.u<b1.a> uVar2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f22575f = size;
        this.f22576g = i10;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f22577h = list;
        this.f22578i = z10;
        this.f22579j = m1Var;
        this.f22580k = k0Var;
        if (uVar == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f22581l = uVar;
        if (uVar2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.f22582m = uVar2;
    }

    @Override // m0.x.c
    public x0.u<b1.a> b() {
        return this.f22582m;
    }

    @Override // m0.x.c
    public m1 c() {
        return this.f22579j;
    }

    @Override // m0.x.c
    public int d() {
        return this.f22576g;
    }

    @Override // m0.x.c
    public List<Integer> e() {
        return this.f22577h;
    }

    public boolean equals(Object obj) {
        m1 m1Var;
        k0 k0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x.c) {
            x.c cVar = (x.c) obj;
            if (this.f22575f.equals(cVar.k()) && this.f22576g == cVar.d() && this.f22577h.equals(cVar.e()) && this.f22578i == cVar.m() && ((m1Var = this.f22579j) != null ? m1Var.equals(cVar.c()) : cVar.c() == null) && ((k0Var = this.f22580k) != null ? k0Var.equals(cVar.f()) : cVar.f() == null) && this.f22581l.equals(cVar.h()) && this.f22582m.equals(cVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // m0.x.c
    public k0 f() {
        return this.f22580k;
    }

    @Override // m0.x.c
    public x0.u<v0> h() {
        return this.f22581l;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f22575f.hashCode() ^ 1000003) * 1000003) ^ this.f22576g) * 1000003) ^ this.f22577h.hashCode()) * 1000003) ^ (this.f22578i ? 1231 : 1237)) * 1000003;
        m1 m1Var = this.f22579j;
        int iHashCode2 = (iHashCode ^ (m1Var == null ? 0 : m1Var.hashCode())) * 1000003;
        k0 k0Var = this.f22580k;
        return ((((iHashCode2 ^ (k0Var != null ? k0Var.hashCode() : 0)) * 1000003) ^ this.f22581l.hashCode()) * 1000003) ^ this.f22582m.hashCode();
    }

    @Override // m0.x.c
    public Size k() {
        return this.f22575f;
    }

    @Override // m0.x.c
    public boolean m() {
        return this.f22578i;
    }

    public String toString() {
        return "In{size=" + this.f22575f + ", inputFormat=" + this.f22576g + ", outputFormats=" + this.f22577h + ", virtualCamera=" + this.f22578i + ", imageReaderProxyProvider=" + this.f22579j + ", postviewSettings=" + this.f22580k + ", requestEdge=" + this.f22581l + ", errorEdge=" + this.f22582m + "}";
    }
}
