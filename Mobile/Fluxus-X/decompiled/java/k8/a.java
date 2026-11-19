package k8;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21156f;

    public static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f21157a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f21158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f21159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f21160e;

        @Override // k8.e.a
        public e a() {
            Long l10 = this.f21157a;
            String str = BuildConfig.FLAVOR;
            if (l10 == null) {
                str = BuildConfig.FLAVOR + " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f21158c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f21159d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f21160e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f21157a.longValue(), this.b.intValue(), this.f21158c.intValue(), this.f21159d.longValue(), this.f21160e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // k8.e.a
        public e.a b(int i10) {
            this.f21158c = Integer.valueOf(i10);
            return this;
        }

        @Override // k8.e.a
        public e.a c(long j10) {
            this.f21159d = Long.valueOf(j10);
            return this;
        }

        @Override // k8.e.a
        public e.a d(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }

        @Override // k8.e.a
        public e.a e(int i10) {
            this.f21160e = Integer.valueOf(i10);
            return this;
        }

        @Override // k8.e.a
        public e.a f(long j10) {
            this.f21157a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // k8.e
    public int b() {
        return this.f21154d;
    }

    @Override // k8.e
    public long c() {
        return this.f21155e;
    }

    @Override // k8.e
    public int d() {
        return this.f21153c;
    }

    @Override // k8.e
    public int e() {
        return this.f21156f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.b == eVar.f() && this.f21153c == eVar.d() && this.f21154d == eVar.b() && this.f21155e == eVar.c() && this.f21156f == eVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // k8.e
    public long f() {
        return this.b;
    }

    public int hashCode() {
        long j10 = this.b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f21153c) * 1000003) ^ this.f21154d) * 1000003;
        long j11 = this.f21155e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f21156f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.f21153c + ", criticalSectionEnterTimeoutMs=" + this.f21154d + ", eventCleanUpAge=" + this.f21155e + ", maxBlobByteSizePerRow=" + this.f21156f + "}";
    }

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.b = j10;
        this.f21153c = i10;
        this.f21154d = i11;
        this.f21155e = j11;
        this.f21156f = i12;
    }
}
