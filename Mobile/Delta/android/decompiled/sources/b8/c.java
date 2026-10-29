package b8;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f4013a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y7.d<?> f4014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y7.g<?, byte[]> f4015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y7.c f4016e;

    public static final class b extends n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o f4017a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public y7.d<?> f4018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public y7.g<?, byte[]> f4019d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public y7.c f4020e;

        @Override // b8.n.a
        public n a() {
            String str = "";
            if (this.f4017a == null) {
                str = " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.f4018c == null) {
                str = str + " event";
            }
            if (this.f4019d == null) {
                str = str + " transformer";
            }
            if (this.f4020e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f4017a, this.b, this.f4018c, this.f4019d, this.f4020e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b8.n.a
        public n.a b(y7.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f4020e = cVar;
            return this;
        }

        @Override // b8.n.a
        public n.a c(y7.d<?> dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f4018c = dVar;
            return this;
        }

        @Override // b8.n.a
        public n.a d(y7.g<?, byte[]> gVar) {
            if (gVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f4019d = gVar;
            return this;
        }

        @Override // b8.n.a
        public n.a e(o oVar) {
            if (oVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f4017a = oVar;
            return this;
        }

        @Override // b8.n.a
        public n.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.b = str;
            return this;
        }
    }

    @Override // b8.n
    public y7.c b() {
        return this.f4016e;
    }

    @Override // b8.n
    public y7.d<?> c() {
        return this.f4014c;
    }

    @Override // b8.n
    public y7.g<?, byte[]> e() {
        return this.f4015d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f4013a.equals(nVar.f()) && this.b.equals(nVar.g()) && this.f4014c.equals(nVar.c()) && this.f4015d.equals(nVar.e()) && this.f4016e.equals(nVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // b8.n
    public o f() {
        return this.f4013a;
    }

    @Override // b8.n
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.f4013a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f4014c.hashCode()) * 1000003) ^ this.f4015d.hashCode()) * 1000003) ^ this.f4016e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f4013a + ", transportName=" + this.b + ", event=" + this.f4014c + ", transformer=" + this.f4015d + ", encoding=" + this.f4016e + "}";
    }

    public c(o oVar, String str, y7.d<?> dVar, y7.g<?, byte[]> gVar, y7.c cVar) {
        this.f4013a = oVar;
        this.b = str;
        this.f4014c = dVar;
        this.f4015d = gVar;
        this.f4016e = cVar;
    }
}
