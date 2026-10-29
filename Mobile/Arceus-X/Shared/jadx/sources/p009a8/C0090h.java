package p009a8;

/* JADX INFO: renamed from: a8.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0090h extends AbstractC0096n {

    /* JADX INFO: renamed from: a */
    public final long f259a;

    public C0090h(long j10) {
        this.f259a = j10;
    }

    @Override // p009a8.AbstractC0096n
    /* JADX INFO: renamed from: c */
    public long mo275c() {
        return this.f259a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC0096n) && this.f259a == ((AbstractC0096n) obj).mo275c();
    }

    public int hashCode() {
        long j10 = this.f259a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f259a + "}";
    }
}
