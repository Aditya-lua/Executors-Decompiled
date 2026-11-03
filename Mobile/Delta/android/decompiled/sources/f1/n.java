package f1;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class n extends c2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f16486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Range<Integer> f16488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16489f;

    public static final class b extends c2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a0 f16490a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Range<Integer> f16491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f16492d;

        @Override // f1.c2.a
        public c2 a() {
            String str = "";
            if (this.f16490a == null) {
                str = " qualitySelector";
            }
            if (this.b == null) {
                str = str + " encodeFrameRate";
            }
            if (this.f16491c == null) {
                str = str + " bitrate";
            }
            if (this.f16492d == null) {
                str = str + " aspectRatio";
            }
            if (str.isEmpty()) {
                return new n(this.f16490a, this.b.intValue(), this.f16491c, this.f16492d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.c2.a
        public c2.a b(int i10) {
            this.f16492d = Integer.valueOf(i10);
            return this;
        }

        @Override // f1.c2.a
        public c2.a c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f16491c = range;
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
            this.f16490a = a0Var;
            return this;
        }

        public b() {
        }

        public b(c2 c2Var) {
            this.f16490a = c2Var.e();
            this.b = Integer.valueOf(c2Var.d());
            this.f16491c = c2Var.c();
            this.f16492d = Integer.valueOf(c2Var.b());
        }
    }

    @Override // f1.c2
    public int b() {
        return this.f16489f;
    }

    @Override // f1.c2
    public Range<Integer> c() {
        return this.f16488e;
    }

    @Override // f1.c2
    public int d() {
        return this.f16487d;
    }

    @Override // f1.c2
    public a0 e() {
        return this.f16486c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            c2 c2Var = (c2) obj;
            if (this.f16486c.equals(c2Var.e()) && this.f16487d == c2Var.d() && this.f16488e.equals(c2Var.c()) && this.f16489f == c2Var.b()) {
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
        return ((((((this.f16486c.hashCode() ^ 1000003) * 1000003) ^ this.f16487d) * 1000003) ^ this.f16488e.hashCode()) * 1000003) ^ this.f16489f;
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.f16486c + ", encodeFrameRate=" + this.f16487d + ", bitrate=" + this.f16488e + ", aspectRatio=" + this.f16489f + "}";
    }

    public n(a0 a0Var, int i10, Range<Integer> range, int i11) {
        this.f16486c = a0Var;
        this.f16487d = i10;
        this.f16488e = range;
        this.f16489f = i11;
    }
}
