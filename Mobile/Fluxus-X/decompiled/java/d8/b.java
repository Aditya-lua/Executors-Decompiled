package d8;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a f11963a;
    public final long b;

    public b(g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f11963a = aVar;
        this.b = j10;
    }

    @Override // d8.g
    public long b() {
        return this.b;
    }

    @Override // d8.g
    public g.a c() {
        return this.f11963a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f11963a.equals(gVar.c()) && this.b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f11963a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.b;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f11963a + ", nextRequestWaitMillis=" + this.b + "}";
    }
}
