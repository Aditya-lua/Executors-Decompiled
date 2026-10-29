package p064d1;

import p140g0.C5933s;

/* JADX INFO: renamed from: d1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4396a extends C4403h.a {

    /* JADX INFO: renamed from: a */
    public final int f18258a;

    /* JADX INFO: renamed from: b */
    public final C5933s f18259b;

    public C4396a(int i10, C5933s c5933s) {
        this.f18258a = i10;
        if (c5933s == null) {
            throw new NullPointerException("Null cameraIdentifier");
        }
        this.f18259b = c5933s;
    }

    @Override // p064d1.C4403h.a
    /* JADX INFO: renamed from: b */
    public C5933s mo22069b() {
        return this.f18259b;
    }

    @Override // p064d1.C4403h.a
    /* JADX INFO: renamed from: c */
    public int mo22070c() {
        return this.f18258a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4403h.a) {
            C4403h.a aVar = (C4403h.a) obj;
            if (this.f18258a == aVar.mo22070c() && this.f18259b.equals(aVar.mo22069b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f18258a ^ 1000003) * 1000003) ^ this.f18259b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwnerHash=" + this.f18258a + ", cameraIdentifier=" + this.f18259b + "}";
    }
}
