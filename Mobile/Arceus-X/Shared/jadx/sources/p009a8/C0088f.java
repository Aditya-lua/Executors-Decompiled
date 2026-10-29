package p009a8;

import java.util.Arrays;

/* JADX INFO: renamed from: a8.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0088f extends AbstractC0094l {

    /* JADX INFO: renamed from: a */
    public final long f231a;

    /* JADX INFO: renamed from: b */
    public final Integer f232b;

    /* JADX INFO: renamed from: c */
    public final long f233c;

    /* JADX INFO: renamed from: d */
    public final byte[] f234d;

    /* JADX INFO: renamed from: e */
    public final String f235e;

    /* JADX INFO: renamed from: f */
    public final long f236f;

    /* JADX INFO: renamed from: g */
    public final AbstractC0097o f237g;

    /* JADX INFO: renamed from: a8.f$b */
    public static final class b extends AbstractC0094l.a {

        /* JADX INFO: renamed from: a */
        public Long f238a;

        /* JADX INFO: renamed from: b */
        public Integer f239b;

        /* JADX INFO: renamed from: c */
        public Long f240c;

        /* JADX INFO: renamed from: d */
        public byte[] f241d;

        /* JADX INFO: renamed from: e */
        public String f242e;

        /* JADX INFO: renamed from: f */
        public Long f243f;

        /* JADX INFO: renamed from: g */
        public AbstractC0097o f244g;

        @Override // p009a8.AbstractC0094l.a
        /* JADX INFO: renamed from: a */
        public AbstractC0094l mo252a() {
            String str = "";
            if (this.f238a == null) {
                str = " eventTimeMs";
            }
            if (this.f240c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f243f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C0088f(this.f238a.longValue(), this.f239b, this.f240c.longValue(), this.f241d, this.f242e, this.f243f.longValue(), this.f244g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p009a8.AbstractC0094l.a
        /* JADX INFO: renamed from: b */
        public AbstractC0094l.a mo253b(Integer num) {
            this.f239b = num;
            return this;
        }

        @Override // p009a8.AbstractC0094l.a
        /* JADX INFO: renamed from: c */
        public AbstractC0094l.a mo254c(long j10) {
            this.f238a = Long.valueOf(j10);
            return this;
        }

        @Override // p009a8.AbstractC0094l.a
        /* JADX INFO: renamed from: d */
        public AbstractC0094l.a mo255d(long j10) {
            this.f240c = Long.valueOf(j10);
            return this;
        }

        @Override // p009a8.AbstractC0094l.a
        /* JADX INFO: renamed from: e */
        public AbstractC0094l.a mo256e(AbstractC0097o abstractC0097o) {
            this.f244g = abstractC0097o;
            return this;
        }

        @Override // p009a8.AbstractC0094l.a
        /* JADX INFO: renamed from: f */
        public AbstractC0094l.a mo257f(byte[] bArr) {
            this.f241d = bArr;
            return this;
        }

        @Override // p009a8.AbstractC0094l.a
        /* JADX INFO: renamed from: g */
        public AbstractC0094l.a mo258g(String str) {
            this.f242e = str;
            return this;
        }

        @Override // p009a8.AbstractC0094l.a
        /* JADX INFO: renamed from: h */
        public AbstractC0094l.a mo259h(long j10) {
            this.f243f = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p009a8.AbstractC0094l
    /* JADX INFO: renamed from: b */
    public Integer mo245b() {
        return this.f232b;
    }

    @Override // p009a8.AbstractC0094l
    /* JADX INFO: renamed from: c */
    public long mo246c() {
        return this.f231a;
    }

    @Override // p009a8.AbstractC0094l
    /* JADX INFO: renamed from: d */
    public long mo247d() {
        return this.f233c;
    }

    @Override // p009a8.AbstractC0094l
    /* JADX INFO: renamed from: e */
    public AbstractC0097o mo248e() {
        return this.f237g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        AbstractC0097o abstractC0097o;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0094l) {
            AbstractC0094l abstractC0094l = (AbstractC0094l) obj;
            if (this.f231a == abstractC0094l.mo246c() && ((num = this.f232b) != null ? num.equals(abstractC0094l.mo245b()) : abstractC0094l.mo245b() == null) && this.f233c == abstractC0094l.mo247d()) {
                if (Arrays.equals(this.f234d, abstractC0094l instanceof C0088f ? ((C0088f) abstractC0094l).f234d : abstractC0094l.mo249f()) && ((str = this.f235e) != null ? str.equals(abstractC0094l.mo250g()) : abstractC0094l.mo250g() == null) && this.f236f == abstractC0094l.mo251h() && ((abstractC0097o = this.f237g) != null ? abstractC0097o.equals(abstractC0094l.mo248e()) : abstractC0094l.mo248e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p009a8.AbstractC0094l
    /* JADX INFO: renamed from: f */
    public byte[] mo249f() {
        return this.f234d;
    }

    @Override // p009a8.AbstractC0094l
    /* JADX INFO: renamed from: g */
    public String mo250g() {
        return this.f235e;
    }

    @Override // p009a8.AbstractC0094l
    /* JADX INFO: renamed from: h */
    public long mo251h() {
        return this.f236f;
    }

    public int hashCode() {
        long j10 = this.f231a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f232b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f233c;
        int iHashCode2 = (((((i10 ^ iHashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f234d)) * 1000003;
        String str = this.f235e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f236f;
        int i11 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        AbstractC0097o abstractC0097o = this.f237g;
        return i11 ^ (abstractC0097o != null ? abstractC0097o.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f231a + ", eventCode=" + this.f232b + ", eventUptimeMs=" + this.f233c + ", sourceExtension=" + Arrays.toString(this.f234d) + ", sourceExtensionJsonProto3=" + this.f235e + ", timezoneOffsetSeconds=" + this.f236f + ", networkConnectionInfo=" + this.f237g + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0088f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, AbstractC0097o abstractC0097o) {
        this.f231a = j10;
        this.f232b = num;
        this.f233c = j11;
        this.f234d = bArr;
        this.f235e = str;
        this.f236f = j12;
        this.f237g = abstractC0097o;
    }
}
