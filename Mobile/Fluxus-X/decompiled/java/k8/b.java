package k8;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21163a;
    public final c8.o b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c8.i f21164c;

    public b(long j10, c8.o oVar, c8.i iVar) {
        this.f21163a = j10;
        if (oVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = oVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f21164c = iVar;
    }

    @Override // k8.k
    public c8.i b() {
        return this.f21164c;
    }

    @Override // k8.k
    public long c() {
        return this.f21163a;
    }

    @Override // k8.k
    public c8.o d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f21163a == kVar.c() && this.b.equals(kVar.d()) && this.f21164c.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f21163a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f21164c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f21163a + ", transportContext=" + this.b + ", event=" + this.f21164c + "}";
    }
}
