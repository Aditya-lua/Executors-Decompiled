package be;

/* JADX INFO: renamed from: be.k1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1337k1 extends AbstractC1340l1 {

    /* JADX INFO: renamed from: a */
    public final int f5377a;

    /* JADX INFO: renamed from: b */
    public final long f5378b;

    public C1337k1(int i10, long j10) {
        this.f5377a = i10;
        this.f5378b = j10;
    }

    @Override // be.AbstractC1340l1
    /* JADX INFO: renamed from: a */
    public final int mo7178a() {
        return this.f5377a;
    }

    @Override // be.AbstractC1340l1
    /* JADX INFO: renamed from: b */
    public final long mo7179b() {
        return this.f5378b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1340l1) {
            AbstractC1340l1 abstractC1340l1 = (AbstractC1340l1) obj;
            if (this.f5377a == abstractC1340l1.mo7178a() && this.f5378b == abstractC1340l1.mo7179b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f5377a ^ 1000003;
        long j10 = this.f5378b;
        return (i10 * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f5377a + ", eventTimestamp=" + this.f5378b + "}";
    }
}
