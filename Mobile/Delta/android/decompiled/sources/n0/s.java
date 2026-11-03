package n0;

import android.util.Range;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class s extends t3 {
    public final Size b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f25644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.k0 f25645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Range<Integer> f25647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f25648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f25649h;

    public static final class b extends t3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Size f25650a;
        public Size b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g0.k0 f25651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f25652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Range<Integer> f25653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public n1 f25654f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Boolean f25655g;

        @Override // n0.t3.a
        public t3 a() {
            String str = "";
            if (this.f25650a == null) {
                str = " resolution";
            }
            if (this.b == null) {
                str = str + " originalConfiguredResolution";
            }
            if (this.f25651c == null) {
                str = str + " dynamicRange";
            }
            if (this.f25652d == null) {
                str = str + " sessionType";
            }
            if (this.f25653e == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f25655g == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new s(this.f25650a, this.b, this.f25651c, this.f25652d.intValue(), this.f25653e, this.f25654f, this.f25655g.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n0.t3.a
        public t3.a b(g0.k0 k0Var) {
            if (k0Var == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f25651c = k0Var;
            return this;
        }

        @Override // n0.t3.a
        public t3.a c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f25653e = range;
            return this;
        }

        @Override // n0.t3.a
        public t3.a d(n1 n1Var) {
            this.f25654f = n1Var;
            return this;
        }

        @Override // n0.t3.a
        public t3.a e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null originalConfiguredResolution");
            }
            this.b = size;
            return this;
        }

        @Override // n0.t3.a
        public t3.a f(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f25650a = size;
            return this;
        }

        @Override // n0.t3.a
        public t3.a g(int i10) {
            this.f25652d = Integer.valueOf(i10);
            return this;
        }

        @Override // n0.t3.a
        public t3.a h(boolean z10) {
            this.f25655g = Boolean.valueOf(z10);
            return this;
        }

        public b() {
        }

        public b(t3 t3Var) {
            this.f25650a = t3Var.f();
            this.b = t3Var.e();
            this.f25651c = t3Var.b();
            this.f25652d = Integer.valueOf(t3Var.g());
            this.f25653e = t3Var.c();
            this.f25654f = t3Var.d();
            this.f25655g = Boolean.valueOf(t3Var.h());
        }
    }

    @Override // n0.t3
    public g0.k0 b() {
        return this.f25645d;
    }

    @Override // n0.t3
    public Range<Integer> c() {
        return this.f25647f;
    }

    @Override // n0.t3
    public n1 d() {
        return this.f25648g;
    }

    @Override // n0.t3
    public Size e() {
        return this.f25644c;
    }

    public boolean equals(Object obj) {
        n1 n1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t3) {
            t3 t3Var = (t3) obj;
            if (this.b.equals(t3Var.f()) && this.f25644c.equals(t3Var.e()) && this.f25645d.equals(t3Var.b()) && this.f25646e == t3Var.g() && this.f25647f.equals(t3Var.c()) && ((n1Var = this.f25648g) != null ? n1Var.equals(t3Var.d()) : t3Var.d() == null) && this.f25649h == t3Var.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.t3
    public Size f() {
        return this.b;
    }

    @Override // n0.t3
    public int g() {
        return this.f25646e;
    }

    @Override // n0.t3
    public boolean h() {
        return this.f25649h;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.f25644c.hashCode()) * 1000003) ^ this.f25645d.hashCode()) * 1000003) ^ this.f25646e) * 1000003) ^ this.f25647f.hashCode()) * 1000003;
        n1 n1Var = this.f25648g;
        return ((iHashCode ^ (n1Var == null ? 0 : n1Var.hashCode())) * 1000003) ^ (this.f25649h ? 1231 : 1237);
    }

    @Override // n0.t3
    public t3.a i() {
        return new b(this);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.b + ", originalConfiguredResolution=" + this.f25644c + ", dynamicRange=" + this.f25645d + ", sessionType=" + this.f25646e + ", expectedFrameRateRange=" + this.f25647f + ", implementationOptions=" + this.f25648g + ", zslDisabled=" + this.f25649h + "}";
    }

    public s(Size size, Size size2, g0.k0 k0Var, int i10, Range<Integer> range, n1 n1Var, boolean z10) {
        this.b = size;
        this.f25644c = size2;
        this.f25645d = k0Var;
        this.f25646e = i10;
        this.f25647f = range;
        this.f25648g = n1Var;
        this.f25649h = z10;
    }
}
