package n0;

/* JADX INFO: loaded from: classes.dex */
public final class j<T> extends n1.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24702a;
    public final Class<T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f24703c;

    public j(String str, Class<T> cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f24702a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.b = cls;
        this.f24703c = obj;
    }

    @Override // n0.n1.a
    public String c() {
        return this.f24702a;
    }

    @Override // n0.n1.a
    public Object d() {
        return this.f24703c;
    }

    @Override // n0.n1.a
    public Class<T> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n1.a) {
            n1.a aVar = (n1.a) obj;
            if (this.f24702a.equals(aVar.c()) && this.b.equals(aVar.e()) && ((obj2 = this.f24703c) != null ? obj2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f24702a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Object obj = this.f24703c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f24702a + ", valueClass=" + this.b + ", token=" + this.f24703c + "}";
    }
}
