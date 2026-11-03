package ff;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17200a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17201c;

    public a(long j10, long j11, long j12) {
        this.f17200a = j10;
        this.b = j11;
        this.f17201c = j12;
    }

    @Override // ff.l
    public long b() {
        return this.b;
    }

    @Override // ff.l
    public long c() {
        return this.f17200a;
    }

    @Override // ff.l
    public long d() {
        return this.f17201c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f17200a == lVar.c() && this.b == lVar.b() && this.f17201c == lVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f17200a;
        long j11 = this.b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f17201c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f17200a + ", elapsedRealtime=" + this.b + ", uptimeMillis=" + this.f17201c + "}";
    }
}
