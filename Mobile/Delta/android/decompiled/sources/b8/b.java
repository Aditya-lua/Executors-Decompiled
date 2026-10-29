package b8;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4003a;
    public final Integer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f4004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f4007f;

    /* JADX INFO: renamed from: b8.b$b, reason: collision with other inner class name */
    public static final class C0078b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4008a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h f4009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f4010d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f4011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Map<String, String> f4012f;

        @Override // b8.i.a
        public i d() {
            String str = "";
            if (this.f4008a == null) {
                str = " transportName";
            }
            if (this.f4009c == null) {
                str = str + " encodedPayload";
            }
            if (this.f4010d == null) {
                str = str + " eventMillis";
            }
            if (this.f4011e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f4012f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f4008a, this.b, this.f4009c, this.f4010d.longValue(), this.f4011e.longValue(), this.f4012f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b8.i.a
        public Map<String, String> e() {
            Map<String, String> map = this.f4012f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // b8.i.a
        public i.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f4012f = map;
            return this;
        }

        @Override // b8.i.a
        public i.a g(Integer num) {
            this.b = num;
            return this;
        }

        @Override // b8.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f4009c = hVar;
            return this;
        }

        @Override // b8.i.a
        public i.a i(long j10) {
            this.f4010d = Long.valueOf(j10);
            return this;
        }

        @Override // b8.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f4008a = str;
            return this;
        }

        @Override // b8.i.a
        public i.a k(long j10) {
            this.f4011e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // b8.i
    public Map<String, String> c() {
        return this.f4007f;
    }

    @Override // b8.i
    public Integer d() {
        return this.b;
    }

    @Override // b8.i
    public h e() {
        return this.f4004c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f4003a.equals(iVar.j()) && ((num = this.b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f4004c.equals(iVar.e()) && this.f4005d == iVar.f() && this.f4006e == iVar.k() && this.f4007f.equals(iVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // b8.i
    public long f() {
        return this.f4005d;
    }

    public int hashCode() {
        int iHashCode = (this.f4003a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f4004c.hashCode()) * 1000003;
        long j10 = this.f4005d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f4006e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f4007f.hashCode();
    }

    @Override // b8.i
    public String j() {
        return this.f4003a;
    }

    @Override // b8.i
    public long k() {
        return this.f4006e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f4003a + ", code=" + this.b + ", encodedPayload=" + this.f4004c + ", eventMillis=" + this.f4005d + ", uptimeMillis=" + this.f4006e + ", autoMetadata=" + this.f4007f + "}";
    }

    public b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map) {
        this.f4003a = str;
        this.b = num;
        this.f4004c = hVar;
        this.f4005d = j10;
        this.f4006e = j11;
        this.f4007f = map;
    }
}
