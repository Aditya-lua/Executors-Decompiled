package p282m1;

import p296n0.EnumC8723a4;

/* JADX INFO: renamed from: m1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8342c extends AbstractC8336a {

    /* JADX INFO: renamed from: a */
    public final String f30759a;

    /* JADX INFO: renamed from: b */
    public final int f30760b;

    /* JADX INFO: renamed from: c */
    public final EnumC8723a4 f30761c;

    /* JADX INFO: renamed from: d */
    public final int f30762d;

    /* JADX INFO: renamed from: e */
    public final int f30763e;

    /* JADX INFO: renamed from: f */
    public final int f30764f;

    /* JADX INFO: renamed from: g */
    public final int f30765g;

    /* JADX INFO: renamed from: m1.c$b */
    public static final class b extends AbstractC8336a.a {

        /* JADX INFO: renamed from: a */
        public String f30766a;

        /* JADX INFO: renamed from: b */
        public Integer f30767b;

        /* JADX INFO: renamed from: c */
        public EnumC8723a4 f30768c;

        /* JADX INFO: renamed from: d */
        public Integer f30769d;

        /* JADX INFO: renamed from: e */
        public Integer f30770e;

        /* JADX INFO: renamed from: f */
        public Integer f30771f;

        /* JADX INFO: renamed from: g */
        public Integer f30772g;

        @Override // p282m1.AbstractC8336a.a
        /* JADX INFO: renamed from: a */
        public AbstractC8336a mo33897a() {
            String str = "";
            if (this.f30766a == null) {
                str = " mimeType";
            }
            if (this.f30767b == null) {
                str = str + " profile";
            }
            if (this.f30768c == null) {
                str = str + " inputTimebase";
            }
            if (this.f30769d == null) {
                str = str + " bitrate";
            }
            if (this.f30770e == null) {
                str = str + " captureSampleRate";
            }
            if (this.f30771f == null) {
                str = str + " encodeSampleRate";
            }
            if (this.f30772g == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C8342c(this.f30766a, this.f30767b.intValue(), this.f30768c, this.f30769d.intValue(), this.f30770e.intValue(), this.f30771f.intValue(), this.f30772g.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p282m1.AbstractC8336a.a
        /* JADX INFO: renamed from: c */
        public AbstractC8336a.a mo33899c(int i10) {
            this.f30769d = Integer.valueOf(i10);
            return this;
        }

        @Override // p282m1.AbstractC8336a.a
        /* JADX INFO: renamed from: d */
        public AbstractC8336a.a mo33900d(int i10) {
            this.f30770e = Integer.valueOf(i10);
            return this;
        }

        @Override // p282m1.AbstractC8336a.a
        /* JADX INFO: renamed from: e */
        public AbstractC8336a.a mo33901e(int i10) {
            this.f30772g = Integer.valueOf(i10);
            return this;
        }

        @Override // p282m1.AbstractC8336a.a
        /* JADX INFO: renamed from: f */
        public AbstractC8336a.a mo33902f(int i10) {
            this.f30771f = Integer.valueOf(i10);
            return this;
        }

        @Override // p282m1.AbstractC8336a.a
        /* JADX INFO: renamed from: g */
        public AbstractC8336a.a mo33903g(EnumC8723a4 enumC8723a4) {
            if (enumC8723a4 == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f30768c = enumC8723a4;
            return this;
        }

        @Override // p282m1.AbstractC8336a.a
        /* JADX INFO: renamed from: h */
        public AbstractC8336a.a mo33904h(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f30766a = str;
            return this;
        }

        @Override // p282m1.AbstractC8336a.a
        /* JADX INFO: renamed from: i */
        public AbstractC8336a.a mo33905i(int i10) {
            this.f30767b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // p282m1.AbstractC8336a, p282m1.InterfaceC8375n
    /* JADX INFO: renamed from: b */
    public String mo33890b() {
        return this.f30759a;
    }

    @Override // p282m1.AbstractC8336a, p282m1.InterfaceC8375n
    /* JADX INFO: renamed from: c */
    public EnumC8723a4 mo33891c() {
        return this.f30761c;
    }

    @Override // p282m1.AbstractC8336a
    /* JADX INFO: renamed from: e */
    public int mo33892e() {
        return this.f30762d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8336a) {
            AbstractC8336a abstractC8336a = (AbstractC8336a) obj;
            if (this.f30759a.equals(abstractC8336a.mo33890b()) && this.f30760b == abstractC8336a.mo33896i() && this.f30761c.equals(abstractC8336a.mo33891c()) && this.f30762d == abstractC8336a.mo33892e() && this.f30763e == abstractC8336a.mo33893f() && this.f30764f == abstractC8336a.mo33895h() && this.f30765g == abstractC8336a.mo33894g()) {
                return true;
            }
        }
        return false;
    }

    @Override // p282m1.AbstractC8336a
    /* JADX INFO: renamed from: f */
    public int mo33893f() {
        return this.f30763e;
    }

    @Override // p282m1.AbstractC8336a
    /* JADX INFO: renamed from: g */
    public int mo33894g() {
        return this.f30765g;
    }

    @Override // p282m1.AbstractC8336a
    /* JADX INFO: renamed from: h */
    public int mo33895h() {
        return this.f30764f;
    }

    public int hashCode() {
        return ((((((((((((this.f30759a.hashCode() ^ 1000003) * 1000003) ^ this.f30760b) * 1000003) ^ this.f30761c.hashCode()) * 1000003) ^ this.f30762d) * 1000003) ^ this.f30763e) * 1000003) ^ this.f30764f) * 1000003) ^ this.f30765g;
    }

    @Override // p282m1.AbstractC8336a
    /* JADX INFO: renamed from: i */
    public int mo33896i() {
        return this.f30760b;
    }

    public String toString() {
        return "AudioEncoderConfig{mimeType=" + this.f30759a + ", profile=" + this.f30760b + ", inputTimebase=" + this.f30761c + ", bitrate=" + this.f30762d + ", captureSampleRate=" + this.f30763e + ", encodeSampleRate=" + this.f30764f + ", channelCount=" + this.f30765g + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8342c(String str, int i10, EnumC8723a4 enumC8723a4, int i11, int i12, int i13, int i14) {
        this.f30759a = str;
        this.f30760b = i10;
        this.f30761c = enumC8723a4;
        this.f30762d = i11;
        this.f30763e = i12;
        this.f30764f = i13;
        this.f30765g = i14;
    }
}
