package n0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24755a;

    public n(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.f24755a = obj;
    }

    @Override // n0.e2
    public Object b() {
        return this.f24755a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            return this.f24755a.equals(((e2) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f24755a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f24755a + "}";
    }
}
