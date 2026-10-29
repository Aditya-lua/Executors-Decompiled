package p115f1;

/* JADX INFO: renamed from: f1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C5270l extends AbstractC5254f1 {

    /* JADX INFO: renamed from: a */
    public final long f20393a;

    /* JADX INFO: renamed from: b */
    public final long f20394b;

    /* JADX INFO: renamed from: c */
    public final AbstractC5238b f20395c;

    public C5270l(long j10, long j11, AbstractC5238b abstractC5238b) {
        this.f20393a = j10;
        this.f20394b = j11;
        if (abstractC5238b == null) {
            throw new NullPointerException("Null audioStats");
        }
        this.f20395c = abstractC5238b;
    }

    @Override // p115f1.AbstractC5254f1
    /* JADX INFO: renamed from: a */
    public AbstractC5238b mo24301a() {
        return this.f20395c;
    }

    @Override // p115f1.AbstractC5254f1
    /* JADX INFO: renamed from: b */
    public long mo24302b() {
        return this.f20394b;
    }

    @Override // p115f1.AbstractC5254f1
    /* JADX INFO: renamed from: c */
    public long mo24303c() {
        return this.f20393a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5254f1) {
            AbstractC5254f1 abstractC5254f1 = (AbstractC5254f1) obj;
            if (this.f20393a == abstractC5254f1.mo24303c() && this.f20394b == abstractC5254f1.mo24302b() && this.f20395c.equals(abstractC5254f1.mo24301a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f20393a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f20394b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f20395c.hashCode();
    }

    public String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f20393a + ", numBytesRecorded=" + this.f20394b + ", audioStats=" + this.f20395c + "}";
    }
}
