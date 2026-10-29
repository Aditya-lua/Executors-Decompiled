package p296n0;

/* JADX INFO: renamed from: n0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C8772j<T> extends InterfaceC8795n1.a<T> {

    /* JADX INFO: renamed from: a */
    public final String f31912a;

    /* JADX INFO: renamed from: b */
    public final Class<T> f31913b;

    /* JADX INFO: renamed from: c */
    public final Object f31914c;

    public C8772j(String str, Class<T> cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f31912a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f31913b = cls;
        this.f31914c = obj;
    }

    @Override // p296n0.InterfaceC8795n1.a
    /* JADX INFO: renamed from: c */
    public String mo35216c() {
        return this.f31912a;
    }

    @Override // p296n0.InterfaceC8795n1.a
    /* JADX INFO: renamed from: d */
    public Object mo35217d() {
        return this.f31914c;
    }

    @Override // p296n0.InterfaceC8795n1.a
    /* JADX INFO: renamed from: e */
    public Class<T> mo35218e() {
        return this.f31913b;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC8795n1.a) {
            InterfaceC8795n1.a aVar = (InterfaceC8795n1.a) obj;
            if (this.f31912a.equals(aVar.mo35216c()) && this.f31913b.equals(aVar.mo35218e()) && ((obj2 = this.f31914c) != null ? obj2.equals(aVar.mo35217d()) : aVar.mo35217d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f31912a.hashCode() ^ 1000003) * 1000003) ^ this.f31913b.hashCode()) * 1000003;
        Object obj = this.f31914c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f31912a + ", valueClass=" + this.f31913b + ", token=" + this.f31914c + "}";
    }
}
