package a8;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.b f175a;
    public final a8.a b;

    public static final class b extends k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k.b f176a;
        public a8.a b;

        @Override // a8.k.a
        public k a() {
            return new e(this.f176a, this.b);
        }

        @Override // a8.k.a
        public k.a b(a8.a aVar) {
            this.b = aVar;
            return this;
        }

        @Override // a8.k.a
        public k.a c(k.b bVar) {
            this.f176a = bVar;
            return this;
        }
    }

    @Override // a8.k
    public a8.a b() {
        return this.b;
    }

    @Override // a8.k
    public k.b c() {
        return this.f175a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            k.b bVar = this.f175a;
            if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
                a8.a aVar = this.b;
                if (aVar != null ? aVar.equals(kVar.b()) : kVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f175a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        a8.a aVar = this.b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f175a + ", androidClientInfo=" + this.b + "}";
    }

    public e(k.b bVar, a8.a aVar) {
        this.f175a = bVar;
        this.b = aVar;
    }
}
