package f1;

import android.util.Range;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class n extends c2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f14963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Range<Integer> f14965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14966f;

    public static final class b extends c2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a0 f14967a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Range<Integer> f14968c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f14969d;

        @Override // f1.c2.a
        public c2 a() {
            a0 a0Var = this.f14967a;
            String str = BuildConfig.FLAVOR;
            if (a0Var == null) {
                str = BuildConfig.FLAVOR + " qualitySelector";
            }
            if (this.b == null) {
                str = str + " encodeFrameRate";
            }
            if (this.f14968c == null) {
                str = str + " bitrate";
            }
            if (this.f14969d == null) {
                str = str + " aspectRatio";
            }
            if (str.isEmpty()) {
                return new n(this.f14967a, this.b.intValue(), this.f14968c, this.f14969d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.c2.a
        public c2.a b(int i10) {
            this.f14969d = Integer.valueOf(i10);
            return this;
        }

        @Override // f1.c2.a
        public c2.a c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f14968c = range;
            return this;
        }

        @Override // f1.c2.a
        public c2.a d(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }

        @Override // f1.c2.a
        public c2.a e(a0 a0Var) {
            if (a0Var == null) {
                throw new NullPointerException("Null qualitySelector");
            }
            this.f14967a = a0Var;
            return this;
        }

        public b() {
        }

        public b(c2 c2Var) {
            this.f14967a = c2Var.e();
            this.b = Integer.valueOf(c2Var.d());
            this.f14968c = c2Var.c();
            this.f14969d = Integer.valueOf(c2Var.b());
        }
    }

    @Override // f1.c2
    public int b() {
        return this.f14966f;
    }

    @Override // f1.c2
    public Range<Integer> c() {
        return this.f14965e;
    }

    @Override // f1.c2
    public int d() {
        return this.f14964d;
    }

    @Override // f1.c2
    public a0 e() {
        return this.f14963c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            c2 c2Var = (c2) obj;
            if (this.f14963c.equals(c2Var.e()) && this.f14964d == c2Var.d() && this.f14965e.equals(c2Var.c()) && this.f14966f == c2Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // f1.c2
    public c2.a f() {
        return new b(this);
    }

    public int hashCode() {
        return ((((((this.f14963c.hashCode() ^ 1000003) * 1000003) ^ this.f14964d) * 1000003) ^ this.f14965e.hashCode()) * 1000003) ^ this.f14966f;
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.f14963c + ", encodeFrameRate=" + this.f14964d + ", bitrate=" + this.f14965e + ", aspectRatio=" + this.f14966f + "}";
    }

    public n(a0 a0Var, int i10, Range<Integer> range, int i11) {
        this.f14963c = a0Var;
        this.f14964d = i10;
        this.f14965e = range;
        this.f14966f = i11;
    }
}
