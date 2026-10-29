package p590z0;

/* JADX INFO: renamed from: z0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13672a extends AbstractC13676e {

    /* JADX INFO: renamed from: a */
    public final String f47926a;

    /* JADX INFO: renamed from: b */
    public final String f47927b;

    /* JADX INFO: renamed from: c */
    public final String f47928c;

    /* JADX INFO: renamed from: d */
    public final String f47929d;

    /* JADX INFO: renamed from: z0.a$b */
    public static final class b extends AbstractC13676e.a {

        /* JADX INFO: renamed from: a */
        public String f47930a;

        /* JADX INFO: renamed from: b */
        public String f47931b;

        /* JADX INFO: renamed from: c */
        public String f47932c;

        /* JADX INFO: renamed from: d */
        public String f47933d;

        @Override // p590z0.AbstractC13676e.a
        /* JADX INFO: renamed from: a */
        public AbstractC13676e mo49850a() {
            String str = "";
            if (this.f47930a == null) {
                str = " glVersion";
            }
            if (this.f47931b == null) {
                str = str + " eglVersion";
            }
            if (this.f47932c == null) {
                str = str + " glExtensions";
            }
            if (this.f47933d == null) {
                str = str + " eglExtensions";
            }
            if (str.isEmpty()) {
                return new C13672a(this.f47930a, this.f47931b, this.f47932c, this.f47933d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p590z0.AbstractC13676e.a
        /* JADX INFO: renamed from: b */
        public AbstractC13676e.a mo49851b(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.f47933d = str;
            return this;
        }

        @Override // p590z0.AbstractC13676e.a
        /* JADX INFO: renamed from: c */
        public AbstractC13676e.a mo49852c(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.f47931b = str;
            return this;
        }

        @Override // p590z0.AbstractC13676e.a
        /* JADX INFO: renamed from: d */
        public AbstractC13676e.a mo49853d(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.f47932c = str;
            return this;
        }

        @Override // p590z0.AbstractC13676e.a
        /* JADX INFO: renamed from: e */
        public AbstractC13676e.a mo49854e(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f47930a = str;
            return this;
        }
    }

    @Override // p590z0.AbstractC13676e
    /* JADX INFO: renamed from: b */
    public String mo49846b() {
        return this.f47929d;
    }

    @Override // p590z0.AbstractC13676e
    /* JADX INFO: renamed from: c */
    public String mo49847c() {
        return this.f47927b;
    }

    @Override // p590z0.AbstractC13676e
    /* JADX INFO: renamed from: d */
    public String mo49848d() {
        return this.f47928c;
    }

    @Override // p590z0.AbstractC13676e
    /* JADX INFO: renamed from: e */
    public String mo49849e() {
        return this.f47926a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13676e) {
            AbstractC13676e abstractC13676e = (AbstractC13676e) obj;
            if (this.f47926a.equals(abstractC13676e.mo49849e()) && this.f47927b.equals(abstractC13676e.mo49847c()) && this.f47928c.equals(abstractC13676e.mo49848d()) && this.f47929d.equals(abstractC13676e.mo49846b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f47926a.hashCode() ^ 1000003) * 1000003) ^ this.f47927b.hashCode()) * 1000003) ^ this.f47928c.hashCode()) * 1000003) ^ this.f47929d.hashCode();
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f47926a + ", eglVersion=" + this.f47927b + ", glExtensions=" + this.f47928c + ", eglExtensions=" + this.f47929d + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C13672a(String str, String str2, String str3, String str4) {
        this.f47926a = str;
        this.f47927b = str2;
        this.f47928c = str3;
        this.f47929d = str4;
    }
}
