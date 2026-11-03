package bg;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f4195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f4199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4200h;

    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4201a;
        public c.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f4202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f4203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f4204e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f4205f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f4206g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte f4207h;

        @Override // bg.d.a
        public d a() {
            if (this.f4207h == 3 && this.b != null) {
                return new a(this.f4201a, this.b, this.f4202c, this.f4203d, this.f4204e, this.f4205f, this.f4206g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.b == null) {
                sb2.append(" registrationStatus");
            }
            if ((this.f4207h & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((this.f4207h & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // bg.d.a
        public d.a b(String str) {
            this.f4202c = str;
            return this;
        }

        @Override // bg.d.a
        public d.a c(long j10) {
            this.f4204e = j10;
            this.f4207h = (byte) (this.f4207h | 1);
            return this;
        }

        @Override // bg.d.a
        public d.a d(String str) {
            this.f4201a = str;
            return this;
        }

        @Override // bg.d.a
        public d.a e(String str) {
            this.f4206g = str;
            return this;
        }

        @Override // bg.d.a
        public d.a f(String str) {
            this.f4203d = str;
            return this;
        }

        @Override // bg.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.b = aVar;
            return this;
        }

        @Override // bg.d.a
        public d.a h(long j10) {
            this.f4205f = j10;
            this.f4207h = (byte) (this.f4207h | 2);
            return this;
        }

        public b() {
        }

        public b(d dVar) {
            this.f4201a = dVar.d();
            this.b = dVar.g();
            this.f4202c = dVar.b();
            this.f4203d = dVar.f();
            this.f4204e = dVar.c();
            this.f4205f = dVar.h();
            this.f4206g = dVar.e();
            this.f4207h = (byte) 3;
        }
    }

    @Override // bg.d
    public String b() {
        return this.f4196d;
    }

    @Override // bg.d
    public long c() {
        return this.f4198f;
    }

    @Override // bg.d
    public String d() {
        return this.b;
    }

    @Override // bg.d
    public String e() {
        return this.f4200h;
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
                if (this.f4195c.equals(dVar.g()) && ((str = this.f4196d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f4197e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f4198f == dVar.c() && this.f4199g == dVar.h() && ((str3 = this.f4200h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // bg.d
    public String f() {
        return this.f4197e;
    }

    @Override // bg.d
    @NonNull
    public c.a g() {
        return this.f4195c;
    }

    @Override // bg.d
    public long h() {
        return this.f4199g;
    }

    public int hashCode() {
        String str = this.b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f4195c.hashCode()) * 1000003;
        String str2 = this.f4196d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4197e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f4198f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f4199g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f4200h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // bg.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.b + ", registrationStatus=" + this.f4195c + ", authToken=" + this.f4196d + ", refreshToken=" + this.f4197e + ", expiresInSecs=" + this.f4198f + ", tokenCreationEpochInSecs=" + this.f4199g + ", fisError=" + this.f4200h + "}";
    }

    public a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.b = str;
        this.f4195c = aVar;
        this.f4196d = str2;
        this.f4197e = str3;
        this.f4198f = j10;
        this.f4199g = j11;
        this.f4200h = str4;
    }
}
