package g0;

import android.graphics.Matrix;
import n0.z3;

/* JADX INFO: loaded from: classes.dex */
public final class g extends o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3 f16822a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f16824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16825e;

    public g(z3 z3Var, long j10, int i10, Matrix matrix, int i11) {
        if (z3Var == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f16822a = z3Var;
        this.b = j10;
        this.f16823c = i10;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f16824d = matrix;
        this.f16825e = i11;
    }

    @Override // g0.o1, g0.i1
    public int b() {
        return this.f16825e;
    }

    @Override // g0.o1, g0.i1
    public z3 c() {
        return this.f16822a;
    }

    @Override // g0.o1, g0.i1
    public int d() {
        return this.f16823c;
    }

    @Override // g0.o1, g0.i1
    public Matrix e() {
        return this.f16824d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (this.f16822a.equals(o1Var.c()) && this.b == o1Var.getTimestamp() && this.f16823c == o1Var.d() && this.f16824d.equals(o1Var.e()) && this.f16825e == o1Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // g0.o1, g0.i1
    public long getTimestamp() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = (this.f16822a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.b;
        return ((((((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f16823c) * 1000003) ^ this.f16824d.hashCode()) * 1000003) ^ this.f16825e;
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f16822a + ", timestamp=" + this.b + ", rotationDegrees=" + this.f16823c + ", sensorToBufferTransformMatrix=" + this.f16824d + ", flashState=" + this.f16825e + "}";
    }
}
