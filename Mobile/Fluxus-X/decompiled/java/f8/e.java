package f8;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f15696c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15697a;
    public final long b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f15698a = 0;
        public long b = 0;

        public e a() {
            return new e(this.f15698a, this.b);
        }

        public a b(long j10) {
            this.f15698a = j10;
            return this;
        }

        public a c(long j10) {
            this.b = j10;
            return this;
        }
    }

    public e(long j10, long j11) {
        this.f15697a = j10;
        this.b = j11;
    }

    public static a c() {
        return new a();
    }

    @wf.d(tag = 1)
    public long a() {
        return this.f15697a;
    }

    @wf.d(tag = 2)
    public long b() {
        return this.b;
    }
}
