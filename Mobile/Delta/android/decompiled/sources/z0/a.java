package z0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37008a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37010d;

    public static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f37011a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f37012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f37013d;

        @Override // z0.e.a
        public e a() {
            String str = "";
            if (this.f37011a == null) {
                str = " glVersion";
            }
            if (this.b == null) {
                str = str + " eglVersion";
            }
            if (this.f37012c == null) {
                str = str + " glExtensions";
            }
            if (this.f37013d == null) {
                str = str + " eglExtensions";
            }
            if (str.isEmpty()) {
                return new a(this.f37011a, this.b, this.f37012c, this.f37013d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // z0.e.a
        public e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.f37013d = str;
            return this;
        }

        @Override // z0.e.a
        public e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.b = str;
            return this;
        }

        @Override // z0.e.a
        public e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.f37012c = str;
            return this;
        }

        @Override // z0.e.a
        public e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f37011a = str;
            return this;
        }
    }

    @Override // z0.e
    public String b() {
        return this.f37010d;
    }

    @Override // z0.e
    public String c() {
        return this.b;
    }

    @Override // z0.e
    public String d() {
        return this.f37009c;
    }

    @Override // z0.e
    public String e() {
        return this.f37008a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f37008a.equals(eVar.e()) && this.b.equals(eVar.c()) && this.f37009c.equals(eVar.d()) && this.f37010d.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f37008a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f37009c.hashCode()) * 1000003) ^ this.f37010d.hashCode();
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f37008a + ", eglVersion=" + this.b + ", glExtensions=" + this.f37009c + ", eglExtensions=" + this.f37010d + "}";
    }

    public a(String str, String str2, String str3, String str4) {
        this.f37008a = str;
        this.b = str2;
        this.f37009c = str3;
        this.f37010d = str4;
    }
}
