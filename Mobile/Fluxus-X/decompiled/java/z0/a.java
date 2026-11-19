package z0;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38808a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38810d;

    public static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f38811a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f38812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f38813d;

        @Override // z0.e.a
        public e a() {
            String str = this.f38811a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " glVersion";
            }
            if (this.b == null) {
                str2 = str2 + " eglVersion";
            }
            if (this.f38812c == null) {
                str2 = str2 + " glExtensions";
            }
            if (this.f38813d == null) {
                str2 = str2 + " eglExtensions";
            }
            if (str2.isEmpty()) {
                return new a(this.f38811a, this.b, this.f38812c, this.f38813d);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // z0.e.a
        public e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.f38813d = str;
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
            this.f38812c = str;
            return this;
        }

        @Override // z0.e.a
        public e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f38811a = str;
            return this;
        }
    }

    @Override // z0.e
    public String b() {
        return this.f38810d;
    }

    @Override // z0.e
    public String c() {
        return this.b;
    }

    @Override // z0.e
    public String d() {
        return this.f38809c;
    }

    @Override // z0.e
    public String e() {
        return this.f38808a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f38808a.equals(eVar.e()) && this.b.equals(eVar.c()) && this.f38809c.equals(eVar.d()) && this.f38810d.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f38808a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f38809c.hashCode()) * 1000003) ^ this.f38810d.hashCode();
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f38808a + ", eglVersion=" + this.b + ", glExtensions=" + this.f38809c + ", eglExtensions=" + this.f38810d + "}";
    }

    public a(String str, String str2, String str3, String str4) {
        this.f38808a = str;
        this.b = str2;
        this.f38809c = str3;
        this.f38810d = str4;
    }
}
