package i1;

/* JADX INFO: loaded from: classes.dex */
public final class u extends i1.a {
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20352f;

    public static final class b extends i1.a.AbstractC0354a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f20353a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f20354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f20355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f20356e;

        @Override // i1.a.AbstractC0354a
        public i1.a a() {
            String str = "";
            if (this.f20353a == null) {
                str = " audioSource";
            }
            if (this.b == null) {
                str = str + " captureSampleRate";
            }
            if (this.f20354c == null) {
                str = str + " encodeSampleRate";
            }
            if (this.f20355d == null) {
                str = str + " channelCount";
            }
            if (this.f20356e == null) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return new u(this.f20353a.intValue(), this.b.intValue(), this.f20354c.intValue(), this.f20355d.intValue(), this.f20356e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // i1.a.AbstractC0354a
        public i1.a.AbstractC0354a c(int i10) {
            this.f20356e = Integer.valueOf(i10);
            return this;
        }

        @Override // i1.a.AbstractC0354a
        public i1.a.AbstractC0354a d(int i10) {
            this.f20353a = Integer.valueOf(i10);
            return this;
        }

        @Override // i1.a.AbstractC0354a
        public i1.a.AbstractC0354a e(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }

        @Override // i1.a.AbstractC0354a
        public i1.a.AbstractC0354a f(int i10) {
            this.f20355d = Integer.valueOf(i10);
            return this;
        }

        @Override // i1.a.AbstractC0354a
        public i1.a.AbstractC0354a g(int i10) {
            this.f20354c = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // i1.a
    public int b() {
        return this.f20352f;
    }

    @Override // i1.a
    public int c() {
        return this.b;
    }

    @Override // i1.a
    public int e() {
        return this.f20349c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1.a) {
            i1.a aVar = (i1.a) obj;
            if (this.b == aVar.c() && this.f20349c == aVar.e() && this.f20350d == aVar.g() && this.f20351e == aVar.f() && this.f20352f == aVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // i1.a
    public int f() {
        return this.f20351e;
    }

    @Override // i1.a
    public int g() {
        return this.f20350d;
    }

    public int hashCode() {
        return ((((((((this.b ^ 1000003) * 1000003) ^ this.f20349c) * 1000003) ^ this.f20350d) * 1000003) ^ this.f20351e) * 1000003) ^ this.f20352f;
    }

    public String toString() {
        return "AudioSettings{audioSource=" + this.b + ", captureSampleRate=" + this.f20349c + ", encodeSampleRate=" + this.f20350d + ", channelCount=" + this.f20351e + ", audioFormat=" + this.f20352f + "}";
    }

    public u(int i10, int i11, int i12, int i13, int i14) {
        this.b = i10;
        this.f20349c = i11;
        this.f20350d = i12;
        this.f20351e = i13;
        this.f20352f = i14;
    }
}
