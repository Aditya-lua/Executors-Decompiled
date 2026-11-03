package z0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37703a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37705d;

    public static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f37706a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f37707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f37708d;

        @Override // z0.e.a
        public e a() {
            String str = "";
            if (this.f37706a == null) {
                str = " glVersion";
            }
            if (this.b == null) {
                str = str + " eglVersion";
            }
            if (this.f37707c == null) {
                str = str + " glExtensions";
            }
            if (this.f37708d == null) {
                str = str + " eglExtensions";
            }
            if (str.isEmpty()) {
                return new a(this.f37706a, this.b, this.f37707c, this.f37708d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // z0.e.a
        public e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.f37708d = str;
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
            this.f37707c = str;
            return this;
        }

        @Override // z0.e.a
        public e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f37706a = str;
            return this;
        }
    }

    @Override // z0.e
    public String b() {
        return this.f37705d;
    }

    @Override // z0.e
    public String c() {
        return this.b;
    }

    @Override // z0.e
    public String d() {
        return this.f37704c;
    }

    @Override // z0.e
    public String e() {
        return this.f37703a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f37703a.equals(eVar.e()) && this.b.equals(eVar.c()) && this.f37704c.equals(eVar.d()) && this.f37705d.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f37703a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f37704c.hashCode()) * 1000003) ^ this.f37705d.hashCode();
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f37703a + ", eglVersion=" + this.b + ", glExtensions=" + this.f37704c + ", eglExtensions=" + this.f37705d + "}";
    }

    public a(String str, String str2, String str3, String str4) {
        this.f37703a = str;
        this.b = str2;
        this.f37704c = str3;
        this.f37705d = str4;
    }
}
