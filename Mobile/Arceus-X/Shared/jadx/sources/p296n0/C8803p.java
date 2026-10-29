package p296n0;

/* JADX INFO: renamed from: n0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C8803p extends AbstractC8746e3 {

    /* JADX INFO: renamed from: a */
    public final AbstractC8740d3 f32017a;

    /* JADX INFO: renamed from: b */
    public final AbstractC8740d3 f32018b;

    /* JADX INFO: renamed from: c */
    public final AbstractC8740d3 f32019c;

    /* JADX INFO: renamed from: d */
    public final AbstractC8740d3 f32020d;

    public C8803p(AbstractC8740d3 abstractC8740d3, AbstractC8740d3 abstractC8740d4, AbstractC8740d3 abstractC8740d5, AbstractC8740d3 abstractC8740d6) {
        if (abstractC8740d3 == null) {
            throw new NullPointerException("Null previewOutputSurface");
        }
        this.f32017a = abstractC8740d3;
        if (abstractC8740d4 == null) {
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        this.f32018b = abstractC8740d4;
        this.f32019c = abstractC8740d5;
        this.f32020d = abstractC8740d6;
    }

    @Override // p296n0.AbstractC8746e3
    /* JADX INFO: renamed from: b */
    public AbstractC8740d3 mo35078b() {
        return this.f32019c;
    }

    @Override // p296n0.AbstractC8746e3
    /* JADX INFO: renamed from: c */
    public AbstractC8740d3 mo35079c() {
        return this.f32018b;
    }

    @Override // p296n0.AbstractC8746e3
    /* JADX INFO: renamed from: d */
    public AbstractC8740d3 mo35080d() {
        return this.f32020d;
    }

    @Override // p296n0.AbstractC8746e3
    /* JADX INFO: renamed from: e */
    public AbstractC8740d3 mo35081e() {
        return this.f32017a;
    }

    public boolean equals(Object obj) {
        AbstractC8740d3 abstractC8740d3;
        AbstractC8740d3 abstractC8740d4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8746e3) {
            AbstractC8746e3 abstractC8746e3 = (AbstractC8746e3) obj;
            if (this.f32017a.equals(abstractC8746e3.mo35081e()) && this.f32018b.equals(abstractC8746e3.mo35079c()) && ((abstractC8740d3 = this.f32019c) != null ? abstractC8740d3.equals(abstractC8746e3.mo35078b()) : abstractC8746e3.mo35078b() == null) && ((abstractC8740d4 = this.f32020d) != null ? abstractC8740d4.equals(abstractC8746e3.mo35080d()) : abstractC8746e3.mo35080d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f32017a.hashCode() ^ 1000003) * 1000003) ^ this.f32018b.hashCode()) * 1000003;
        AbstractC8740d3 abstractC8740d3 = this.f32019c;
        int iHashCode2 = (iHashCode ^ (abstractC8740d3 == null ? 0 : abstractC8740d3.hashCode())) * 1000003;
        AbstractC8740d3 abstractC8740d4 = this.f32020d;
        return iHashCode2 ^ (abstractC8740d4 != null ? abstractC8740d4.hashCode() : 0);
    }

    public String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.f32017a + ", imageCaptureOutputSurface=" + this.f32018b + ", imageAnalysisOutputSurface=" + this.f32019c + ", postviewOutputSurface=" + this.f32020d + "}";
    }
}
