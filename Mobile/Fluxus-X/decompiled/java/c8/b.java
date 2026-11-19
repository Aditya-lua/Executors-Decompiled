package c8;

import com.github.luben.zstd.BuildConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4886a;
    public final Integer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f4887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f4890f;

    /* JADX INFO: renamed from: c8.b$b, reason: collision with other inner class name */
    public static final class C0099b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4891a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h f4892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f4893d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f4894e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Map<String, String> f4895f;

        @Override // c8.i.a
        public i d() {
            String str = this.f4891a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " transportName";
            }
            if (this.f4892c == null) {
                str2 = str2 + " encodedPayload";
            }
            if (this.f4893d == null) {
                str2 = str2 + " eventMillis";
            }
            if (this.f4894e == null) {
                str2 = str2 + " uptimeMillis";
            }
            if (this.f4895f == null) {
                str2 = str2 + " autoMetadata";
            }
            if (str2.isEmpty()) {
                return new b(this.f4891a, this.b, this.f4892c, this.f4893d.longValue(), this.f4894e.longValue(), this.f4895f);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // c8.i.a
        public Map<String, String> e() {
            Map<String, String> map = this.f4895f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // c8.i.a
        public i.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f4895f = map;
            return this;
        }

        @Override // c8.i.a
        public i.a g(Integer num) {
            this.b = num;
            return this;
        }

        @Override // c8.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f4892c = hVar;
            return this;
        }

        @Override // c8.i.a
        public i.a i(long j10) {
            this.f4893d = Long.valueOf(j10);
            return this;
        }

        @Override // c8.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f4891a = str;
            return this;
        }

        @Override // c8.i.a
        public i.a k(long j10) {
            this.f4894e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // c8.i
    public Map<String, String> c() {
        return this.f4890f;
    }

    @Override // c8.i
    public Integer d() {
        return this.b;
    }

    @Override // c8.i
    public h e() {
        return this.f4887c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f4886a.equals(iVar.j()) && ((num = this.b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f4887c.equals(iVar.e()) && this.f4888d == iVar.f() && this.f4889e == iVar.k() && this.f4890f.equals(iVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // c8.i
    public long f() {
        return this.f4888d;
    }

    public int hashCode() {
        int iHashCode = (this.f4886a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f4887c.hashCode()) * 1000003;
        long j10 = this.f4888d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f4889e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f4890f.hashCode();
    }

    @Override // c8.i
    public String j() {
        return this.f4886a;
    }

    @Override // c8.i
    public long k() {
        return this.f4889e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f4886a + ", code=" + this.b + ", encodedPayload=" + this.f4887c + ", eventMillis=" + this.f4888d + ", uptimeMillis=" + this.f4889e + ", autoMetadata=" + this.f4890f + "}";
    }

    public b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map) {
        this.f4886a = str;
        this.b = num;
        this.f4887c = hVar;
        this.f4888d = j10;
        this.f4889e = j11;
        this.f4890f = map;
    }
}
