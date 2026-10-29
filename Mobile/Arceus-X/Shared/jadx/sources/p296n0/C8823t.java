package p296n0;

import android.util.Size;
import java.util.Map;

/* JADX INFO: renamed from: n0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C8823t extends AbstractC8847x3 {

    /* JADX INFO: renamed from: a */
    public final Size f32090a;

    /* JADX INFO: renamed from: b */
    public final Map<Integer, Size> f32091b;

    /* JADX INFO: renamed from: c */
    public final Size f32092c;

    /* JADX INFO: renamed from: d */
    public final Map<Integer, Size> f32093d;

    /* JADX INFO: renamed from: e */
    public final Size f32094e;

    /* JADX INFO: renamed from: f */
    public final Map<Integer, Size> f32095f;

    /* JADX INFO: renamed from: g */
    public final Map<Integer, Size> f32096g;

    /* JADX INFO: renamed from: h */
    public final Map<Integer, Size> f32097h;

    /* JADX INFO: renamed from: i */
    public final Map<Integer, Size> f32098i;

    public C8823t(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4, Map<Integer, Size> map5, Map<Integer, Size> map6) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f32090a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.f32091b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f32092c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f32093d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f32094e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f32095f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null maximum4x3SizeMap");
        }
        this.f32096g = map4;
        if (map5 == null) {
            throw new NullPointerException("Null maximum16x9SizeMap");
        }
        this.f32097h = map5;
        if (map6 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f32098i = map6;
    }

    @Override // p296n0.AbstractC8847x3
    /* JADX INFO: renamed from: b */
    public Size mo35415b() {
        return this.f32090a;
    }

    @Override // p296n0.AbstractC8847x3
    /* JADX INFO: renamed from: d */
    public Map<Integer, Size> mo35416d() {
        return this.f32097h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8847x3) {
            AbstractC8847x3 abstractC8847x3 = (AbstractC8847x3) obj;
            if (this.f32090a.equals(abstractC8847x3.mo35415b()) && this.f32091b.equals(abstractC8847x3.mo35422n()) && this.f32092c.equals(abstractC8847x3.mo35419i()) && this.f32093d.equals(abstractC8847x3.mo35421l()) && this.f32094e.equals(abstractC8847x3.mo35420j()) && this.f32095f.equals(abstractC8847x3.mo35418h()) && this.f32096g.equals(abstractC8847x3.mo35417f()) && this.f32097h.equals(abstractC8847x3.mo35416d()) && this.f32098i.equals(abstractC8847x3.mo35423p())) {
                return true;
            }
        }
        return false;
    }

    @Override // p296n0.AbstractC8847x3
    /* JADX INFO: renamed from: f */
    public Map<Integer, Size> mo35417f() {
        return this.f32096g;
    }

    @Override // p296n0.AbstractC8847x3
    /* JADX INFO: renamed from: h */
    public Map<Integer, Size> mo35418h() {
        return this.f32095f;
    }

    public int hashCode() {
        return ((((((((((((((((this.f32090a.hashCode() ^ 1000003) * 1000003) ^ this.f32091b.hashCode()) * 1000003) ^ this.f32092c.hashCode()) * 1000003) ^ this.f32093d.hashCode()) * 1000003) ^ this.f32094e.hashCode()) * 1000003) ^ this.f32095f.hashCode()) * 1000003) ^ this.f32096g.hashCode()) * 1000003) ^ this.f32097h.hashCode()) * 1000003) ^ this.f32098i.hashCode();
    }

    @Override // p296n0.AbstractC8847x3
    /* JADX INFO: renamed from: i */
    public Size mo35419i() {
        return this.f32092c;
    }

    @Override // p296n0.AbstractC8847x3
    /* JADX INFO: renamed from: j */
    public Size mo35420j() {
        return this.f32094e;
    }

    @Override // p296n0.AbstractC8847x3
    /* JADX INFO: renamed from: l */
    public Map<Integer, Size> mo35421l() {
        return this.f32093d;
    }

    @Override // p296n0.AbstractC8847x3
    /* JADX INFO: renamed from: n */
    public Map<Integer, Size> mo35422n() {
        return this.f32091b;
    }

    @Override // p296n0.AbstractC8847x3
    /* JADX INFO: renamed from: p */
    public Map<Integer, Size> mo35423p() {
        return this.f32098i;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f32090a + ", s720pSizeMap=" + this.f32091b + ", previewSize=" + this.f32092c + ", s1440pSizeMap=" + this.f32093d + ", recordSize=" + this.f32094e + ", maximumSizeMap=" + this.f32095f + ", maximum4x3SizeMap=" + this.f32096g + ", maximum16x9SizeMap=" + this.f32097h + ", ultraMaximumSizeMap=" + this.f32098i + "}";
    }
}
