package m1;

import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public final class c extends m1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23704a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4 f23705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23709g;

    public static final class b extends m1.a.AbstractC0418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f23710a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a4 f23711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f23712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f23713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Integer f23714f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f23715g;

        @Override // m1.a.AbstractC0418a
        public m1.a a() {
            String str = "";
            if (this.f23710a == null) {
                str = " mimeType";
            }
            if (this.b == null) {
                str = str + " profile";
            }
            if (this.f23711c == null) {
                str = str + " inputTimebase";
            }
            if (this.f23712d == null) {
                str = str + " bitrate";
            }
            if (this.f23713e == null) {
                str = str + " captureSampleRate";
            }
            if (this.f23714f == null) {
                str = str + " encodeSampleRate";
            }
            if (this.f23715g == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new c(this.f23710a, this.b.intValue(), this.f23711c, this.f23712d.intValue(), this.f23713e.intValue(), this.f23714f.intValue(), this.f23715g.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // m1.a.AbstractC0418a
        public m1.a.AbstractC0418a c(int i10) {
            this.f23712d = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.a.AbstractC0418a
        public m1.a.AbstractC0418a d(int i10) {
            this.f23713e = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.a.AbstractC0418a
        public m1.a.AbstractC0418a e(int i10) {
            this.f23715g = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.a.AbstractC0418a
        public m1.a.AbstractC0418a f(int i10) {
            this.f23714f = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.a.AbstractC0418a
        public m1.a.AbstractC0418a g(a4 a4Var) {
            if (a4Var == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f23711c = a4Var;
            return this;
        }

        @Override // m1.a.AbstractC0418a
        public m1.a.AbstractC0418a h(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f23710a = str;
            return this;
        }

        @Override // m1.a.AbstractC0418a
        public m1.a.AbstractC0418a i(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // m1.a, m1.n
    public String b() {
        return this.f23704a;
    }

    @Override // m1.a, m1.n
    public a4 c() {
        return this.f23705c;
    }

    @Override // m1.a
    public int e() {
        return this.f23706d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1.a) {
            m1.a aVar = (m1.a) obj;
            if (this.f23704a.equals(aVar.b()) && this.b == aVar.i() && this.f23705c.equals(aVar.c()) && this.f23706d == aVar.e() && this.f23707e == aVar.f() && this.f23708f == aVar.h() && this.f23709g == aVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // m1.a
    public int f() {
        return this.f23707e;
    }

    @Override // m1.a
    public int g() {
        return this.f23709g;
    }

    @Override // m1.a
    public int h() {
        return this.f23708f;
    }

    public int hashCode() {
        return ((((((((((((this.f23704a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f23705c.hashCode()) * 1000003) ^ this.f23706d) * 1000003) ^ this.f23707e) * 1000003) ^ this.f23708f) * 1000003) ^ this.f23709g;
    }

    @Override // m1.a
    public int i() {
        return this.b;
    }

    public String toString() {
        return "AudioEncoderConfig{mimeType=" + this.f23704a + ", profile=" + this.b + ", inputTimebase=" + this.f23705c + ", bitrate=" + this.f23706d + ", captureSampleRate=" + this.f23707e + ", encodeSampleRate=" + this.f23708f + ", channelCount=" + this.f23709g + "}";
    }

    public c(String str, int i10, a4 a4Var, int i11, int i12, int i13, int i14) {
        this.f23704a = str;
        this.b = i10;
        this.f23705c = a4Var;
        this.f23706d = i11;
        this.f23707e = i12;
        this.f23708f = i13;
        this.f23709g = i14;
    }
}
