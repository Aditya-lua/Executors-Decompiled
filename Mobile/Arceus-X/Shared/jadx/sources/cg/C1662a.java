package cg;

/* JADX INFO: renamed from: cg.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1662a extends AbstractC1665d {

    /* JADX INFO: renamed from: a */
    public final String f6403a;

    /* JADX INFO: renamed from: b */
    public final String f6404b;

    /* JADX INFO: renamed from: c */
    public final String f6405c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1667f f6406d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1665d.b f6407e;

    /* JADX INFO: renamed from: cg.a$b */
    public static final class b extends AbstractC1665d.a {

        /* JADX INFO: renamed from: a */
        public String f6408a;

        /* JADX INFO: renamed from: b */
        public String f6409b;

        /* JADX INFO: renamed from: c */
        public String f6410c;

        /* JADX INFO: renamed from: d */
        public AbstractC1667f f6411d;

        /* JADX INFO: renamed from: e */
        public AbstractC1665d.b f6412e;

        @Override // cg.AbstractC1665d.a
        /* JADX INFO: renamed from: a */
        public AbstractC1665d mo8330a() {
            return new C1662a(this.f6408a, this.f6409b, this.f6410c, this.f6411d, this.f6412e);
        }

        @Override // cg.AbstractC1665d.a
        /* JADX INFO: renamed from: b */
        public AbstractC1665d.a mo8331b(AbstractC1667f abstractC1667f) {
            this.f6411d = abstractC1667f;
            return this;
        }

        @Override // cg.AbstractC1665d.a
        /* JADX INFO: renamed from: c */
        public AbstractC1665d.a mo8332c(String str) {
            this.f6409b = str;
            return this;
        }

        @Override // cg.AbstractC1665d.a
        /* JADX INFO: renamed from: d */
        public AbstractC1665d.a mo8333d(String str) {
            this.f6410c = str;
            return this;
        }

        @Override // cg.AbstractC1665d.a
        /* JADX INFO: renamed from: e */
        public AbstractC1665d.a mo8334e(AbstractC1665d.b bVar) {
            this.f6412e = bVar;
            return this;
        }

        @Override // cg.AbstractC1665d.a
        /* JADX INFO: renamed from: f */
        public AbstractC1665d.a mo8335f(String str) {
            this.f6408a = str;
            return this;
        }
    }

    @Override // cg.AbstractC1665d
    /* JADX INFO: renamed from: b */
    public AbstractC1667f mo8325b() {
        return this.f6406d;
    }

    @Override // cg.AbstractC1665d
    /* JADX INFO: renamed from: c */
    public String mo8326c() {
        return this.f6404b;
    }

    @Override // cg.AbstractC1665d
    /* JADX INFO: renamed from: d */
    public String mo8327d() {
        return this.f6405c;
    }

    @Override // cg.AbstractC1665d
    /* JADX INFO: renamed from: e */
    public AbstractC1665d.b mo8328e() {
        return this.f6407e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1665d) {
            AbstractC1665d abstractC1665d = (AbstractC1665d) obj;
            String str = this.f6403a;
            if (str != null ? str.equals(abstractC1665d.mo8329f()) : abstractC1665d.mo8329f() == null) {
                String str2 = this.f6404b;
                if (str2 != null ? str2.equals(abstractC1665d.mo8326c()) : abstractC1665d.mo8326c() == null) {
                    String str3 = this.f6405c;
                    if (str3 != null ? str3.equals(abstractC1665d.mo8327d()) : abstractC1665d.mo8327d() == null) {
                        AbstractC1667f abstractC1667f = this.f6406d;
                        if (abstractC1667f != null ? abstractC1667f.equals(abstractC1665d.mo8325b()) : abstractC1665d.mo8325b() == null) {
                            AbstractC1665d.b bVar = this.f6407e;
                            if (bVar != null ? bVar.equals(abstractC1665d.mo8328e()) : abstractC1665d.mo8328e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // cg.AbstractC1665d
    /* JADX INFO: renamed from: f */
    public String mo8329f() {
        return this.f6403a;
    }

    public int hashCode() {
        String str = this.f6403a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f6404b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f6405c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC1667f abstractC1667f = this.f6406d;
        int iHashCode4 = (iHashCode3 ^ (abstractC1667f == null ? 0 : abstractC1667f.hashCode())) * 1000003;
        AbstractC1665d.b bVar = this.f6407e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f6403a + ", fid=" + this.f6404b + ", refreshToken=" + this.f6405c + ", authToken=" + this.f6406d + ", responseCode=" + this.f6407e + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1662a(String str, String str2, String str3, AbstractC1667f abstractC1667f, AbstractC1665d.b bVar) {
        this.f6403a = str;
        this.f6404b = str2;
        this.f6405c = str3;
        this.f6406d = abstractC1667f;
        this.f6407e = bVar;
    }
}
