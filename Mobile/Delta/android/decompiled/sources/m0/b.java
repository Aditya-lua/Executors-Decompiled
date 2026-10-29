package m0;

import android.util.Size;
import g0.m1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends x.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Size f23565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<Integer> f23567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f23568i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m1 f23569j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k0 f23570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x0.u<v0> f23571l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x0.u<b1.a> f23572m;

    public b(Size size, int i10, List<Integer> list, boolean z10, m1 m1Var, k0 k0Var, x0.u<v0> uVar, x0.u<b1.a> uVar2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f23565f = size;
        this.f23566g = i10;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f23567h = list;
        this.f23568i = z10;
        this.f23569j = m1Var;
        this.f23570k = k0Var;
        if (uVar == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f23571l = uVar;
        if (uVar2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.f23572m = uVar2;
    }

    @Override // m0.x.c
    public x0.u<b1.a> b() {
        return this.f23572m;
    }

    @Override // m0.x.c
    public m1 c() {
        return this.f23569j;
    }

    @Override // m0.x.c
    public int d() {
        return this.f23566g;
    }

    @Override // m0.x.c
    public List<Integer> e() {
        return this.f23567h;
    }

    public boolean equals(Object obj) {
        m1 m1Var;
        k0 k0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x.c) {
            x.c cVar = (x.c) obj;
            if (this.f23565f.equals(cVar.k()) && this.f23566g == cVar.d() && this.f23567h.equals(cVar.e()) && this.f23568i == cVar.m() && ((m1Var = this.f23569j) != null ? m1Var.equals(cVar.c()) : cVar.c() == null) && ((k0Var = this.f23570k) != null ? k0Var.equals(cVar.f()) : cVar.f() == null) && this.f23571l.equals(cVar.h()) && this.f23572m.equals(cVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // m0.x.c
    public k0 f() {
        return this.f23570k;
    }

    @Override // m0.x.c
    public x0.u<v0> h() {
        return this.f23571l;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f23565f.hashCode() ^ 1000003) * 1000003) ^ this.f23566g) * 1000003) ^ this.f23567h.hashCode()) * 1000003) ^ (this.f23568i ? 1231 : 1237)) * 1000003;
        m1 m1Var = this.f23569j;
        int iHashCode2 = (iHashCode ^ (m1Var == null ? 0 : m1Var.hashCode())) * 1000003;
        k0 k0Var = this.f23570k;
        return ((((iHashCode2 ^ (k0Var != null ? k0Var.hashCode() : 0)) * 1000003) ^ this.f23571l.hashCode()) * 1000003) ^ this.f23572m.hashCode();
    }

    @Override // m0.x.c
    public Size k() {
        return this.f23565f;
    }

    @Override // m0.x.c
    public boolean m() {
        return this.f23568i;
    }

    public String toString() {
        return "In{size=" + this.f23565f + ", inputFormat=" + this.f23566g + ", outputFormats=" + this.f23567h + ", virtualCamera=" + this.f23568i + ", imageReaderProxyProvider=" + this.f23569j + ", postviewSettings=" + this.f23570k + ", requestEdge=" + this.f23571l + ", errorEdge=" + this.f23572m + "}";
    }
}
