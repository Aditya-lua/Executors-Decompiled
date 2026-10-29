package p100eb;

import java.util.Arrays;

/* JADX INFO: renamed from: eb.z3 */
/* JADX INFO: loaded from: classes.dex */
public final class C5047z3 extends AbstractC4923e4 {

    /* JADX INFO: renamed from: a */
    public final long f19848a;

    public C5047z3(long j10) {
        this.f19848a = j10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC4923e4 abstractC4923e4 = (AbstractC4923e4) obj;
        if (zza() != abstractC4923e4.zza()) {
            return zza() - abstractC4923e4.zza();
        }
        long jAbs = Math.abs(this.f19848a);
        long jAbs2 = Math.abs(((C5047z3) abstractC4923e4).f19848a);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5047z3.class == obj.getClass() && this.f19848a == ((C5047z3) obj).f19848a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f19848a)});
    }

    /* JADX INFO: renamed from: q */
    public final long m23727q() {
        return this.f19848a;
    }

    public final String toString() {
        return Long.toString(this.f19848a);
    }

    @Override // p100eb.AbstractC4923e4
    public final int zza() {
        return AbstractC4923e4.m23579c(this.f19848a >= 0 ? (byte) 0 : (byte) 32);
    }
}
