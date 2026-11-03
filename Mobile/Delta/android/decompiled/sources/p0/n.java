package p0;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28326a;
    public final long b;

    public n(long j10, long j11) {
        this.f28326a = j10;
        this.b = j11;
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.f28326a;
    }

    public String toString() {
        return this.f28326a + "/" + this.b;
    }

    public n(double d10) {
        this((long) (d10 * 10000.0d), 10000L);
    }
}
