package p282m1;

import android.util.Size;
import p296n0.EnumC8723a4;

/* JADX INFO: renamed from: m1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8345d extends AbstractC8383p1 {

    /* JADX INFO: renamed from: a */
    public final String f30776a;

    /* JADX INFO: renamed from: b */
    public final int f30777b;

    /* JADX INFO: renamed from: c */
    public final EnumC8723a4 f30778c;

    /* JADX INFO: renamed from: d */
    public final Size f30779d;

    /* JADX INFO: renamed from: e */
    public final int f30780e;

    /* JADX INFO: renamed from: f */
    public final AbstractC8386q1 f30781f;

    /* JADX INFO: renamed from: g */
    public final int f30782g;

    /* JADX INFO: renamed from: h */
    public final int f30783h;

    /* JADX INFO: renamed from: i */
    public final int f30784i;

    /* JADX INFO: renamed from: j */
    public final int f30785j;

    /* JADX INFO: renamed from: m1.d$b */
    public static final class b extends AbstractC8383p1.a {

        /* JADX INFO: renamed from: a */
        public String f30786a;

        /* JADX INFO: renamed from: b */
        public Integer f30787b;

        /* JADX INFO: renamed from: c */
        public EnumC8723a4 f30788c;

        /* JADX INFO: renamed from: d */
        public Size f30789d;

        /* JADX INFO: renamed from: e */
        public Integer f30790e;

        /* JADX INFO: renamed from: f */
        public AbstractC8386q1 f30791f;

        /* JADX INFO: renamed from: g */
        public Integer f30792g;

        /* JADX INFO: renamed from: h */
        public Integer f30793h;

        /* JADX INFO: renamed from: i */
        public Integer f30794i;

        /* JADX INFO: renamed from: j */
        public Integer f30795j;

        @Override // p282m1.AbstractC8383p1.a
        /* JADX INFO: renamed from: a */
        public AbstractC8383p1 mo33915a() {
            String str = "";
            if (this.f30786a == null) {
                str = " mimeType";
            }
            if (this.f30787b == null) {
                str = str + " profile";
            }
            if (this.f30788c == null) {
                str = str + " inputTimebase";
            }
            if (this.f30789d == null) {
                str = str + " resolution";
            }
            if (this.f30790e == null) {
                str = str + " colorFormat";
            }
            if (this.f30791f == null) {
                str = str + " dataSpace";
            }
            if (this.f30792g == null) {
                str = str + " captureFrameRate";
            }
            if (this.f30793h == null) {
                str = str + " encodeFrameRate";
            }
            if (this.f30794i == null) {
                str = str + " IFrameInterval";
            }
            if (this.f30795j == null) {
                str = str + " bitrate";
            }
            if (str.isEmpty()) {
                return new C8345d(this.f30786a, this.f30787b.intValue(), this.f30788c, this.f30789d, this.f30790e.intValue(), this.f30791f, this.f30792g.intValue(), this.f30793h.intValue(), this.f30794i.intValue(), this.f30795j.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p282m1.AbstractC8383p1.a
        /* JADX INFO: renamed from: b */
        public AbstractC8383p1.a mo33916b(int i10) {
            this.f30795j = Integer.valueOf(i10);
            return this;
        }

        @Override // p282m1.AbstractC8383p1.a
        /* JADX INFO: renamed from: c */
        public AbstractC8383p1.a mo33917c(int i10) {
            this.f30792g = Integer.valueOf(i10);
            return this;
        }

        @Override // p282m1.AbstractC8383p1.a
        /* JADX INFO: renamed from: d */
        public AbstractC8383p1.a mo33918d(int i10) {
            this.f30790e = Integer.valueOf(i10);
            return this;
        }

        @Override // p282m1.AbstractC8383p1.a
        /* JADX INFO: renamed from: e */
        public AbstractC8383p1.a mo33919e(AbstractC8386q1 abstractC8386q1) {
            if (abstractC8386q1 == null) {
                throw new NullPointerException("Null dataSpace");
            }
            this.f30791f = abstractC8386q1;
            return this;
        }

        @Override // p282m1.AbstractC8383p1.a
        /* JADX INFO: renamed from: f */
        public AbstractC8383p1.a mo33920f(int i10) {
            this.f30793h = Integer.valueOf(i10);
            return this;
        }

        @Override // p282m1.AbstractC8383p1.a
        /* JADX INFO: renamed from: g */
        public AbstractC8383p1.a mo33921g(int i10) {
            this.f30794i = Integer.valueOf(i10);
            return this;
        }

        @Override // p282m1.AbstractC8383p1.a
        /* JADX INFO: renamed from: h */
        public AbstractC8383p1.a mo33922h(EnumC8723a4 enumC8723a4) {
            if (enumC8723a4 == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f30788c = enumC8723a4;
            return this;
        }

        @Override // p282m1.AbstractC8383p1.a
        /* JADX INFO: renamed from: i */
        public AbstractC8383p1.a mo33923i(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f30786a = str;
            return this;
        }

        @Override // p282m1.AbstractC8383p1.a
        /* JADX INFO: renamed from: j */
        public AbstractC8383p1.a mo33924j(int i10) {
            this.f30787b = Integer.valueOf(i10);
            return this;
        }

        @Override // p282m1.AbstractC8383p1.a
        /* JADX INFO: renamed from: k */
        public AbstractC8383p1.a mo33925k(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f30789d = size;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }

        public b(AbstractC8383p1 abstractC8383p1) {
            this.f30786a = abstractC8383p1.mo33890b();
            this.f30787b = Integer.valueOf(abstractC8383p1.mo33912k());
            this.f30788c = abstractC8383p1.mo33891c();
            this.f30789d = abstractC8383p1.mo33913l();
            this.f30790e = Integer.valueOf(abstractC8383p1.mo33908g());
            this.f30791f = abstractC8383p1.mo33909h();
            this.f30792g = Integer.valueOf(abstractC8383p1.mo33907f());
            this.f30793h = Integer.valueOf(abstractC8383p1.mo33910i());
            this.f30794i = Integer.valueOf(abstractC8383p1.mo33911j());
            this.f30795j = Integer.valueOf(abstractC8383p1.mo33906e());
        }
    }

    @Override // p282m1.AbstractC8383p1, p282m1.InterfaceC8375n
    /* JADX INFO: renamed from: b */
    public String mo33890b() {
        return this.f30776a;
    }

    @Override // p282m1.AbstractC8383p1, p282m1.InterfaceC8375n
    /* JADX INFO: renamed from: c */
    public EnumC8723a4 mo33891c() {
        return this.f30778c;
    }

    @Override // p282m1.AbstractC8383p1
    /* JADX INFO: renamed from: e */
    public int mo33906e() {
        return this.f30785j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8383p1) {
            AbstractC8383p1 abstractC8383p1 = (AbstractC8383p1) obj;
            if (this.f30776a.equals(abstractC8383p1.mo33890b()) && this.f30777b == abstractC8383p1.mo33912k() && this.f30778c.equals(abstractC8383p1.mo33891c()) && this.f30779d.equals(abstractC8383p1.mo33913l()) && this.f30780e == abstractC8383p1.mo33908g() && this.f30781f.equals(abstractC8383p1.mo33909h()) && this.f30782g == abstractC8383p1.mo33907f() && this.f30783h == abstractC8383p1.mo33910i() && this.f30784i == abstractC8383p1.mo33911j() && this.f30785j == abstractC8383p1.mo33906e()) {
                return true;
            }
        }
        return false;
    }

    @Override // p282m1.AbstractC8383p1
    /* JADX INFO: renamed from: f */
    public int mo33907f() {
        return this.f30782g;
    }

    @Override // p282m1.AbstractC8383p1
    /* JADX INFO: renamed from: g */
    public int mo33908g() {
        return this.f30780e;
    }

    @Override // p282m1.AbstractC8383p1
    /* JADX INFO: renamed from: h */
    public AbstractC8386q1 mo33909h() {
        return this.f30781f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f30776a.hashCode() ^ 1000003) * 1000003) ^ this.f30777b) * 1000003) ^ this.f30778c.hashCode()) * 1000003) ^ this.f30779d.hashCode()) * 1000003) ^ this.f30780e) * 1000003) ^ this.f30781f.hashCode()) * 1000003) ^ this.f30782g) * 1000003) ^ this.f30783h) * 1000003) ^ this.f30784i) * 1000003) ^ this.f30785j;
    }

    @Override // p282m1.AbstractC8383p1
    /* JADX INFO: renamed from: i */
    public int mo33910i() {
        return this.f30783h;
    }

    @Override // p282m1.AbstractC8383p1
    /* JADX INFO: renamed from: j */
    public int mo33911j() {
        return this.f30784i;
    }

    @Override // p282m1.AbstractC8383p1
    /* JADX INFO: renamed from: k */
    public int mo33912k() {
        return this.f30777b;
    }

    @Override // p282m1.AbstractC8383p1
    /* JADX INFO: renamed from: l */
    public Size mo33913l() {
        return this.f30779d;
    }

    @Override // p282m1.AbstractC8383p1
    /* JADX INFO: renamed from: m */
    public AbstractC8383p1.a mo33914m() {
        return new b(this);
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.f30776a + ", profile=" + this.f30777b + ", inputTimebase=" + this.f30778c + ", resolution=" + this.f30779d + ", colorFormat=" + this.f30780e + ", dataSpace=" + this.f30781f + ", captureFrameRate=" + this.f30782g + ", encodeFrameRate=" + this.f30783h + ", IFrameInterval=" + this.f30784i + ", bitrate=" + this.f30785j + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8345d(String str, int i10, EnumC8723a4 enumC8723a4, Size size, int i11, AbstractC8386q1 abstractC8386q1, int i12, int i13, int i14, int i15) {
        this.f30776a = str;
        this.f30777b = i10;
        this.f30778c = enumC8723a4;
        this.f30779d = size;
        this.f30780e = i11;
        this.f30781f = abstractC8386q1;
        this.f30782g = i12;
        this.f30783h = i13;
        this.f30784i = i14;
        this.f30785j = i15;
    }
}
