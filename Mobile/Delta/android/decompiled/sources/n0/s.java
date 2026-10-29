package n0;

import android.util.Range;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class s extends t3 {
    public final Size b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f24823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.k0 f24824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Range<Integer> f24826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f24827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f24828h;

    public static final class b extends t3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Size f24829a;
        public Size b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g0.k0 f24830c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f24831d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Range<Integer> f24832e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public n1 f24833f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Boolean f24834g;

        @Override // n0.t3.a
        public t3 a() {
            String str = "";
            if (this.f24829a == null) {
                str = " resolution";
            }
            if (this.b == null) {
                str = str + " originalConfiguredResolution";
            }
            if (this.f24830c == null) {
                str = str + " dynamicRange";
            }
            if (this.f24831d == null) {
                str = str + " sessionType";
            }
            if (this.f24832e == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f24834g == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new s(this.f24829a, this.b, this.f24830c, this.f24831d.intValue(), this.f24832e, this.f24833f, this.f24834g.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n0.t3.a
        public t3.a b(g0.k0 k0Var) {
            if (k0Var == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f24830c = k0Var;
            return this;
        }

        @Override // n0.t3.a
        public t3.a c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f24832e = range;
            return this;
        }

        @Override // n0.t3.a
        public t3.a d(n1 n1Var) {
            this.f24833f = n1Var;
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
            this.f24829a = size;
            return this;
        }

        @Override // n0.t3.a
        public t3.a g(int i10) {
            this.f24831d = Integer.valueOf(i10);
            return this;
        }

        @Override // n0.t3.a
        public t3.a h(boolean z10) {
            this.f24834g = Boolean.valueOf(z10);
            return this;
        }

        public b() {
        }

        public b(t3 t3Var) {
            this.f24829a = t3Var.f();
            this.b = t3Var.e();
            this.f24830c = t3Var.b();
            this.f24831d = Integer.valueOf(t3Var.g());
            this.f24832e = t3Var.c();
            this.f24833f = t3Var.d();
            this.f24834g = Boolean.valueOf(t3Var.h());
        }
    }

    @Override // n0.t3
    public g0.k0 b() {
        return this.f24824d;
    }

    @Override // n0.t3
    public Range<Integer> c() {
        return this.f24826f;
    }

    @Override // n0.t3
    public n1 d() {
        return this.f24827g;
    }

    @Override // n0.t3
    public Size e() {
        return this.f24823c;
    }

    public boolean equals(Object obj) {
        n1 n1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t3) {
            t3 t3Var = (t3) obj;
            if (this.b.equals(t3Var.f()) && this.f24823c.equals(t3Var.e()) && this.f24824d.equals(t3Var.b()) && this.f24825e == t3Var.g() && this.f24826f.equals(t3Var.c()) && ((n1Var = this.f24827g) != null ? n1Var.equals(t3Var.d()) : t3Var.d() == null) && this.f24828h == t3Var.h()) {
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
        return this.f24825e;
    }

    @Override // n0.t3
    public boolean h() {
        return this.f24828h;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.f24823c.hashCode()) * 1000003) ^ this.f24824d.hashCode()) * 1000003) ^ this.f24825e) * 1000003) ^ this.f24826f.hashCode()) * 1000003;
        n1 n1Var = this.f24827g;
        return ((iHashCode ^ (n1Var == null ? 0 : n1Var.hashCode())) * 1000003) ^ (this.f24828h ? 1231 : 1237);
    }

    @Override // n0.t3
    public t3.a i() {
        return new b(this);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.b + ", originalConfiguredResolution=" + this.f24823c + ", dynamicRange=" + this.f24824d + ", sessionType=" + this.f24825e + ", expectedFrameRateRange=" + this.f24826f + ", implementationOptions=" + this.f24827g + ", zslDisabled=" + this.f24828h + "}";
    }

    public s(Size size, Size size2, g0.k0 k0Var, int i10, Range<Integer> range, n1 n1Var, boolean z10) {
        this.b = size;
        this.f24823c = size2;
        this.f24824d = k0Var;
        this.f24825e = i10;
        this.f24826f = range;
        this.f24827g = n1Var;
        this.f24828h = z10;
    }
}
