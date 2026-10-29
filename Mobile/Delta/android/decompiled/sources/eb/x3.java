package eb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x3 extends e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3 f15424a;

    public x3(m3 m3Var) {
        this.f15424a = m3Var;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        e4 e4Var = (e4) obj;
        if (e4.c((byte) 64) != e4Var.zza()) {
            return e4.c((byte) 64) - e4Var.zza();
        }
        x3 x3Var = (x3) e4Var;
        m3 m3Var = this.f15424a;
        int iD = m3Var.d();
        m3 m3Var2 = x3Var.f15424a;
        if (iD != m3Var2.d()) {
            return m3Var.d() - m3Var2.d();
        }
        return b3.a().compare(m3Var.p(), x3Var.f15424a.p());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x3.class == obj.getClass()) {
            return this.f15424a.equals(((x3) obj).f15424a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(e4.c((byte) 64)), this.f15424a});
    }

    public final m3 q() {
        return this.f15424a;
    }

    public final String toString() {
        u2 u2VarC = u2.d().c();
        byte[] bArrP = this.f15424a.p();
        return "h'" + u2VarC.e(bArrP, 0, bArrP.length) + "'";
    }

    @Override // eb.e4
    public final int zza() {
        return e4.c((byte) 64);
    }
}
