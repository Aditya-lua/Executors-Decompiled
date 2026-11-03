package f1;

/* JADX INFO: loaded from: classes.dex */
public final class g extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f16447a;
    public final f1.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16448c;

    public static final class b extends s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c2 f16449a;
        public f1.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f16450c;

        @Override // f1.s.a
        public s a() {
            String str = "";
            if (this.f16449a == null) {
                str = " videoSpec";
            }
            if (this.b == null) {
                str = str + " audioSpec";
            }
            if (this.f16450c == null) {
                str = str + " outputFormat";
            }
            if (str.isEmpty()) {
                return new g(this.f16449a, this.b, this.f16450c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.s.a
        public c2 c() {
            c2 c2Var = this.f16449a;
            if (c2Var != null) {
                return c2Var;
            }
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }

        @Override // f1.s.a
        public s.a d(f1.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null audioSpec");
            }
            this.b = aVar;
            return this;
        }

        @Override // f1.s.a
        public s.a e(int i10) {
            this.f16450c = Integer.valueOf(i10);
            return this;
        }

        @Override // f1.s.a
        public s.a f(c2 c2Var) {
            if (c2Var == null) {
                throw new NullPointerException("Null videoSpec");
            }
            this.f16449a = c2Var;
            return this;
        }

        public b() {
        }

        public b(s sVar) {
            this.f16449a = sVar.d();
            this.b = sVar.b();
            this.f16450c = Integer.valueOf(sVar.c());
        }
    }

    @Override // f1.s
    public f1.a b() {
        return this.b;
    }

    @Override // f1.s
    public int c() {
        return this.f16448c;
    }

    @Override // f1.s
    public c2 d() {
        return this.f16447a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f16447a.equals(sVar.d()) && this.b.equals(sVar.b()) && this.f16448c == sVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f16447a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f16448c;
    }

    @Override // f1.s
    public s.a i() {
        return new b(this);
    }

    public String toString() {
        return "MediaSpec{videoSpec=" + this.f16447a + ", audioSpec=" + this.b + ", outputFormat=" + this.f16448c + "}";
    }

    public g(c2 c2Var, f1.a aVar, int i10) {
        this.f16447a = c2Var;
        this.b = aVar;
        this.f16448c = i10;
    }
}
