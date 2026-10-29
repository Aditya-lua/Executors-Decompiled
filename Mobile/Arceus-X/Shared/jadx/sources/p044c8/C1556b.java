package p044c8;

/* JADX INFO: renamed from: c8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1556b extends AbstractC1561g {

    /* JADX INFO: renamed from: a */
    public final AbstractC1561g.a f6252a;

    /* JADX INFO: renamed from: b */
    public final long f6253b;

    public C1556b(AbstractC1561g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f6252a = aVar;
        this.f6253b = j10;
    }

    @Override // p044c8.AbstractC1561g
    /* JADX INFO: renamed from: b */
    public long mo8153b() {
        return this.f6253b;
    }

    @Override // p044c8.AbstractC1561g
    /* JADX INFO: renamed from: c */
    public AbstractC1561g.a mo8154c() {
        return this.f6252a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1561g) {
            AbstractC1561g abstractC1561g = (AbstractC1561g) obj;
            if (this.f6252a.equals(abstractC1561g.mo8154c()) && this.f6253b == abstractC1561g.mo8153b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f6252a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f6253b;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f6252a + ", nextRequestWaitMillis=" + this.f6253b + "}";
    }
}
