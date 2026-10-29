package a8;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f189a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<l> f193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f194g;

    public static final class b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f195a;
        public Long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public k f196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<l> f199f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p f200g;

        @Override // a8.m.a
        public m a() {
            String str = "";
            if (this.f195a == null) {
                str = " requestTimeMs";
            }
            if (this.b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f195a.longValue(), this.b.longValue(), this.f196c, this.f197d, this.f198e, this.f199f, this.f200g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // a8.m.a
        public m.a b(k kVar) {
            this.f196c = kVar;
            return this;
        }

        @Override // a8.m.a
        public m.a c(List<l> list) {
            this.f199f = list;
            return this;
        }

        @Override // a8.m.a
        public m.a d(Integer num) {
            this.f197d = num;
            return this;
        }

        @Override // a8.m.a
        public m.a e(String str) {
            this.f198e = str;
            return this;
        }

        @Override // a8.m.a
        public m.a f(p pVar) {
            this.f200g = pVar;
            return this;
        }

        @Override // a8.m.a
        public m.a g(long j10) {
            this.f195a = Long.valueOf(j10);
            return this;
        }

        @Override // a8.m.a
        public m.a h(long j10) {
            this.b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // a8.m
    public k b() {
        return this.f190c;
    }

    @Override // a8.m
    public List<l> c() {
        return this.f193f;
    }

    @Override // a8.m
    public Integer d() {
        return this.f191d;
    }

    @Override // a8.m
    public String e() {
        return this.f192e;
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
            if (this.f189a == mVar.g() && this.b == mVar.h() && ((kVar = this.f190c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f191d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f192e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f193f) != null ? list.equals(mVar.c()) : mVar.c() == null) && ((pVar = this.f194g) != null ? pVar.equals(mVar.f()) : mVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // a8.m
    public p f() {
        return this.f194g;
    }

    @Override // a8.m
    public long g() {
        return this.f189a;
    }

    @Override // a8.m
    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j10 = this.f189a;
        long j11 = this.b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f190c;
        int iHashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f191d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f192e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f193f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f194g;
        return iHashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f189a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.f190c + ", logSource=" + this.f191d + ", logSourceName=" + this.f192e + ", logEvents=" + this.f193f + ", qosTier=" + this.f194g + "}";
    }

    public g(long j10, long j11, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.f189a = j10;
        this.b = j11;
        this.f190c = kVar;
        this.f191d = num;
        this.f192e = str;
        this.f193f = list;
        this.f194g = pVar;
    }
}
