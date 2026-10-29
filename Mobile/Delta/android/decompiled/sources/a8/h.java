package a8;

/* JADX INFO: loaded from: classes.dex */
public final class h extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f201a;

    public h(long j10) {
        this.f201a = j10;
    }

    @Override // a8.n
    public long c() {
        return this.f201a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f201a == ((n) obj).c();
    }

    public int hashCode() {
        long j10 = this.f201a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f201a + "}";
    }
}
