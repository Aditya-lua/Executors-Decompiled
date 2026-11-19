package dg;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f12393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f12397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f12398h;

    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f12399a;
        public c.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f12400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f12401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f12402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f12403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f12404g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte f12405h;

        @Override // dg.d.a
        public d a() {
            if (this.f12405h == 3 && this.b != null) {
                return new a(this.f12399a, this.b, this.f12400c, this.f12401d, this.f12402e, this.f12403f, this.f12404g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.b == null) {
                sb2.append(" registrationStatus");
            }
            if ((this.f12405h & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((this.f12405h & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // dg.d.a
        public d.a b(String str) {
            this.f12400c = str;
            return this;
        }

        @Override // dg.d.a
        public d.a c(long j10) {
            this.f12402e = j10;
            this.f12405h = (byte) (this.f12405h | 1);
            return this;
        }

        @Override // dg.d.a
        public d.a d(String str) {
            this.f12399a = str;
            return this;
        }

        @Override // dg.d.a
        public d.a e(String str) {
            this.f12404g = str;
            return this;
        }

        @Override // dg.d.a
        public d.a f(String str) {
            this.f12401d = str;
            return this;
        }

        @Override // dg.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.b = aVar;
            return this;
        }

        @Override // dg.d.a
        public d.a h(long j10) {
            this.f12403f = j10;
            this.f12405h = (byte) (this.f12405h | 2);
            return this;
        }

        public b() {
        }

        public b(d dVar) {
            this.f12399a = dVar.d();
            this.b = dVar.g();
            this.f12400c = dVar.b();
            this.f12401d = dVar.f();
            this.f12402e = dVar.c();
            this.f12403f = dVar.h();
            this.f12404g = dVar.e();
            this.f12405h = (byte) 3;
        }
    }

    @Override // dg.d
    public String b() {
        return this.f12394d;
    }

    @Override // dg.d
    public long c() {
        return this.f12396f;
    }

    @Override // dg.d
    public String d() {
        return this.b;
    }

    @Override // dg.d
    public String e() {
        return this.f12398h;
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
                if (this.f12393c.equals(dVar.g()) && ((str = this.f12394d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f12395e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f12396f == dVar.c() && this.f12397g == dVar.h() && ((str3 = this.f12398h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // dg.d
    public String f() {
        return this.f12395e;
    }

    @Override // dg.d
    @NonNull
    public c.a g() {
        return this.f12393c;
    }

    @Override // dg.d
    public long h() {
        return this.f12397g;
    }

    public int hashCode() {
        String str = this.b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f12393c.hashCode()) * 1000003;
        String str2 = this.f12394d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12395e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f12396f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f12397g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f12398h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // dg.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.b + ", registrationStatus=" + this.f12393c + ", authToken=" + this.f12394d + ", refreshToken=" + this.f12395e + ", expiresInSecs=" + this.f12396f + ", tokenCreationEpochInSecs=" + this.f12397g + ", fisError=" + this.f12398h + "}";
    }

    public a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.b = str;
        this.f12393c = aVar;
        this.f12394d = str2;
        this.f12395e = str3;
        this.f12396f = j10;
        this.f12397g = j11;
        this.f12398h = str4;
    }
}
