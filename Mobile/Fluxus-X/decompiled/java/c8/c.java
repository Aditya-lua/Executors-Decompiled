package c8;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f4896a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z7.d<?> f4897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z7.g<?, byte[]> f4898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z7.c f4899e;

    public static final class b extends n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o f4900a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public z7.d<?> f4901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public z7.g<?, byte[]> f4902d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public z7.c f4903e;

        @Override // c8.n.a
        public n a() {
            o oVar = this.f4900a;
            String str = BuildConfig.FLAVOR;
            if (oVar == null) {
                str = BuildConfig.FLAVOR + " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.f4901c == null) {
                str = str + " event";
            }
            if (this.f4902d == null) {
                str = str + " transformer";
            }
            if (this.f4903e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f4900a, this.b, this.f4901c, this.f4902d, this.f4903e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c8.n.a
        public n.a b(z7.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f4903e = cVar;
            return this;
        }

        @Override // c8.n.a
        public n.a c(z7.d<?> dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f4901c = dVar;
            return this;
        }

        @Override // c8.n.a
        public n.a d(z7.g<?, byte[]> gVar) {
            if (gVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f4902d = gVar;
            return this;
        }

        @Override // c8.n.a
        public n.a e(o oVar) {
            if (oVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f4900a = oVar;
            return this;
        }

        @Override // c8.n.a
        public n.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.b = str;
            return this;
        }
    }

    @Override // c8.n
    public z7.c b() {
        return this.f4899e;
    }

    @Override // c8.n
    public z7.d<?> c() {
        return this.f4897c;
    }

    @Override // c8.n
    public z7.g<?, byte[]> e() {
        return this.f4898d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f4896a.equals(nVar.f()) && this.b.equals(nVar.g()) && this.f4897c.equals(nVar.c()) && this.f4898d.equals(nVar.e()) && this.f4899e.equals(nVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // c8.n
    public o f() {
        return this.f4896a;
    }

    @Override // c8.n
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.f4896a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f4897c.hashCode()) * 1000003) ^ this.f4898d.hashCode()) * 1000003) ^ this.f4899e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f4896a + ", transportName=" + this.b + ", event=" + this.f4897c + ", transformer=" + this.f4898d + ", encoding=" + this.f4899e + "}";
    }

    public c(o oVar, String str, z7.d<?> dVar, z7.g<?, byte[]> gVar, z7.c cVar) {
        this.f4896a = oVar;
        this.b = str;
        this.f4897c = dVar;
        this.f4898d = gVar;
        this.f4899e = cVar;
    }
}
