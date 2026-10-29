package p347p0;

/* JADX INFO: renamed from: p0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C10098n {

    /* JADX INFO: renamed from: a */
    public final long f36382a;

    /* JADX INFO: renamed from: b */
    public final long f36383b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10098n(long j10, long j11) {
        this.f36382a = j10;
        this.f36383b = j11;
    }

    /* JADX INFO: renamed from: a */
    public long m38988a() {
        return this.f36383b;
    }

    /* JADX INFO: renamed from: b */
    public long m38989b() {
        return this.f36382a;
    }

    public String toString() {
        return this.f36382a + "/" + this.f36383b;
    }

    public C10098n(double d10) {
        this((long) (d10 * 10000.0d), 10000L);
    }
}
