package p028b8;

import java.util.Map;

/* JADX INFO: renamed from: b8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1254b extends AbstractC1261i {

    /* JADX INFO: renamed from: a */
    public final String f5235a;

    /* JADX INFO: renamed from: b */
    public final Integer f5236b;

    /* JADX INFO: renamed from: c */
    public final C1260h f5237c;

    /* JADX INFO: renamed from: d */
    public final long f5238d;

    /* JADX INFO: renamed from: e */
    public final long f5239e;

    /* JADX INFO: renamed from: f */
    public final Map<String, String> f5240f;

    /* JADX INFO: renamed from: b8.b$b */
    public static final class b extends AbstractC1261i.a {

        /* JADX INFO: renamed from: a */
        public String f5241a;

        /* JADX INFO: renamed from: b */
        public Integer f5242b;

        /* JADX INFO: renamed from: c */
        public C1260h f5243c;

        /* JADX INFO: renamed from: d */
        public Long f5244d;

        /* JADX INFO: renamed from: e */
        public Long f5245e;

        /* JADX INFO: renamed from: f */
        public Map<String, String> f5246f;

        @Override // p028b8.AbstractC1261i.a
        /* JADX INFO: renamed from: d */
        public AbstractC1261i mo6988d() {
            String str = "";
            if (this.f5241a == null) {
                str = " transportName";
            }
            if (this.f5243c == null) {
                str = str + " encodedPayload";
            }
            if (this.f5244d == null) {
                str = str + " eventMillis";
            }
            if (this.f5245e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f5246f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C1254b(this.f5241a, this.f5242b, this.f5243c, this.f5244d.longValue(), this.f5245e.longValue(), this.f5246f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p028b8.AbstractC1261i.a
        /* JADX INFO: renamed from: e */
        public Map<String, String> mo6989e() {
            Map<String, String> map = this.f5246f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // p028b8.AbstractC1261i.a
        /* JADX INFO: renamed from: f */
        public AbstractC1261i.a mo6990f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f5246f = map;
            return this;
        }

        @Override // p028b8.AbstractC1261i.a
        /* JADX INFO: renamed from: g */
        public AbstractC1261i.a mo6991g(Integer num) {
            this.f5242b = num;
            return this;
        }

        @Override // p028b8.AbstractC1261i.a
        /* JADX INFO: renamed from: h */
        public AbstractC1261i.a mo6992h(C1260h c1260h) {
            if (c1260h == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f5243c = c1260h;
            return this;
        }

        @Override // p028b8.AbstractC1261i.a
        /* JADX INFO: renamed from: i */
        public AbstractC1261i.a mo6993i(long j10) {
            this.f5244d = Long.valueOf(j10);
            return this;
        }

        @Override // p028b8.AbstractC1261i.a
        /* JADX INFO: renamed from: j */
        public AbstractC1261i.a mo6994j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f5241a = str;
            return this;
        }

        @Override // p028b8.AbstractC1261i.a
        /* JADX INFO: renamed from: k */
        public AbstractC1261i.a mo6995k(long j10) {
            this.f5245e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p028b8.AbstractC1261i
    /* JADX INFO: renamed from: c */
    public Map<String, String> mo6982c() {
        return this.f5240f;
    }

    @Override // p028b8.AbstractC1261i
    /* JADX INFO: renamed from: d */
    public Integer mo6983d() {
        return this.f5236b;
    }

    @Override // p028b8.AbstractC1261i
    /* JADX INFO: renamed from: e */
    public C1260h mo6984e() {
        return this.f5237c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1261i) {
            AbstractC1261i abstractC1261i = (AbstractC1261i) obj;
            if (this.f5235a.equals(abstractC1261i.mo6986j()) && ((num = this.f5236b) != null ? num.equals(abstractC1261i.mo6983d()) : abstractC1261i.mo6983d() == null) && this.f5237c.equals(abstractC1261i.mo6984e()) && this.f5238d == abstractC1261i.mo6985f() && this.f5239e == abstractC1261i.mo6987k() && this.f5240f.equals(abstractC1261i.mo6982c())) {
                return true;
            }
        }
        return false;
    }

    @Override // p028b8.AbstractC1261i
    /* JADX INFO: renamed from: f */
    public long mo6985f() {
        return this.f5238d;
    }

    public int hashCode() {
        int iHashCode = (this.f5235a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f5236b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f5237c.hashCode()) * 1000003;
        long j10 = this.f5238d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f5239e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f5240f.hashCode();
    }

    @Override // p028b8.AbstractC1261i
    /* JADX INFO: renamed from: j */
    public String mo6986j() {
        return this.f5235a;
    }

    @Override // p028b8.AbstractC1261i
    /* JADX INFO: renamed from: k */
    public long mo6987k() {
        return this.f5239e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f5235a + ", code=" + this.f5236b + ", encodedPayload=" + this.f5237c + ", eventMillis=" + this.f5238d + ", uptimeMillis=" + this.f5239e + ", autoMetadata=" + this.f5240f + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1254b(String str, Integer num, C1260h c1260h, long j10, long j11, Map<String, String> map) {
        this.f5235a = str;
        this.f5236b = num;
        this.f5237c = c1260h;
        this.f5238d = j10;
        this.f5239e = j11;
        this.f5240f = map;
    }
}
