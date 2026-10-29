package nb;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x f26078f = new x((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26079a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f26080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumMap f26082e;

    public x(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(p8.class);
        this.f26082e = enumMap;
        enumMap.put(p8.AD_USER_DATA, q8.h(bool));
        this.f26079a = i10;
        this.b = l();
        this.f26080c = bool2;
        this.f26081d = str;
    }

    public static x a(n8 n8Var, int i10) {
        EnumMap enumMap = new EnumMap(p8.class);
        enumMap.put(p8.AD_USER_DATA, n8Var);
        return new x(enumMap, -10, (Boolean) null, (String) null);
    }

    public static x g(String str) {
        if (str == null || str.length() <= 0) {
            return f26078f;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(p8.class);
        p8[] p8VarArrA = o8.DMA.a();
        int length = p8VarArrA.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put(p8VarArrA[i12], q8.j(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new x(enumMap, i10, (Boolean) null, (String) null);
    }

    public static x h(Bundle bundle, int i10) {
        if (bundle == null) {
            return new x((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(p8.class);
        for (p8 p8Var : o8.DMA.a()) {
            enumMap.put(p8Var, q8.g(bundle.getString(p8Var.f25855a)));
        }
        return new x(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean i(Bundle bundle) {
        n8 n8VarG;
        if (bundle == null || (n8VarG = q8.g(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = n8VarG.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final int b() {
        return this.f26079a;
    }

    public final n8 c() {
        n8 n8Var = (n8) this.f26082e.get(p8.AD_USER_DATA);
        return n8Var == null ? n8.UNINITIALIZED : n8Var;
    }

    public final boolean d() {
        Iterator it = this.f26082e.values().iterator();
        while (it.hasNext()) {
            if (((n8) it.next()) != n8.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.b.equalsIgnoreCase(xVar.b) && Objects.equals(this.f26080c, xVar.f26080c)) {
            return Objects.equals(this.f26081d, xVar.f26081d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f26082e.entrySet()) {
            String strI = q8.i((n8) entry.getValue());
            if (strI != null) {
                bundle.putString(((p8) entry.getKey()).f25855a, strI);
            }
        }
        Boolean bool = this.f26080c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f26081d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final int hashCode() {
        int i10;
        Boolean bool = this.f26080c;
        if (bool == null) {
            i10 = 3;
        } else {
            i10 = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.f26081d;
        return this.b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final Boolean j() {
        return this.f26080c;
    }

    public final String k() {
        return this.f26081d;
    }

    public final String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26079a);
        for (p8 p8Var : o8.DMA.a()) {
            sb2.append(":");
            sb2.append(q8.m((n8) this.f26082e.get(p8Var)));
        }
        return sb2.toString();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(q8.d(this.f26079a));
        for (p8 p8Var : o8.DMA.a()) {
            sb2.append(",");
            sb2.append(p8Var.f25855a);
            sb2.append("=");
            n8 n8Var = (n8) this.f26082e.get(p8Var);
            if (n8Var == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = n8Var.ordinal();
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
        Boolean bool = this.f26080c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f26081d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public x(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(p8.class);
        this.f26082e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f26079a = i10;
        this.b = l();
        this.f26080c = bool;
        this.f26081d = str;
    }
}
