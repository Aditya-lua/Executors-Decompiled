package a8;

/* JADX INFO: loaded from: classes.dex */
public final class i extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.c f202a;
    public final o.b b;

    public static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o.c f203a;
        public o.b b;

        @Override // a8.o.a
        public o a() {
            return new i(this.f203a, this.b);
        }

        @Override // a8.o.a
        public o.a b(o.b bVar) {
            this.b = bVar;
            return this;
        }

        @Override // a8.o.a
        public o.a c(o.c cVar) {
            this.f203a = cVar;
            return this;
        }
    }

    @Override // a8.o
    public o.b b() {
        return this.b;
    }

    @Override // a8.o
    public o.c c() {
        return this.f202a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.c cVar = this.f202a;
            if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
                o.b bVar = this.b;
                if (bVar != null ? bVar.equals(oVar.b()) : oVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f202a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f202a + ", mobileSubtype=" + this.b + "}";
    }

    public i(o.c cVar, o.b bVar) {
        this.f202a = cVar;
        this.b = bVar;
    }
}
