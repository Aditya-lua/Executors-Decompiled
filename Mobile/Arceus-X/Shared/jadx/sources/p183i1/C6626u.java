package p183i1;

/* JADX INFO: renamed from: i1.u */
/* JADX INFO: loaded from: classes.dex */
public final class C6626u extends AbstractC6601a {

    /* JADX INFO: renamed from: b */
    public final int f25561b;

    /* JADX INFO: renamed from: c */
    public final int f25562c;

    /* JADX INFO: renamed from: d */
    public final int f25563d;

    /* JADX INFO: renamed from: e */
    public final int f25564e;

    /* JADX INFO: renamed from: f */
    public final int f25565f;

    /* JADX INFO: renamed from: i1.u$b */
    public static final class b extends AbstractC6601a.a {

        /* JADX INFO: renamed from: a */
        public Integer f25566a;

        /* JADX INFO: renamed from: b */
        public Integer f25567b;

        /* JADX INFO: renamed from: c */
        public Integer f25568c;

        /* JADX INFO: renamed from: d */
        public Integer f25569d;

        /* JADX INFO: renamed from: e */
        public Integer f25570e;

        @Override // p183i1.AbstractC6601a.a
        /* JADX INFO: renamed from: a */
        public AbstractC6601a mo28515a() {
            String str = "";
            if (this.f25566a == null) {
                str = " audioSource";
            }
            if (this.f25567b == null) {
                str = str + " captureSampleRate";
            }
            if (this.f25568c == null) {
                str = str + " encodeSampleRate";
            }
            if (this.f25569d == null) {
                str = str + " channelCount";
            }
            if (this.f25570e == null) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return new C6626u(this.f25566a.intValue(), this.f25567b.intValue(), this.f25568c.intValue(), this.f25569d.intValue(), this.f25570e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p183i1.AbstractC6601a.a
        /* JADX INFO: renamed from: c */
        public AbstractC6601a.a mo28517c(int i10) {
            this.f25570e = Integer.valueOf(i10);
            return this;
        }

        @Override // p183i1.AbstractC6601a.a
        /* JADX INFO: renamed from: d */
        public AbstractC6601a.a mo28518d(int i10) {
            this.f25566a = Integer.valueOf(i10);
            return this;
        }

        @Override // p183i1.AbstractC6601a.a
        /* JADX INFO: renamed from: e */
        public AbstractC6601a.a mo28519e(int i10) {
            this.f25567b = Integer.valueOf(i10);
            return this;
        }

        @Override // p183i1.AbstractC6601a.a
        /* JADX INFO: renamed from: f */
        public AbstractC6601a.a mo28520f(int i10) {
            this.f25569d = Integer.valueOf(i10);
            return this;
        }

        @Override // p183i1.AbstractC6601a.a
        /* JADX INFO: renamed from: g */
        public AbstractC6601a.a mo28521g(int i10) {
            this.f25568c = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // p183i1.AbstractC6601a
    /* JADX INFO: renamed from: b */
    public int mo28509b() {
        return this.f25565f;
    }

    @Override // p183i1.AbstractC6601a
    /* JADX INFO: renamed from: c */
    public int mo28510c() {
        return this.f25561b;
    }

    @Override // p183i1.AbstractC6601a
    /* JADX INFO: renamed from: e */
    public int mo28512e() {
        return this.f25562c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6601a) {
            AbstractC6601a abstractC6601a = (AbstractC6601a) obj;
            if (this.f25561b == abstractC6601a.mo28510c() && this.f25562c == abstractC6601a.mo28512e() && this.f25563d == abstractC6601a.mo28514g() && this.f25564e == abstractC6601a.mo28513f() && this.f25565f == abstractC6601a.mo28509b()) {
                return true;
            }
        }
        return false;
    }

    @Override // p183i1.AbstractC6601a
    /* JADX INFO: renamed from: f */
    public int mo28513f() {
        return this.f25564e;
    }

    @Override // p183i1.AbstractC6601a
    /* JADX INFO: renamed from: g */
    public int mo28514g() {
        return this.f25563d;
    }

    public int hashCode() {
        return ((((((((this.f25561b ^ 1000003) * 1000003) ^ this.f25562c) * 1000003) ^ this.f25563d) * 1000003) ^ this.f25564e) * 1000003) ^ this.f25565f;
    }

    public String toString() {
        return "AudioSettings{audioSource=" + this.f25561b + ", captureSampleRate=" + this.f25562c + ", encodeSampleRate=" + this.f25563d + ", channelCount=" + this.f25564e + ", audioFormat=" + this.f25565f + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6626u(int i10, int i11, int i12, int i13, int i14) {
        this.f25561b = i10;
        this.f25562c = i11;
        this.f25563d = i12;
        this.f25564e = i13;
        this.f25565f = i14;
    }
}
