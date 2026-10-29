package f1;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Range<Integer> f15814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Range<Integer> f15817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15818h;

    public static final class b extends f1.a.AbstractC0304a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Range<Integer> f15819a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f15820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Range<Integer> f15821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f15822e;

        @Override // f1.a.AbstractC0304a
        public f1.a a() {
            String str = "";
            if (this.f15819a == null) {
                str = " bitrate";
            }
            if (this.b == null) {
                str = str + " sourceFormat";
            }
            if (this.f15820c == null) {
                str = str + " source";
            }
            if (this.f15821d == null) {
                str = str + " sampleRate";
            }
            if (this.f15822e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new c(this.f15819a, this.b.intValue(), this.f15820c.intValue(), this.f15821d, this.f15822e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.a.AbstractC0304a
        public f1.a.AbstractC0304a b(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f15819a = range;
            return this;
        }

        @Override // f1.a.AbstractC0304a
        public f1.a.AbstractC0304a c(int i10) {
            this.f15822e = Integer.valueOf(i10);
            return this;
        }

        @Override // f1.a.AbstractC0304a
        public f1.a.AbstractC0304a d(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null sampleRate");
            }
            this.f15821d = range;
            return this;
        }

        @Override // f1.a.AbstractC0304a
        public f1.a.AbstractC0304a e(int i10) {
            this.f15820c = Integer.valueOf(i10);
            return this;
        }

        public f1.a.AbstractC0304a f(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // f1.a
    public Range<Integer> b() {
        return this.f15814d;
    }

    @Override // f1.a
    public int c() {
        return this.f15818h;
    }

    @Override // f1.a
    public Range<Integer> d() {
        return this.f15817g;
    }

    @Override // f1.a
    public int e() {
        return this.f15816f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1.a) {
            f1.a aVar = (f1.a) obj;
            if (this.f15814d.equals(aVar.b()) && this.f15815e == aVar.f() && this.f15816f == aVar.e() && this.f15817g.equals(aVar.d()) && this.f15818h == aVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // f1.a
    public int f() {
        return this.f15815e;
    }

    public int hashCode() {
        return ((((((((this.f15814d.hashCode() ^ 1000003) * 1000003) ^ this.f15815e) * 1000003) ^ this.f15816f) * 1000003) ^ this.f15817g.hashCode()) * 1000003) ^ this.f15818h;
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.f15814d + ", sourceFormat=" + this.f15815e + ", source=" + this.f15816f + ", sampleRate=" + this.f15817g + ", channelCount=" + this.f15818h + "}";
    }

    public c(Range<Integer> range, int i10, int i11, Range<Integer> range2, int i12) {
        this.f15814d = range;
        this.f15815e = i10;
        this.f15816f = i11;
        this.f15817g = range2;
        this.f15818h = i12;
    }
}
