package hf;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18186a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18187c;

    public a(long j10, long j11, long j12) {
        this.f18186a = j10;
        this.b = j11;
        this.f18187c = j12;
    }

    @Override // hf.l
    public long b() {
        return this.b;
    }

    @Override // hf.l
    public long c() {
        return this.f18186a;
    }

    @Override // hf.l
    public long d() {
        return this.f18187c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f18186a == lVar.c() && this.b == lVar.b() && this.f18187c == lVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f18186a;
        long j11 = this.b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f18187c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f18186a + ", elapsedRealtime=" + this.b + ", uptimeMillis=" + this.f18187c + "}";
    }
}
