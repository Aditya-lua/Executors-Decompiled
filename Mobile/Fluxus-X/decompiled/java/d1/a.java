package d1;

import g0.s;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11637a;
    public final s b;

    public a(int i10, s sVar) {
        this.f11637a = i10;
        if (sVar == null) {
            throw new NullPointerException("Null cameraIdentifier");
        }
        this.b = sVar;
    }

    @Override // d1.h.a
    public s b() {
        return this.b;
    }

    @Override // d1.h.a
    public int c() {
        return this.f11637a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h.a) {
            h.a aVar = (h.a) obj;
            if (this.f11637a == aVar.c() && this.b.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11637a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwnerHash=" + this.f11637a + ", cameraIdentifier=" + this.b + "}";
    }
}
