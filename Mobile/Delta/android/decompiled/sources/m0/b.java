package m0;

import android.util.Size;
import g0.m1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends x.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Size f24215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<Integer> f24217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f24218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m1 f24219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k0 f24220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x0.u<v0> f24221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x0.u<b1.a> f24222m;

    public b(Size size, int i10, List<Integer> list, boolean z10, m1 m1Var, k0 k0Var, x0.u<v0> uVar, x0.u<b1.a> uVar2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f24215f = size;
        this.f24216g = i10;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f24217h = list;
        this.f24218i = z10;
        this.f24219j = m1Var;
        this.f24220k = k0Var;
        if (uVar == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f24221l = uVar;
        if (uVar2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.f24222m = uVar2;
    }

    @Override // m0.x.c
    public x0.u<b1.a> b() {
        return this.f24222m;
    }

    @Override // m0.x.c
    public m1 c() {
        return this.f24219j;
    }

    @Override // m0.x.c
    public int d() {
        return this.f24216g;
    }

    @Override // m0.x.c
    public List<Integer> e() {
        return this.f24217h;
    }

    public boolean equals(Object obj) {
        m1 m1Var;
        k0 k0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x.c) {
            x.c cVar = (x.c) obj;
            if (this.f24215f.equals(cVar.k()) && this.f24216g == cVar.d() && this.f24217h.equals(cVar.e()) && this.f24218i == cVar.m() && ((m1Var = this.f24219j) != null ? m1Var.equals(cVar.c()) : cVar.c() == null) && ((k0Var = this.f24220k) != null ? k0Var.equals(cVar.f()) : cVar.f() == null) && this.f24221l.equals(cVar.h()) && this.f24222m.equals(cVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // m0.x.c
    public k0 f() {
        return this.f24220k;
    }

    @Override // m0.x.c
    public x0.u<v0> h() {
        return this.f24221l;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f24215f.hashCode() ^ 1000003) * 1000003) ^ this.f24216g) * 1000003) ^ this.f24217h.hashCode()) * 1000003) ^ (this.f24218i ? 1231 : 1237)) * 1000003;
        m1 m1Var = this.f24219j;
        int iHashCode2 = (iHashCode ^ (m1Var == null ? 0 : m1Var.hashCode())) * 1000003;
        k0 k0Var = this.f24220k;
        return ((((iHashCode2 ^ (k0Var != null ? k0Var.hashCode() : 0)) * 1000003) ^ this.f24221l.hashCode()) * 1000003) ^ this.f24222m.hashCode();
    }

    @Override // m0.x.c
    public Size k() {
        return this.f24215f;
    }

    @Override // m0.x.c
    public boolean m() {
        return this.f24218i;
    }

    public String toString() {
        return "In{size=" + this.f24215f + ", inputFormat=" + this.f24216g + ", outputFormats=" + this.f24217h + ", virtualCamera=" + this.f24218i + ", imageReaderProxyProvider=" + this.f24219j + ", postviewSettings=" + this.f24220k + ", requestEdge=" + this.f24221l + ", errorEdge=" + this.f24222m + "}";
    }
}
