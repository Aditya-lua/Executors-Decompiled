package eb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class z3 extends e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15431a;

    public z3(long j10) {
        this.f15431a = j10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        e4 e4Var = (e4) obj;
        if (zza() != e4Var.zza()) {
            return zza() - e4Var.zza();
        }
        long jAbs = Math.abs(this.f15431a);
        long jAbs2 = Math.abs(((z3) e4Var).f15431a);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && z3.class == obj.getClass() && this.f15431a == ((z3) obj).f15431a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f15431a)});
    }

    public final long q() {
        return this.f15431a;
    }

    public final String toString() {
        return Long.toString(this.f15431a);
    }

    @Override // eb.e4
    public final int zza() {
        return e4.c(this.f15431a >= 0 ? (byte) 0 : (byte) 32);
    }
}
