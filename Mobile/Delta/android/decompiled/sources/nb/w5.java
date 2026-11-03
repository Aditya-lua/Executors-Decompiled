package nb;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class w5 extends k8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f26877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u5 f26880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u5 f26881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u5 f26882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u5 f26883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u5 f26884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u5 f26885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u5 f26886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u5 f26887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u5 f26888n;

    public w5(g7 g7Var) {
        super(g7Var);
        this.f26877c = (char) 0;
        this.f26878d = -1L;
        this.f26880f = new u5(this, 6, false, false);
        this.f26881g = new u5(this, 6, true, false);
        this.f26882h = new u5(this, 6, false, true);
        this.f26883i = new u5(this, 5, false, false);
        this.f26884j = new u5(this, 5, true, false);
        this.f26885k = new u5(this, 5, false, true);
        this.f26886l = new u5(this, 4, false, false);
        this.f26887m = new u5(this, 3, false, false);
        this.f26888n = new u5(this, 2, false, false);
    }

    public static String A(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String strB = B(z10, obj);
        String strB2 = B(z10, obj2);
        String strB3 = B(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strB)) {
            sb2.append(str2);
            sb2.append(strB);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strB2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strB2);
        }
        if (!TextUtils.isEmpty(strB3)) {
            sb2.append(str3);
            sb2.append(strB3);
        }
        return sb2.toString();
    }

    public static String B(boolean z10, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb2 = new StringBuilder(str.length() + length + 3 + str.length() + String.valueOf(jRound2).length());
            sb2.append(str);
            sb2.append(jRound);
            sb2.append("...");
            sb2.append(str);
            sb2.append(jRound2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof v5) {
                return ((v5) obj).a();
            }
            return z10 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
        String strC = C(g7.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && C(className).equals(strC)) {
                sb3.append(": ");
                sb3.append(stackTraceElement);
                break;
            }
        }
        return sb3.toString();
    }

    public static String C(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, iLastIndexOf);
    }

    public static Object x(String str) {
        if (str == null) {
            return null;
        }
        return new v5(str);
    }

    public final /* synthetic */ char D() {
        return this.f26877c;
    }

    public final /* synthetic */ void E(char c10) {
        this.f26877c = c10;
    }

    public final /* synthetic */ long F() {
        return this.f26878d;
    }

    public final /* synthetic */ void G(long j10) {
        this.f26878d = 133005L;
    }

    @Override // nb.k8
    public final boolean i() {
        return false;
    }

    public final u5 o() {
        return this.f26880f;
    }

    public final u5 p() {
        return this.f26881g;
    }

    public final u5 q() {
        return this.f26882h;
    }

    public final u5 r() {
        return this.f26883i;
    }

    public final u5 s() {
        return this.f26884j;
    }

    public final u5 t() {
        return this.f26885k;
    }

    public final u5 u() {
        return this.f26886l;
    }

    public final u5 v() {
        return this.f26887m;
    }

    public final u5 w() {
        return this.f26888n;
    }

    public final void y(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(z(), i10)) {
            Log.println(i10, z(), A(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        n9.m.l(str);
        c7 c7VarA = this.f26446a.A();
        if (c7VarA == null) {
            Log.println(6, z(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!c7VarA.k()) {
                Log.println(6, z(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            c7VarA.t(new t5(this, i10, str, obj, obj2, obj3));
        }
    }

    public final String z() {
        String str;
        synchronized (this) {
            try {
                if (this.f26879e == null) {
                    this.f26879e = this.f26446a.w().u();
                }
                n9.m.l(this.f26879e);
                str = this.f26879e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
