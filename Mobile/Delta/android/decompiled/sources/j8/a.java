package j8;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21108f;

    public static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f21109a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f21110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f21111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f21112e;

        @Override // j8.e.a
        public e a() {
            String str = "";
            if (this.f21109a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f21110c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f21111d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f21112e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f21109a.longValue(), this.b.intValue(), this.f21110c.intValue(), this.f21111d.longValue(), this.f21112e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // j8.e.a
        public e.a b(int i10) {
            this.f21110c = Integer.valueOf(i10);
            return this;
        }

        @Override // j8.e.a
        public e.a c(long j10) {
            this.f21111d = Long.valueOf(j10);
            return this;
        }

        @Override // j8.e.a
        public e.a d(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }

        @Override // j8.e.a
        public e.a e(int i10) {
            this.f21112e = Integer.valueOf(i10);
            return this;
        }

        @Override // j8.e.a
        public e.a f(long j10) {
            this.f21109a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // j8.e
    public int b() {
        return this.f21106d;
    }

    @Override // j8.e
    public long c() {
        return this.f21107e;
    }

    @Override // j8.e
    public int d() {
        return this.f21105c;
    }

    @Override // j8.e
    public int e() {
        return this.f21108f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.b == eVar.f() && this.f21105c == eVar.d() && this.f21106d == eVar.b() && this.f21107e == eVar.c() && this.f21108f == eVar.e()) {
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
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f21105c) * 1000003) ^ this.f21106d) * 1000003;
        long j11 = this.f21107e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f21108f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.f21105c + ", criticalSectionEnterTimeoutMs=" + this.f21106d + ", eventCleanUpAge=" + this.f21107e + ", maxBlobByteSizePerRow=" + this.f21108f + "}";
    }

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.b = j10;
        this.f21105c = i10;
        this.f21106d = i11;
        this.f21107e = j11;
        this.f21108f = i12;
    }
}
