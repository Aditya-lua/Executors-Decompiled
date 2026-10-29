package eb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15282a;
    public final h0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h0 f15283c;

    public /* synthetic */ j0(String str, i0 i0Var) {
        h0 h0Var = new h0();
        this.b = h0Var;
        this.f15283c = h0Var;
        str.getClass();
        this.f15282a = str;
    }

    public final j0 a(String str, int i10) {
        String strValueOf = String.valueOf(i10);
        g0 g0Var = new g0(null);
        this.f15283c.f15272c = g0Var;
        this.f15283c = g0Var;
        g0Var.b = strValueOf;
        g0Var.f15271a = "errorCode";
        return this;
    }

    public final j0 b(String str, Object obj) {
        h0 h0Var = new h0();
        this.f15283c.f15272c = h0Var;
        this.f15283c = h0Var;
        h0Var.b = obj;
        h0Var.f15271a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f15282a);
        sb2.append('{');
        h0 h0Var = this.b.f15272c;
        String str = "";
        while (h0Var != null) {
            Object obj = h0Var.b;
            sb2.append(str);
            String str2 = h0Var.f15271a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            h0Var = h0Var.f15272c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
