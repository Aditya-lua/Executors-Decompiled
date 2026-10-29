package g0;

import android.graphics.Matrix;
import n0.z3;

/* JADX INFO: loaded from: classes.dex */
public final class g extends o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3 f17425a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f17427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17428e;

    public g(z3 z3Var, long j10, int i10, Matrix matrix, int i11) {
        if (z3Var == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f17425a = z3Var;
        this.b = j10;
        this.f17426c = i10;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f17427d = matrix;
        this.f17428e = i11;
    }

    @Override // g0.o1, g0.i1
    public int b() {
        return this.f17428e;
    }

    @Override // g0.o1, g0.i1
    public z3 c() {
        return this.f17425a;
    }

    @Override // g0.o1, g0.i1
    public int d() {
        return this.f17426c;
    }

    @Override // g0.o1, g0.i1
    public Matrix e() {
        return this.f17427d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (this.f17425a.equals(o1Var.c()) && this.b == o1Var.getTimestamp() && this.f17426c == o1Var.d() && this.f17427d.equals(o1Var.e()) && this.f17428e == o1Var.b()) {
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
        int iHashCode = (this.f17425a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.b;
        return ((((((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f17426c) * 1000003) ^ this.f17427d.hashCode()) * 1000003) ^ this.f17428e;
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f17425a + ", timestamp=" + this.b + ", rotationDegrees=" + this.f17426c + ", sensorToBufferTransformMatrix=" + this.f17427d + ", flashState=" + this.f17428e + "}";
    }
}
