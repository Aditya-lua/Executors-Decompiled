package p306nb;

import android.text.TextUtils;
import android.util.Log;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.w5 */
/* JADX INFO: loaded from: classes.dex */
public final class C9348w5 extends AbstractC9159k8 {

    /* JADX INFO: renamed from: c */
    public char f33591c;

    /* JADX INFO: renamed from: d */
    public long f33592d;

    /* JADX INFO: renamed from: e */
    public String f33593e;

    /* JADX INFO: renamed from: f */
    public final C9316u5 f33594f;

    /* JADX INFO: renamed from: g */
    public final C9316u5 f33595g;

    /* JADX INFO: renamed from: h */
    public final C9316u5 f33596h;

    /* JADX INFO: renamed from: i */
    public final C9316u5 f33597i;

    /* JADX INFO: renamed from: j */
    public final C9316u5 f33598j;

    /* JADX INFO: renamed from: k */
    public final C9316u5 f33599k;

    /* JADX INFO: renamed from: l */
    public final C9316u5 f33600l;

    /* JADX INFO: renamed from: m */
    public final C9316u5 f33601m;

    /* JADX INFO: renamed from: n */
    public final C9316u5 f33602n;

    public C9348w5(C9094g7 c9094g7) {
        super(c9094g7);
        this.f33591c = (char) 0;
        this.f33592d = -1L;
        this.f33594f = new C9316u5(this, 6, false, false);
        this.f33595g = new C9316u5(this, 6, true, false);
        this.f33596h = new C9316u5(this, 6, false, true);
        this.f33597i = new C9316u5(this, 5, false, false);
        this.f33598j = new C9316u5(this, 5, true, false);
        this.f33599k = new C9316u5(this, 5, false, true);
        this.f33600l = new C9316u5(this, 4, false, false);
        this.f33601m = new C9316u5(this, 3, false, false);
        this.f33602n = new C9316u5(this, 2, false, false);
    }

    /* JADX INFO: renamed from: A */
    public static String m36995A(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String strM36996B = m36996B(z10, obj);
        String strM36996B2 = m36996B(z10, obj2);
        String strM36996B3 = m36996B(z10, obj3);
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
        if (!TextUtils.isEmpty(strM36996B)) {
            sb2.append(str2);
            sb2.append(strM36996B);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strM36996B2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strM36996B2);
        }
        if (!TextUtils.isEmpty(strM36996B3)) {
            sb2.append(str3);
            sb2.append(strM36996B3);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: B */
    public static String m36996B(boolean z10, Object obj) {
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
            if (obj instanceof C9332v5) {
                return ((C9332v5) obj).m36917a();
            }
            return z10 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
        String strM36997C = m36997C(C9094g7.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m36997C(className).equals(strM36997C)) {
                sb3.append(": ");
                sb3.append(stackTraceElement);
                break;
            }
        }
        return sb3.toString();
    }

    /* JADX INFO: renamed from: C */
    public static String m36997C(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: x */
    public static Object m36998x(String str) {
        if (str == null) {
            return null;
        }
        return new C9332v5(str);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ char m36999D() {
        return this.f33591c;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m37000E(char c10) {
        this.f33591c = c10;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ long m37001F() {
        return this.f33592d;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m37002G(long j10) {
        this.f33592d = 133005L;
    }

    @Override // p306nb.AbstractC9159k8
    /* JADX INFO: renamed from: i */
    public final boolean mo36257i() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final C9316u5 m37003o() {
        return this.f33594f;
    }

    /* JADX INFO: renamed from: p */
    public final C9316u5 m37004p() {
        return this.f33595g;
    }

    /* JADX INFO: renamed from: q */
    public final C9316u5 m37005q() {
        return this.f33596h;
    }

    /* JADX INFO: renamed from: r */
    public final C9316u5 m37006r() {
        return this.f33597i;
    }

    /* JADX INFO: renamed from: s */
    public final C9316u5 m37007s() {
        return this.f33598j;
    }

    /* JADX INFO: renamed from: t */
    public final C9316u5 m37008t() {
        return this.f33599k;
    }

    /* JADX INFO: renamed from: u */
    public final C9316u5 m37009u() {
        return this.f33600l;
    }

    /* JADX INFO: renamed from: v */
    public final C9316u5 m37010v() {
        return this.f33601m;
    }

    /* JADX INFO: renamed from: w */
    public final C9316u5 m37011w() {
        return this.f33602n;
    }

    /* JADX INFO: renamed from: y */
    public final void m37012y(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(m37013z(), i10)) {
            Log.println(i10, m37013z(), m36995A(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        C8953m.m36047l(str);
        C9027c7 c9027c7M36306A = this.f33067a.m36306A();
        if (c9027c7M36306A == null) {
            Log.println(6, m37013z(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!c9027c7M36306A.m36454k()) {
                Log.println(6, m37013z(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            c9027c7M36306A.m36263t(new RunnableC9300t5(this, i10, str, obj, obj2, obj3));
        }
    }

    /* JADX INFO: renamed from: z */
    public final String m37013z() {
        String str;
        synchronized (this) {
            try {
                if (this.f33593e == null) {
                    this.f33593e = this.f33067a.m36338w().m36424u();
                }
                C8953m.m36047l(this.f33593e);
                str = this.f33593e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
