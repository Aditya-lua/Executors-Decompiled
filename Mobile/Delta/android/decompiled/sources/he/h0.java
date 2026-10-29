package he;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {
    public static boolean a(g0<?, ?> g0Var, Object obj) {
        if (obj == g0Var) {
            return true;
        }
        if (obj instanceof g0) {
            return g0Var.a().equals(((g0) obj).a());
        }
        return false;
    }
}
