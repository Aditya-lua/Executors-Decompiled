package p140g0;

/* JADX INFO: renamed from: g0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5877e extends AbstractC5949w {

    /* JADX INFO: renamed from: a */
    public final AbstractC5949w.b f22404a;

    /* JADX INFO: renamed from: b */
    public final AbstractC5949w.a f22405b;

    public C5877e(AbstractC5949w.b bVar, AbstractC5949w.a aVar) {
        if (bVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f22404a = bVar;
        this.f22405b = aVar;
    }

    @Override // p140g0.AbstractC5949w
    /* JADX INFO: renamed from: c */
    public AbstractC5949w.a mo26327c() {
        return this.f22405b;
    }

    @Override // p140g0.AbstractC5949w
    /* JADX INFO: renamed from: d */
    public AbstractC5949w.b mo26328d() {
        return this.f22404a;
    }

    public boolean equals(Object obj) {
        AbstractC5949w.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5949w) {
            AbstractC5949w abstractC5949w = (AbstractC5949w) obj;
            if (this.f22404a.equals(abstractC5949w.mo26328d()) && ((aVar = this.f22405b) != null ? aVar.equals(abstractC5949w.mo26327c()) : abstractC5949w.mo26327c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f22404a.hashCode() ^ 1000003) * 1000003;
        AbstractC5949w.a aVar = this.f22405b;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f22404a + ", error=" + this.f22405b + "}";
    }
}
