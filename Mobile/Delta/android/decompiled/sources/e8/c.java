package e8;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f15228c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15229a;
    public final b b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f15230a = 0;
        public b b = b.REASON_UNKNOWN;

        public c a() {
            return new c(this.f15230a, this.b);
        }

        public a b(long j10) {
            this.f15230a = j10;
            return this;
        }

        public a c(b bVar) {
            this.b = bVar;
            return this;
        }
    }

    public enum b implements tf.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15238a;

        b(int i10) {
            this.f15238a = i10;
        }

        @Override // tf.c
        public int getNumber() {
            return this.f15238a;
        }
    }

    public c(long j10, b bVar) {
        this.f15229a = j10;
        this.b = bVar;
    }

    public static a c() {
        return new a();
    }

    @tf.d(tag = 1)
    public long a() {
        return this.f15229a;
    }

    @tf.d(tag = 3)
    public b b() {
        return this.b;
    }
}
