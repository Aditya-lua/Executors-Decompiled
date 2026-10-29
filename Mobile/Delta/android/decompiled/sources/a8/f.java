package a8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f177a;
    public final Integer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f182g;

    public static final class b extends l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f183a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f185d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f186e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f187f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o f188g;

        @Override // a8.l.a
        public l a() {
            String str = "";
            if (this.f183a == null) {
                str = " eventTimeMs";
            }
            if (this.f184c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f187f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f183a.longValue(), this.b, this.f184c.longValue(), this.f185d, this.f186e, this.f187f.longValue(), this.f188g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // a8.l.a
        public l.a b(Integer num) {
            this.b = num;
            return this;
        }

        @Override // a8.l.a
        public l.a c(long j10) {
            this.f183a = Long.valueOf(j10);
            return this;
        }

        @Override // a8.l.a
        public l.a d(long j10) {
            this.f184c = Long.valueOf(j10);
            return this;
        }

        @Override // a8.l.a
        public l.a e(o oVar) {
            this.f188g = oVar;
            return this;
        }

        @Override // a8.l.a
        public l.a f(byte[] bArr) {
            this.f185d = bArr;
            return this;
        }

        @Override // a8.l.a
        public l.a g(String str) {
            this.f186e = str;
            return this;
        }

        @Override // a8.l.a
        public l.a h(long j10) {
            this.f187f = Long.valueOf(j10);
            return this;
        }
    }

    @Override // a8.l
    public Integer b() {
        return this.b;
    }

    @Override // a8.l
    public long c() {
        return this.f177a;
    }

    @Override // a8.l
    public long d() {
        return this.f178c;
    }

    @Override // a8.l
    public o e() {
        return this.f182g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        o oVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f177a == lVar.c() && ((num = this.b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f178c == lVar.d()) {
                if (Arrays.equals(this.f179d, lVar instanceof f ? ((f) lVar).f179d : lVar.f()) && ((str = this.f180e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f181f == lVar.h() && ((oVar = this.f182g) != null ? oVar.equals(lVar.e()) : lVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // a8.l
    public byte[] f() {
        return this.f179d;
    }

    @Override // a8.l
    public String g() {
        return this.f180e;
    }

    @Override // a8.l
    public long h() {
        return this.f181f;
    }

    public int hashCode() {
        long j10 = this.f177a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f178c;
        int iHashCode2 = (((((i10 ^ iHashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f179d)) * 1000003;
        String str = this.f180e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f181f;
        int i11 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f182g;
        return i11 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f177a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.f178c + ", sourceExtension=" + Arrays.toString(this.f179d) + ", sourceExtensionJsonProto3=" + this.f180e + ", timezoneOffsetSeconds=" + this.f181f + ", networkConnectionInfo=" + this.f182g + "}";
    }

    public f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f177a = j10;
        this.b = num;
        this.f178c = j11;
        this.f179d = bArr;
        this.f180e = str;
        this.f181f = j12;
        this.f182g = oVar;
    }
}
