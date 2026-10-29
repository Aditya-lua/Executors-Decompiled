package p306nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.url._UrlKt;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.p5 */
/* JADX INFO: loaded from: classes.dex */
public final class C9236p5 {

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f33333b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public static final AtomicReference f33334c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public static final AtomicReference f33335d = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final InterfaceC9220o5 f33336a;

    public C9236p5(InterfaceC9220o5 interfaceC9220o5) {
        this.f33336a = interfaceC9220o5;
    }

    /* JADX INFO: renamed from: g */
    public static final String m36619g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        C8953m.m36047l(strArr);
        C8953m.m36047l(strArr2);
        C8953m.m36047l(atomicReference);
        C8953m.m36036a(strArr.length == strArr2.length);
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

    /* JADX INFO: renamed from: a */
    public final String m36620a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f33336a.zza() ? str : m36619g(str, C9271r8.f33435c, C9271r8.f33433a, f33333b);
    }

    /* JADX INFO: renamed from: b */
    public final String m36621b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f33336a.zza() ? str : m36619g(str, C9287s8.f33460b, C9287s8.f33459a, f33334c);
    }

    /* JADX INFO: renamed from: c */
    public final String m36622c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f33336a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m36619g(str, C9303t8.f33499b, C9303t8.f33498a, f33335d);
        }
        return "experiment_id(" + str + ")";
    }

    /* JADX INFO: renamed from: d */
    public final String m36623d(zzbg zzbgVar) {
        String string;
        InterfaceC9220o5 interfaceC9220o5 = this.f33336a;
        if (!interfaceC9220o5.zza()) {
            return zzbgVar.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(zzbgVar.f9504h);
        sb2.append(",name=");
        sb2.append(m36620a(zzbgVar.f9502f));
        sb2.append(",params=");
        zzbe zzbeVar = zzbgVar.f9503g;
        if (zzbeVar == null) {
            string = null;
        } else {
            string = !interfaceC9220o5.zza() ? zzbeVar.toString() : m36624e(zzbeVar.m11882y3());
        }
        sb2.append(string);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: e */
    public final String m36624e(Bundle bundle) {
        String strM36625f;
        if (bundle == null) {
            return null;
        }
        if (!this.f33336a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(m36621b(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strM36625f = m36625f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strM36625f = m36625f((Object[]) obj);
            } else {
                strM36625f = obj instanceof ArrayList ? m36625f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sb2.append(strM36625f);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: f */
    public final String m36625f(Object[] objArr) {
        if (objArr == null) {
            return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String strM36624e = obj instanceof Bundle ? m36624e((Bundle) obj) : String.valueOf(obj);
            if (strM36624e != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(strM36624e);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
