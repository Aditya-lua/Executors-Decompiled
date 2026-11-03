package j8;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21681f;

    public static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f21682a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f21683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f21684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f21685e;

        @Override // j8.e.a
        public e a() {
            String str = "";
            if (this.f21682a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f21683c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f21684d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f21685e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f21682a.longValue(), this.b.intValue(), this.f21683c.intValue(), this.f21684d.longValue(), this.f21685e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // j8.e.a
        public e.a b(int i10) {
            this.f21683c = Integer.valueOf(i10);
            return this;
        }

        @Override // j8.e.a
        public e.a c(long j10) {
            this.f21684d = Long.valueOf(j10);
            return this;
        }

        @Override // j8.e.a
        public e.a d(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }

        @Override // j8.e.a
        public e.a e(int i10) {
            this.f21685e = Integer.valueOf(i10);
            return this;
        }

        @Override // j8.e.a
        public e.a f(long j10) {
            this.f21682a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // j8.e
    public int b() {
        return this.f21679d;
    }

    @Override // j8.e
    public long c() {
        return this.f21680e;
    }

    @Override // j8.e
    public int d() {
        return this.f21678c;
    }

    @Override // j8.e
    public int e() {
        return this.f21681f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.b == eVar.f() && this.f21678c == eVar.d() && this.f21679d == eVar.b() && this.f21680e == eVar.c() && this.f21681f == eVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // j8.e
    public long f() {
        return this.b;
    }

    public int hashCode() {
        long j10 = this.b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f21678c) * 1000003) ^ this.f21679d) * 1000003;
        long j11 = this.f21680e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f21681f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.f21678c + ", criticalSectionEnterTimeoutMs=" + this.f21679d + ", eventCleanUpAge=" + this.f21680e + ", maxBlobByteSizePerRow=" + this.f21681f + "}";
    }

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.b = j10;
        this.f21678c = i10;
        this.f21679d = i11;
        this.f21680e = j11;
        this.f21681f = i12;
    }
}
