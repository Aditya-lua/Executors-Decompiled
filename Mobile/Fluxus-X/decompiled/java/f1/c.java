package f1;

import android.util.Range;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Range<Integer> f14887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Range<Integer> f14890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14891h;

    public static final class b extends f1.a.AbstractC0287a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Range<Integer> f14892a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f14893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Range<Integer> f14894d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f14895e;

        @Override // f1.a.AbstractC0287a
        public f1.a a() {
            Range<Integer> range = this.f14892a;
            String str = BuildConfig.FLAVOR;
            if (range == null) {
                str = BuildConfig.FLAVOR + " bitrate";
            }
            if (this.b == null) {
                str = str + " sourceFormat";
            }
            if (this.f14893c == null) {
                str = str + " source";
            }
            if (this.f14894d == null) {
                str = str + " sampleRate";
            }
            if (this.f14895e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new c(this.f14892a, this.b.intValue(), this.f14893c.intValue(), this.f14894d, this.f14895e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.a.AbstractC0287a
        public f1.a.AbstractC0287a b(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f14892a = range;
            return this;
        }

        @Override // f1.a.AbstractC0287a
        public f1.a.AbstractC0287a c(int i10) {
            this.f14895e = Integer.valueOf(i10);
            return this;
        }

        @Override // f1.a.AbstractC0287a
        public f1.a.AbstractC0287a d(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null sampleRate");
            }
            this.f14894d = range;
            return this;
        }

        @Override // f1.a.AbstractC0287a
        public f1.a.AbstractC0287a e(int i10) {
            this.f14893c = Integer.valueOf(i10);
            return this;
        }

        public f1.a.AbstractC0287a f(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // f1.a
    public Range<Integer> b() {
        return this.f14887d;
    }

    @Override // f1.a
    public int c() {
        return this.f14891h;
    }

    @Override // f1.a
    public Range<Integer> d() {
        return this.f14890g;
    }

    @Override // f1.a
    public int e() {
        return this.f14889f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1.a) {
            f1.a aVar = (f1.a) obj;
            if (this.f14887d.equals(aVar.b()) && this.f14888e == aVar.f() && this.f14889f == aVar.e() && this.f14890g.equals(aVar.d()) && this.f14891h == aVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // f1.a
    public int f() {
        return this.f14888e;
    }

    public int hashCode() {
        return ((((((((this.f14887d.hashCode() ^ 1000003) * 1000003) ^ this.f14888e) * 1000003) ^ this.f14889f) * 1000003) ^ this.f14890g.hashCode()) * 1000003) ^ this.f14891h;
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.f14887d + ", sourceFormat=" + this.f14888e + ", source=" + this.f14889f + ", sampleRate=" + this.f14890g + ", channelCount=" + this.f14891h + "}";
    }

    public c(Range<Integer> range, int i10, int i11, Range<Integer> range2, int i12) {
        this.f14887d = range;
        this.f14888e = i10;
        this.f14889f = i11;
        this.f14890g = range2;
        this.f14891h = i12;
    }
}
