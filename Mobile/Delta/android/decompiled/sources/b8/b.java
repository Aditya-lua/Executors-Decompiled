package b8;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3901a;
    public final Integer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f3902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f3905f;

    /* JADX INFO: renamed from: b8.b$b, reason: collision with other inner class name */
    public static final class C0077b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3906a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h f3907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f3908d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f3909e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Map<String, String> f3910f;

        @Override // b8.i.a
        public i d() {
            String str = "";
            if (this.f3906a == null) {
                str = " transportName";
            }
            if (this.f3907c == null) {
                str = str + " encodedPayload";
            }
            if (this.f3908d == null) {
                str = str + " eventMillis";
            }
            if (this.f3909e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f3910f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f3906a, this.b, this.f3907c, this.f3908d.longValue(), this.f3909e.longValue(), this.f3910f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b8.i.a
        public Map<String, String> e() {
            Map<String, String> map = this.f3910f;
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
            this.f3910f = map;
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
            this.f3907c = hVar;
            return this;
        }

        @Override // b8.i.a
        public i.a i(long j10) {
            this.f3908d = Long.valueOf(j10);
            return this;
        }

        @Override // b8.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f3906a = str;
            return this;
        }

        @Override // b8.i.a
        public i.a k(long j10) {
            this.f3909e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // b8.i
    public Map<String, String> c() {
        return this.f3905f;
    }

    @Override // b8.i
    public Integer d() {
        return this.b;
    }

    @Override // b8.i
    public h e() {
        return this.f3902c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f3901a.equals(iVar.j()) && ((num = this.b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f3902c.equals(iVar.e()) && this.f3903d == iVar.f() && this.f3904e == iVar.k() && this.f3905f.equals(iVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // b8.i
    public long f() {
        return this.f3903d;
    }

    public int hashCode() {
        int iHashCode = (this.f3901a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f3902c.hashCode()) * 1000003;
        long j10 = this.f3903d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f3904e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f3905f.hashCode();
    }

    @Override // b8.i
    public String j() {
        return this.f3901a;
    }

    @Override // b8.i
    public long k() {
        return this.f3904e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f3901a + ", code=" + this.b + ", encodedPayload=" + this.f3902c + ", eventMillis=" + this.f3903d + ", uptimeMillis=" + this.f3904e + ", autoMetadata=" + this.f3905f + "}";
    }

    public b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map) {
        this.f3901a = str;
        this.b = num;
        this.f3902c = hVar;
        this.f3903d = j10;
        this.f3904e = j11;
        this.f3905f = map;
    }
}
