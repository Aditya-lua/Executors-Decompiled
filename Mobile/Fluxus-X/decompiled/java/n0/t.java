package n0;

import android.util.Size;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t extends x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f25148a;
    public final Map<Integer, Size> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f25149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Integer, Size> f25150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f25151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<Integer, Size> f25152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<Integer, Size> f25153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<Integer, Size> f25154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<Integer, Size> f25155i;

    public t(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4, Map<Integer, Size> map5, Map<Integer, Size> map6) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f25148a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f25149c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f25150d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f25151e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f25152f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null maximum4x3SizeMap");
        }
        this.f25153g = map4;
        if (map5 == null) {
            throw new NullPointerException("Null maximum16x9SizeMap");
        }
        this.f25154h = map5;
        if (map6 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f25155i = map6;
    }

    @Override // n0.x3
    public Size b() {
        return this.f25148a;
    }

    @Override // n0.x3
    public Map<Integer, Size> d() {
        return this.f25154h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x3) {
            x3 x3Var = (x3) obj;
            if (this.f25148a.equals(x3Var.b()) && this.b.equals(x3Var.n()) && this.f25149c.equals(x3Var.i()) && this.f25150d.equals(x3Var.l()) && this.f25151e.equals(x3Var.j()) && this.f25152f.equals(x3Var.h()) && this.f25153g.equals(x3Var.f()) && this.f25154h.equals(x3Var.d()) && this.f25155i.equals(x3Var.p())) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.x3
    public Map<Integer, Size> f() {
        return this.f25153g;
    }

    @Override // n0.x3
    public Map<Integer, Size> h() {
        return this.f25152f;
    }

    public int hashCode() {
        return ((((((((((((((((this.f25148a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f25149c.hashCode()) * 1000003) ^ this.f25150d.hashCode()) * 1000003) ^ this.f25151e.hashCode()) * 1000003) ^ this.f25152f.hashCode()) * 1000003) ^ this.f25153g.hashCode()) * 1000003) ^ this.f25154h.hashCode()) * 1000003) ^ this.f25155i.hashCode();
    }

    @Override // n0.x3
    public Size i() {
        return this.f25149c;
    }

    @Override // n0.x3
    public Size j() {
        return this.f25151e;
    }

    @Override // n0.x3
    public Map<Integer, Size> l() {
        return this.f25150d;
    }

    @Override // n0.x3
    public Map<Integer, Size> n() {
        return this.b;
    }

    @Override // n0.x3
    public Map<Integer, Size> p() {
        return this.f25155i;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f25148a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.f25149c + ", s1440pSizeMap=" + this.f25150d + ", recordSize=" + this.f25151e + ", maximumSizeMap=" + this.f25152f + ", maximum4x3SizeMap=" + this.f25153g + ", maximum16x9SizeMap=" + this.f25154h + ", ultraMaximumSizeMap=" + this.f25155i + "}";
    }
}
