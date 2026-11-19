package f8;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f15699c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15700a;
    public final long b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f15701a = 0;
        public long b = 0;

        public f a() {
            return new f(this.f15701a, this.b);
        }

        public a b(long j10) {
            this.b = j10;
            return this;
        }

        public a c(long j10) {
            this.f15701a = j10;
            return this;
        }
    }

    public f(long j10, long j11) {
        this.f15700a = j10;
        this.b = j11;
    }

    public static a c() {
        return new a();
    }

    @wf.d(tag = 2)
    public long a() {
        return this.b;
    }

    @wf.d(tag = 1)
    public long b() {
        return this.f15700a;
    }
}
