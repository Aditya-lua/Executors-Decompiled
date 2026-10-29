package nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes.dex */
public final class p5 {
    public static final AtomicReference b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f25844c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f25845d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5 f25846a;

    public p5(o5 o5Var) {
        this.f25846a = o5Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        n9.m.l(strArr);
        n9.m.l(strArr2);
        n9.m.l(atomicReference);
        n9.m.a(strArr.length == strArr2.length);
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
        return !this.f25846a.zza() ? str : g(str, r8.f25928c, r8.f25927a, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f25846a.zza() ? str : g(str, s8.b, s8.f25946a, f25844c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f25846a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, t8.b, t8.f25980a, f25845d);
        }
        return "experiment_id(" + str + ")";
    }

    public final String d(zzbg zzbgVar) {
        String string;
        o5 o5Var = this.f25846a;
        if (!o5Var.zza()) {
            return zzbgVar.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(zzbgVar.f7424h);
        sb2.append(",name=");
        sb2.append(a(zzbgVar.f7422f));
        sb2.append(",params=");
        zzbe zzbeVar = zzbgVar.f7423g;
        if (zzbeVar == null) {
            string = null;
        } else {
            string = !o5Var.zza() ? zzbeVar.toString() : e(zzbeVar.y3());
        }
        sb2.append(string);
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        String strF;
        if (bundle == null) {
            return null;
        }
        if (!this.f25846a.zza()) {
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
            return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
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
