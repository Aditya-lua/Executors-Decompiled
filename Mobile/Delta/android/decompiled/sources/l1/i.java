package l1;

import n0.a2;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23299a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.c f23300c;

    public static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f23301a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a2.c f23302c;

        @Override // l1.p.a
        public p b() {
            String str = "";
            if (this.f23301a == null) {
                str = " mimeType";
            }
            if (this.b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new i(this.f23301a, this.b.intValue(), this.f23302c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // l1.p.a
        public p.a c(a2.c cVar) {
            this.f23302c = cVar;
            return this;
        }

        public p.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f23301a = str;
            return this;
        }

        @Override // l1.l.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public p.a a(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // l1.l
    public String a() {
        return this.f23299a;
    }

    @Override // l1.l
    public int b() {
        return this.b;
    }

    @Override // l1.p
    public a2.c d() {
        return this.f23300c;
    }

    public boolean equals(Object obj) {
        a2.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f23299a.equals(pVar.a()) && this.b == pVar.b() && ((cVar = this.f23300c) != null ? cVar.equals(pVar.d()) : pVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f23299a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        a2.c cVar = this.f23300c;
        return iHashCode ^ (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        return "VideoMimeInfo{mimeType=" + this.f23299a + ", profile=" + this.b + ", compatibleVideoProfile=" + this.f23300c + "}";
    }

    public i(String str, int i10, a2.c cVar) {
        this.f23299a = str;
        this.b = i10;
        this.f23300c = cVar;
    }
}
