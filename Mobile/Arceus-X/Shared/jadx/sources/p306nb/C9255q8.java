package p306nb;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: nb.q8 */
/* JADX INFO: loaded from: classes.dex */
public final class C9255q8 {

    /* JADX INFO: renamed from: c */
    public static final C9255q8 f33384c = new C9255q8(null, null, 100);

    /* JADX INFO: renamed from: a */
    public final EnumMap f33385a;

    /* JADX INFO: renamed from: b */
    public final int f33386b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C9255q8(Boolean bool, Boolean bool2, int i10) {
        EnumMap enumMap = new EnumMap(EnumC9239p8.class);
        this.f33385a = enumMap;
        enumMap.put(EnumC9239p8.AD_STORAGE, m36646h(null));
        enumMap.put(EnumC9239p8.ANALYTICS_STORAGE, m36646h(null));
        this.f33386b = i10;
    }

    /* JADX INFO: renamed from: a */
    public static C9255q8 m36641a(EnumC9207n8 enumC9207n8, EnumC9207n8 enumC9207n9, int i10) {
        EnumMap enumMap = new EnumMap(EnumC9239p8.class);
        enumMap.put(EnumC9239p8.AD_STORAGE, enumC9207n8);
        enumMap.put(EnumC9239p8.ANALYTICS_STORAGE, enumC9207n9);
        return new C9255q8(enumMap, -10);
    }

    /* JADX INFO: renamed from: d */
    public static String m36642d(int i10) {
        if (i10 == -30) {
            return "TCF";
        }
        if (i10 == -20) {
            return "API";
        }
        if (i10 == -10) {
            return "MANIFEST";
        }
        if (i10 == 0) {
            return "1P_API";
        }
        if (i10 == 30) {
            return "1P_INIT";
        }
        if (i10 != 90) {
            return i10 != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    /* JADX INFO: renamed from: e */
    public static C9255q8 m36643e(Bundle bundle, int i10) {
        if (bundle == null) {
            return new C9255q8(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(EnumC9239p8.class);
        for (EnumC9239p8 enumC9239p8 : EnumC9223o8.STORAGE.m36599b()) {
            enumMap.put(enumC9239p8, m36645g(bundle.getString(enumC9239p8.f33347a)));
        }
        return new C9255q8(enumMap, i10);
    }

    /* JADX INFO: renamed from: f */
    public static C9255q8 m36644f(String str, int i10) {
        EnumMap enumMap = new EnumMap(EnumC9239p8.class);
        EnumC9239p8[] enumC9239p8ArrM36598a = EnumC9223o8.STORAGE.m36598a();
        for (int i11 = 0; i11 < enumC9239p8ArrM36598a.length; i11++) {
            String str2 = str == null ? "" : str;
            EnumC9239p8 enumC9239p8 = enumC9239p8ArrM36598a[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put(enumC9239p8, m36648j(str2.charAt(i12)));
            } else {
                enumMap.put(enumC9239p8, EnumC9207n8.UNINITIALIZED);
            }
        }
        return new C9255q8(enumMap, i10);
    }

    /* JADX INFO: renamed from: g */
    public static EnumC9207n8 m36645g(String str) {
        if (str == null) {
            return EnumC9207n8.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return EnumC9207n8.GRANTED;
        }
        return str.equals("denied") ? EnumC9207n8.DENIED : EnumC9207n8.UNINITIALIZED;
    }

    /* JADX INFO: renamed from: h */
    public static EnumC9207n8 m36646h(Boolean bool) {
        if (bool == null) {
            return EnumC9207n8.UNINITIALIZED;
        }
        return bool.booleanValue() ? EnumC9207n8.GRANTED : EnumC9207n8.DENIED;
    }

    /* JADX INFO: renamed from: i */
    public static String m36647i(EnumC9207n8 enumC9207n8) {
        int iOrdinal = enumC9207n8.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    /* JADX INFO: renamed from: j */
    public static EnumC9207n8 m36648j(char c10) {
        if (c10 == '+') {
            return EnumC9207n8.POLICY;
        }
        if (c10 != '0') {
            return c10 != '1' ? EnumC9207n8.UNINITIALIZED : EnumC9207n8.GRANTED;
        }
        return EnumC9207n8.DENIED;
    }

    /* JADX INFO: renamed from: m */
    public static char m36649m(EnumC9207n8 enumC9207n8) {
        if (enumC9207n8 == null) {
            return '-';
        }
        int iOrdinal = enumC9207n8.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    /* JADX INFO: renamed from: u */
    public static boolean m36650u(int i10, int i11) {
        int i12 = -30;
        if (i10 == -20) {
            if (i11 == -30) {
                return true;
            }
            i10 = -20;
        }
        if (i10 != -30) {
            i12 = i10;
        } else if (i11 == -20) {
            return true;
        }
        return i12 == i11 || i10 < i11;
    }

    /* JADX INFO: renamed from: b */
    public final int m36651b() {
        return this.f33386b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m36652c() {
        Iterator it = this.f33385a.values().iterator();
        while (it.hasNext()) {
            if (((EnumC9207n8) it.next()) != EnumC9207n8.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9255q8)) {
            return false;
        }
        C9255q8 c9255q8 = (C9255q8) obj;
        for (EnumC9239p8 enumC9239p8 : EnumC9223o8.STORAGE.m36599b()) {
            if (this.f33385a.get(enumC9239p8) != c9255q8.f33385a.get(enumC9239p8)) {
                return false;
            }
        }
        return this.f33386b == c9255q8.f33386b;
    }

    public final int hashCode() {
        Iterator it = this.f33385a.values().iterator();
        int iHashCode = this.f33386b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((EnumC9207n8) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX INFO: renamed from: k */
    public final String m36653k() {
        int iOrdinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (EnumC9239p8 enumC9239p8 : EnumC9223o8.STORAGE.m36598a()) {
            EnumC9207n8 enumC9207n8 = (EnumC9207n8) this.f33385a.get(enumC9239p8);
            char c10 = '-';
            if (enumC9207n8 != null && (iOrdinal = enumC9207n8.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c10 = '1';
                } else if (iOrdinal == 2) {
                    c10 = '0';
                } else if (iOrdinal == 3) {
                    c10 = '1';
                }
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: l */
    public final String m36654l() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (EnumC9239p8 enumC9239p8 : EnumC9223o8.STORAGE.m36598a()) {
            sb2.append(m36649m((EnumC9207n8) this.f33385a.get(enumC9239p8)));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: n */
    public final Bundle m36655n() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f33385a.entrySet()) {
            String strM36647i = m36647i((EnumC9207n8) entry.getValue());
            if (strM36647i != null) {
                bundle.putString(((EnumC9239p8) entry.getKey()).f33347a, strM36647i);
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m36656o(EnumC9239p8 enumC9239p8) {
        return ((EnumC9207n8) this.f33385a.get(enumC9239p8)) != EnumC9207n8.DENIED;
    }

    /* JADX INFO: renamed from: p */
    public final EnumC9207n8 m36657p() {
        EnumC9207n8 enumC9207n8 = (EnumC9207n8) this.f33385a.get(EnumC9239p8.AD_STORAGE);
        return enumC9207n8 == null ? EnumC9207n8.UNINITIALIZED : enumC9207n8;
    }

    /* JADX INFO: renamed from: q */
    public final EnumC9207n8 m36658q() {
        EnumC9207n8 enumC9207n8 = (EnumC9207n8) this.f33385a.get(EnumC9239p8.ANALYTICS_STORAGE);
        return enumC9207n8 == null ? EnumC9207n8.UNINITIALIZED : enumC9207n8;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m36659r(C9255q8 c9255q8) {
        EnumMap enumMap = this.f33385a;
        for (EnumC9239p8 enumC9239p8 : (EnumC9239p8[]) enumMap.keySet().toArray(new EnumC9239p8[0])) {
            EnumC9207n8 enumC9207n8 = (EnumC9207n8) enumMap.get(enumC9239p8);
            EnumC9207n8 enumC9207n9 = (EnumC9207n8) c9255q8.f33385a.get(enumC9239p8);
            EnumC9207n8 enumC9207n10 = EnumC9207n8.DENIED;
            if (enumC9207n8 == enumC9207n10 && enumC9207n9 != enumC9207n10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX INFO: renamed from: s */
    public final C9255q8 m36660s(C9255q8 c9255q8) {
        EnumMap enumMap = new EnumMap(EnumC9239p8.class);
        for (EnumC9239p8 enumC9239p8 : EnumC9223o8.STORAGE.m36599b()) {
            EnumC9207n8 enumC9207n8 = (EnumC9207n8) this.f33385a.get(enumC9239p8);
            EnumC9207n8 enumC9207n9 = (EnumC9207n8) c9255q8.f33385a.get(enumC9239p8);
            if (enumC9207n8 == null) {
                enumC9207n8 = enumC9207n9;
            } else if (enumC9207n9 != null) {
                EnumC9207n8 enumC9207n10 = EnumC9207n8.UNINITIALIZED;
                if (enumC9207n8 == enumC9207n10) {
                    enumC9207n8 = enumC9207n9;
                } else if (enumC9207n9 != enumC9207n10) {
                    EnumC9207n8 enumC9207n11 = EnumC9207n8.POLICY;
                    if (enumC9207n8 == enumC9207n11) {
                        enumC9207n8 = enumC9207n9;
                    } else if (enumC9207n9 != enumC9207n11) {
                        EnumC9207n8 enumC9207n12 = EnumC9207n8.DENIED;
                        enumC9207n8 = (enumC9207n8 == enumC9207n12 || enumC9207n9 == enumC9207n12) ? enumC9207n12 : EnumC9207n8.GRANTED;
                    }
                }
            }
            if (enumC9207n8 != null) {
                enumMap.put(enumC9239p8, enumC9207n8);
            }
        }
        return new C9255q8(enumMap, 100);
    }

    /* JADX INFO: renamed from: t */
    public final C9255q8 m36661t(C9255q8 c9255q8) {
        EnumMap enumMap = new EnumMap(EnumC9239p8.class);
        for (EnumC9239p8 enumC9239p8 : EnumC9223o8.STORAGE.m36599b()) {
            EnumC9207n8 enumC9207n8 = (EnumC9207n8) this.f33385a.get(enumC9239p8);
            if (enumC9207n8 == EnumC9207n8.UNINITIALIZED) {
                enumC9207n8 = (EnumC9207n8) c9255q8.f33385a.get(enumC9239p8);
            }
            if (enumC9207n8 != null) {
                enumMap.put(enumC9239p8, enumC9207n8);
            }
        }
        return new C9255q8(enumMap, this.f33386b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(m36642d(this.f33386b));
        for (EnumC9239p8 enumC9239p8 : EnumC9223o8.STORAGE.m36599b()) {
            sb2.append(",");
            sb2.append(enumC9239p8.f33347a);
            sb2.append("=");
            EnumC9207n8 enumC9207n8 = (EnumC9207n8) this.f33385a.get(enumC9239p8);
            if (enumC9207n8 == null) {
                enumC9207n8 = EnumC9207n8.UNINITIALIZED;
            }
            sb2.append(enumC9207n8);
        }
        return sb2.toString();
    }

    public C9255q8(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(EnumC9239p8.class);
        this.f33385a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f33386b = i10;
    }
}
