package p115f1;

import android.util.Range;

/* JADX INFO: renamed from: f1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5242c extends AbstractC5234a {

    /* JADX INFO: renamed from: d */
    public final Range<Integer> f20306d;

    /* JADX INFO: renamed from: e */
    public final int f20307e;

    /* JADX INFO: renamed from: f */
    public final int f20308f;

    /* JADX INFO: renamed from: g */
    public final Range<Integer> f20309g;

    /* JADX INFO: renamed from: h */
    public final int f20310h;

    /* JADX INFO: renamed from: f1.c$b */
    public static final class b extends AbstractC5234a.a {

        /* JADX INFO: renamed from: a */
        public Range<Integer> f20311a;

        /* JADX INFO: renamed from: b */
        public Integer f20312b;

        /* JADX INFO: renamed from: c */
        public Integer f20313c;

        /* JADX INFO: renamed from: d */
        public Range<Integer> f20314d;

        /* JADX INFO: renamed from: e */
        public Integer f20315e;

        @Override // p115f1.AbstractC5234a.a
        /* JADX INFO: renamed from: a */
        public AbstractC5234a mo24224a() {
            String str = "";
            if (this.f20311a == null) {
                str = " bitrate";
            }
            if (this.f20312b == null) {
                str = str + " sourceFormat";
            }
            if (this.f20313c == null) {
                str = str + " source";
            }
            if (this.f20314d == null) {
                str = str + " sampleRate";
            }
            if (this.f20315e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C5242c(this.f20311a, this.f20312b.intValue(), this.f20313c.intValue(), this.f20314d, this.f20315e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p115f1.AbstractC5234a.a
        /* JADX INFO: renamed from: b */
        public AbstractC5234a.a mo24225b(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f20311a = range;
            return this;
        }

        @Override // p115f1.AbstractC5234a.a
        /* JADX INFO: renamed from: c */
        public AbstractC5234a.a mo24226c(int i10) {
            this.f20315e = Integer.valueOf(i10);
            return this;
        }

        @Override // p115f1.AbstractC5234a.a
        /* JADX INFO: renamed from: d */
        public AbstractC5234a.a mo24227d(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null sampleRate");
            }
            this.f20314d = range;
            return this;
        }

        @Override // p115f1.AbstractC5234a.a
        /* JADX INFO: renamed from: e */
        public AbstractC5234a.a mo24228e(int i10) {
            this.f20313c = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public AbstractC5234a.a m24261f(int i10) {
            this.f20312b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // p115f1.AbstractC5234a
    /* JADX INFO: renamed from: b */
    public Range<Integer> mo24219b() {
        return this.f20306d;
    }

    @Override // p115f1.AbstractC5234a
    /* JADX INFO: renamed from: c */
    public int mo24220c() {
        return this.f20310h;
    }

    @Override // p115f1.AbstractC5234a
    /* JADX INFO: renamed from: d */
    public Range<Integer> mo24221d() {
        return this.f20309g;
    }

    @Override // p115f1.AbstractC5234a
    /* JADX INFO: renamed from: e */
    public int mo24222e() {
        return this.f20308f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5234a) {
            AbstractC5234a abstractC5234a = (AbstractC5234a) obj;
            if (this.f20306d.equals(abstractC5234a.mo24219b()) && this.f20307e == abstractC5234a.mo24223f() && this.f20308f == abstractC5234a.mo24222e() && this.f20309g.equals(abstractC5234a.mo24221d()) && this.f20310h == abstractC5234a.mo24220c()) {
                return true;
            }
        }
        return false;
    }

    @Override // p115f1.AbstractC5234a
    /* JADX INFO: renamed from: f */
    public int mo24223f() {
        return this.f20307e;
    }

    public int hashCode() {
        return ((((((((this.f20306d.hashCode() ^ 1000003) * 1000003) ^ this.f20307e) * 1000003) ^ this.f20308f) * 1000003) ^ this.f20309g.hashCode()) * 1000003) ^ this.f20310h;
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.f20306d + ", sourceFormat=" + this.f20307e + ", source=" + this.f20308f + ", sampleRate=" + this.f20309g + ", channelCount=" + this.f20310h + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5242c(Range<Integer> range, int i10, int i11, Range<Integer> range2, int i12) {
        this.f20306d = range;
        this.f20307e = i10;
        this.f20308f = i11;
        this.f20309g = range2;
        this.f20310h = i12;
    }
}
