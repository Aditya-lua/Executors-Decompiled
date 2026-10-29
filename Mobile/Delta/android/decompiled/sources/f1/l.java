package f1;

/* JADX INFO: loaded from: classes.dex */
public final class l extends f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15881a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f15882c;

    public l(long j10, long j11, b bVar) {
        this.f15881a = j10;
        this.b = j11;
        if (bVar == null) {
            throw new NullPointerException("Null audioStats");
        }
        this.f15882c = bVar;
    }

    @Override // f1.f1
    public b a() {
        return this.f15882c;
    }

    @Override // f1.f1
    public long b() {
        return this.b;
    }

    @Override // f1.f1
    public long c() {
        return this.f15881a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (this.f15881a == f1Var.c() && this.b == f1Var.b() && this.f15882c.equals(f1Var.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f15881a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f15882c.hashCode();
    }

    public String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f15881a + ", numBytesRecorded=" + this.b + ", audioStats=" + this.f15882c + "}";
    }
}
