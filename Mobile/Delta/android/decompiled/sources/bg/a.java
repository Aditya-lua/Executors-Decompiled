package bg;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4171a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f4173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d.b f4174e;

    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4175a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f4176c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f f4177d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d.b f4178e;

        @Override // bg.d.a
        public d a() {
            return new a(this.f4175a, this.b, this.f4176c, this.f4177d, this.f4178e);
        }

        @Override // bg.d.a
        public d.a b(f fVar) {
            this.f4177d = fVar;
            return this;
        }

        @Override // bg.d.a
        public d.a c(String str) {
            this.b = str;
            return this;
        }

        @Override // bg.d.a
        public d.a d(String str) {
            this.f4176c = str;
            return this;
        }

        @Override // bg.d.a
        public d.a e(d.b bVar) {
            this.f4178e = bVar;
            return this;
        }

        @Override // bg.d.a
        public d.a f(String str) {
            this.f4175a = str;
            return this;
        }
    }

    @Override // bg.d
    public f b() {
        return this.f4173d;
    }

    @Override // bg.d
    public String c() {
        return this.b;
    }

    @Override // bg.d
    public String d() {
        return this.f4172c;
    }

    @Override // bg.d
    public d.b e() {
        return this.f4174e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f4171a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f4172c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f4173d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f4174e;
                            if (bVar != null ? bVar.equals(dVar.e()) : dVar.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // bg.d
    public String f() {
        return this.f4171a;
    }

    public int hashCode() {
        String str = this.f4171a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4172c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f4173d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f4174e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f4171a + ", fid=" + this.b + ", refreshToken=" + this.f4172c + ", authToken=" + this.f4173d + ", responseCode=" + this.f4174e + "}";
    }

    public a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f4171a = str;
        this.b = str2;
        this.f4172c = str3;
        this.f4173d = fVar;
        this.f4174e = bVar;
    }
}
