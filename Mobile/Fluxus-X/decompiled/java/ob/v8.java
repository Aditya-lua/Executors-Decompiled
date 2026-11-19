package ob;

import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v8 f27868c = new v8(null, null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f27869a;
    public final int b;

    public v8(Boolean bool, Boolean bool2, int i10) {
        EnumMap enumMap = new EnumMap(u8.class);
        this.f27869a = enumMap;
        enumMap.put(u8.AD_STORAGE, h(null));
        enumMap.put(u8.ANALYTICS_STORAGE, h(null));
        this.b = i10;
    }

    public static v8 a(s8 s8Var, s8 s8Var2, int i10) {
        EnumMap enumMap = new EnumMap(u8.class);
        enumMap.put(u8.AD_STORAGE, s8Var);
        enumMap.put(u8.ANALYTICS_STORAGE, s8Var2);
        return new v8(enumMap, -10);
    }

    public static String d(int i10) {
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

    public static v8 e(Bundle bundle, int i10) {
        if (bundle == null) {
            return new v8(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(u8.class);
        for (u8 u8Var : t8.STORAGE.b()) {
            enumMap.put(u8Var, g(bundle.getString(u8Var.f27847a)));
        }
        return new v8(enumMap, i10);
    }

    public static v8 f(String str, int i10) {
        EnumMap enumMap = new EnumMap(u8.class);
        u8[] u8VarArrA = t8.STORAGE.a();
        for (int i11 = 0; i11 < u8VarArrA.length; i11++) {
            String str2 = str == null ? BuildConfig.FLAVOR : str;
            u8 u8Var = u8VarArrA[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put(u8Var, j(str2.charAt(i12)));
            } else {
                enumMap.put(u8Var, s8.UNINITIALIZED);
            }
        }
        return new v8(enumMap, i10);
    }

    public static s8 g(String str) {
        if (str == null) {
            return s8.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return s8.GRANTED;
        }
        return str.equals("denied") ? s8.DENIED : s8.UNINITIALIZED;
    }

    public static s8 h(Boolean bool) {
        if (bool == null) {
            return s8.UNINITIALIZED;
        }
        return bool.booleanValue() ? s8.GRANTED : s8.DENIED;
    }

    public static String i(s8 s8Var) {
        int iOrdinal = s8Var.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    public static s8 j(char c10) {
        if (c10 == '+') {
            return s8.POLICY;
        }
        if (c10 != '0') {
            return c10 != '1' ? s8.UNINITIALIZED : s8.GRANTED;
        }
        return s8.DENIED;
    }

    public static char m(s8 s8Var) {
        if (s8Var == null) {
            return '-';
        }
        int iOrdinal = s8Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean u(int i10, int i11) {
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

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        Iterator it = this.f27869a.values().iterator();
        while (it.hasNext()) {
            if (((s8) it.next()) != s8.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v8)) {
            return false;
        }
        v8 v8Var = (v8) obj;
        for (u8 u8Var : t8.STORAGE.b()) {
            if (this.f27869a.get(u8Var) != v8Var.f27869a.get(u8Var)) {
                return false;
            }
        }
        return this.b == v8Var.b;
    }

    public final int hashCode() {
        Iterator it = this.f27869a.values().iterator();
        int iHashCode = this.b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((s8) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final String k() {
        int iOrdinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (u8 u8Var : t8.STORAGE.a()) {
            s8 s8Var = (s8) this.f27869a.get(u8Var);
            char c10 = '-';
            if (s8Var != null && (iOrdinal = s8Var.ordinal()) != 0) {
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

    public final String l() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (u8 u8Var : t8.STORAGE.a()) {
            sb2.append(m((s8) this.f27869a.get(u8Var)));
        }
        return sb2.toString();
    }

    public final Bundle n() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f27869a.entrySet()) {
            String strI = i((s8) entry.getValue());
            if (strI != null) {
                bundle.putString(((u8) entry.getKey()).f27847a, strI);
            }
        }
        return bundle;
    }

    public final boolean o(u8 u8Var) {
        return ((s8) this.f27869a.get(u8Var)) != s8.DENIED;
    }

    public final s8 p() {
        s8 s8Var = (s8) this.f27869a.get(u8.AD_STORAGE);
        return s8Var == null ? s8.UNINITIALIZED : s8Var;
    }

    public final s8 q() {
        s8 s8Var = (s8) this.f27869a.get(u8.ANALYTICS_STORAGE);
        return s8Var == null ? s8.UNINITIALIZED : s8Var;
    }

    public final boolean r(v8 v8Var) {
        EnumMap enumMap = this.f27869a;
        for (u8 u8Var : (u8[]) enumMap.keySet().toArray(new u8[0])) {
            s8 s8Var = (s8) enumMap.get(u8Var);
            s8 s8Var2 = (s8) v8Var.f27869a.get(u8Var);
            s8 s8Var3 = s8.DENIED;
            if (s8Var == s8Var3 && s8Var2 != s8Var3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public final v8 s(v8 v8Var) {
        EnumMap enumMap = new EnumMap(u8.class);
        for (u8 u8Var : t8.STORAGE.b()) {
            s8 s8Var = (s8) this.f27869a.get(u8Var);
            s8 s8Var2 = (s8) v8Var.f27869a.get(u8Var);
            if (s8Var == null) {
                s8Var = s8Var2;
            } else if (s8Var2 != null) {
                s8 s8Var3 = s8.UNINITIALIZED;
                if (s8Var == s8Var3) {
                    s8Var = s8Var2;
                } else if (s8Var2 != s8Var3) {
                    s8 s8Var4 = s8.POLICY;
                    if (s8Var == s8Var4) {
                        s8Var = s8Var2;
                    } else if (s8Var2 != s8Var4) {
                        s8 s8Var5 = s8.DENIED;
                        s8Var = (s8Var == s8Var5 || s8Var2 == s8Var5) ? s8Var5 : s8.GRANTED;
                    }
                }
            }
            if (s8Var != null) {
                enumMap.put(u8Var, s8Var);
            }
        }
        return new v8(enumMap, 100);
    }

    public final v8 t(v8 v8Var) {
        EnumMap enumMap = new EnumMap(u8.class);
        for (u8 u8Var : t8.STORAGE.b()) {
            s8 s8Var = (s8) this.f27869a.get(u8Var);
            if (s8Var == s8.UNINITIALIZED) {
                s8Var = (s8) v8Var.f27869a.get(u8Var);
            }
            if (s8Var != null) {
                enumMap.put(u8Var, s8Var);
            }
        }
        return new v8(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(d(this.b));
        for (u8 u8Var : t8.STORAGE.b()) {
            sb2.append(",");
            sb2.append(u8Var.f27847a);
            sb2.append("=");
            s8 s8Var = (s8) this.f27869a.get(u8Var);
            if (s8Var == null) {
                s8Var = s8.UNINITIALIZED;
            }
            sb2.append(s8Var);
        }
        return sb2.toString();
    }

    public v8(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(u8.class);
        this.f27869a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i10;
    }
}
