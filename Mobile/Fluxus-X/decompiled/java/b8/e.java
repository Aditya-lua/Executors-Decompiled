package b8;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.b f3712a;
    public final b8.a b;

    public static final class b extends k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k.b f3713a;
        public b8.a b;

        @Override // b8.k.a
        public k a() {
            return new e(this.f3713a, this.b);
        }

        @Override // b8.k.a
        public k.a b(b8.a aVar) {
            this.b = aVar;
            return this;
        }

        @Override // b8.k.a
        public k.a c(k.b bVar) {
            this.f3713a = bVar;
            return this;
        }
    }

    @Override // b8.k
    public b8.a b() {
        return this.b;
    }

    @Override // b8.k
    public k.b c() {
        return this.f3712a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            k.b bVar = this.f3712a;
            if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
                b8.a aVar = this.b;
                if (aVar != null ? aVar.equals(kVar.b()) : kVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f3712a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        b8.a aVar = this.b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f3712a + ", androidClientInfo=" + this.b + "}";
    }

    public e(k.b bVar, b8.a aVar) {
        this.f3712a = bVar;
        this.b = aVar;
    }
}
