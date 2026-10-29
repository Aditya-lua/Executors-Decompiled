package p296n0;

/* JADX INFO: renamed from: n0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C8793n extends AbstractC8745e2 {

    /* JADX INFO: renamed from: a */
    public final Object f31974a;

    public C8793n(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.f31974a = obj;
    }

    @Override // p296n0.AbstractC8745e2
    /* JADX INFO: renamed from: b */
    public Object mo35076b() {
        return this.f31974a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8745e2) {
            return this.f31974a.equals(((AbstractC8745e2) obj).mo35076b());
        }
        return false;
    }

    public int hashCode() {
        return this.f31974a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f31974a + "}";
    }
}
