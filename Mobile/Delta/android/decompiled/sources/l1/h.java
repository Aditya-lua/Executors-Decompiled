package l1;

import n0.a2;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22901a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.a f22902c;

    public static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f22903a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a2.a f22904c;

        @Override // l1.e.a
        public e b() {
            String str = "";
            if (this.f22903a == null) {
                str = " mimeType";
            }
            if (this.b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new h(this.f22903a, this.b.intValue(), this.f22904c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // l1.e.a
        public e.a c(a2.a aVar) {
            this.f22904c = aVar;
            return this;
        }

        public e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f22903a = str;
            return this;
        }

        @Override // l1.l.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public e.a a(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // l1.l
    public String a() {
        return this.f22901a;
    }

    @Override // l1.l
    public int b() {
        return this.b;
    }

    @Override // l1.e
    public a2.a d() {
        return this.f22902c;
    }

    public boolean equals(Object obj) {
        a2.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f22901a.equals(eVar.a()) && this.b == eVar.b() && ((aVar = this.f22902c) != null ? aVar.equals(eVar.d()) : eVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f22901a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        a2.a aVar = this.f22902c;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "AudioMimeInfo{mimeType=" + this.f22901a + ", profile=" + this.b + ", compatibleAudioProfile=" + this.f22902c + "}";
    }

    public h(String str, int i10, a2.a aVar) {
        this.f22901a = str;
        this.b = i10;
        this.f22902c = aVar;
    }
}
