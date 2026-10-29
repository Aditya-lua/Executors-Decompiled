package bg;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: bg.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1434a extends AbstractC1437d {

    /* JADX INFO: renamed from: b */
    public final String f5607b;

    /* JADX INFO: renamed from: c */
    public final C1436c.a f5608c;

    /* JADX INFO: renamed from: d */
    public final String f5609d;

    /* JADX INFO: renamed from: e */
    public final String f5610e;

    /* JADX INFO: renamed from: f */
    public final long f5611f;

    /* JADX INFO: renamed from: g */
    public final long f5612g;

    /* JADX INFO: renamed from: h */
    public final String f5613h;

    /* JADX INFO: renamed from: bg.a$b */
    public static final class b extends AbstractC1437d.a {

        /* JADX INFO: renamed from: a */
        public String f5614a;

        /* JADX INFO: renamed from: b */
        public C1436c.a f5615b;

        /* JADX INFO: renamed from: c */
        public String f5616c;

        /* JADX INFO: renamed from: d */
        public String f5617d;

        /* JADX INFO: renamed from: e */
        public long f5618e;

        /* JADX INFO: renamed from: f */
        public long f5619f;

        /* JADX INFO: renamed from: g */
        public String f5620g;

        /* JADX INFO: renamed from: h */
        public byte f5621h;

        @Override // bg.AbstractC1437d.a
        /* JADX INFO: renamed from: a */
        public AbstractC1437d mo7402a() {
            if (this.f5621h == 3 && this.f5615b != null) {
                return new C1434a(this.f5614a, this.f5615b, this.f5616c, this.f5617d, this.f5618e, this.f5619f, this.f5620g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f5615b == null) {
                sb2.append(" registrationStatus");
            }
            if ((this.f5621h & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((this.f5621h & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // bg.AbstractC1437d.a
        /* JADX INFO: renamed from: b */
        public AbstractC1437d.a mo7403b(String str) {
            this.f5616c = str;
            return this;
        }

        @Override // bg.AbstractC1437d.a
        /* JADX INFO: renamed from: c */
        public AbstractC1437d.a mo7404c(long j10) {
            this.f5618e = j10;
            this.f5621h = (byte) (this.f5621h | 1);
            return this;
        }

        @Override // bg.AbstractC1437d.a
        /* JADX INFO: renamed from: d */
        public AbstractC1437d.a mo7405d(String str) {
            this.f5614a = str;
            return this;
        }

        @Override // bg.AbstractC1437d.a
        /* JADX INFO: renamed from: e */
        public AbstractC1437d.a mo7406e(String str) {
            this.f5620g = str;
            return this;
        }

        @Override // bg.AbstractC1437d.a
        /* JADX INFO: renamed from: f */
        public AbstractC1437d.a mo7407f(String str) {
            this.f5617d = str;
            return this;
        }

        @Override // bg.AbstractC1437d.a
        /* JADX INFO: renamed from: g */
        public AbstractC1437d.a mo7408g(C1436c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f5615b = aVar;
            return this;
        }

        @Override // bg.AbstractC1437d.a
        /* JADX INFO: renamed from: h */
        public AbstractC1437d.a mo7409h(long j10) {
            this.f5619f = j10;
            this.f5621h = (byte) (this.f5621h | 2);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }

        public b(AbstractC1437d abstractC1437d) {
            this.f5614a = abstractC1437d.mo7396d();
            this.f5615b = abstractC1437d.mo7399g();
            this.f5616c = abstractC1437d.mo7394b();
            this.f5617d = abstractC1437d.mo7398f();
            this.f5618e = abstractC1437d.mo7395c();
            this.f5619f = abstractC1437d.mo7400h();
            this.f5620g = abstractC1437d.mo7397e();
            this.f5621h = (byte) 3;
        }
    }

    @Override // bg.AbstractC1437d
    /* JADX INFO: renamed from: b */
    public String mo7394b() {
        return this.f5609d;
    }

    @Override // bg.AbstractC1437d
    /* JADX INFO: renamed from: c */
    public long mo7395c() {
        return this.f5611f;
    }

    @Override // bg.AbstractC1437d
    /* JADX INFO: renamed from: d */
    public String mo7396d() {
        return this.f5607b;
    }

    @Override // bg.AbstractC1437d
    /* JADX INFO: renamed from: e */
    public String mo7397e() {
        return this.f5613h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1437d) {
            AbstractC1437d abstractC1437d = (AbstractC1437d) obj;
            String str4 = this.f5607b;
            if (str4 != null ? str4.equals(abstractC1437d.mo7396d()) : abstractC1437d.mo7396d() == null) {
                if (this.f5608c.equals(abstractC1437d.mo7399g()) && ((str = this.f5609d) != null ? str.equals(abstractC1437d.mo7394b()) : abstractC1437d.mo7394b() == null) && ((str2 = this.f5610e) != null ? str2.equals(abstractC1437d.mo7398f()) : abstractC1437d.mo7398f() == null) && this.f5611f == abstractC1437d.mo7395c() && this.f5612g == abstractC1437d.mo7400h() && ((str3 = this.f5613h) != null ? str3.equals(abstractC1437d.mo7397e()) : abstractC1437d.mo7397e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // bg.AbstractC1437d
    /* JADX INFO: renamed from: f */
    public String mo7398f() {
        return this.f5610e;
    }

    @Override // bg.AbstractC1437d
    @NonNull
    /* JADX INFO: renamed from: g */
    public C1436c.a mo7399g() {
        return this.f5608c;
    }

    @Override // bg.AbstractC1437d
    /* JADX INFO: renamed from: h */
    public long mo7400h() {
        return this.f5612g;
    }

    public int hashCode() {
        String str = this.f5607b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f5608c.hashCode()) * 1000003;
        String str2 = this.f5609d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f5610e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f5611f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f5612g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f5613h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // bg.AbstractC1437d
    /* JADX INFO: renamed from: n */
    public AbstractC1437d.a mo7401n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f5607b + ", registrationStatus=" + this.f5608c + ", authToken=" + this.f5609d + ", refreshToken=" + this.f5610e + ", expiresInSecs=" + this.f5611f + ", tokenCreationEpochInSecs=" + this.f5612g + ", fisError=" + this.f5613h + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1434a(String str, C1436c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f5607b = str;
        this.f5608c = aVar;
        this.f5609d = str2;
        this.f5610e = str3;
        this.f5611f = j10;
        this.f5612g = j11;
        this.f5613h = str4;
    }
}
