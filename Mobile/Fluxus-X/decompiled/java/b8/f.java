package b8;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3714a;
    public final Integer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f3716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f3719g;

    public static final class b extends l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f3720a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f3721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f3722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f3723e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f3724f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o f3725g;

        @Override // b8.l.a
        public l a() {
            Long l10 = this.f3720a;
            String str = BuildConfig.FLAVOR;
            if (l10 == null) {
                str = BuildConfig.FLAVOR + " eventTimeMs";
            }
            if (this.f3721c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f3724f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f3720a.longValue(), this.b, this.f3721c.longValue(), this.f3722d, this.f3723e, this.f3724f.longValue(), this.f3725g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b8.l.a
        public l.a b(Integer num) {
            this.b = num;
            return this;
        }

        @Override // b8.l.a
        public l.a c(long j10) {
            this.f3720a = Long.valueOf(j10);
            return this;
        }

        @Override // b8.l.a
        public l.a d(long j10) {
            this.f3721c = Long.valueOf(j10);
            return this;
        }

        @Override // b8.l.a
        public l.a e(o oVar) {
            this.f3725g = oVar;
            return this;
        }

        @Override // b8.l.a
        public l.a f(byte[] bArr) {
            this.f3722d = bArr;
            return this;
        }

        @Override // b8.l.a
        public l.a g(String str) {
            this.f3723e = str;
            return this;
        }

        @Override // b8.l.a
        public l.a h(long j10) {
            this.f3724f = Long.valueOf(j10);
            return this;
        }
    }

    @Override // b8.l
    public Integer b() {
        return this.b;
    }

    @Override // b8.l
    public long c() {
        return this.f3714a;
    }

    @Override // b8.l
    public long d() {
        return this.f3715c;
    }

    @Override // b8.l
    public o e() {
        return this.f3719g;
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
            if (this.f3714a == lVar.c() && ((num = this.b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f3715c == lVar.d()) {
                if (Arrays.equals(this.f3716d, lVar instanceof f ? ((f) lVar).f3716d : lVar.f()) && ((str = this.f3717e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f3718f == lVar.h() && ((oVar = this.f3719g) != null ? oVar.equals(lVar.e()) : lVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // b8.l
    public byte[] f() {
        return this.f3716d;
    }

    @Override // b8.l
    public String g() {
        return this.f3717e;
    }

    @Override // b8.l
    public long h() {
        return this.f3718f;
    }

    public int hashCode() {
        long j10 = this.f3714a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f3715c;
        int iHashCode2 = (((((i10 ^ iHashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f3716d)) * 1000003;
        String str = this.f3717e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f3718f;
        int i11 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f3719g;
        return i11 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f3714a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.f3715c + ", sourceExtension=" + Arrays.toString(this.f3716d) + ", sourceExtensionJsonProto3=" + this.f3717e + ", timezoneOffsetSeconds=" + this.f3718f + ", networkConnectionInfo=" + this.f3719g + "}";
    }

    public f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f3714a = j10;
        this.b = num;
        this.f3715c = j11;
        this.f3716d = bArr;
        this.f3717e = str;
        this.f3718f = j12;
        this.f3719g = oVar;
    }
}
