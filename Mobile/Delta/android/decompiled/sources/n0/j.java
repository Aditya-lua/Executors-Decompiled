package n0;

/* JADX INFO: loaded from: classes.dex */
public final class j<T> extends n1.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25523a;
    public final Class<T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f25524c;

    public j(String str, Class<T> cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f25523a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.b = cls;
        this.f25524c = obj;
    }

    @Override // n0.n1.a
    public String c() {
        return this.f25523a;
    }

    @Override // n0.n1.a
    public Object d() {
        return this.f25524c;
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
            if (this.f25523a.equals(aVar.c()) && this.b.equals(aVar.e()) && ((obj2 = this.f25524c) != null ? obj2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f25523a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Object obj = this.f25524c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f25523a + ", valueClass=" + this.b + ", token=" + this.f25524c + "}";
    }
}
