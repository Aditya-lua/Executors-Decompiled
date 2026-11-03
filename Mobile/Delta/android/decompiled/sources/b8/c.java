package b8;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f3911a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y7.d<?> f3912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y7.g<?, byte[]> f3913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y7.c f3914e;

    public static final class b extends n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o f3915a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public y7.d<?> f3916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public y7.g<?, byte[]> f3917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public y7.c f3918e;

        @Override // b8.n.a
        public n a() {
            String str = "";
            if (this.f3915a == null) {
                str = " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.f3916c == null) {
                str = str + " event";
            }
            if (this.f3917d == null) {
                str = str + " transformer";
            }
            if (this.f3918e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f3915a, this.b, this.f3916c, this.f3917d, this.f3918e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b8.n.a
        public n.a b(y7.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f3918e = cVar;
            return this;
        }

        @Override // b8.n.a
        public n.a c(y7.d<?> dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f3916c = dVar;
            return this;
        }

        @Override // b8.n.a
        public n.a d(y7.g<?, byte[]> gVar) {
            if (gVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f3917d = gVar;
            return this;
        }

        @Override // b8.n.a
        public n.a e(o oVar) {
            if (oVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f3915a = oVar;
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
        return this.f3914e;
    }

    @Override // b8.n
    public y7.d<?> c() {
        return this.f3912c;
    }

    @Override // b8.n
    public y7.g<?, byte[]> e() {
        return this.f3913d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f3911a.equals(nVar.f()) && this.b.equals(nVar.g()) && this.f3912c.equals(nVar.c()) && this.f3913d.equals(nVar.e()) && this.f3914e.equals(nVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // b8.n
    public o f() {
        return this.f3911a;
    }

    @Override // b8.n
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.f3911a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f3912c.hashCode()) * 1000003) ^ this.f3913d.hashCode()) * 1000003) ^ this.f3914e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f3911a + ", transportName=" + this.b + ", event=" + this.f3912c + ", transformer=" + this.f3913d + ", encoding=" + this.f3914e + "}";
    }

    public c(o oVar, String str, y7.d<?> dVar, y7.g<?, byte[]> gVar, y7.c cVar) {
        this.f3911a = oVar;
        this.b = str;
        this.f3912c = dVar;
        this.f3913d = gVar;
        this.f3914e = cVar;
    }
}
