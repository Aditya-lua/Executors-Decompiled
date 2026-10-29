package p260l1;

import p296n0.InterfaceC8721a2;

/* JADX INFO: renamed from: l1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7966i extends AbstractC7973p {

    /* JADX INFO: renamed from: a */
    public final String f29862a;

    /* JADX INFO: renamed from: b */
    public final int f29863b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8721a2.c f29864c;

    /* JADX INFO: renamed from: l1.i$b */
    public static final class b extends AbstractC7973p.a {

        /* JADX INFO: renamed from: a */
        public String f29865a;

        /* JADX INFO: renamed from: b */
        public Integer f29866b;

        /* JADX INFO: renamed from: c */
        public InterfaceC8721a2.c f29867c;

        @Override // p260l1.AbstractC7973p.a
        /* JADX INFO: renamed from: b */
        public AbstractC7973p mo32983b() {
            String str = "";
            if (this.f29865a == null) {
                str = " mimeType";
            }
            if (this.f29866b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new C7966i(this.f29865a, this.f29866b.intValue(), this.f29867c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p260l1.AbstractC7973p.a
        /* JADX INFO: renamed from: c */
        public AbstractC7973p.a mo32984c(InterfaceC8721a2.c cVar) {
            this.f29867c = cVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public AbstractC7973p.a m32985d(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f29865a = str;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: a(I)Ljava/lang/Object; */
        @Override // p260l1.AbstractC7969l.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractC7973p.a mo32979a(int i10) {
            this.f29866b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // p260l1.AbstractC7969l
    /* JADX INFO: renamed from: a */
    public String mo32977a() {
        return this.f29862a;
    }

    @Override // p260l1.AbstractC7969l
    /* JADX INFO: renamed from: b */
    public int mo32978b() {
        return this.f29863b;
    }

    @Override // p260l1.AbstractC7973p
    /* JADX INFO: renamed from: d */
    public InterfaceC8721a2.c mo32982d() {
        return this.f29864c;
    }

    public boolean equals(Object obj) {
        InterfaceC8721a2.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7973p) {
            AbstractC7973p abstractC7973p = (AbstractC7973p) obj;
            if (this.f29862a.equals(abstractC7973p.mo32977a()) && this.f29863b == abstractC7973p.mo32978b() && ((cVar = this.f29864c) != null ? cVar.equals(abstractC7973p.mo32982d()) : abstractC7973p.mo32982d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f29862a.hashCode() ^ 1000003) * 1000003) ^ this.f29863b) * 1000003;
        InterfaceC8721a2.c cVar = this.f29864c;
        return iHashCode ^ (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        return "VideoMimeInfo{mimeType=" + this.f29862a + ", profile=" + this.f29863b + ", compatibleVideoProfile=" + this.f29864c + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7966i(String str, int i10, InterfaceC8721a2.c cVar) {
        this.f29862a = str;
        this.f29863b = i10;
        this.f29864c = cVar;
    }
}
