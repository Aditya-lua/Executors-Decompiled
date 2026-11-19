package b8;

import com.github.luben.zstd.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3726a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f3727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f3728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<l> f3730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f3731g;

    public static final class b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f3732a;
        public Long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public k f3733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f3734d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f3735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<l> f3736f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p f3737g;

        @Override // b8.m.a
        public m a() {
            Long l10 = this.f3732a;
            String str = BuildConfig.FLAVOR;
            if (l10 == null) {
                str = BuildConfig.FLAVOR + " requestTimeMs";
            }
            if (this.b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f3732a.longValue(), this.b.longValue(), this.f3733c, this.f3734d, this.f3735e, this.f3736f, this.f3737g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b8.m.a
        public m.a b(k kVar) {
            this.f3733c = kVar;
            return this;
        }

        @Override // b8.m.a
        public m.a c(List<l> list) {
            this.f3736f = list;
            return this;
        }

        @Override // b8.m.a
        public m.a d(Integer num) {
            this.f3734d = num;
            return this;
        }

        @Override // b8.m.a
        public m.a e(String str) {
            this.f3735e = str;
            return this;
        }

        @Override // b8.m.a
        public m.a f(p pVar) {
            this.f3737g = pVar;
            return this;
        }

        @Override // b8.m.a
        public m.a g(long j10) {
            this.f3732a = Long.valueOf(j10);
            return this;
        }

        @Override // b8.m.a
        public m.a h(long j10) {
            this.b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // b8.m
    public k b() {
        return this.f3727c;
    }

    @Override // b8.m
    public List<l> c() {
        return this.f3730f;
    }

    @Override // b8.m
    public Integer d() {
        return this.f3728d;
    }

    @Override // b8.m
    public String e() {
        return this.f3729e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        p pVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f3726a == mVar.g() && this.b == mVar.h() && ((kVar = this.f3727c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f3728d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f3729e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f3730f) != null ? list.equals(mVar.c()) : mVar.c() == null) && ((pVar = this.f3731g) != null ? pVar.equals(mVar.f()) : mVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // b8.m
    public p f() {
        return this.f3731g;
    }

    @Override // b8.m
    public long g() {
        return this.f3726a;
    }

    @Override // b8.m
    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j10 = this.f3726a;
        long j11 = this.b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f3727c;
        int iHashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f3728d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f3729e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f3730f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f3731g;
        return iHashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f3726a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.f3727c + ", logSource=" + this.f3728d + ", logSourceName=" + this.f3729e + ", logEvents=" + this.f3730f + ", qosTier=" + this.f3731g + "}";
    }

    public g(long j10, long j11, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.f3726a = j10;
        this.b = j11;
        this.f3727c = kVar;
        this.f3728d = num;
        this.f3729e = str;
        this.f3730f = list;
        this.f3731g = pVar;
    }
}
