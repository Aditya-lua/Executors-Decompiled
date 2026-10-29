package p306nb;

import com.google.android.gms.internal.measurement.C2060f4;
import com.google.android.gms.internal.measurement.C2170l4;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9019c {

    /* JADX INFO: renamed from: a */
    public final String f32739a;

    /* JADX INFO: renamed from: b */
    public final int f32740b;

    /* JADX INFO: renamed from: c */
    public Boolean f32741c;

    /* JADX INFO: renamed from: d */
    public Boolean f32742d;

    /* JADX INFO: renamed from: e */
    public Long f32743e;

    /* JADX INFO: renamed from: f */
    public Long f32744f;

    public AbstractC9019c(String str, int i10) {
        this.f32739a = str;
        this.f32740b = i10;
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m36152d(String str, int i10, boolean z10, String str2, List list, String str3, C9348w5 c9348w5) {
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
                    if (c9348w5 != null) {
                        c9348w5.m37006r().m36912b("Invalid regular expression in REGEXP audience filter. expression", str3);
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

    /* JADX INFO: renamed from: e */
    public static Boolean m36153e(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m36154f(String str, C2170l4 c2170l4, C9348w5 c9348w5) {
        List list;
        C8953m.m36047l(c2170l4);
        if (str == null || !c2170l4.m10351F() || c2170l4.m10358Q() == 1 || (c2170l4.m10358Q() != 7 ? !c2170l4.m10352G() : c2170l4.m10357N() == 0)) {
            return null;
        }
        int iM10358Q = c2170l4.m10358Q();
        boolean zM10355K = c2170l4.m10355K();
        String strM10353H = (zM10355K || iM10358Q == 2 || iM10358Q == 7) ? c2170l4.m10353H() : c2170l4.m10353H().toUpperCase(Locale.ENGLISH);
        if (c2170l4.m10357N() == 0) {
            list = null;
        } else {
            List listM10356M = c2170l4.m10356M();
            if (!zM10355K) {
                ArrayList arrayList = new ArrayList(listM10356M.size());
                Iterator it = listM10356M.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listM10356M = Collections.unmodifiableList(arrayList);
            }
            list = listM10356M;
        }
        return m36152d(str, iM10358Q, zM10355K, strM10353H, list, iM10358Q == 2 ? strM10353H : null, c9348w5);
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m36155g(long j10, C2060f4 c2060f4) {
        try {
            return m36158j(new BigDecimal(j10), c2060f4, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static Boolean m36156h(double d10, C2060f4 c2060f4) {
        try {
            return m36158j(new BigDecimal(d10), c2060f4, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static Boolean m36157i(String str, C2060f4 c2060f4) {
        if (!C9277re.m36734O(str)) {
            return null;
        }
        try {
            return m36158j(new BigDecimal(str), c2060f4, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static Boolean m36158j(BigDecimal bigDecimal, C2060f4 c2060f4, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        C8953m.m36047l(c2060f4);
        if (c2060f4.m9969F()) {
            if (c2060f4.m9978S() != 1) {
                if (c2060f4.m9978S() == 5) {
                    if (!c2060f4.m9974M() || !c2060f4.m9976O()) {
                        return null;
                    }
                } else if (!c2060f4.m9972J()) {
                    return null;
                }
                int iM9978S = c2060f4.m9978S();
                if (c2060f4.m9978S() == 5) {
                    if (C9277re.m36734O(c2060f4.m9975N()) && C9277re.m36734O(c2060f4.m9977P())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(c2060f4.m9975N());
                            bigDecimal4 = new BigDecimal(c2060f4.m9977P());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!C9277re.m36734O(c2060f4.m9973K())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(c2060f4.m9973K());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iM9978S == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i10 = iM9978S - 1;
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

    /* JADX INFO: renamed from: a */
    public abstract int mo36113a();

    /* JADX INFO: renamed from: b */
    public abstract boolean mo36114b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo36115c();
}
