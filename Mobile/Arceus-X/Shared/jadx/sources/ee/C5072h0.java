package ee;

/* JADX INFO: renamed from: ee.h0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5072h0 extends AbstractC5074i0 {

    /* JADX INFO: renamed from: a */
    public final int f19898a;

    /* JADX INFO: renamed from: b */
    public final long f19899b;

    public C5072h0(int i10, long j10) {
        this.f19898a = i10;
        this.f19899b = j10;
    }

    @Override // ee.AbstractC5074i0
    /* JADX INFO: renamed from: a */
    public final int mo23804a() {
        return this.f19898a;
    }

    @Override // ee.AbstractC5074i0
    /* JADX INFO: renamed from: b */
    public final long mo23805b() {
        return this.f19899b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5074i0) {
            AbstractC5074i0 abstractC5074i0 = (AbstractC5074i0) obj;
            if (this.f19898a == abstractC5074i0.mo23804a() && this.f19899b == abstractC5074i0.mo23805b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f19899b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ ((this.f19898a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f19898a + ", eventTimestamp=" + this.f19899b + "}";
    }
}
