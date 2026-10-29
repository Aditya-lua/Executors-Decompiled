package ag;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f528h;

    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f529a;
        public c.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte f535h;

        @Override // ag.d.a
        public d a() {
            if (this.f535h == 3 && this.b != null) {
                return new a(this.f529a, this.b, this.f530c, this.f531d, this.f532e, this.f533f, this.f534g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.b == null) {
                sb2.append(" registrationStatus");
            }
            if ((this.f535h & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((this.f535h & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // ag.d.a
        public d.a b(String str) {
            this.f530c = str;
            return this;
        }

        @Override // ag.d.a
        public d.a c(long j10) {
            this.f532e = j10;
            this.f535h = (byte) (this.f535h | 1);
            return this;
        }

        @Override // ag.d.a
        public d.a d(String str) {
            this.f529a = str;
            return this;
        }

        @Override // ag.d.a
        public d.a e(String str) {
            this.f534g = str;
            return this;
        }

        @Override // ag.d.a
        public d.a f(String str) {
            this.f531d = str;
            return this;
        }

        @Override // ag.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.b = aVar;
            return this;
        }

        @Override // ag.d.a
        public d.a h(long j10) {
            this.f533f = j10;
            this.f535h = (byte) (this.f535h | 2);
            return this;
        }

        public b() {
        }

        public b(d dVar) {
            this.f529a = dVar.d();
            this.b = dVar.g();
            this.f530c = dVar.b();
            this.f531d = dVar.f();
            this.f532e = dVar.c();
            this.f533f = dVar.h();
            this.f534g = dVar.e();
            this.f535h = (byte) 3;
        }
    }

    @Override // ag.d
    public String b() {
        return this.f524d;
    }

    @Override // ag.d
    public long c() {
        return this.f526f;
    }

    @Override // ag.d
    public String d() {
        return this.b;
    }

    @Override // ag.d
    public String e() {
        return this.f528h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.f523c.equals(dVar.g()) && ((str = this.f524d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f525e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f526f == dVar.c() && this.f527g == dVar.h() && ((str3 = this.f528h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ag.d
    public String f() {
        return this.f525e;
    }

    @Override // ag.d
    @NonNull
    public c.a g() {
        return this.f523c;
    }

    @Override // ag.d
    public long h() {
        return this.f527g;
    }

    public int hashCode() {
        String str = this.b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f523c.hashCode()) * 1000003;
        String str2 = this.f524d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f525e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f526f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f527g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f528h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // ag.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.b + ", registrationStatus=" + this.f523c + ", authToken=" + this.f524d + ", refreshToken=" + this.f525e + ", expiresInSecs=" + this.f526f + ", tokenCreationEpochInSecs=" + this.f527g + ", fisError=" + this.f528h + "}";
    }

    public a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.b = str;
        this.f523c = aVar;
        this.f524d = str2;
        this.f525e = str3;
        this.f526f = j10;
        this.f527g = j11;
        this.f528h = str4;
    }
}
