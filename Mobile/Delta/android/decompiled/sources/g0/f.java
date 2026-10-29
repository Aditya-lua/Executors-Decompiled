package g0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17372a;
    public final Throwable b;

    public f(int i10, Throwable th2) {
        this.f17372a = i10;
        this.b = th2;
    }

    @Override // g0.w.a
    public Throwable c() {
        return this.b;
    }

    @Override // g0.w.a
    public int d() {
        return this.f17372a;
    }

    public boolean equals(Object obj) {
        Throwable th2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w.a) {
            w.a aVar = (w.a) obj;
            if (this.f17372a == aVar.d() && ((th2 = this.b) != null ? th2.equals(aVar.c()) : aVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.f17372a ^ 1000003) * 1000003;
        Throwable th2 = this.b;
        return i10 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f17372a + ", cause=" + this.b + "}";
    }
}
