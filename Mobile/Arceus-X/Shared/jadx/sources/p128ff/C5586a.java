package p128ff;

/* JADX INFO: renamed from: ff.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5586a extends AbstractC5597l {

    /* JADX INFO: renamed from: a */
    public final long f21390a;

    /* JADX INFO: renamed from: b */
    public final long f21391b;

    /* JADX INFO: renamed from: c */
    public final long f21392c;

    public C5586a(long j10, long j11, long j12) {
        this.f21390a = j10;
        this.f21391b = j11;
        this.f21392c = j12;
    }

    @Override // p128ff.AbstractC5597l
    /* JADX INFO: renamed from: b */
    public long mo25249b() {
        return this.f21391b;
    }

    @Override // p128ff.AbstractC5597l
    /* JADX INFO: renamed from: c */
    public long mo25250c() {
        return this.f21390a;
    }

    @Override // p128ff.AbstractC5597l
    /* JADX INFO: renamed from: d */
    public long mo25251d() {
        return this.f21392c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5597l) {
            AbstractC5597l abstractC5597l = (AbstractC5597l) obj;
            if (this.f21390a == abstractC5597l.mo25250c() && this.f21391b == abstractC5597l.mo25249b() && this.f21392c == abstractC5597l.mo25251d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f21390a;
        long j11 = this.f21391b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f21392c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f21390a + ", elapsedRealtime=" + this.f21391b + ", uptimeMillis=" + this.f21392c + "}";
    }
}
