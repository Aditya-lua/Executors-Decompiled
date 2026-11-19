package ob;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f27063f = new a0((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27064a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f27065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumMap f27067e;

    public a0(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(u8.class);
        this.f27067e = enumMap;
        enumMap.put(u8.AD_USER_DATA, v8.h(bool));
        this.f27064a = i10;
        this.b = l();
        this.f27065c = bool2;
        this.f27066d = str;
    }

    public static a0 a(s8 s8Var, int i10) {
        EnumMap enumMap = new EnumMap(u8.class);
        enumMap.put(u8.AD_USER_DATA, s8Var);
        return new a0(enumMap, -10, (Boolean) null, (String) null);
    }

    public static a0 g(String str) {
        if (str == null || str.length() <= 0) {
            return f27063f;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(u8.class);
        u8[] u8VarArrA = t8.DMA.a();
        int length = u8VarArrA.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put(u8VarArrA[i12], v8.j(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new a0(enumMap, i10, (Boolean) null, (String) null);
    }

    public static a0 h(Bundle bundle, int i10) {
        if (bundle == null) {
            return new a0((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(u8.class);
        for (u8 u8Var : t8.DMA.a()) {
            enumMap.put(u8Var, v8.g(bundle.getString(u8Var.f27847a)));
        }
        return new a0(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean i(Bundle bundle) {
        s8 s8VarG;
        if (bundle == null || (s8VarG = v8.g(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = s8VarG.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final int b() {
        return this.f27064a;
    }

    public final s8 c() {
        s8 s8Var = (s8) this.f27067e.get(u8.AD_USER_DATA);
        return s8Var == null ? s8.UNINITIALIZED : s8Var;
    }

    public final boolean d() {
        Iterator it = this.f27067e.values().iterator();
        while (it.hasNext()) {
            if (((s8) it.next()) != s8.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.b.equalsIgnoreCase(a0Var.b) && Objects.equals(this.f27065c, a0Var.f27065c)) {
            return Objects.equals(this.f27066d, a0Var.f27066d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f27067e.entrySet()) {
            String strI = v8.i((s8) entry.getValue());
            if (strI != null) {
                bundle.putString(((u8) entry.getKey()).f27847a, strI);
            }
        }
        Boolean bool = this.f27065c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f27066d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final int hashCode() {
        int i10;
        Boolean bool = this.f27065c;
        if (bool == null) {
            i10 = 3;
        } else {
            i10 = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.f27066d;
        return this.b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final Boolean j() {
        return this.f27065c;
    }

    public final String k() {
        return this.f27066d;
    }

    public final String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27064a);
        for (u8 u8Var : t8.DMA.a()) {
            sb2.append(":");
            sb2.append(v8.m((s8) this.f27067e.get(u8Var)));
        }
        return sb2.toString();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(v8.d(this.f27064a));
        for (u8 u8Var : t8.DMA.a()) {
            sb2.append(",");
            sb2.append(u8Var.f27847a);
            sb2.append("=");
            s8 s8Var = (s8) this.f27067e.get(u8Var);
            if (s8Var == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = s8Var.ordinal();
                if (iOrdinal == 0) {
                    sb2.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb2.append("denied");
                } else if (iOrdinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f27065c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f27066d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public a0(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(u8.class);
        this.f27067e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f27064a = i10;
        this.b = l();
        this.f27065c = bool;
        this.f27066d = str;
    }
}
