package f1;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class n extends c2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f15890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Range<Integer> f15892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15893f;

    public static final class b extends c2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a0 f15894a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Range<Integer> f15895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f15896d;

        @Override // f1.c2.a
        public c2 a() {
            String str = "";
            if (this.f15894a == null) {
                str = " qualitySelector";
            }
            if (this.b == null) {
                str = str + " encodeFrameRate";
            }
            if (this.f15895c == null) {
                str = str + " bitrate";
            }
            if (this.f15896d == null) {
                str = str + " aspectRatio";
            }
            if (str.isEmpty()) {
                return new n(this.f15894a, this.b.intValue(), this.f15895c, this.f15896d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.c2.a
        public c2.a b(int i10) {
            this.f15896d = Integer.valueOf(i10);
            return this;
        }

        @Override // f1.c2.a
        public c2.a c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f15895c = range;
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
            this.f15894a = a0Var;
            return this;
        }

        public b() {
        }

        public b(c2 c2Var) {
            this.f15894a = c2Var.e();
            this.b = Integer.valueOf(c2Var.d());
            this.f15895c = c2Var.c();
            this.f15896d = Integer.valueOf(c2Var.b());
        }
    }

    @Override // f1.c2
    public int b() {
        return this.f15893f;
    }

    @Override // f1.c2
    public Range<Integer> c() {
        return this.f15892e;
    }

    @Override // f1.c2
    public int d() {
        return this.f15891d;
    }

    @Override // f1.c2
    public a0 e() {
        return this.f15890c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            c2 c2Var = (c2) obj;
            if (this.f15890c.equals(c2Var.e()) && this.f15891d == c2Var.d() && this.f15892e.equals(c2Var.c()) && this.f15893f == c2Var.b()) {
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
        return ((((((this.f15890c.hashCode() ^ 1000003) * 1000003) ^ this.f15891d) * 1000003) ^ this.f15892e.hashCode()) * 1000003) ^ this.f15893f;
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.f15890c + ", encodeFrameRate=" + this.f15891d + ", bitrate=" + this.f15892e + ", aspectRatio=" + this.f15893f + "}";
    }

    public n(a0 a0Var, int i10, Range<Integer> range, int i11) {
        this.f15890c = a0Var;
        this.f15891d = i10;
        this.f15892e = range;
        this.f15893f = i11;
    }
}
