package m1;

import android.util.Size;
import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23718a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4 f23719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f23720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q1 f23722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f23725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f23726j;

    public static final class b extends p1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f23727a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a4 f23728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Size f23729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f23730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public q1 f23731f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f23732g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f23733h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Integer f23734i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Integer f23735j;

        @Override // m1.p1.a
        public p1 a() {
            String str = "";
            if (this.f23727a == null) {
                str = " mimeType";
            }
            if (this.b == null) {
                str = str + " profile";
            }
            if (this.f23728c == null) {
                str = str + " inputTimebase";
            }
            if (this.f23729d == null) {
                str = str + " resolution";
            }
            if (this.f23730e == null) {
                str = str + " colorFormat";
            }
            if (this.f23731f == null) {
                str = str + " dataSpace";
            }
            if (this.f23732g == null) {
                str = str + " captureFrameRate";
            }
            if (this.f23733h == null) {
                str = str + " encodeFrameRate";
            }
            if (this.f23734i == null) {
                str = str + " IFrameInterval";
            }
            if (this.f23735j == null) {
                str = str + " bitrate";
            }
            if (str.isEmpty()) {
                return new d(this.f23727a, this.b.intValue(), this.f23728c, this.f23729d, this.f23730e.intValue(), this.f23731f, this.f23732g.intValue(), this.f23733h.intValue(), this.f23734i.intValue(), this.f23735j.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // m1.p1.a
        public p1.a b(int i10) {
            this.f23735j = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a c(int i10) {
            this.f23732g = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a d(int i10) {
            this.f23730e = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a e(q1 q1Var) {
            if (q1Var == null) {
                throw new NullPointerException("Null dataSpace");
            }
            this.f23731f = q1Var;
            return this;
        }

        @Override // m1.p1.a
        public p1.a f(int i10) {
            this.f23733h = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a g(int i10) {
            this.f23734i = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a h(a4 a4Var) {
            if (a4Var == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f23728c = a4Var;
            return this;
        }

        @Override // m1.p1.a
        public p1.a i(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f23727a = str;
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
            this.f23729d = size;
            return this;
        }

        public b() {
        }

        public b(p1 p1Var) {
            this.f23727a = p1Var.b();
            this.b = Integer.valueOf(p1Var.k());
            this.f23728c = p1Var.c();
            this.f23729d = p1Var.l();
            this.f23730e = Integer.valueOf(p1Var.g());
            this.f23731f = p1Var.h();
            this.f23732g = Integer.valueOf(p1Var.f());
            this.f23733h = Integer.valueOf(p1Var.i());
            this.f23734i = Integer.valueOf(p1Var.j());
            this.f23735j = Integer.valueOf(p1Var.e());
        }
    }

    @Override // m1.p1, m1.n
    public String b() {
        return this.f23718a;
    }

    @Override // m1.p1, m1.n
    public a4 c() {
        return this.f23719c;
    }

    @Override // m1.p1
    public int e() {
        return this.f23726j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f23718a.equals(p1Var.b()) && this.b == p1Var.k() && this.f23719c.equals(p1Var.c()) && this.f23720d.equals(p1Var.l()) && this.f23721e == p1Var.g() && this.f23722f.equals(p1Var.h()) && this.f23723g == p1Var.f() && this.f23724h == p1Var.i() && this.f23725i == p1Var.j() && this.f23726j == p1Var.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // m1.p1
    public int f() {
        return this.f23723g;
    }

    @Override // m1.p1
    public int g() {
        return this.f23721e;
    }

    @Override // m1.p1
    public q1 h() {
        return this.f23722f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f23718a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f23719c.hashCode()) * 1000003) ^ this.f23720d.hashCode()) * 1000003) ^ this.f23721e) * 1000003) ^ this.f23722f.hashCode()) * 1000003) ^ this.f23723g) * 1000003) ^ this.f23724h) * 1000003) ^ this.f23725i) * 1000003) ^ this.f23726j;
    }

    @Override // m1.p1
    public int i() {
        return this.f23724h;
    }

    @Override // m1.p1
    public int j() {
        return this.f23725i;
    }

    @Override // m1.p1
    public int k() {
        return this.b;
    }

    @Override // m1.p1
    public Size l() {
        return this.f23720d;
    }

    @Override // m1.p1
    public p1.a m() {
        return new b(this);
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.f23718a + ", profile=" + this.b + ", inputTimebase=" + this.f23719c + ", resolution=" + this.f23720d + ", colorFormat=" + this.f23721e + ", dataSpace=" + this.f23722f + ", captureFrameRate=" + this.f23723g + ", encodeFrameRate=" + this.f23724h + ", IFrameInterval=" + this.f23725i + ", bitrate=" + this.f23726j + "}";
    }

    public d(String str, int i10, a4 a4Var, Size size, int i11, q1 q1Var, int i12, int i13, int i14, int i15) {
        this.f23718a = str;
        this.b = i10;
        this.f23719c = a4Var;
        this.f23720d = size;
        this.f23721e = i11;
        this.f23722f = q1Var;
        this.f23723g = i12;
        this.f23724h = i13;
        this.f23725i = i14;
        this.f23726j = i15;
    }
}
