package ob;

import android.text.TextUtils;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class b6 extends p8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f27105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f27106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z5 f27108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z5 f27109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z5 f27110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z5 f27111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z5 f27112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z5 f27113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z5 f27114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z5 f27115m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z5 f27116n;

    public b6(l7 l7Var) {
        super(l7Var);
        this.f27105c = (char) 0;
        this.f27106d = -1L;
        this.f27108f = new z5(this, 6, false, false);
        this.f27109g = new z5(this, 6, true, false);
        this.f27110h = new z5(this, 6, false, true);
        this.f27111i = new z5(this, 5, false, false);
        this.f27112j = new z5(this, 5, true, false);
        this.f27113k = new z5(this, 5, false, true);
        this.f27114l = new z5(this, 4, false, false);
        this.f27115m = new z5(this, 3, false, false);
        this.f27116n = new z5(this, 2, false, false);
    }

    public static String A(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String strB = B(z10, obj);
        String strB2 = B(z10, obj2);
        String strB3 = B(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = BuildConfig.FLAVOR;
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
        String str = BuildConfig.FLAVOR;
        if (obj == null) {
            return BuildConfig.FLAVOR;
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
            if (cCharAt == '-') {
                str = "-";
            }
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
            if (obj instanceof a6) {
                return ((a6) obj).a();
            }
            return z10 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
        String strC = C(l7.class.getCanonicalName());
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
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) ? BuildConfig.FLAVOR : str.substring(0, iLastIndexOf);
    }

    public static Object x(String str) {
        if (str == null) {
            return null;
        }
        return new a6(str);
    }

    public final /* synthetic */ char D() {
        return this.f27105c;
    }

    public final /* synthetic */ void E(char c10) {
        this.f27105c = c10;
    }

    public final /* synthetic */ long F() {
        return this.f27106d;
    }

    public final /* synthetic */ void G(long j10) {
        this.f27106d = 133005L;
    }

    @Override // ob.p8
    public final boolean i() {
        return false;
    }

    public final z5 o() {
        return this.f27108f;
    }

    public final z5 p() {
        return this.f27109g;
    }

    public final z5 q() {
        return this.f27110h;
    }

    public final z5 r() {
        return this.f27111i;
    }

    public final z5 s() {
        return this.f27112j;
    }

    public final z5 t() {
        return this.f27113k;
    }

    public final z5 u() {
        return this.f27114l;
    }

    public final z5 v() {
        return this.f27115m;
    }

    public final z5 w() {
        return this.f27116n;
    }

    public final void y(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(z(), i10)) {
            Log.println(i10, z(), A(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        o9.s.l(str);
        h7 h7VarA = this.f27641a.A();
        if (h7VarA == null) {
            Log.println(6, z(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!h7VarA.k()) {
                Log.println(6, z(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            h7VarA.t(new y5(this, i10, str, obj, obj2, obj3));
        }
    }

    public final String z() {
        String str;
        synchronized (this) {
            try {
                if (this.f27107e == null) {
                    this.f27107e = this.f27641a.w().u();
                }
                o9.s.l(this.f27107e);
                str = this.f27107e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
