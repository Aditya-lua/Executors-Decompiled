package m1;

import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public final class c extends m1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24354a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4 f24355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24359g;

    public static final class b extends m1.a.AbstractC0432a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f24360a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a4 f24361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f24362d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f24363e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Integer f24364f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f24365g;

        @Override // m1.a.AbstractC0432a
        public m1.a a() {
            String str = "";
            if (this.f24360a == null) {
                str = " mimeType";
            }
            if (this.b == null) {
                str = str + " profile";
            }
            if (this.f24361c == null) {
                str = str + " inputTimebase";
            }
            if (this.f24362d == null) {
                str = str + " bitrate";
            }
            if (this.f24363e == null) {
                str = str + " captureSampleRate";
            }
            if (this.f24364f == null) {
                str = str + " encodeSampleRate";
            }
            if (this.f24365g == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new c(this.f24360a, this.b.intValue(), this.f24361c, this.f24362d.intValue(), this.f24363e.intValue(), this.f24364f.intValue(), this.f24365g.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // m1.a.AbstractC0432a
        public m1.a.AbstractC0432a c(int i10) {
            this.f24362d = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.a.AbstractC0432a
        public m1.a.AbstractC0432a d(int i10) {
            this.f24363e = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.a.AbstractC0432a
        public m1.a.AbstractC0432a e(int i10) {
            this.f24365g = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.a.AbstractC0432a
        public m1.a.AbstractC0432a f(int i10) {
            this.f24364f = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.a.AbstractC0432a
        public m1.a.AbstractC0432a g(a4 a4Var) {
            if (a4Var == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f24361c = a4Var;
            return this;
        }

        @Override // m1.a.AbstractC0432a
        public m1.a.AbstractC0432a h(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f24360a = str;
            return this;
        }

        @Override // m1.a.AbstractC0432a
        public m1.a.AbstractC0432a i(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // m1.a, m1.n
    public String b() {
        return this.f24354a;
    }

    @Override // m1.a, m1.n
    public a4 c() {
        return this.f24355c;
    }

    @Override // m1.a
    public int e() {
        return this.f24356d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1.a) {
            m1.a aVar = (m1.a) obj;
            if (this.f24354a.equals(aVar.b()) && this.b == aVar.i() && this.f24355c.equals(aVar.c()) && this.f24356d == aVar.e() && this.f24357e == aVar.f() && this.f24358f == aVar.h() && this.f24359g == aVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // m1.a
    public int f() {
        return this.f24357e;
    }

    @Override // m1.a
    public int g() {
        return this.f24359g;
    }

    @Override // m1.a
    public int h() {
        return this.f24358f;
    }

    public int hashCode() {
        return ((((((((((((this.f24354a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f24355c.hashCode()) * 1000003) ^ this.f24356d) * 1000003) ^ this.f24357e) * 1000003) ^ this.f24358f) * 1000003) ^ this.f24359g;
    }

    @Override // m1.a
    public int i() {
        return this.b;
    }

    public String toString() {
        return "AudioEncoderConfig{mimeType=" + this.f24354a + ", profile=" + this.b + ", inputTimebase=" + this.f24355c + ", bitrate=" + this.f24356d + ", captureSampleRate=" + this.f24357e + ", encodeSampleRate=" + this.f24358f + ", channelCount=" + this.f24359g + "}";
    }

    public c(String str, int i10, a4 a4Var, int i11, int i12, int i13, int i14) {
        this.f24354a = str;
        this.b = i10;
        this.f24355c = a4Var;
        this.f24356d = i11;
        this.f24357e = i12;
        this.f24358f = i13;
        this.f24359g = i14;
    }
}
