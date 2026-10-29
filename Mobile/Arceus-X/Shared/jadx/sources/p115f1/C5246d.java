package p115f1;

/* JADX INFO: renamed from: f1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5246d extends AbstractC5238b {

    /* JADX INFO: renamed from: b */
    public final int f20324b;

    /* JADX INFO: renamed from: c */
    public final double f20325c;

    /* JADX INFO: renamed from: d */
    public final long f20326d;

    /* JADX INFO: renamed from: e */
    public final Throwable f20327e;

    public C5246d(int i10, double d10, long j10, Throwable th2) {
        this.f20324b = i10;
        this.f20325c = d10;
        this.f20326d = j10;
        this.f20327e = th2;
    }

    @Override // p115f1.AbstractC5238b
    /* JADX INFO: renamed from: a */
    public double mo24246a() {
        return this.f20325c;
    }

    @Override // p115f1.AbstractC5238b
    /* JADX INFO: renamed from: b */
    public long mo24247b() {
        return this.f20326d;
    }

    @Override // p115f1.AbstractC5238b
    /* JADX INFO: renamed from: c */
    public int mo24248c() {
        return this.f20324b;
    }

    @Override // p115f1.AbstractC5238b
    /* JADX INFO: renamed from: d */
    public Throwable mo24249d() {
        return this.f20327e;
    }

    public boolean equals(Object obj) {
        Throwable th2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5238b) {
            AbstractC5238b abstractC5238b = (AbstractC5238b) obj;
            if (this.f20324b == abstractC5238b.mo24248c() && Double.doubleToLongBits(this.f20325c) == Double.doubleToLongBits(abstractC5238b.mo24246a()) && this.f20326d == abstractC5238b.mo24247b() && ((th2 = this.f20327e) != null ? th2.equals(abstractC5238b.mo24249d()) : abstractC5238b.mo24249d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iDoubleToLongBits = (((this.f20324b ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f20325c) >>> 32) ^ Double.doubleToLongBits(this.f20325c)))) * 1000003;
        long j10 = this.f20326d;
        int i10 = (iDoubleToLongBits ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Throwable th2 = this.f20327e;
        return i10 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "AudioStats{audioState=" + this.f20324b + ", audioAmplitudeInternal=" + this.f20325c + ", audioBytesRecorded=" + this.f20326d + ", errorCause=" + this.f20327e + "}";
    }
}
