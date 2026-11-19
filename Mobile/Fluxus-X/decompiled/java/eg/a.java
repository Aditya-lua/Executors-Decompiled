package eg;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13445a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f13447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d.b f13448e;

    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f13449a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f13450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f f13451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d.b f13452e;

        @Override // eg.d.a
        public d a() {
            return new a(this.f13449a, this.b, this.f13450c, this.f13451d, this.f13452e);
        }

        @Override // eg.d.a
        public d.a b(f fVar) {
            this.f13451d = fVar;
            return this;
        }

        @Override // eg.d.a
        public d.a c(String str) {
            this.b = str;
            return this;
        }

        @Override // eg.d.a
        public d.a d(String str) {
            this.f13450c = str;
            return this;
        }

        @Override // eg.d.a
        public d.a e(d.b bVar) {
            this.f13452e = bVar;
            return this;
        }

        @Override // eg.d.a
        public d.a f(String str) {
            this.f13449a = str;
            return this;
        }
    }

    @Override // eg.d
    public f b() {
        return this.f13447d;
    }

    @Override // eg.d
    public String c() {
        return this.b;
    }

    @Override // eg.d
    public String d() {
        return this.f13446c;
    }

    @Override // eg.d
    public d.b e() {
        return this.f13448e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f13445a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f13446c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f13447d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f13448e;
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

    @Override // eg.d
    public String f() {
        return this.f13445a;
    }

    public int hashCode() {
        String str = this.f13445a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f13446c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f13447d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f13448e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f13445a + ", fid=" + this.b + ", refreshToken=" + this.f13446c + ", authToken=" + this.f13447d + ", responseCode=" + this.f13448e + "}";
    }

    public a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f13445a = str;
        this.b = str2;
        this.f13446c = str3;
        this.f13447d = fVar;
        this.f13448e = bVar;
    }
}
