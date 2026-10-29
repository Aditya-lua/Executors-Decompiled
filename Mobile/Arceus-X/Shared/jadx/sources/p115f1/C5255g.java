package p115f1;

/* JADX INFO: renamed from: f1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5255g extends AbstractC5291s {

    /* JADX INFO: renamed from: a */
    public final AbstractC5245c2 f20355a;

    /* JADX INFO: renamed from: b */
    public final AbstractC5234a f20356b;

    /* JADX INFO: renamed from: c */
    public final int f20357c;

    /* JADX INFO: renamed from: f1.g$b */
    public static final class b extends AbstractC5291s.a {

        /* JADX INFO: renamed from: a */
        public AbstractC5245c2 f20358a;

        /* JADX INFO: renamed from: b */
        public AbstractC5234a f20359b;

        /* JADX INFO: renamed from: c */
        public Integer f20360c;

        @Override // p115f1.AbstractC5291s.a
        /* JADX INFO: renamed from: a */
        public AbstractC5291s mo24308a() {
            String str = "";
            if (this.f20358a == null) {
                str = " videoSpec";
            }
            if (this.f20359b == null) {
                str = str + " audioSpec";
            }
            if (this.f20360c == null) {
                str = str + " outputFormat";
            }
            if (str.isEmpty()) {
                return new C5255g(this.f20358a, this.f20359b, this.f20360c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p115f1.AbstractC5291s.a
        /* JADX INFO: renamed from: c */
        public AbstractC5245c2 mo24309c() {
            AbstractC5245c2 abstractC5245c2 = this.f20358a;
            if (abstractC5245c2 != null) {
                return abstractC5245c2;
            }
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }

        @Override // p115f1.AbstractC5291s.a
        /* JADX INFO: renamed from: d */
        public AbstractC5291s.a mo24310d(AbstractC5234a abstractC5234a) {
            if (abstractC5234a == null) {
                throw new NullPointerException("Null audioSpec");
            }
            this.f20359b = abstractC5234a;
            return this;
        }

        @Override // p115f1.AbstractC5291s.a
        /* JADX INFO: renamed from: e */
        public AbstractC5291s.a mo24311e(int i10) {
            this.f20360c = Integer.valueOf(i10);
            return this;
        }

        @Override // p115f1.AbstractC5291s.a
        /* JADX INFO: renamed from: f */
        public AbstractC5291s.a mo24312f(AbstractC5245c2 abstractC5245c2) {
            if (abstractC5245c2 == null) {
                throw new NullPointerException("Null videoSpec");
            }
            this.f20358a = abstractC5245c2;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }

        public b(AbstractC5291s abstractC5291s) {
            this.f20358a = abstractC5291s.mo24306d();
            this.f20359b = abstractC5291s.mo24304b();
            this.f20360c = Integer.valueOf(abstractC5291s.mo24305c());
        }
    }

    @Override // p115f1.AbstractC5291s
    /* JADX INFO: renamed from: b */
    public AbstractC5234a mo24304b() {
        return this.f20356b;
    }

    @Override // p115f1.AbstractC5291s
    /* JADX INFO: renamed from: c */
    public int mo24305c() {
        return this.f20357c;
    }

    @Override // p115f1.AbstractC5291s
    /* JADX INFO: renamed from: d */
    public AbstractC5245c2 mo24306d() {
        return this.f20355a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5291s) {
            AbstractC5291s abstractC5291s = (AbstractC5291s) obj;
            if (this.f20355a.equals(abstractC5291s.mo24306d()) && this.f20356b.equals(abstractC5291s.mo24304b()) && this.f20357c == abstractC5291s.mo24305c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f20355a.hashCode() ^ 1000003) * 1000003) ^ this.f20356b.hashCode()) * 1000003) ^ this.f20357c;
    }

    @Override // p115f1.AbstractC5291s
    /* JADX INFO: renamed from: i */
    public AbstractC5291s.a mo24307i() {
        return new b(this);
    }

    public String toString() {
        return "MediaSpec{videoSpec=" + this.f20355a + ", audioSpec=" + this.f20356b + ", outputFormat=" + this.f20357c + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5255g(AbstractC5245c2 abstractC5245c2, AbstractC5234a abstractC5234a, int i10) {
        this.f20355a = abstractC5245c2;
        this.f20356b = abstractC5234a;
        this.f20357c = i10;
    }
}
