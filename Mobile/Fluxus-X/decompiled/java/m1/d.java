package m1;

import android.util.Size;
import com.github.luben.zstd.BuildConfig;
import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22728a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4 f22729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f22730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q1 f22732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f22735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f22736j;

    public static final class b extends p1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f22737a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a4 f22738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Size f22739d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f22740e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public q1 f22741f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f22742g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f22743h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Integer f22744i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Integer f22745j;

        @Override // m1.p1.a
        public p1 a() {
            String str = this.f22737a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " mimeType";
            }
            if (this.b == null) {
                str2 = str2 + " profile";
            }
            if (this.f22738c == null) {
                str2 = str2 + " inputTimebase";
            }
            if (this.f22739d == null) {
                str2 = str2 + " resolution";
            }
            if (this.f22740e == null) {
                str2 = str2 + " colorFormat";
            }
            if (this.f22741f == null) {
                str2 = str2 + " dataSpace";
            }
            if (this.f22742g == null) {
                str2 = str2 + " captureFrameRate";
            }
            if (this.f22743h == null) {
                str2 = str2 + " encodeFrameRate";
            }
            if (this.f22744i == null) {
                str2 = str2 + " IFrameInterval";
            }
            if (this.f22745j == null) {
                str2 = str2 + " bitrate";
            }
            if (str2.isEmpty()) {
                return new d(this.f22737a, this.b.intValue(), this.f22738c, this.f22739d, this.f22740e.intValue(), this.f22741f, this.f22742g.intValue(), this.f22743h.intValue(), this.f22744i.intValue(), this.f22745j.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // m1.p1.a
        public p1.a b(int i10) {
            this.f22745j = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a c(int i10) {
            this.f22742g = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a d(int i10) {
            this.f22740e = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a e(q1 q1Var) {
            if (q1Var == null) {
                throw new NullPointerException("Null dataSpace");
            }
            this.f22741f = q1Var;
            return this;
        }

        @Override // m1.p1.a
        public p1.a f(int i10) {
            this.f22743h = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a g(int i10) {
            this.f22744i = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a h(a4 a4Var) {
            if (a4Var == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f22738c = a4Var;
            return this;
        }

        @Override // m1.p1.a
        public p1.a i(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f22737a = str;
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
            this.f22739d = size;
            return this;
        }

        public b() {
        }

        public b(p1 p1Var) {
            this.f22737a = p1Var.b();
            this.b = Integer.valueOf(p1Var.k());
            this.f22738c = p1Var.c();
            this.f22739d = p1Var.l();
            this.f22740e = Integer.valueOf(p1Var.g());
            this.f22741f = p1Var.h();
            this.f22742g = Integer.valueOf(p1Var.f());
            this.f22743h = Integer.valueOf(p1Var.i());
            this.f22744i = Integer.valueOf(p1Var.j());
            this.f22745j = Integer.valueOf(p1Var.e());
        }
    }

    @Override // m1.p1, m1.n
    public String b() {
        return this.f22728a;
    }

    @Override // m1.p1, m1.n
    public a4 c() {
        return this.f22729c;
    }

    @Override // m1.p1
    public int e() {
        return this.f22736j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f22728a.equals(p1Var.b()) && this.b == p1Var.k() && this.f22729c.equals(p1Var.c()) && this.f22730d.equals(p1Var.l()) && this.f22731e == p1Var.g() && this.f22732f.equals(p1Var.h()) && this.f22733g == p1Var.f() && this.f22734h == p1Var.i() && this.f22735i == p1Var.j() && this.f22736j == p1Var.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // m1.p1
    public int f() {
        return this.f22733g;
    }

    @Override // m1.p1
    public int g() {
        return this.f22731e;
    }

    @Override // m1.p1
    public q1 h() {
        return this.f22732f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f22728a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f22729c.hashCode()) * 1000003) ^ this.f22730d.hashCode()) * 1000003) ^ this.f22731e) * 1000003) ^ this.f22732f.hashCode()) * 1000003) ^ this.f22733g) * 1000003) ^ this.f22734h) * 1000003) ^ this.f22735i) * 1000003) ^ this.f22736j;
    }

    @Override // m1.p1
    public int i() {
        return this.f22734h;
    }

    @Override // m1.p1
    public int j() {
        return this.f22735i;
    }

    @Override // m1.p1
    public int k() {
        return this.b;
    }

    @Override // m1.p1
    public Size l() {
        return this.f22730d;
    }

    @Override // m1.p1
    public p1.a m() {
        return new b(this);
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.f22728a + ", profile=" + this.b + ", inputTimebase=" + this.f22729c + ", resolution=" + this.f22730d + ", colorFormat=" + this.f22731e + ", dataSpace=" + this.f22732f + ", captureFrameRate=" + this.f22733g + ", encodeFrameRate=" + this.f22734h + ", IFrameInterval=" + this.f22735i + ", bitrate=" + this.f22736j + "}";
    }

    public d(String str, int i10, a4 a4Var, Size size, int i11, q1 q1Var, int i12, int i13, int i14, int i15) {
        this.f22728a = str;
        this.b = i10;
        this.f22729c = a4Var;
        this.f22730d = size;
        this.f22731e = i11;
        this.f22732f = q1Var;
        this.f22733g = i12;
        this.f22734h = i13;
        this.f22735i = i14;
        this.f22736j = i15;
    }
}
