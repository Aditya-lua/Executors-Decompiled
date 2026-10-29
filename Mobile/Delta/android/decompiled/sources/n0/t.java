package n0;

import android.util.Size;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t extends x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f24850a;
    public final Map<Integer, Size> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f24851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Integer, Size> f24852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f24853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<Integer, Size> f24854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<Integer, Size> f24855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<Integer, Size> f24856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<Integer, Size> f24857i;

    public t(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4, Map<Integer, Size> map5, Map<Integer, Size> map6) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f24850a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f24851c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f24852d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f24853e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f24854f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null maximum4x3SizeMap");
        }
        this.f24855g = map4;
        if (map5 == null) {
            throw new NullPointerException("Null maximum16x9SizeMap");
        }
        this.f24856h = map5;
        if (map6 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f24857i = map6;
    }

    @Override // n0.x3
    public Size b() {
        return this.f24850a;
    }

    @Override // n0.x3
    public Map<Integer, Size> d() {
        return this.f24856h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x3) {
            x3 x3Var = (x3) obj;
            if (this.f24850a.equals(x3Var.b()) && this.b.equals(x3Var.n()) && this.f24851c.equals(x3Var.i()) && this.f24852d.equals(x3Var.l()) && this.f24853e.equals(x3Var.j()) && this.f24854f.equals(x3Var.h()) && this.f24855g.equals(x3Var.f()) && this.f24856h.equals(x3Var.d()) && this.f24857i.equals(x3Var.p())) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.x3
    public Map<Integer, Size> f() {
        return this.f24855g;
    }

    @Override // n0.x3
    public Map<Integer, Size> h() {
        return this.f24854f;
    }

    public int hashCode() {
        return ((((((((((((((((this.f24850a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f24851c.hashCode()) * 1000003) ^ this.f24852d.hashCode()) * 1000003) ^ this.f24853e.hashCode()) * 1000003) ^ this.f24854f.hashCode()) * 1000003) ^ this.f24855g.hashCode()) * 1000003) ^ this.f24856h.hashCode()) * 1000003) ^ this.f24857i.hashCode();
    }

    @Override // n0.x3
    public Size i() {
        return this.f24851c;
    }

    @Override // n0.x3
    public Size j() {
        return this.f24853e;
    }

    @Override // n0.x3
    public Map<Integer, Size> l() {
        return this.f24852d;
    }

    @Override // n0.x3
    public Map<Integer, Size> n() {
        return this.b;
    }

    @Override // n0.x3
    public Map<Integer, Size> p() {
        return this.f24857i;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f24850a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.f24851c + ", s1440pSizeMap=" + this.f24852d + ", recordSize=" + this.f24853e + ", maximumSizeMap=" + this.f24854f + ", maximum4x3SizeMap=" + this.f24855g + ", maximum16x9SizeMap=" + this.f24856h + ", ultraMaximumSizeMap=" + this.f24857i + "}";
    }
}
