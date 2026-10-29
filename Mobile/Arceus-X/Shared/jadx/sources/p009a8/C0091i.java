package p009a8;

/* JADX INFO: renamed from: a8.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0091i extends AbstractC0097o {

    /* JADX INFO: renamed from: a */
    public final AbstractC0097o.c f260a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0097o.b f261b;

    /* JADX INFO: renamed from: a8.i$b */
    public static final class b extends AbstractC0097o.a {

        /* JADX INFO: renamed from: a */
        public AbstractC0097o.c f262a;

        /* JADX INFO: renamed from: b */
        public AbstractC0097o.b f263b;

        @Override // p009a8.AbstractC0097o.a
        /* JADX INFO: renamed from: a */
        public AbstractC0097o mo278a() {
            return new C0091i(this.f262a, this.f263b);
        }

        @Override // p009a8.AbstractC0097o.a
        /* JADX INFO: renamed from: b */
        public AbstractC0097o.a mo279b(AbstractC0097o.b bVar) {
            this.f263b = bVar;
            return this;
        }

        @Override // p009a8.AbstractC0097o.a
        /* JADX INFO: renamed from: c */
        public AbstractC0097o.a mo280c(AbstractC0097o.c cVar) {
            this.f262a = cVar;
            return this;
        }
    }

    @Override // p009a8.AbstractC0097o
    /* JADX INFO: renamed from: b */
    public AbstractC0097o.b mo276b() {
        return this.f261b;
    }

    @Override // p009a8.AbstractC0097o
    /* JADX INFO: renamed from: c */
    public AbstractC0097o.c mo277c() {
        return this.f260a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0097o) {
            AbstractC0097o abstractC0097o = (AbstractC0097o) obj;
            AbstractC0097o.c cVar = this.f260a;
            if (cVar != null ? cVar.equals(abstractC0097o.mo277c()) : abstractC0097o.mo277c() == null) {
                AbstractC0097o.b bVar = this.f261b;
                if (bVar != null ? bVar.equals(abstractC0097o.mo276b()) : abstractC0097o.mo276b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC0097o.c cVar = this.f260a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC0097o.b bVar = this.f261b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f260a + ", mobileSubtype=" + this.f261b + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0091i(AbstractC0097o.c cVar, AbstractC0097o.b bVar) {
        this.f260a = cVar;
        this.f261b = bVar;
    }
}
