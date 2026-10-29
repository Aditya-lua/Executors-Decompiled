package l1;

import n0.a2;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22905a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.c f22906c;

    public static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f22907a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a2.c f22908c;

        @Override // l1.p.a
        public p b() {
            String str = "";
            if (this.f22907a == null) {
                str = " mimeType";
            }
            if (this.b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new i(this.f22907a, this.b.intValue(), this.f22908c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // l1.p.a
        public p.a c(a2.c cVar) {
            this.f22908c = cVar;
            return this;
        }

        public p.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f22907a = str;
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
        return this.f22905a;
    }

    @Override // l1.l
    public int b() {
        return this.b;
    }

    @Override // l1.p
    public a2.c d() {
        return this.f22906c;
    }

    public boolean equals(Object obj) {
        a2.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f22905a.equals(pVar.a()) && this.b == pVar.b() && ((cVar = this.f22906c) != null ? cVar.equals(pVar.d()) : pVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f22905a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        a2.c cVar = this.f22906c;
        return iHashCode ^ (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        return "VideoMimeInfo{mimeType=" + this.f22905a + ", profile=" + this.b + ", compatibleVideoProfile=" + this.f22906c + "}";
    }

    public i(String str, int i10, a2.c cVar) {
        this.f22905a = str;
        this.b = i10;
        this.f22906c = cVar;
    }
}
