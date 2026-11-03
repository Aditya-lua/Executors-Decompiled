package e8;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f15859c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15860a;
    public final long b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f15861a = 0;
        public long b = 0;

        public f a() {
            return new f(this.f15861a, this.b);
        }

        public a b(long j10) {
            this.b = j10;
            return this;
        }

        public a c(long j10) {
            this.f15861a = j10;
            return this;
        }
    }

    public f(long j10, long j11) {
        this.f15860a = j10;
        this.b = j11;
    }

    public static a c() {
        return new a();
    }

    @uf.d(tag = 2)
    public long a() {
        return this.b;
    }

    @uf.d(tag = 1)
    public long b() {
        return this.f15860a;
    }
}
