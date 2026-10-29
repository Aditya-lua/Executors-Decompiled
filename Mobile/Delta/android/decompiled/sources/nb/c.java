package nb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25377a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f25378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f25379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f25380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f25381f;

    public c(String str, int i10) {
        this.f25377a = str;
        this.b = i10;
    }

    public static Boolean d(String str, int i10, boolean z10, String str2, List list, String str3, w5 w5Var) {
        if (i10 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && i10 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i10 - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z10 ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (w5Var != null) {
                        w5Var.r().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    public static Boolean e(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    public static Boolean f(String str, com.google.android.gms.internal.measurement.l4 l4Var, w5 w5Var) {
        List list;
        n9.m.l(l4Var);
        if (str == null || !l4Var.F() || l4Var.Q() == 1 || (l4Var.Q() != 7 ? !l4Var.G() : l4Var.N() == 0)) {
            return null;
        }
        int iQ = l4Var.Q();
        boolean zK = l4Var.K();
        String strH = (zK || iQ == 2 || iQ == 7) ? l4Var.H() : l4Var.H().toUpperCase(Locale.ENGLISH);
        if (l4Var.N() == 0) {
            list = null;
        } else {
            List listL = l4Var.L();
            if (!zK) {
                ArrayList arrayList = new ArrayList(listL.size());
                Iterator it = listL.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listL = Collections.unmodifiableList(arrayList);
            }
            list = listL;
        }
        return d(str, iQ, zK, strH, list, iQ == 2 ? strH : null, w5Var);
    }

    public static Boolean g(long j10, com.google.android.gms.internal.measurement.f4 f4Var) {
        try {
            return j(new BigDecimal(j10), f4Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean h(double d10, com.google.android.gms.internal.measurement.f4 f4Var) {
        try {
            return j(new BigDecimal(d10), f4Var, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean i(String str, com.google.android.gms.internal.measurement.f4 f4Var) {
        if (!re.O(str)) {
            return null;
        }
        try {
            return j(new BigDecimal(str), f4Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean j(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.f4 f4Var, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        n9.m.l(f4Var);
        if (f4Var.F()) {
            if (f4Var.S() != 1) {
                if (f4Var.S() == 5) {
                    if (!f4Var.L() || !f4Var.O()) {
                        return null;
                    }
                } else if (!f4Var.J()) {
                    return null;
                }
                int iS = f4Var.S();
                if (f4Var.S() == 5) {
                    if (re.O(f4Var.N()) && re.O(f4Var.P())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(f4Var.N());
                            bigDecimal4 = new BigDecimal(f4Var.P());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!re.O(f4Var.K())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(f4Var.K());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iS == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i10 = iS - 1;
                if (i10 == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i10 == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i10 != 3) {
                    if (i10 == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d10 != 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) < 0);
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
