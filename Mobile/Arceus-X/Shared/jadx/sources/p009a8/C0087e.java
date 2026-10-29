package p009a8;

/* JADX INFO: renamed from: a8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0087e extends AbstractC0093k {

    /* JADX INFO: renamed from: a */
    public final AbstractC0093k.b f227a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0083a f228b;

    /* JADX INFO: renamed from: a8.e$b */
    public static final class b extends AbstractC0093k.a {

        /* JADX INFO: renamed from: a */
        public AbstractC0093k.b f229a;

        /* JADX INFO: renamed from: b */
        public AbstractC0083a f230b;

        @Override // p009a8.AbstractC0093k.a
        /* JADX INFO: renamed from: a */
        public AbstractC0093k mo242a() {
            return new C0087e(this.f229a, this.f230b);
        }

        @Override // p009a8.AbstractC0093k.a
        /* JADX INFO: renamed from: b */
        public AbstractC0093k.a mo243b(AbstractC0083a abstractC0083a) {
            this.f230b = abstractC0083a;
            return this;
        }

        @Override // p009a8.AbstractC0093k.a
        /* JADX INFO: renamed from: c */
        public AbstractC0093k.a mo244c(AbstractC0093k.b bVar) {
            this.f229a = bVar;
            return this;
        }
    }

    @Override // p009a8.AbstractC0093k
    /* JADX INFO: renamed from: b */
    public AbstractC0083a mo240b() {
        return this.f228b;
    }

    @Override // p009a8.AbstractC0093k
    /* JADX INFO: renamed from: c */
    public AbstractC0093k.b mo241c() {
        return this.f227a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0093k) {
            AbstractC0093k abstractC0093k = (AbstractC0093k) obj;
            AbstractC0093k.b bVar = this.f227a;
            if (bVar != null ? bVar.equals(abstractC0093k.mo241c()) : abstractC0093k.mo241c() == null) {
                AbstractC0083a abstractC0083a = this.f228b;
                if (abstractC0083a != null ? abstractC0083a.equals(abstractC0093k.mo240b()) : abstractC0093k.mo240b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC0093k.b bVar = this.f227a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC0083a abstractC0083a = this.f228b;
        return iHashCode ^ (abstractC0083a != null ? abstractC0083a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f227a + ", androidClientInfo=" + this.f228b + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0087e(AbstractC0093k.b bVar, AbstractC0083a abstractC0083a) {
        this.f227a = bVar;
        this.f228b = abstractC0083a;
    }
}
