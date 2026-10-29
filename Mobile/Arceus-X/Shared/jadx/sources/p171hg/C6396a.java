package p171hg;

/* JADX INFO: renamed from: hg.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6396a extends AbstractC6401f {

    /* JADX INFO: renamed from: a */
    public final String f24328a;

    /* JADX INFO: renamed from: b */
    public final String f24329b;

    public C6396a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f24328a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f24329b = str2;
    }

    @Override // p171hg.AbstractC6401f
    /* JADX INFO: renamed from: b */
    public String mo27975b() {
        return this.f24328a;
    }

    @Override // p171hg.AbstractC6401f
    /* JADX INFO: renamed from: c */
    public String mo27976c() {
        return this.f24329b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6401f) {
            AbstractC6401f abstractC6401f = (AbstractC6401f) obj;
            if (this.f24328a.equals(abstractC6401f.mo27975b()) && this.f24329b.equals(abstractC6401f.mo27976c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f24328a.hashCode() ^ 1000003) * 1000003) ^ this.f24329b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f24328a + ", version=" + this.f24329b + "}";
    }
}
