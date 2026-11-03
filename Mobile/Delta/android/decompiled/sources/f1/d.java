package f1;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f16425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f16427e;

    public d(int i10, double d10, long j10, Throwable th2) {
        this.b = i10;
        this.f16425c = d10;
        this.f16426d = j10;
        this.f16427e = th2;
    }

    @Override // f1.b
    public double a() {
        return this.f16425c;
    }

    @Override // f1.b
    public long b() {
        return this.f16426d;
    }

    @Override // f1.b
    public int c() {
        return this.b;
    }

    @Override // f1.b
    public Throwable d() {
        return this.f16427e;
    }

    public boolean equals(Object obj) {
        Throwable th2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.b == bVar.c() && Double.doubleToLongBits(this.f16425c) == Double.doubleToLongBits(bVar.a()) && this.f16426d == bVar.b() && ((th2 = this.f16427e) != null ? th2.equals(bVar.d()) : bVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iDoubleToLongBits = (((this.b ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f16425c) >>> 32) ^ Double.doubleToLongBits(this.f16425c)))) * 1000003;
        long j10 = this.f16426d;
        int i10 = (iDoubleToLongBits ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Throwable th2 = this.f16427e;
        return i10 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "AudioStats{audioState=" + this.b + ", audioAmplitudeInternal=" + this.f16425c + ", audioBytesRecorded=" + this.f16426d + ", errorCause=" + this.f16427e + "}";
    }
}
