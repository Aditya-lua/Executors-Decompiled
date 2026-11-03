package n0;

import android.util.Size;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t extends x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f25671a;
    public final Map<Integer, Size> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f25672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Integer, Size> f25673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f25674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<Integer, Size> f25675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<Integer, Size> f25676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<Integer, Size> f25677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<Integer, Size> f25678i;

    public t(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4, Map<Integer, Size> map5, Map<Integer, Size> map6) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f25671a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f25672c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f25673d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f25674e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f25675f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null maximum4x3SizeMap");
        }
        this.f25676g = map4;
        if (map5 == null) {
            throw new NullPointerException("Null maximum16x9SizeMap");
        }
        this.f25677h = map5;
        if (map6 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f25678i = map6;
    }

    @Override // n0.x3
    public Size b() {
        return this.f25671a;
    }

    @Override // n0.x3
    public Map<Integer, Size> d() {
        return this.f25677h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x3) {
            x3 x3Var = (x3) obj;
            if (this.f25671a.equals(x3Var.b()) && this.b.equals(x3Var.n()) && this.f25672c.equals(x3Var.i()) && this.f25673d.equals(x3Var.l()) && this.f25674e.equals(x3Var.j()) && this.f25675f.equals(x3Var.h()) && this.f25676g.equals(x3Var.f()) && this.f25677h.equals(x3Var.d()) && this.f25678i.equals(x3Var.p())) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.x3
    public Map<Integer, Size> f() {
        return this.f25676g;
    }

    @Override // n0.x3
    public Map<Integer, Size> h() {
        return this.f25675f;
    }

    public int hashCode() {
        return ((((((((((((((((this.f25671a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f25672c.hashCode()) * 1000003) ^ this.f25673d.hashCode()) * 1000003) ^ this.f25674e.hashCode()) * 1000003) ^ this.f25675f.hashCode()) * 1000003) ^ this.f25676g.hashCode()) * 1000003) ^ this.f25677h.hashCode()) * 1000003) ^ this.f25678i.hashCode();
    }

    @Override // n0.x3
    public Size i() {
        return this.f25672c;
    }

    @Override // n0.x3
    public Size j() {
        return this.f25674e;
    }

    @Override // n0.x3
    public Map<Integer, Size> l() {
        return this.f25673d;
    }

    @Override // n0.x3
    public Map<Integer, Size> n() {
        return this.b;
    }

    @Override // n0.x3
    public Map<Integer, Size> p() {
        return this.f25678i;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f25671a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.f25672c + ", s1440pSizeMap=" + this.f25673d + ", recordSize=" + this.f25674e + ", maximumSizeMap=" + this.f25675f + ", maximum4x3SizeMap=" + this.f25676g + ", maximum16x9SizeMap=" + this.f25677h + ", ultraMaximumSizeMap=" + this.f25678i + "}";
    }
}
