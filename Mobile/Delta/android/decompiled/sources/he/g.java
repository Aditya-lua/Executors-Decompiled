package he;

/* JADX INFO: loaded from: classes2.dex */
public final class g {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 24);
            sb2.append("null key in entry: null=");
            sb2.append(strValueOf);
            throw new NullPointerException(sb2.toString());
        }
        if (obj2 != null) {
            return;
        }
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 26);
        sb3.append("null value in entry: ");
        sb3.append(strValueOf2);
        sb3.append("=null");
        throw new NullPointerException(sb3.toString());
    }

    public static int b(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void c(boolean z10) {
        ge.n.s(z10, "no calls to next() since the last call to remove()");
    }
}
