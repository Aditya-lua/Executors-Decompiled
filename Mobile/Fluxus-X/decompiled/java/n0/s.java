package n0;

import android.util.Range;
import android.util.Size;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class s extends t3 {
    public final Size b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f25121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.k0 f25122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Range<Integer> f25124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f25125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f25126h;

    public static final class b extends t3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Size f25127a;
        public Size b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g0.k0 f25128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f25129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Range<Integer> f25130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public n1 f25131f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Boolean f25132g;

        @Override // n0.t3.a
        public t3 a() {
            Size size = this.f25127a;
            String str = BuildConfig.FLAVOR;
            if (size == null) {
                str = BuildConfig.FLAVOR + " resolution";
            }
            if (this.b == null) {
                str = str + " originalConfiguredResolution";
            }
            if (this.f25128c == null) {
                str = str + " dynamicRange";
            }
            if (this.f25129d == null) {
                str = str + " sessionType";
            }
            if (this.f25130e == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f25132g == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new s(this.f25127a, this.b, this.f25128c, this.f25129d.intValue(), this.f25130e, this.f25131f, this.f25132g.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n0.t3.a
        public t3.a b(g0.k0 k0Var) {
            if (k0Var == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f25128c = k0Var;
            return this;
        }

        @Override // n0.t3.a
        public t3.a c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f25130e = range;
            return this;
        }

        @Override // n0.t3.a
        public t3.a d(n1 n1Var) {
            this.f25131f = n1Var;
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
            this.f25127a = size;
            return this;
        }

        @Override // n0.t3.a
        public t3.a g(int i10) {
            this.f25129d = Integer.valueOf(i10);
            return this;
        }

        @Override // n0.t3.a
        public t3.a h(boolean z10) {
            this.f25132g = Boolean.valueOf(z10);
            return this;
        }

        public b() {
        }

        public b(t3 t3Var) {
            this.f25127a = t3Var.f();
            this.b = t3Var.e();
            this.f25128c = t3Var.b();
            this.f25129d = Integer.valueOf(t3Var.g());
            this.f25130e = t3Var.c();
            this.f25131f = t3Var.d();
            this.f25132g = Boolean.valueOf(t3Var.h());
        }
    }

    @Override // n0.t3
    public g0.k0 b() {
        return this.f25122d;
    }

    @Override // n0.t3
    public Range<Integer> c() {
        return this.f25124f;
    }

    @Override // n0.t3
    public n1 d() {
        return this.f25125g;
    }

    @Override // n0.t3
    public Size e() {
        return this.f25121c;
    }

    public boolean equals(Object obj) {
        n1 n1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t3) {
            t3 t3Var = (t3) obj;
            if (this.b.equals(t3Var.f()) && this.f25121c.equals(t3Var.e()) && this.f25122d.equals(t3Var.b()) && this.f25123e == t3Var.g() && this.f25124f.equals(t3Var.c()) && ((n1Var = this.f25125g) != null ? n1Var.equals(t3Var.d()) : t3Var.d() == null) && this.f25126h == t3Var.h()) {
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
        return this.f25123e;
    }

    @Override // n0.t3
    public boolean h() {
        return this.f25126h;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.f25121c.hashCode()) * 1000003) ^ this.f25122d.hashCode()) * 1000003) ^ this.f25123e) * 1000003) ^ this.f25124f.hashCode()) * 1000003;
        n1 n1Var = this.f25125g;
        return ((iHashCode ^ (n1Var == null ? 0 : n1Var.hashCode())) * 1000003) ^ (this.f25126h ? 1231 : 1237);
    }

    @Override // n0.t3
    public t3.a i() {
        return new b(this);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.b + ", originalConfiguredResolution=" + this.f25121c + ", dynamicRange=" + this.f25122d + ", sessionType=" + this.f25123e + ", expectedFrameRateRange=" + this.f25124f + ", implementationOptions=" + this.f25125g + ", zslDisabled=" + this.f25126h + "}";
    }

    public s(Size size, Size size2, g0.k0 k0Var, int i10, Range<Integer> range, n1 n1Var, boolean z10) {
        this.b = size;
        this.f25121c = size2;
        this.f25122d = k0Var;
        this.f25123e = i10;
        this.f25124f = range;
        this.f25125g = n1Var;
        this.f25126h = z10;
    }
}
