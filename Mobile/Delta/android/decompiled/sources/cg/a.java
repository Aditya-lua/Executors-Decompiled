package cg;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4942a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f4944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d.b f4945e;

    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4946a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f4947c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f f4948d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d.b f4949e;

        @Override // cg.d.a
        public d a() {
            return new a(this.f4946a, this.b, this.f4947c, this.f4948d, this.f4949e);
        }

        @Override // cg.d.a
        public d.a b(f fVar) {
            this.f4948d = fVar;
            return this;
        }

        @Override // cg.d.a
        public d.a c(String str) {
            this.b = str;
            return this;
        }

        @Override // cg.d.a
        public d.a d(String str) {
            this.f4947c = str;
            return this;
        }

        @Override // cg.d.a
        public d.a e(d.b bVar) {
            this.f4949e = bVar;
            return this;
        }

        @Override // cg.d.a
        public d.a f(String str) {
            this.f4946a = str;
            return this;
        }
    }

    @Override // cg.d
    public f b() {
        return this.f4944d;
    }

    @Override // cg.d
    public String c() {
        return this.b;
    }

    @Override // cg.d
    public String d() {
        return this.f4943c;
    }

    @Override // cg.d
    public d.b e() {
        return this.f4945e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f4942a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f4943c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f4944d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f4945e;
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

    @Override // cg.d
    public String f() {
        return this.f4942a;
    }

    public int hashCode() {
        String str = this.f4942a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4943c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f4944d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f4945e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f4942a + ", fid=" + this.b + ", refreshToken=" + this.f4943c + ", authToken=" + this.f4944d + ", responseCode=" + this.f4945e + "}";
    }

    public a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f4942a = str;
        this.b = str2;
        this.f4943c = str3;
        this.f4944d = fVar;
        this.f4945e = bVar;
    }
}
