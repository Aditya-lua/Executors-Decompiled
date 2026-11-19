package f8;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f15682c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15683a;
    public final b b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f15684a = 0;
        public b b = b.REASON_UNKNOWN;

        public c a() {
            return new c(this.f15684a, this.b);
        }

        public a b(long j10) {
            this.f15684a = j10;
            return this;
        }

        public a c(b bVar) {
            this.b = bVar;
            return this;
        }
    }

    public enum b implements wf.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15692a;

        b(int i10) {
            this.f15692a = i10;
        }

        @Override // wf.c
        public int getNumber() {
            return this.f15692a;
        }
    }

    public c(long j10, b bVar) {
        this.f15683a = j10;
        this.b = bVar;
    }

    public static a c() {
        return new a();
    }

    @wf.d(tag = 1)
    public long a() {
        return this.f15683a;
    }

    @wf.d(tag = 3)
    public b b() {
        return this.b;
    }
}
