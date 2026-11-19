package ob;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class u5 {
    public static final AtomicReference b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f27836c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f27837d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t5 f27838a;

    public u5(t5 t5Var) {
        this.f27838a = t5Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        o9.s.l(strArr);
        o9.s.l(strArr2);
        o9.s.l(atomicReference);
        o9.s.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f27838a.zza() ? str : g(str, w8.f27950c, w8.f27949a, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f27838a.zza() ? str : g(str, x8.b, x8.f27967a, f27836c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f27838a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, y8.b, y8.f27995a, f27837d);
        }
        return "experiment_id(" + str + ")";
    }

    public final String d(i0 i0Var) {
        String string;
        t5 t5Var = this.f27838a;
        if (!t5Var.zza()) {
            return i0Var.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(i0Var.f27458h);
        sb2.append(",name=");
        sb2.append(a(i0Var.f27456f));
        sb2.append(",params=");
        g0 g0Var = i0Var.f27457g;
        if (g0Var == null) {
            string = null;
        } else {
            string = !t5Var.zza() ? g0Var.toString() : e(g0Var.D3());
        }
        sb2.append(string);
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        String strF;
        if (bundle == null) {
            return null;
        }
        if (!this.f27838a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(b(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strF = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strF = f((Object[]) obj);
            } else {
                strF = obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sb2.append(strF);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(strE);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
