package p140g0;

import android.graphics.Matrix;
import p296n0.C8857z3;

/* JADX INFO: renamed from: g0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5885g extends AbstractC5919o1 {

    /* JADX INFO: renamed from: a */
    public final C8857z3 f22484a;

    /* JADX INFO: renamed from: b */
    public final long f22485b;

    /* JADX INFO: renamed from: c */
    public final int f22486c;

    /* JADX INFO: renamed from: d */
    public final Matrix f22487d;

    /* JADX INFO: renamed from: e */
    public final int f22488e;

    public C5885g(C8857z3 c8857z3, long j10, int i10, Matrix matrix, int i11) {
        if (c8857z3 == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f22484a = c8857z3;
        this.f22485b = j10;
        this.f22486c = i10;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f22487d = matrix;
        this.f22488e = i11;
    }

    @Override // p140g0.AbstractC5919o1, p140g0.InterfaceC5895i1
    /* JADX INFO: renamed from: b */
    public int mo26440b() {
        return this.f22488e;
    }

    @Override // p140g0.AbstractC5919o1, p140g0.InterfaceC5895i1
    /* JADX INFO: renamed from: c */
    public C8857z3 mo26441c() {
        return this.f22484a;
    }

    @Override // p140g0.AbstractC5919o1, p140g0.InterfaceC5895i1
    /* JADX INFO: renamed from: d */
    public int mo26442d() {
        return this.f22486c;
    }

    @Override // p140g0.AbstractC5919o1, p140g0.InterfaceC5895i1
    /* JADX INFO: renamed from: e */
    public Matrix mo26443e() {
        return this.f22487d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5919o1) {
            AbstractC5919o1 abstractC5919o1 = (AbstractC5919o1) obj;
            if (this.f22484a.equals(abstractC5919o1.mo26441c()) && this.f22485b == abstractC5919o1.getTimestamp() && this.f22486c == abstractC5919o1.mo26442d() && this.f22487d.equals(abstractC5919o1.mo26443e()) && this.f22488e == abstractC5919o1.mo26440b()) {
                return true;
            }
        }
        return false;
    }

    @Override // p140g0.AbstractC5919o1, p140g0.InterfaceC5895i1
    public long getTimestamp() {
        return this.f22485b;
    }

    public int hashCode() {
        int iHashCode = (this.f22484a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f22485b;
        return ((((((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f22486c) * 1000003) ^ this.f22487d.hashCode()) * 1000003) ^ this.f22488e;
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f22484a + ", timestamp=" + this.f22485b + ", rotationDegrees=" + this.f22486c + ", sensorToBufferTransformMatrix=" + this.f22487d + ", flashState=" + this.f22488e + "}";
    }
}
