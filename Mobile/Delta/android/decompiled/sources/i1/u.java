package i1;

/* JADX INFO: loaded from: classes.dex */
public final class u extends i1.a {
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20236f;

    public static final class b extends i1.a.AbstractC0356a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f20237a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f20238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f20239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f20240e;

        @Override // i1.a.AbstractC0356a
        public i1.a a() {
            String str = "";
            if (this.f20237a == null) {
                str = " audioSource";
            }
            if (this.b == null) {
                str = str + " captureSampleRate";
            }
            if (this.f20238c == null) {
                str = str + " encodeSampleRate";
            }
            if (this.f20239d == null) {
                str = str + " channelCount";
            }
            if (this.f20240e == null) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return new u(this.f20237a.intValue(), this.b.intValue(), this.f20238c.intValue(), this.f20239d.intValue(), this.f20240e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // i1.a.AbstractC0356a
        public i1.a.AbstractC0356a c(int i10) {
            this.f20240e = Integer.valueOf(i10);
            return this;
        }

        @Override // i1.a.AbstractC0356a
        public i1.a.AbstractC0356a d(int i10) {
            this.f20237a = Integer.valueOf(i10);
            return this;
        }

        @Override // i1.a.AbstractC0356a
        public i1.a.AbstractC0356a e(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }

        @Override // i1.a.AbstractC0356a
        public i1.a.AbstractC0356a f(int i10) {
            this.f20239d = Integer.valueOf(i10);
            return this;
        }

        @Override // i1.a.AbstractC0356a
        public i1.a.AbstractC0356a g(int i10) {
            this.f20238c = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // i1.a
    public int b() {
        return this.f20236f;
    }

    @Override // i1.a
    public int c() {
        return this.b;
    }

    @Override // i1.a
    public int e() {
        return this.f20233c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1.a) {
            i1.a aVar = (i1.a) obj;
            if (this.b == aVar.c() && this.f20233c == aVar.e() && this.f20234d == aVar.g() && this.f20235e == aVar.f() && this.f20236f == aVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // i1.a
    public int f() {
        return this.f20235e;
    }

    @Override // i1.a
    public int g() {
        return this.f20234d;
    }

    public int hashCode() {
        return ((((((((this.b ^ 1000003) * 1000003) ^ this.f20233c) * 1000003) ^ this.f20234d) * 1000003) ^ this.f20235e) * 1000003) ^ this.f20236f;
    }

    public String toString() {
        return "AudioSettings{audioSource=" + this.b + ", captureSampleRate=" + this.f20233c + ", encodeSampleRate=" + this.f20234d + ", channelCount=" + this.f20235e + ", audioFormat=" + this.f20236f + "}";
    }

    public u(int i10, int i11, int i12, int i13, int i14) {
        this.b = i10;
        this.f20233c = i11;
        this.f20234d = i12;
        this.f20235e = i13;
        this.f20236f = i14;
    }
}
