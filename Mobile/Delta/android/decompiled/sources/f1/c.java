package f1;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Range<Integer> f16410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Range<Integer> f16413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f16414h;

    public static final class b extends f1.a.AbstractC0302a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Range<Integer> f16415a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f16416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Range<Integer> f16417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f16418e;

        @Override // f1.a.AbstractC0302a
        public f1.a a() {
            String str = "";
            if (this.f16415a == null) {
                str = " bitrate";
            }
            if (this.b == null) {
                str = str + " sourceFormat";
            }
            if (this.f16416c == null) {
                str = str + " source";
            }
            if (this.f16417d == null) {
                str = str + " sampleRate";
            }
            if (this.f16418e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new c(this.f16415a, this.b.intValue(), this.f16416c.intValue(), this.f16417d, this.f16418e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.a.AbstractC0302a
        public f1.a.AbstractC0302a b(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f16415a = range;
            return this;
        }

        @Override // f1.a.AbstractC0302a
        public f1.a.AbstractC0302a c(int i10) {
            this.f16418e = Integer.valueOf(i10);
            return this;
        }

        @Override // f1.a.AbstractC0302a
        public f1.a.AbstractC0302a d(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null sampleRate");
            }
            this.f16417d = range;
            return this;
        }

        @Override // f1.a.AbstractC0302a
        public f1.a.AbstractC0302a e(int i10) {
            this.f16416c = Integer.valueOf(i10);
            return this;
        }

        public f1.a.AbstractC0302a f(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // f1.a
    public Range<Integer> b() {
        return this.f16410d;
    }

    @Override // f1.a
    public int c() {
        return this.f16414h;
    }

    @Override // f1.a
    public Range<Integer> d() {
        return this.f16413g;
    }

    @Override // f1.a
    public int e() {
        return this.f16412f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1.a) {
            f1.a aVar = (f1.a) obj;
            if (this.f16410d.equals(aVar.b()) && this.f16411e == aVar.f() && this.f16412f == aVar.e() && this.f16413g.equals(aVar.d()) && this.f16414h == aVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // f1.a
    public int f() {
        return this.f16411e;
    }

    public int hashCode() {
        return ((((((((this.f16410d.hashCode() ^ 1000003) * 1000003) ^ this.f16411e) * 1000003) ^ this.f16412f) * 1000003) ^ this.f16413g.hashCode()) * 1000003) ^ this.f16414h;
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.f16410d + ", sourceFormat=" + this.f16411e + ", source=" + this.f16412f + ", sampleRate=" + this.f16413g + ", channelCount=" + this.f16414h + "}";
    }

    public c(Range<Integer> range, int i10, int i11, Range<Integer> range2, int i12) {
        this.f16410d = range;
        this.f16411e = i10;
        this.f16412f = i11;
        this.f16413g = range2;
        this.f16414h = i12;
    }
}
