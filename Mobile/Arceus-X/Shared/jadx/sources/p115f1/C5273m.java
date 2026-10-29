package p115f1;

import p140g0.C5948v2;

/* JADX INFO: renamed from: f1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C5273m extends AbstractC5257g1 {

    /* JADX INFO: renamed from: d */
    public final int f20399d;

    /* JADX INFO: renamed from: e */
    public final AbstractC5257g1.a f20400e;

    /* JADX INFO: renamed from: f */
    public final C5948v2.h f20401f;

    public C5273m(int i10, AbstractC5257g1.a aVar, C5948v2.h hVar) {
        this.f20399d = i10;
        if (aVar == null) {
            throw new NullPointerException("Null streamState");
        }
        this.f20400e = aVar;
        this.f20401f = hVar;
    }

    @Override // p115f1.AbstractC5257g1
    /* JADX INFO: renamed from: a */
    public int mo24315a() {
        return this.f20399d;
    }

    @Override // p115f1.AbstractC5257g1
    /* JADX INFO: renamed from: b */
    public C5948v2.h mo24316b() {
        return this.f20401f;
    }

    @Override // p115f1.AbstractC5257g1
    /* JADX INFO: renamed from: c */
    public AbstractC5257g1.a mo24317c() {
        return this.f20400e;
    }

    public boolean equals(Object obj) {
        C5948v2.h hVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5257g1) {
            AbstractC5257g1 abstractC5257g1 = (AbstractC5257g1) obj;
            if (this.f20399d == abstractC5257g1.mo24315a() && this.f20400e.equals(abstractC5257g1.mo24317c()) && ((hVar = this.f20401f) != null ? hVar.equals(abstractC5257g1.mo24316b()) : abstractC5257g1.mo24316b() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f20399d ^ 1000003) * 1000003) ^ this.f20400e.hashCode()) * 1000003;
        C5948v2.h hVar = this.f20401f;
        return iHashCode ^ (hVar == null ? 0 : hVar.hashCode());
    }

    public String toString() {
        return "StreamInfo{id=" + this.f20399d + ", streamState=" + this.f20400e + ", inProgressTransformationInfo=" + this.f20401f + "}";
    }
}
