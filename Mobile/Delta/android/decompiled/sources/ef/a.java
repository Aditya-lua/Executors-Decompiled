package ef;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15446a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15447c;

    public a(long j10, long j11, long j12) {
        this.f15446a = j10;
        this.b = j11;
        this.f15447c = j12;
    }

    @Override // ef.l
    public long b() {
        return this.b;
    }

    @Override // ef.l
    public long c() {
        return this.f15446a;
    }

    @Override // ef.l
    public long d() {
        return this.f15447c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f15446a == lVar.c() && this.b == lVar.b() && this.f15447c == lVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f15446a;
        long j11 = this.b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f15447c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f15446a + ", elapsedRealtime=" + this.b + ", uptimeMillis=" + this.f15447c + "}";
    }
}
