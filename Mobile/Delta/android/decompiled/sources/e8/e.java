package e8;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f15242c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15243a;
    public final long b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f15244a = 0;
        public long b = 0;

        public e a() {
            return new e(this.f15244a, this.b);
        }

        public a b(long j10) {
            this.f15244a = j10;
            return this;
        }

        public a c(long j10) {
            this.b = j10;
            return this;
        }
    }

    public e(long j10, long j11) {
        this.f15243a = j10;
        this.b = j11;
    }

    public static a c() {
        return new a();
    }

    @tf.d(tag = 1)
    public long a() {
        return this.f15243a;
    }

    @tf.d(tag = 2)
    public long b() {
        return this.b;
    }
}
