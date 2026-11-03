package m0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends u0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0.u<u0.b> f24244a;
    public final x0.u<u0.b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Integer> f24246d;

    public g(x0.u<u0.b> uVar, x0.u<u0.b> uVar2, int i10, List<Integer> list) {
        if (uVar == null) {
            throw new NullPointerException("Null edge");
        }
        this.f24244a = uVar;
        if (uVar2 == null) {
            throw new NullPointerException("Null postviewEdge");
        }
        this.b = uVar2;
        this.f24245c = i10;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f24246d = list;
    }

    @Override // m0.u0.a
    public x0.u<u0.b> a() {
        return this.f24244a;
    }

    @Override // m0.u0.a
    public int b() {
        return this.f24245c;
    }

    @Override // m0.u0.a
    public List<Integer> c() {
        return this.f24246d;
    }

    @Override // m0.u0.a
    public x0.u<u0.b> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u0.a) {
            u0.a aVar = (u0.a) obj;
            if (this.f24244a.equals(aVar.a()) && this.b.equals(aVar.d()) && this.f24245c == aVar.b() && this.f24246d.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f24244a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f24245c) * 1000003) ^ this.f24246d.hashCode();
    }

    public String toString() {
        return "In{edge=" + this.f24244a + ", postviewEdge=" + this.b + ", inputFormat=" + this.f24245c + ", outputFormats=" + this.f24246d + "}";
    }
}
