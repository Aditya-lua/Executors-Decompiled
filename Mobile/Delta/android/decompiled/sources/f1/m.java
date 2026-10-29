package f1;

import g0.v2;

/* JADX INFO: loaded from: classes.dex */
public final class m extends g1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g1.a f15886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v2.h f15887f;

    public m(int i10, g1.a aVar, v2.h hVar) {
        this.f15885d = i10;
        if (aVar == null) {
            throw new NullPointerException("Null streamState");
        }
        this.f15886e = aVar;
        this.f15887f = hVar;
    }

    @Override // f1.g1
    public int a() {
        return this.f15885d;
    }

    @Override // f1.g1
    public v2.h b() {
        return this.f15887f;
    }

    @Override // f1.g1
    public g1.a c() {
        return this.f15886e;
    }

    public boolean equals(Object obj) {
        v2.h hVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            if (this.f15885d == g1Var.a() && this.f15886e.equals(g1Var.c()) && ((hVar = this.f15887f) != null ? hVar.equals(g1Var.b()) : g1Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f15885d ^ 1000003) * 1000003) ^ this.f15886e.hashCode()) * 1000003;
        v2.h hVar = this.f15887f;
        return iHashCode ^ (hVar == null ? 0 : hVar.hashCode());
    }

    public String toString() {
        return "StreamInfo{id=" + this.f15885d + ", streamState=" + this.f15886e + ", inProgressTransformationInfo=" + this.f15887f + "}";
    }
}
