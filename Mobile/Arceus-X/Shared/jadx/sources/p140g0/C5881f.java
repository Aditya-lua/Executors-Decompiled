package p140g0;

/* JADX INFO: renamed from: g0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5881f extends AbstractC5949w.a {

    /* JADX INFO: renamed from: a */
    public final int f22417a;

    /* JADX INFO: renamed from: b */
    public final Throwable f22418b;

    public C5881f(int i10, Throwable th2) {
        this.f22417a = i10;
        this.f22418b = th2;
    }

    @Override // p140g0.AbstractC5949w.a
    /* JADX INFO: renamed from: c */
    public Throwable mo26329c() {
        return this.f22418b;
    }

    @Override // p140g0.AbstractC5949w.a
    /* JADX INFO: renamed from: d */
    public int mo26330d() {
        return this.f22417a;
    }

    public boolean equals(Object obj) {
        Throwable th2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5949w.a) {
            AbstractC5949w.a aVar = (AbstractC5949w.a) obj;
            if (this.f22417a == aVar.mo26330d() && ((th2 = this.f22418b) != null ? th2.equals(aVar.mo26329c()) : aVar.mo26329c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.f22417a ^ 1000003) * 1000003;
        Throwable th2 = this.f22418b;
        return i10 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f22417a + ", cause=" + this.f22418b + "}";
    }
}
