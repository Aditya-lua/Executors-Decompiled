package eb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class w3 extends e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15421a;

    public w3(boolean z10) {
        this.f15421a = z10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        e4 e4Var = (e4) obj;
        if (e4.c((byte) -32) != e4Var.zza()) {
            return e4.c((byte) -32) - e4Var.zza();
        }
        return (true != this.f15421a ? 20 : 21) - (true != ((w3) e4Var).f15421a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && w3.class == obj.getClass() && this.f15421a == ((w3) obj).f15421a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(e4.c((byte) -32)), Boolean.valueOf(this.f15421a)});
    }

    public final String toString() {
        return Boolean.toString(this.f15421a);
    }

    @Override // eb.e4
    public final int zza() {
        return e4.c((byte) -32);
    }
}
