package i1;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class u extends i1.a {
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19079f;

    public static final class b extends i1.a.AbstractC0357a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f19080a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f19081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f19082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f19083e;

        @Override // i1.a.AbstractC0357a
        public i1.a a() {
            Integer num = this.f19080a;
            String str = BuildConfig.FLAVOR;
            if (num == null) {
                str = BuildConfig.FLAVOR + " audioSource";
            }
            if (this.b == null) {
                str = str + " captureSampleRate";
            }
            if (this.f19081c == null) {
                str = str + " encodeSampleRate";
            }
            if (this.f19082d == null) {
                str = str + " channelCount";
            }
            if (this.f19083e == null) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return new u(this.f19080a.intValue(), this.b.intValue(), this.f19081c.intValue(), this.f19082d.intValue(), this.f19083e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // i1.a.AbstractC0357a
        public i1.a.AbstractC0357a c(int i10) {
            this.f19083e = Integer.valueOf(i10);
            return this;
        }

        @Override // i1.a.AbstractC0357a
        public i1.a.AbstractC0357a d(int i10) {
            this.f19080a = Integer.valueOf(i10);
            return this;
        }

        @Override // i1.a.AbstractC0357a
        public i1.a.AbstractC0357a e(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }

        @Override // i1.a.AbstractC0357a
        public i1.a.AbstractC0357a f(int i10) {
            this.f19082d = Integer.valueOf(i10);
            return this;
        }

        @Override // i1.a.AbstractC0357a
        public i1.a.AbstractC0357a g(int i10) {
            this.f19081c = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // i1.a
    public int b() {
        return this.f19079f;
    }

    @Override // i1.a
    public int c() {
        return this.b;
    }

    @Override // i1.a
    public int e() {
        return this.f19076c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1.a) {
            i1.a aVar = (i1.a) obj;
            if (this.b == aVar.c() && this.f19076c == aVar.e() && this.f19077d == aVar.g() && this.f19078e == aVar.f() && this.f19079f == aVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // i1.a
    public int f() {
        return this.f19078e;
    }

    @Override // i1.a
    public int g() {
        return this.f19077d;
    }

    public int hashCode() {
        return ((((((((this.b ^ 1000003) * 1000003) ^ this.f19076c) * 1000003) ^ this.f19077d) * 1000003) ^ this.f19078e) * 1000003) ^ this.f19079f;
    }

    public String toString() {
        return "AudioSettings{audioSource=" + this.b + ", captureSampleRate=" + this.f19076c + ", encodeSampleRate=" + this.f19077d + ", channelCount=" + this.f19078e + ", audioFormat=" + this.f19079f + "}";
    }

    public u(int i10, int i11, int i12, int i13, int i14) {
        this.b = i10;
        this.f19076c = i11;
        this.f19077d = i12;
        this.f19078e = i13;
        this.f19079f = i14;
    }
}
