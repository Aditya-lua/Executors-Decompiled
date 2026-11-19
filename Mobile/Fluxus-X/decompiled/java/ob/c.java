package ob;

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
    public final String f27133a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f27134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f27135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f27136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f27137f;

    public c(String str, int i10) {
        this.f27133a = str;
        this.b = i10;
    }

    public static Boolean d(String str, int i10, boolean z10, String str2, List list, String str3, b6 b6Var) {
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
                    if (b6Var != null) {
                        b6Var.r().b("Invalid regular expression in REGEXP audience filter. expression", str3);
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

    public static Boolean f(String str, com.google.android.gms.internal.measurement.p4 p4Var, b6 b6Var) {
        List list;
        o9.s.l(p4Var);
        if (str == null || !p4Var.F() || p4Var.O() == 1 || (p4Var.O() != 7 ? !p4Var.G() : p4Var.L() == 0)) {
            return null;
        }
        int iO = p4Var.O();
        boolean zJ = p4Var.J();
        String strH = (zJ || iO == 2 || iO == 7) ? p4Var.H() : p4Var.H().toUpperCase(Locale.ENGLISH);
        if (p4Var.L() == 0) {
            list = null;
        } else {
            List listK = p4Var.K();
            if (!zJ) {
                ArrayList arrayList = new ArrayList(listK.size());
                Iterator it = listK.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listK = Collections.unmodifiableList(arrayList);
            }
            list = listK;
        }
        return d(str, iO, zJ, strH, list, iO == 2 ? strH : null, b6Var);
    }

    public static Boolean g(long j10, com.google.android.gms.internal.measurement.j4 j4Var) {
        try {
            return j(new BigDecimal(j10), j4Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean h(double d10, com.google.android.gms.internal.measurement.j4 j4Var) {
        try {
            return j(new BigDecimal(d10), j4Var, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean i(String str, com.google.android.gms.internal.measurement.j4 j4Var) {
        if (!af.O(str)) {
            return null;
        }
        try {
            return j(new BigDecimal(str), j4Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean j(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.j4 j4Var, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        o9.s.l(j4Var);
        if (j4Var.F()) {
            if (j4Var.R() != 1) {
                if (j4Var.R() == 5) {
                    if (!j4Var.K() || !j4Var.M()) {
                        return null;
                    }
                } else if (!j4Var.I()) {
                    return null;
                }
                int iR = j4Var.R();
                if (j4Var.R() == 5) {
                    if (af.O(j4Var.L()) && af.O(j4Var.N())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(j4Var.L());
                            bigDecimal4 = new BigDecimal(j4Var.N());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!af.O(j4Var.J())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(j4Var.J());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iR == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i10 = iR - 1;
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
