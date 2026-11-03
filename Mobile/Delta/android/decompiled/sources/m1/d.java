package m1;

import android.util.Size;
import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24368a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4 f24369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f24370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q1 f24372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f24376j;

    public static final class b extends p1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f24377a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a4 f24378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Size f24379d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f24380e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public q1 f24381f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f24382g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f24383h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Integer f24384i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Integer f24385j;

        @Override // m1.p1.a
        public p1 a() {
            String str = "";
            if (this.f24377a == null) {
                str = " mimeType";
            }
            if (this.b == null) {
                str = str + " profile";
            }
            if (this.f24378c == null) {
                str = str + " inputTimebase";
            }
            if (this.f24379d == null) {
                str = str + " resolution";
            }
            if (this.f24380e == null) {
                str = str + " colorFormat";
            }
            if (this.f24381f == null) {
                str = str + " dataSpace";
            }
            if (this.f24382g == null) {
                str = str + " captureFrameRate";
            }
            if (this.f24383h == null) {
                str = str + " encodeFrameRate";
            }
            if (this.f24384i == null) {
                str = str + " IFrameInterval";
            }
            if (this.f24385j == null) {
                str = str + " bitrate";
            }
            if (str.isEmpty()) {
                return new d(this.f24377a, this.b.intValue(), this.f24378c, this.f24379d, this.f24380e.intValue(), this.f24381f, this.f24382g.intValue(), this.f24383h.intValue(), this.f24384i.intValue(), this.f24385j.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // m1.p1.a
        public p1.a b(int i10) {
            this.f24385j = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a c(int i10) {
            this.f24382g = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a d(int i10) {
            this.f24380e = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a e(q1 q1Var) {
            if (q1Var == null) {
                throw new NullPointerException("Null dataSpace");
            }
            this.f24381f = q1Var;
            return this;
        }

        @Override // m1.p1.a
        public p1.a f(int i10) {
            this.f24383h = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a g(int i10) {
            this.f24384i = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a h(a4 a4Var) {
            if (a4Var == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f24378c = a4Var;
            return this;
        }

        @Override // m1.p1.a
        public p1.a i(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f24377a = str;
            return this;
        }

        @Override // m1.p1.a
        public p1.a j(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a k(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f24379d = size;
            return this;
        }

        public b() {
        }

        public b(p1 p1Var) {
            this.f24377a = p1Var.b();
            this.b = Integer.valueOf(p1Var.k());
            this.f24378c = p1Var.c();
            this.f24379d = p1Var.l();
            this.f24380e = Integer.valueOf(p1Var.g());
            this.f24381f = p1Var.h();
            this.f24382g = Integer.valueOf(p1Var.f());
            this.f24383h = Integer.valueOf(p1Var.i());
            this.f24384i = Integer.valueOf(p1Var.j());
            this.f24385j = Integer.valueOf(p1Var.e());
        }
    }

    @Override // m1.p1, m1.n
    public String b() {
        return this.f24368a;
    }

    @Override // m1.p1, m1.n
    public a4 c() {
        return this.f24369c;
    }

    @Override // m1.p1
    public int e() {
        return this.f24376j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f24368a.equals(p1Var.b()) && this.b == p1Var.k() && this.f24369c.equals(p1Var.c()) && this.f24370d.equals(p1Var.l()) && this.f24371e == p1Var.g() && this.f24372f.equals(p1Var.h()) && this.f24373g == p1Var.f() && this.f24374h == p1Var.i() && this.f24375i == p1Var.j() && this.f24376j == p1Var.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // m1.p1
    public int f() {
        return this.f24373g;
    }

    @Override // m1.p1
    public int g() {
        return this.f24371e;
    }

    @Override // m1.p1
    public q1 h() {
        return this.f24372f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f24368a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f24369c.hashCode()) * 1000003) ^ this.f24370d.hashCode()) * 1000003) ^ this.f24371e) * 1000003) ^ this.f24372f.hashCode()) * 1000003) ^ this.f24373g) * 1000003) ^ this.f24374h) * 1000003) ^ this.f24375i) * 1000003) ^ this.f24376j;
    }

    @Override // m1.p1
    public int i() {
        return this.f24374h;
    }

    @Override // m1.p1
    public int j() {
        return this.f24375i;
    }

    @Override // m1.p1
    public int k() {
        return this.b;
    }

    @Override // m1.p1
    public Size l() {
        return this.f24370d;
    }

    @Override // m1.p1
    public p1.a m() {
        return new b(this);
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.f24368a + ", profile=" + this.b + ", inputTimebase=" + this.f24369c + ", resolution=" + this.f24370d + ", colorFormat=" + this.f24371e + ", dataSpace=" + this.f24372f + ", captureFrameRate=" + this.f24373g + ", encodeFrameRate=" + this.f24374h + ", IFrameInterval=" + this.f24375i + ", bitrate=" + this.f24376j + "}";
    }

    public d(String str, int i10, a4 a4Var, Size size, int i11, q1 q1Var, int i12, int i13, int i14, int i15) {
        this.f24368a = str;
        this.b = i10;
        this.f24369c = a4Var;
        this.f24370d = size;
        this.f24371e = i11;
        this.f24372f = q1Var;
        this.f24373g = i12;
        this.f24374h = i13;
        this.f24375i = i14;
        this.f24376j = i15;
    }
}
