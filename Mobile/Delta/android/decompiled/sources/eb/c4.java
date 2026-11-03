package eb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c4 extends e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15870a;

    public c4(String str) {
        this.f15870a = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int length;
        int length2;
        e4 e4Var = (e4) obj;
        if (e4.c((byte) 96) != e4Var.zza()) {
            length = e4Var.zza();
            length2 = e4.c((byte) 96);
        } else {
            String str = this.f15870a;
            String str2 = ((c4) e4Var).f15870a;
            if (str.length() == str2.length()) {
                return str.compareTo(str2);
            }
            length = str2.length();
            length2 = str.length();
        }
        return length2 - length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c4.class == obj.getClass()) {
            return this.f15870a.equals(((c4) obj).f15870a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(e4.c((byte) 96)), this.f15870a});
    }

    public final String toString() {
        return "\"" + this.f15870a + "\"";
    }

    @Override // eb.e4
    public final int zza() {
        return e4.c((byte) 96);
    }
}
