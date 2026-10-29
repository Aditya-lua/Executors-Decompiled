package f1;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f15829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f15831e;

    public d(int i10, double d10, long j10, Throwable th2) {
        this.b = i10;
        this.f15829c = d10;
        this.f15830d = j10;
        this.f15831e = th2;
    }

    @Override // f1.b
    public double a() {
        return this.f15829c;
    }

    @Override // f1.b
    public long b() {
        return this.f15830d;
    }

    @Override // f1.b
    public int c() {
        return this.b;
    }

    @Override // f1.b
    public Throwable d() {
        return this.f15831e;
    }

    public boolean equals(Object obj) {
        Throwable th2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.b == bVar.c() && Double.doubleToLongBits(this.f15829c) == Double.doubleToLongBits(bVar.a()) && this.f15830d == bVar.b() && ((th2 = this.f15831e) != null ? th2.equals(bVar.d()) : bVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iDoubleToLongBits = (((this.b ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f15829c) >>> 32) ^ Double.doubleToLongBits(this.f15829c)))) * 1000003;
        long j10 = this.f15830d;
        int i10 = (iDoubleToLongBits ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Throwable th2 = this.f15831e;
        return i10 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "AudioStats{audioState=" + this.b + ", audioAmplitudeInternal=" + this.f15829c + ", audioBytesRecorded=" + this.f15830d + ", errorCause=" + this.f15831e + "}";
    }
}
