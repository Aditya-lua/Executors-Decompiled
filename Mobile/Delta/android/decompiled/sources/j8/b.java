package j8;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21115a;
    public final b8.o b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b8.i f21116c;

    public b(long j10, b8.o oVar, b8.i iVar) {
        this.f21115a = j10;
        if (oVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = oVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f21116c = iVar;
    }

    @Override // j8.k
    public b8.i b() {
        return this.f21116c;
    }

    @Override // j8.k
    public long c() {
        return this.f21115a;
    }

    @Override // j8.k
    public b8.o d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f21115a == kVar.c() && this.b.equals(kVar.d()) && this.f21116c.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f21115a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f21116c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f21115a + ", transportContext=" + this.b + ", event=" + this.f21116c + "}";
    }
}
